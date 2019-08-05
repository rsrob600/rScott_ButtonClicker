package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class trackSession
 */
@WebServlet("/trackSession")
public class trackSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// instantiate http session object
		HttpSession session = request.getSession();
		// declare count variable to store casted session attribute
		Integer count = (Integer) session.getAttribute("count");
		// Check existing session exists
		if(count==null) {
			session.setAttribute("count", 0);
		}

		// ensure custom view is used
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/counter.jsp");
        view.forward(request, response);
				

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// instantiate http session object
		HttpSession session = request.getSession();
		// declare count variable to store casted session attribute
		Integer count = (Integer) session.getAttribute("count");
		// increment session attribute count
		session.setAttribute("count", count+1);
		
		doGet(request, response);
	}

}
