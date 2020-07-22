package com.codingdojo.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLang = request.getParameter("favoriteLang");
		String homeTown = request.getParameter("homeTown");
		
		if (firstName == null || firstName == "") {
			firstName = "Unknown";
		}

		if (lastName == null || lastName == "") {
			lastName = "Unknown";
		}

		if (favoriteLang == null || favoriteLang == "") {
			favoriteLang = "Unknown";
		}

		if (homeTown == null || homeTown == "") {
			homeTown = "Unknown";
		}

		response.setContentType("text/html");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome!! " + firstName + " " + lastName + "</h1>");
		out.write("<p>Your favorite language is " + favoriteLang + "</p>");
		out.write("<p>Your hometown is " + homeTown + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
