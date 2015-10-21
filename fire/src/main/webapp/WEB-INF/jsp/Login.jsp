<!DOCTYPE html>
	<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link  type="text/css" rel="stylesheet" href="css/Login.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">


		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Login </b> </h2>
				
				<h4> Please enter Log in details </h4>
						
			
			</div>		

		</div>

		<div class = "panel-body">
	    
	   <div id="centre">
		    <p>Username :<br/>
			<input type = "text" name = "username"/>
			</p>
			
			<p>Password :<br/>
			<input type = "text" name = "password"/>
			</p>
			
				<a href = "#"><button type="submit"><strong>Log In</strong></button></a>
		</div>
	   
	<div class="push"></div>
</div>

		</div>
</body>
</html>