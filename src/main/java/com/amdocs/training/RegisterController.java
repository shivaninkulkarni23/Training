
package com.amdocs.training;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.training.dao.UserDao;
import com.amdocs.training.dao.impl.UserDAOImpl;

import com.amdocs.training.model.user1;

@WebServlet("/register")
public class RegisterController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String phone_no=req.getParameter("phone_no");
		String email=req.getParameter("email");
		String address=req.getParameter("address");		
		String reg_date=req.getParameter("reg_date");
		String password=req.getParameter("password");
		String upload_photo=req.getParameter("upload_photo");
				
		
//		out.println("id :"+id+"name :"+name+"address :"+address+"phone :"+phone);
		UserDao dao=new UserDAOImpl();
		user1 user=new user1(id,name,phone_no,email,address,reg_date,password,upload_photo);
		boolean status=dao.saveUser(user);
		if(status)
			out.println("User saved");
		else
			out.println("Something went wrong...");
		
		
	}

}
