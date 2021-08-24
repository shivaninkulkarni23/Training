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
import com.amdocs.training.dao.UserDao;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.contact;
import com.amdocs.training.model.user1;


@WebServlet("/viewContacts")
public class viewContactController extends HttpServlet {
	
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out=resp.getWriter();
			resp.setContentType("text/html");
			out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
			out.println("<a href='viewcontact.jsp'></a>");
			out.println("<h1>Contact List</h1>");
			ContactDAO userDao=new ContactDAOImpl();
			List<contact>list=userDao.viewAll();
			out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>User_Id</th><th>Name</th><th>Email</th><th>Phone No</th><th>Message</th><th>contact_id</th></tr>");  
	        for(contact c1:list){  
	         out.print("<tr><td>"+c1.getUser_id()+"</td><td>"+c1.getName()+"</td><td>"+c1.getEmail()+"</td><td>"+c1.getPhone_no()+"</td><td>"+c1.getMessage()+"</td><td>"+c1.getContact_id()+"</td>"+"<td></td>");  
	        }  
	        out.print("</table>"); 
	        HttpSession session=req.getSession(false);
			//out.println("Welcome "+(String)session.getAttribute("email"));
	        
	        out.close();  
	    }  

		
}
