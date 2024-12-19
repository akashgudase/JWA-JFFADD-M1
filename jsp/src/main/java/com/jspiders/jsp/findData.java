package com.jspiders.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/data")
public class findData extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Database connection logic
		List<User> users = new ArrayList<>();
		users.add(new User("ramesh", "Ramesh@1234"));
		users.add(new User("suresh", "Suresh@1234"));
		req.setAttribute("users", users);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("jsp3.jsp");
		requestDispatcher.forward(req, resp);

	}

}
