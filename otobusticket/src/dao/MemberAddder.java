package dao;

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
import com.sun.corba.se.spi.orbutil.fsm.State;
@WebServlet("/MembersAdder")
public class MemberAddder extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sql="";
		try {
			String durum="";
			String email=(String)req.getAttribute("email");
			String name=(String)req.getAttribute("name");
			String password=(String)req.getAttribute("password");
			String cinsiyet=(String)req.getAttribute("cinsiyet");
			sql="insert into uyebilgileri values("+"'"+email+"'"+","+"'"+password+"'"+", "+"'"+name+"'"+",'"+cinsiyet+"'"+");";
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?autoReconnect=true&useSSL=false","root","sameteray");
			Statement state=conn.createStatement();
			ResultSet rset=state.executeQuery("select * from uyebilgileri");
			while(rset.next())
			{	
				if(rset.getString("email").equals(email))
			{	
				durum="bu mail adresi zaten kayıtlı";}}
				 if(durum.equals("bu mail adresi zaten kayıtlı"))
				{
					 req.setAttribute("durum1", durum);
						RequestDispatcher s3=req.getRequestDispatcher("login.jsp");
						s3.forward(req, resp);
				}
				 else
				 {
					 state.executeUpdate(sql);
					conn.close();	
					 
					 durum="kayıt basarili";
						req.setAttribute("durum1", durum);
						RequestDispatcher s3=req.getRequestDispatcher("login.jsp");
						s3.forward(req, resp);
				 }
				{	
				}}
				
			

	
	
		catch (Exception e) {
			e.printStackTrace();
		}}}
	
		
		
		
		
		
	

