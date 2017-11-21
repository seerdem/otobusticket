<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div.seferekle {
    
    background-color: lightblue;
    color:red;
    padding-bottom: 50px;
    padding-left: 500px;
}
.qq {
	 padding-bottom: 50px;
    padding-left: 80px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="seferekle"><h1>SEFER EKLE</h1></div>
<form class="qq" action="Seferbilgi">
<p1>KALKIS</p1>
<select name="nereden">
  <option value="Adana">Adana</option>
  <option value="Ankara">Ankara</option>
  <option value="İstanbul">İstanbul</option>
  <option value="Diyarbakır">Diyarbakır</option>
  <option value="Elazığ">Elazığ</option>
</select>
<p1>VARIS</p1>
<select name="nereye">
  <option value="Mersin">Mersin</option>
  <option value="Antalya">Antalya</option>
  <option value="Hatay">Hatay</option>
  <option value="İzmir">İzmir</option>
</select>
<p1>GUN</p1>
	<select name="gun">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  <option value="12">12</option>
  <option value="13">13</option>
  <option value="14">14</option>
  <option value="15">15</option>
  <option value="16">16</option>
  <option value="17">17</option>
  <option value="18">18</option>
  <option value="19">19</option>
  <option value="20">20</option>
  <option value="21">21</option>
  <option value="22">22</option>
  <option value="23">23</option>
  <option value="24">24</option>
  <option value="25">25</option>
  <option value="26">26</option>
  <option value="27">27</option>
  <option value="28">28</option>
  <option value="29">29</option>
  <option value="30">30</option>
  <option value="31">31</option>
</select>
<select name="ay">
<option value="1"> Ocak</option>
<option value="2"> Şubat</option>
<option value="3"> Mart</option>
<option value="4"> Nisan</option>
<option value="5"> Mayıs</option>
<option value="6"> Haziran</option>
<option value="7"> Temmuz</option>
<option value="8"> Ağustos </option>
<option value="9"> Eylül</option>
<option value="10"> Ekim </option>
<option value="11"> Kasım </option>
<option value="12"> Aralık </option>
</select>
<select name="YIL">
<option value="2017"> 2017</option>
<option value="2018"> 2018</option>
<option value="2019"> 2019</option>
</select>
<p1>SAAT</p1>
<select name="saat">
<option value="00">00</option>
<option value="01">01</option>
<option value="02">02</option>
<option value="03">03</option>
<option value="04">04</option>
<option value="05">05</option>
<option value="06">06</option>
<option value="07">07</option>
<option value="08">08</option>
<option value="09">09</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
</select>
:
<select name="dakika">
<option value="00">00</option>
<option value="01">01</option>
<option value="02">02</option>
<option value="03">03</option>
<option value="05">05</option>
<option value="06">06</option>
<option value="07">07</option>
<option value="08">08</option>
<option value="09">09</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
<option value="32">32</option>
<option value="33">33</option>
<option value="34">34</option>
<option value="35">35</option>
<option value="36">36</option>
<option value="37">37</option>
<option value="38">38</option>
<option value="39">39</option>
<option value="40">40</option>
<option value="41">41</option>
<option value="42">42</option>
<option value="43">43</option>
<option value="44">44</option>
<option value="45">45</option>
<option value="46">46</option>
<option value="47">47</option>
<option value="48">48</option>
<option value="49">49</option>
<option value="50">50</option>
<option value="51">51</option>
<option value="52">52</option>
<option value="53">53</option>
<option value="54">54</option>
<option value="55">55</option>
<option value="56">56</option>
<option value="57">57</option>
<option value="58">58</option>
<option value="59">59</option>
</select>
Fiyat
<input type="text" name="fiyat"/>
Koltuk Sayisi
<input type="text" name="koltuksayisi">
<input type="submit" value="Olustur"/> 
</form>
</body>
</html>