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
@WebServlet("/enroll")
public class EnrollController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession(false);
		out.println("Welcome "+(String)session.getAttribute("email"));
		int course_id=Integer.parseInt(req.getParameter("course_id"));
		UserDao userDao=new UserDAOImpl();
		//HttpSession session=req.getSession(false);
		String email=(String) session.getAttribute("email");
		if(userDao.enrollCourse(course_id,email))
			out.print(email+" enrolled to "+course_id);
		else
			out.print("Wrong course_id");
		
	}

}
