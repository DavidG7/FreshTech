<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link  type="text/css" rel="stylesheet" href="css/Register.css" />
		<link  type="text/css" rel="stylesheet" href="css/CustomerAccountPage.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">
	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Thank you for your order!</b> </h2>
				<h3>Your order has been confirmed. Happy Gardening!</h3>
				
			</div>		

		</div>
		
			<h3>Gnomes away!</h3>
			
			<img src= "ImageFolder/Dispatch.gif"/>
			
						
		<div class="push"></div>
		
		<form action="/">
		    <input type="submit" value="Return to Home Page"/>
		</form>
		
</div>

		
</body>
</html>