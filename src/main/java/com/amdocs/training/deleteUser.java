package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.UserDao;
import com.amdocs.training.dao.impl.UserDAOImpl;
@WebServlet("/deleteuser")
public class deleteUser extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
		HttpSession session=req.getSession(false);
		out.println("Welcome "+(String)session.getAttribute("email"));
		out.println("Delete User");
		int user_id=Integer.parseInt(req.getParameter("user_id"));
		UserDao userDao=new UserDAOImpl();
		if(userDao.deleteUser(user_id))
			resp.sendRedirect("http://localhost:8081/Updatedfront/viewUsers.jsp");
		else
			out.println("Deletion not possible..");
	}

}
