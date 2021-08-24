package com.amdocs.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.model.course;
@WebServlet("/viewCourse")
public class ViewCourseController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
		out.println("<a href='viewcourse.jsp'></a>");
		out.println("<h1>Course List</h1>");
		CourseDAO Dao=new CourseDAOImpl();
		List<course>list=Dao.viewAll();
		out.print("<table border='1' width='100%'");  
        out.print("<tr><th>course_id</th><th>Course Name</th><th>Desciption</th><th>fees</th><th>Resources</th></tr>");  
        for(course c1:list){  
         out.print("<tr><td>"+c1.getCourse_id()+"</td><td>"+c1.getC_name()+"</td><td>"+c1.getC_desp()+"</td><td>"+c1.getC_fees()+"</td><td>"+c1.getC_resourse());  
        }  
        out.print("</table>"); 
        HttpSession session=req.getSession(false);
		//out.println("Welcome "+(String)session.getAttribute("email"));
        
        out.close();  
    } 
}
