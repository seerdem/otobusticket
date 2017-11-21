package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ha.backend.Sender;
@WebServlet("/signup")
public class signup extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	boolean ekle=true;
	int uzunluk=44;
	int sayac=0;
	char turkishchar[]= {'ı','ğ','ü','ş','ö','ç','Ğ','Ü','İ','Ö','Ç'};
	String durum="";
	String email=req.getParameter("email");
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	String cinsiyet=req.getParameter("cinsiyet");
	if(ekle==true)
	{
	if(email.equals("") ||name.equals("") ||password.equals("")) {
		try {
				durum=" kayıt olurken bos alan girdiniz";
				req.setAttribute("durum1", durum);
				RequestDispatcher s1=req.getRequestDispatcher("login.jsp");
				s1.forward(req, resp);
				ekle=false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
		
	}if(ekle==true)
	{
	for(sayac=0;sayac<email.length();sayac++)
	{
		for(int i=0;i<=10;i++)
		{
			if(email.charAt(sayac)==turkishchar[i])
			{ durum="türkçe karakter lütfen kullanmayınız";
			try {
				req.setAttribute("durum1", durum);
				RequestDispatcher s2=req.getRequestDispatcher("login.jsp");
				s2.forward(req, resp);
				ekle=false;
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		}
		}	
	}}
	if(ekle==true)
	{
	if(name.length()>uzunluk || password.length()>uzunluk || email.length()>uzunluk)
	{	try {
		req.setAttribute("durum1", "lütfen daha kısa kelimeler giriniz");
		RequestDispatcher s3=req.getRequestDispatcher("login.jsp");
		s3.forward(req, resp);
		ekle=false;
	} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
	
	if(ekle==true)
	{
		if(password.length()<7)
		{	try {
			System.out.println("calisti");
			req.setAttribute("durum1", "Minimum paralo karakter adedi 7");
			RequestDispatcher s0=req.getRequestDispatcher("login.jsp");
			s0.forward(req, resp);
			ekle=false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		}
	}
	if(ekle==true)
	{
	try {
		req.setAttribute("email", email);
		req.setAttribute("name", name);
		req.setAttribute("password",password);
		req.setAttribute("cinsiyet",cinsiyet);
		RequestDispatcher s5=req.getRequestDispatcher("MembersAdder");
		s5.forward(req, resp);

		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
}
