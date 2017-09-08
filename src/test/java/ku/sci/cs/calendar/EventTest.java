package ku.sci.cs.calendar;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class EventTest {
	private Event event;
	private LocalDate today;
	
	@Before
	public void setUp() {
		today = LocalDate.of(2017, 9, 8);
		event = new Event("Test event class", "Lab", today,"12.30", "14.30");
	}
	
	@Test
	public void testGetEvent() {
		assertEquals("Test event class", event.getTitle());
	}
	
	@Test
	public void testGetPlace() {
		assertEquals("Lab", event.getPlace());
	}
	
	@Test
	public void testGetDate() {
		assertEquals(today, event.getDate());
	}
	
	@Test
	public void testGetStartTime() {
		assertEquals("12.30" , event.getStartTime());
	}
	
	@Test
	public void testGetEndTime() {
		assertEquals("14.30" , event.getEndTime());
	}
	
	@Test
	public void testSetEvent() {
		event.setTitle("New event");
		assertEquals("New event", event.getTitle());
	}
	
	@Test
	public void testSetPlace() {
		event.setPlace("New place");
		assertEquals("New place", event.getPlace());
	}
	
	@Test
	public void testSetDate() {
		LocalDate newDate = LocalDate.of(2018, 10, 7);
		event.setDate(newDate);
		assertEquals(newDate, event.getDate());
	}
	
	@Test
	public void testSetStartTime() {
		event.setStartTime("08.05");
		assertEquals("08.05" , event.getStartTime());
	}
	
	@Test
	public void testSetEndTime() {
		event.setStartTime("10.25");
		assertEquals("10.25" , event.getStartTime());
	}

	@Test
	public void testEventToString() {
		String eventInfo = "Event: Test event class @ Lab Date: 2017-09-08 Start: 12.30 Finish: 14.30";
		assertEquals(eventInfo , event.toString());
	}
	
}