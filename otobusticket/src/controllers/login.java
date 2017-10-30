package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import sun.rmi.server.Dispatcher;
@WebServlet("/login")
public class login extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String durum="giriş yaparken boş alan girdiniz";
	String durum1="yanış şifre veya kullanıcı adı";
	String anlik;
	String anlik1;
	String anlik2;
	String email=(String)req.getParameter("email");
	String password=(String)req.getParameter("password");
	if(email.equalsIgnoreCase("")|| password.equals("")) {
		req.setAttribute("durum", durum);
		RequestDispatcher s1=req.getRequestDispatcher("login.jsp");
		s1.forward(req, resp);
	}
		try {Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?autoReconnect=true&useSSL=false","root","sameteray");
		Statement state1=conn1.createStatement();
		ResultSet rset1=state1.executeQuery("select * from uyekayit");	
			while(rset1.next())
			{
				anlik=rset1.getString("email");
				anlik1=rset1.getString("password");
				if(anlik.equals(email)&& anlik1.equals(password))
				{
					req.setAttribute("durum","giris basarili");
					RequestDispatcher re=req.getRequestDispatcher("login.jsp");
					re.forward(req, resp);
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
}}
