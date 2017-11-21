<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Scarica gratis GARAGE Template html/css - Web Domus Italia - Web Agency </title>
	<meta name="description" content="Scarica gratis il nostro Template HTML/CSS GARAGE. Se avete bisogno di un design per il vostro sito web GARAGE può fare per voi. Web Domus Italia">
	<meta name="author" content="Web Domus Italia">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="source/bootstrap-3.3.6-dist/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="source/font-awesome-4.5.0/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="style/slider.css">
	<link rel="stylesheet" type="text/css" href="style/mystyle.css">
</head>
<body>
<% String kullaniciadi="";
if(request.getAttribute("kullaniciadi")!=null)
	kullaniciadi=(String)request.getAttribute("kullaniciadi");
	%>
<!-- Header -->
<div class="allcontain">
	<div class="header">
			
			<ul class="givusacall">
				<li>bisey olursa ara : +905414106530 </li>
				
			</ul>
			
	</div>
	<!-- Navbar Up -->
    <div id="ccc">
	<nav class="topnavbar navbar-default topnav">
		<div class="container">
			<div class="navbar-header">
				
				<a class="navbar-brand logo" href="#"><img src="image/logo1.png" alt="logo"></a>
			</div>	 
		</div>
		<div class="collapse navbar-collapse" id="upmenu">
			<ul class="nav navbar-nav" id="navbarontop">
				
				
				
				<li>
					<a href="login.jsp">Giris Yap veya Kayıt Ol</a>
                    
 
				</li>
                
				<li>
                    <a href="cookieservlet">Bilet Al</a>
                </li>
                <li>
                    <a href="cookiecontroladmin">Admin Yetkileri</a>
                </li>
                <li>
                	<a href="#"><%=kullaniciadi %></a>
                </li>
                
			</ul>
		</div>
	</nav>
</div>
   
<!--_______________________________________ Carousel__________________________________ -->
<div class="allcontain">
	<div id="carousel-up" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner " role="listbox">
			<div class="item active">
				<img src="image/oldcar.jpg" alt="oldcar">
			</div>
			<div class="item">
				<img src="image/porche.jpg" alt="porche">				
				<div class="carousel-caption">
					<h2>Porche</h2>
						<p>Lorem ipsum dolor sit amet, consectetur ,<br>
						sed do eiusmod tempor incididunt ut labore </p>
				</div>
			</div>
			
		</div>
		
	</div>
</div>
<!-- ____________________Featured Section ______________________________--> 
    </div>
    <% kullaniciadi=""; %>
</body>
</html>
