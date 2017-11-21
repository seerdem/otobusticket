package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieservlet")
public class cookiecontrol extends HttpServlet{
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int sayac=0;
	Cookie cook[]=request.getCookies();
	if(cook==null)
	{	
		request.setAttribute("durum3", "lütfen giriş yapınız");
		RequestDispatcher welcome=request.getRequestDispatcher("welcome.jsp");
		welcome.forward(request, response);
		
	}
	if(cook!=null)
	{
		
			for(Cookie den:cook)
			{
				
				if(den.getName().equals("email"))
				{	System.out.println("esitler");
					sayac++;
					response.sendRedirect("biletal.jsp");
				}
				 
			}
			
		}
	if(sayac==0)
	{
		request.setAttribute("durum3", "lütfen giriş yapınız");
		RequestDispatcher welcome=request.getRequestDispatcher("welcome.jsp");
		welcome.forward(request, response);
	}
}
}
