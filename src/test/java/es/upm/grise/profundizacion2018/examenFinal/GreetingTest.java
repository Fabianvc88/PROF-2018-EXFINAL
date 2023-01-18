package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public class GreetingTest {
  MyCalendar cal = mock(MyCalendar.class);
  Message message = mock(Message.class);

	@Test
	public void smokeTest1() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
    when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
    when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");
    when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");

		Greeting greeting = new Greeting(cal, message);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
    when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
    when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");

		Greeting greeting = new Greeting(cal, message);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
    when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
    when(message.getMessage(TimeOfTheDay.MORNING, Language.SPANISH)).thenReturn("Buenos días");

		Greeting greeting = new Greeting(cal, message);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

  @Test
	public void smokeTest4() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
    when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
    when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");

		Greeting greeting = new Greeting(cal, message);
		greeting.getGreeting(null);
    verify(message).getDefaultLanguage();
    verify(message).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}

	@Test
	public void smokeTest5() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
    when(message.getDefaultLanguage()).thenReturn(Language.ENGLISH);
    when(message.getMessage(TimeOfTheDay.MORNING, Language.ENGLISH)).thenReturn("Good morning");

		Greeting greeting = new Greeting(cal, message);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
    verify(message, times(0)).getDefaultLanguage();
    verify(message).getMessage(TimeOfTheDay.MORNING, Language.ENGLISH);
	}

}
