<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">

    <head th:fragment="header">
    <link  type="text/css" rel="stylesheet" href="css/OrderTracking.css" />
	<title>Order Tracking</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
			</div>		

		</div>
			
		<div class = "panel-body" id="centre">
		
		<div id="orderTracking" th:each = "customerOrder:${customerOrders}">
		 <h1>Order Tracking</h1>
		<div th:switch= "${customerOrder.customerOrderStatus}" >
			<div th:case="'Order Confirmed'">
				<span  th:id="statusActive">
				Order Confirmed  <span class="glyphicon glyphicon-thumbs-up"></span>
				</span>
				
				---
				
				<span>
				Processing  <span class="glyphicon glyphicon-hourglass"></span>
				</span>
				
				---
				
				<span>
				Dispatched  <span class="glyphicon glyphicon-plane"></span>
				</span>
				
				---
				
				<span>
				Delivered  <span class="glyphicon glyphicon-home"></span>
				</span>
			</div>
		
		<div th:case="'Dispatched'">
			<span>
			Order Confirmed  <span class="glyphicon glyphicon-thumbs-up"></span> 
			</span>
			
			---
			
			<span th:id="statusActive">
			Processing  <span class="glyphicon glyphicon-hourglass"></span> 
			</span>
			
			---
			
			<span>
			Dispatched  <span class="glyphicon glyphicon-plane"></span> 
			</span>
			
			---
			
			<span>
			Delivered  <span class="glyphicon glyphicon-home"></span>
			</span>
		</div>
		
		<div th:case="'Delivered'">
			<span>
			Order Confirmed  <span class="glyphicon glyphicon-thumbs-up"></span>
			</span>
			
			---
			
			<span>
			Processing  <span class="glyphicon glyphicon-hourglass"></span>
			</span>
			
			---
			
			<span th:id="statusActive">
			Dispatched  <span class="glyphicon glyphicon-plane"></span>
			</span>
			
			---
			
			<span>
			Delivered  <span class="glyphicon glyphicon-home"></span>
			</span>
		</div>
		
		</div>		
		
	<br/>	
	<br/>
		
	    
<p> Order ID: <span th:text="${customerOrder.orderID}"></span></p>
<p> Order Date: <span th:text= "${customerOrder.orderDate}"></span></p>
<p> Order Total: <span th:text= "${customerOrder.orderTotal}"></span></p>
<p> Expected Delivery: <span th:text= "${customerOrder.customerOrderStatus}"></span></p>
<p> Delivery Address: <span th:text= "${customerOrder.deliveryAddress}"></span></p>
		
		<div class="push"></div>
		</div>	
		</div>
		</div>
	</body>
	
</html>