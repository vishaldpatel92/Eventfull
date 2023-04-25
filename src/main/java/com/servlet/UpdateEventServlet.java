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

@WebServlet("/UpdateEvent")
public class UpdateEventServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String E_Name = req.getParameter("E_Name");
		String E_Start = req.getParameter("E_Start");
		String E_End = req.getParameter("E_End");
		String E_Location = req.getParameter("E_Location");
		String E_Category = req.getParameter("E_Category");
		String E_Description = req.getParameter("E_Description");
		int E_ID = Integer.parseInt(req.getParameter("E_ID"));
		Event event = new Event(E_ID, E_Name, E_Start, E_End, E_Location, E_Category, E_Description);

		System.out.println(event);

		EventDAO dao = new EventDAO(DBConnect.getConn());

		HttpSession session = req.getSession();

		boolean f = dao.UpdateEvent(event);

		if (f) {
			session.setAttribute("SuccessMsg", "Event updated successfull");
			resp.sendRedirect("index.jsp");
		} else {
			session.setAttribute("ErrorMsg", "Error updating the event!");
			resp.sendRedirect("index.jsp");
			// System.out.println("Data not added!");
		}
	}
}
