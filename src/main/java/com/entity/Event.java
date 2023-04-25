package com.entity;

public class Event {
	private int eventID;
	private String eventName;
	private String eventStartDate;
	private String eventEndDate;
	private String eventLocation;
	private String eventCategory;
	private String eventDescription;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String eventName, String eventStartDate, String eventEndDate, String eventLocation,
			String eventCategory, String eventDescription) {
		super();
		this.eventName = eventName;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.eventLocation = eventLocation;
		this.eventCategory = eventCategory;
		this.eventDescription = eventDescription;
	}

	public Event(int eventID, String eventName, String eventStartDate, String eventEndDate, String eventLocation,
			String eventCategory, String eventDescription) {
		super();
		this.eventID = eventID;
		this.eventName = eventName;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.eventLocation = eventLocation;
		this.eventCategory = eventCategory;
		this.eventDescription = eventDescription;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@Override
	public String toString() {
		return "Event [eventID=" + eventID + ", eventName=" + eventName + ", eventStartDate=" + eventStartDate
				+ ", eventEndDate=" + eventEndDate + ", eventLocation=" + eventLocation + ", eventCategory="
				+ eventCategory + ", eventDescription=" + eventDescription + "]";
	}

}
