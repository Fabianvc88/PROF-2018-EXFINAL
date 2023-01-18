package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class GreetingTest {
  MyCalendar cal = Mockito.mock(MyCalendar.class);

	@Test
	public void smokeTest1() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
		Greeting greeting = new Greeting(cal);
		assertEquals("Good morning", greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
		Greeting greeting = new Greeting(cal);
		assertEquals("Good morning", greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
    when(cal.get(MyCalendar.HOUR_OF_DAY)).thenReturn(11);
		Greeting greeting = new Greeting(cal);
		assertEquals("Buenos días", greeting.getGreeting(Language.SPANISH));
	}

}
