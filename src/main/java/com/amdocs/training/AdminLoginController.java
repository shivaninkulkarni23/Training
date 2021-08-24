package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.db.DBUtil;
import com.amdocs.training.util.DataSourceUtil;



@WebServlet("/adminlogin")
public class AdminLoginController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
		PrintWriter out=resp.getWriter();
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		HttpSession session=req.getSession(false);
		session.setAttribute("email",email);
		AdminDAOImpl ad=new AdminDAOImpl();
		if(ad.check(email,password))
			resp.sendRedirect("http://localhost:8081/Updatedfront/Adminoptions.jsp");
		else
			out.print("Try again!");
	}
		catch(Exception e1){
		System.out.print("Something went wrong!"+e1);
		}
	}
	
	
	
}
