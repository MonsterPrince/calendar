package ku.sci.cs.calendar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalenderControllerTest {
	private CalendarController controller;
	
	@Before
	public void setUp() {
		controller = new CalendarController();
	}
	
	@Test
	public void testParseTimeFormat1() {
		assertEquals("15:00", controller.parseTimeFormat(15, 0));
	}
	@Test
	public void testParseTimeFormat2() {
		assertEquals("09:55", controller.parseTimeFormat(9, 55));
	}
}
