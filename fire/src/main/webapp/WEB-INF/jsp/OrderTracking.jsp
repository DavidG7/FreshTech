<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/About.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			

				
			
			</div>		

		</div>
			
		<div class = "panel-body">
		 <h1>Order Tracking</h1>
	<p><br/>
	Order Confirmed  <span class="glyphicon glyphicon-thumbs-up"></span>  --- 
	Processing  <span class="glyphicon glyphicon-hourglass"></span>  ---
	Dispatched  <span class="glyphicon glyphicon-plane"></span> ---
	Delivered  <span class="glyphicon glyphicon-home"></span>
   </p>
  
<p> Order ID: </p>
<p> Order Date: </p>
<p> Order Total: </p>
<p> Expected Delivery: </p>
<p> Delivery Address: </p>
		
		<div id = "footer" class = "footer">
	
		
		</div>
		</div>	
		</div>
	</body>
	
</html>