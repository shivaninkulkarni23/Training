package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.model.course;

@WebServlet("/updatecourse")
public class UpdateCourseController extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
	HttpSession session=req.getSession(false);
	out.println("Welcome "+(String)session.getAttribute("email"));
	CourseDAO courseDAO=new CourseDAOImpl();
	int course_id=Integer.parseInt(req.getParameter("course_id"));
	String c_name=req.getParameter("c_name");
	String c_desp=req.getParameter("c_desp");
	String c_fees=req.getParameter("c_fees");
	String c_resource=req.getParameter("c_resource");
	
course course=new course(course_id,c_name,c_desp,c_fees,c_resource);
	
	if(courseDAO.updateCourse(course_id,c_name,c_desp,c_fees,c_resource))
		resp.sendRedirect("http://localhost:8081/Updatedfront/viewCourse.jsp");
	else
		out.println("Wrong course id");
}
}
