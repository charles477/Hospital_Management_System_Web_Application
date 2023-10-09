
package com.org.servlet.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.org.dao.UserDao;
import com.org.entity.User;


@WebServlet("/user_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname= req.getParameter("fullname");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		
		User u=new User(fullname, email, password) ;
		UserDao dao= new UserDao();
	  HttpSession session= req.getSession();
	  
		if(dao.registerUser(u))
		{
			session.setAttribute("sucMsg", "Sign Up is success");
			resp.sendRedirect("signup.jsp");
		}
		else {
			session.setAttribute("errorMsg", "Sign Up failed");
			resp.sendRedirect("signup.jsp");	
		}
		
	}

}
