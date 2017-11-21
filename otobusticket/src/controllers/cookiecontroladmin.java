package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookiecontroladmin")
public class cookiecontroladmin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String durum="";
		Cookie cooks13[]=req.getCookies();
		int yon=0;
		
		if(cooks13==null)
		{	
			resp.sendRedirect("login.jsp");
			
		}
		
		
		if(cooks13!=null)
		{	
			for(Cookie s31:cooks13)
			{	
				if(s31.getName().equals("admincook"))
				{	
					
					yon++;
					
				}
			}}
		if(yon!=0)
		{	
			req.setAttribute("durum12", durum);
			RequestDispatcher la=req.getRequestDispatcher("seferekle.jsp");
			la.forward(req, resp);
		}
		else if(yon==0)
		{
		resp.sendRedirect("admingiris.jsp");	
		}
	}
	

}
