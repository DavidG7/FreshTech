<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/Landing.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Create Payments </b> </h2>
				
				<h4> Please follow the instructions below to create a new payment method </h4>				
			
			</div>		

		</div>

		<div class = "panel-body"></div>
			    <form action="action_page.php"></form>
		<div class="dropdown"></div>
				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 2" data-toggle="dropdown">Select Card Type
    	<span class="caret"></span></button>
		<ul class="dropdown-menu">
		<li><a>Mastercard</a></li>
		<li><a>Visa</a></li>
		<li><a>Visa Electron</a></li>
		<li><a>American Express</a></li>
		</ul><p></p>
		Name on Card:<br/>
		<input type = "text" name = "firstname"/>
		<br/>
		<br/>
		Card Number:<br/>
		<input type = "text" name = "cardnumber"/>
		<br/> 
		<br/>
		Card Expiry Date: 
	   <div class="dropdown">
   		 <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Please choose year
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">2015</a></li>
      <li><a href="#">2016</a></li>
      <li><a href="#">2017</a></li>
      <li><a href="#">2018</a></li>
      <li><a href="#">2019</a></li>
      <li><a href="#">2020</a></li>
      </ul>
  </div>
		<br/>
		Security Number:<br/>
		<input type = "text" name = "securitynumber"/>
		<br/>
		<br/>		
		<a href = "/"><button type="submit"><strong>Submit</strong></button></a>

	<div class="push"></div>
</div>
</body>
</html>