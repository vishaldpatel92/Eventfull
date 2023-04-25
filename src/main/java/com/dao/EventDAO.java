package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Event;

public class EventDAO {
	private Connection conn;

	public EventDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean AddEvent(Event event) {
		boolean f = false;

		try {
			PreparedStatement stmt = conn.prepareStatement(
					"INSERT INTO Events(E_Name, E_Start, E_End, E_Location, E_Category, E_Description) VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, event.getEventName());
			stmt.setString(2, event.getEventStartDate());
			stmt.setString(3, event.getEventEndDate());
			stmt.setString(4, event.getEventLocation());
			stmt.setString(5, event.getEventCategory());
			stmt.setString(6, event.getEventDescription());
			int i = stmt.executeUpdate();

			if (i == 1) {
				f = true;
			}
			// stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Event> getAllEvents() {
		List<Event> events = new ArrayList<Event>();
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Events");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Event event = new Event();
				event.setEventID(rs.getInt("E_ID"));
				event.setEventName(rs.getString("E_Name"));
				event.setEventStartDate(rs.getString("E_Start"));
				event.setEventEndDate(rs.getString("E_End"));
				event.setEventLocation(rs.getString("E_Location"));
				event.setEventCategory(rs.getString("E_Category"));
				event.setEventDescription(rs.getString("E_Description"));
				events.add(event);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return events;
	}

	public Event getEventById(int id) {
		Event event = null;

		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Events WHERE E_ID = ?");
			stmt.setInt(1, id);
			System.out.println("Id is:" + id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				event = new Event();
				event.setEventID(rs.getInt("E_ID"));
				event.setEventName(rs.getString("E_Name"));
				event.setEventStartDate(rs.getString("E_Start"));
				event.setEventEndDate(rs.getString("E_End"));
				event.setEventLocation(rs.getString("E_Location"));
				event.setEventCategory(rs.getString("E_Category"));
				event.setEventDescription(rs.getString("E_Description"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return event;
	}

	public boolean UpdateEvent(Event event) {
		boolean f = false;

		try {
			PreparedStatement stmt = conn.prepareStatement(
					"UPDATE Events SET E_Name = ?, E_Start = ?, E_End = ?, E_Location = ?, E_Category = ?, E_Description = ? WHERE E_ID = ?");
			stmt.setString(1, event.getEventName());
			stmt.setString(2, event.getEventStartDate());
			stmt.setString(3, event.getEventEndDate());
			stmt.setString(4, event.getEventLocation());
			stmt.setString(5, event.getEventCategory());
			stmt.setString(6, event.getEventDescription());
			stmt.setInt(7, event.getEventID());
			int i = stmt.executeUpdate();
			System.out.println("Update executed");

			if (i == 1) {
				f = true;
			}
			// stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

}