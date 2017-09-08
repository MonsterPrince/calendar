package ku.sci.cs.calendar;

import java.time.LocalDate;

public class Event {
	private String eventTitle, eventPlace, eventStartTime, eventEndTime;
	private LocalDate eventDate;
	
	public Event(String eventTitle, String eventPlace, LocalDate eventDate, String eventStartTime, String eventEndTime) {
		this.eventTitle = eventTitle;
		this.eventPlace = eventPlace;
		this.eventDate = eventDate;
		this.eventStartTime = eventStartTime; 
		this.eventEndTime = eventEndTime;
	}
	
	public String getTitle() {
		return eventTitle;
	}
	public String getPlace() {
		return eventPlace;
	}
	public LocalDate getDate() {
		return eventDate;
	}
	public String getStartTime() {
		return eventStartTime;
	}
	public String getEndTime() {
		return eventEndTime;
	}
	
	
	public void setTitle(String newTitle) {
		this.eventTitle = newTitle;
	}
	public void setPlace(String newPlace) {
		this.eventPlace = newPlace;
	}
	public void setDate(LocalDate newDate) {
		this.eventDate = newDate;
	}
	public void setStartTime(String newStartTime) {
		this.eventStartTime = newStartTime;
	}
	public void setEndTime(String newEndTime) {
		this.eventEndTime = newEndTime;
	}
	
	public String toString() {
		String evenInfo = "Event: "+ getTitle() + " @ " + getPlace() + " Date: " + getDate() 
						  + " Start: " + getStartTime() + " Finish: " + getEndTime();
		return evenInfo;
	}

}
