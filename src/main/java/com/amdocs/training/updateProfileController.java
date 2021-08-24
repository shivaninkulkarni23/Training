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
import com.amdocs.training.model.user1;

@WebServlet("/updateprofile")
public class updateProfileController extends  HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
		HttpSession session=req.getSession(false);
		out.println("Welcome "+(String)session.getAttribute("email"));
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String phone_no=req.getParameter("phone_no");
		String email=req.getParameter("email");
		String address=req.getParameter("address");		
		String reg_date=req.getParameter("reg_date");
		String password=req.getParameter("password");
		String upload_photo=req.getParameter("upload_photo");
		UserDao dao=new UserDAOImpl(); 
		user1 user=new user1(id,name,phone_no,email,address,reg_date,password,upload_photo);
		boolean status=dao.updateProfile(id,name,phone_no,email,address,reg_date,password,upload_photo);
		if(status)
			out.println("User updated");
		else
			out.println("Something went wrong...");		
		
	}
}
