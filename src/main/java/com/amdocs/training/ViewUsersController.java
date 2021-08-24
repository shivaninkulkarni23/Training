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

import com.amdocs.training.dao.UserDao;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.user1;

@WebServlet("/viewuser")
public class ViewUsersController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<a href='viewUsers.jsp'></a>");
		out.println("<link rel=\'stylesheet\' href=\'design.css\'>");
		out.println("<h1>Users List</h1>");
		UserDao userDao=new UserDAOImpl();
		List<user1>list=userDao.viewAll();
		out.print("<table border='1' width='100%'");  
        out.print("<tr><th>User_Id</th><th>Name</th><th>Phone_no</th><th>Email</th><th>Address</th><th>Reg_date</th><th>Upload_photo</th></tr>");  
        for(user1 c1:list){  
         out.print("<tr><td>"+c1.getUser_id()+"</td><td>"+c1.getName()+"</td><td>"+c1.getPhone_no()+"</td><td>"+c1.getEmail()+"</td><td>"+c1.getAddress()+"</td><td>"+c1.getReg_date()+"</td><td>"+c1.getUpload_photo()+"</td>"+"<td></td>");  
        }  
        out.print("</table>"); 
        HttpSession session=req.getSession(false);
		//out.println("Welcome "+(String)session.getAttribute("email"));
        
        out.close();  
    }  

	}


