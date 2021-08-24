package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.UserDao;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.feedback;
import com.amdocs.training.model.user1;

@WebServlet("/feedback")
public class FeedbackController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession(false);
		out.println("Welcome "+(String)session.getAttribute("email"));
		int user_id=Integer.parseInt(req.getParameter("user_id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int f_id=Integer.parseInt(req.getParameter("f_id"));
		String feedback=req.getParameter("feedback");
		
		FeedbackDAO dao=new FeedbackDAOImpl();
		feedback feedback1=new feedback(user_id,name,email,f_id,feedback);
		boolean status=dao.saveFeedback(feedback1);
		if(status)
			out.println("User saved");
		else
			out.println("Something went wrong...");
		
		
	}
	}

