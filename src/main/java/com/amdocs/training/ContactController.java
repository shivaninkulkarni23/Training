package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.model.contact;

@WebServlet("/contact")
public class ContactController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession(false);
		out.println("Welcome "+(String)session.getAttribute("email"));
		int user_id=Integer.parseInt(req.getParameter("user_id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone_no=req.getParameter("phone_no");
		String message=req.getParameter("message");
		int contact_id=Integer.parseInt(req.getParameter("contact_id"));
		
		ContactDAO contactDAO=new ContactDAOImpl();
		contact contact=new contact(user_id,name,email,phone_no,message,contact_id);
		boolean status=contactDAO.saveContact(contact);
		if(status)
			out.println("User saved");
		else
			out.println("Something went wrong...");
		
		
	}
	}
