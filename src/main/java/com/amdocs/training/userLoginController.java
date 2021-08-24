package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;

@WebServlet("/userlogin")
public class userLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		UserDAOImpl ad=new UserDAOImpl();
		if(ad.check(email,password)) {
			HttpSession session=req.getSession(false);
			session.setAttribute("email",email);
			resp.sendRedirect("http://localhost:8081/Updatedfront/Useroptions.jsp");
		}
		else
			out.print("Try again!");
	}
		
	}
	


