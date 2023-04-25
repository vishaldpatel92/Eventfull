package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.EventDAO;
import com.entity.Event;

@WebServlet("/AddEvent")
public class Register extends HttpServlet {

	// private static final long serialVersionUID = 1L;

	// @Override
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String E_Name = req.getParameter("E_Name");
		String E_Start = req.getParameter("E_Start");
		String E_End = req.getParameter("E_End");
		String E_Location = req.getParameter("E_Location");
		String E_Category = req.getParameter("E_Category");
		String E_Description = req.getParameter("E_Description");
		Event event = new Event(E_Name, E_Start, E_End, E_Location, E_Category, E_Description);

		System.out.println(event);

		EventDAO dao = new EventDAO(DBConnect.getConn());

		HttpSession session = req.getSession();

		boolean f = dao.AddEvent(event);

		if (f) {
			session.setAttribute("SuccessMsg", "Event added successfully");
			resp.sendRedirect("AddEvent.jsp");
		} else {
			session.setAttribute("ErrorMsg", "Error adding the event!");
			resp.sendRedirect("AddEvent.jsp");
			// System.out.println("Data not added!");
		}
	}
}