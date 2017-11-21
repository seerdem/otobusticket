package controllers;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("adminid");
		String password=req.getParameter("adminpassword");
		String durum="";
		int sayac=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?autoReconnect=true&useSSL=false","root","sameteray");
			Statement state1=conn1.createStatement();
			ResultSet rset=state1.executeQuery("select * from adminbilgileri");
			while(rset.next())
			{	
				if(rset.getString("adminmail").equals(username) && rset.getString("adminsifre").equals(password))
				{
					sayac++;
					
				}
			}
			conn1.close();
			if(sayac==0)
			{
				req.setAttribute("girissorunu", "yanlış veya eksik parola veya şifre girdiniz");
				RequestDispatcher s1=req.getRequestDispatcher("admingiris.jsp");
				s1.forward(req, resp);
				
			}
			if(sayac!=0)
			{
				Cookie admincook=new Cookie("admincook","adminvar");
				resp.addCookie(admincook);
				RequestDispatcher s1=req.getRequestDispatcher("welcome.jsp");
				s1.forward(req, resp);
				
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	
	
	}
}
