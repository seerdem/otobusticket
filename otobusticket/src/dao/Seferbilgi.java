package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


@WebServlet("/Seferbilgi")
public class Seferbilgi extends HttpServlet{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int seferid=0;
		int seferid2;
		
		int gun=Integer.parseInt(req.getParameter("gun"));
		int yil=Integer.parseInt(req.getParameter("YIL"));
		int saat=Integer.parseInt(req.getParameter("saat"));
		int dakika=Integer.parseInt(req.getParameter("dakika"));
		int fiyat=Integer.parseInt(req.getParameter("fiyat"));
		int koltuksayisi=Integer.parseInt(req.getParameter("koltuksayisi"));
		String Nereden=(req.getParameter("nereden"));
		String Varis=(req.getParameter("nereye"));
		int ay=Integer.parseInt(req.getParameter("ay"));
		
		try { 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/uyeler?autoReconnect=true&useSSL=false","root","sameteray");
		Statement state=conn.createStatement();
		ResultSet s1=state.executeQuery("Select * from seferidolustur");
		while (s1.next()) {
			seferid=s1.getInt("sonseferid");
			
		}
		String seferekle="insert into  ulasimbilgileri values("+seferid+",'"+Nereden+"','"+Varis+"',"+saat+dakika+",'"+yil+"-"+ay+"-"+gun+"',"+fiyat+","+koltuksayisi+")";
	
		seferid2=seferid+1;
		String seferidyazan="update seferidolustur set"+"   "+"  sonseferid="+seferid2+"  where sonseferid="+seferid ;
		state.executeUpdate(seferidyazan);
		state.executeUpdate(seferekle);
		// diğer tabloya ekleme
		int i=0;
		
		for( i=1;i<=koltuksayisi;i++)
		{	String koltukdurum="insert into koltukdurum values("+seferid+",'"+"koltuk"+i+"','BOS'"+")";
	
		state.executeUpdate(koltukdurum);
		
			
		}
			
		} catch (Exception e) {
			e.printStackTrace();		}
	
	}
}
 