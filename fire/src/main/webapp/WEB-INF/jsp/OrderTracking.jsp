<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			

				
			
			</div>		

		</div>
			
		<div class = "panel-body" id="centre">
		 <h1>Order Tracking</h1>
	<p><br/>
	Order Confirmed  <span class="glyphicon glyphicon-thumbs-up"></span>  --- 
	Processing  <span class="glyphicon glyphicon-hourglass"></span>  ---
	Dispatched  <span class="glyphicon glyphicon-plane"></span> ---
	Delivered  <span class="glyphicon glyphicon-home"></span>
   </p>
  
<p> Order ID: <span th:text="${customerOrder.orderID}"></span></p>
<p> Order Date: </p>
<p> Order Total: </p>
<p> Expected Delivery: </p>
<p> Delivery Address: </p>
		
		<div class="push"></div>
		</div>	
		</div>
	</body>
	
</html>