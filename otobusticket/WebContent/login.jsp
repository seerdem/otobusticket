<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style3.css">
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:400,300'>
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>

      <link rel="stylesheet" href="css/style3.css">

  
</head>

<body>
<% String durum="";
	String durum1="";
	if(request.getAttribute("durum")!=null)
durum=(String)request.getAttribute("durum");
if(request.getAttribute("durum1")!=null)

durum1=(String)request.getAttribute("durum1");
	 %>
  <div class="cotn_principal">
<div class="cont_centrar">
	
  <div class="cont_login">
  
<div class="cont_info_log_sign_up">

			
			
     <div class="col_md_login"><%= durum %>
      <%=durum1 %>
<div class="cont_ba_opcitiy">
 
        <h2>LOGIN</h2>  
       
        
  <button class="btn_login" onclick="cambiar_login()">LOGIN</button>
  </div>
  </div>
<div class="col_md_sign_up">

<div class="cont_ba_opcitiy">

  <h2>SIGN UP</h2>

  

  <button class="btn_sign_up" onclick="cambiar_sign_up()">SIGN UP</button>
</div>
  </div>
       </div>

    
    <div class="cont_back_info">
       <div class="cont_img_back_grey">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>
       
    </div>
    
<div class="cont_forms" >
    <div class="cont_img_back_">
       <img src="https://images.unsplash.com/42/U7Fc1sy5SCUDIu4tlJY3_NY_by_PhilippHenzler_philmotion.de.jpg?ixlib=rb-0.3.5&q=50&fm=jpg&crop=entropy&s=7686972873678f32efaf2cd79671673d" alt="" />
       </div>
       <form action="login">
 <div class="cont_form_login">
<a href="#" onclick="ocultar_login_sign_up()" ><i class="material-icons">&#xE5C4;</i></a>
   <h2>LOGIN</h2>
 <input type="text" placeholder="Email" name="email"/>
<input type="password" placeholder="Password"  name="password"/>
<input type="submit" value="LOGIN"/>
 </form>
  </div>
  <form action="signup">  
  
  
   <div class="cont_form_sign_up">
   
     <h2>SIGN UP</h2>
    
<input type="text" placeholder="Email" name="email"/>
<input type="text" placeholder="User"  name="name"/>
<input type="password" placeholder="Password" name="password"/>

<select name="cinsiyet">
<option value="erkek">Erkek</option>
   <option value="kadın">Kadın</option>
</select>
<input type="submit" value="SIGN UP"/>
</form>
  </div>
    

    </div>
  </div>
 </div>
</div>
  
    <script  src="js/index3.js"></script>
<% durum=""; durum1=""; %>
</body>
</html>


