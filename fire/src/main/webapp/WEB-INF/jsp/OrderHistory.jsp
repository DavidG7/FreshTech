<!DOCTYPE html>
<!-- Author: Ricky Luu -->
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/OrderHistory.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">
	
		<div class="panel panel-default">
				<div class = "jumbotron">
				<h2> Order History</h2>
			</div>		

		</div>
		
<ul class="rig columns-2">
<li th:each="CustomerOrder : ${customerOrders}" >
	 OrderID:<p th:text="${CustomerOrder.orderID}"></p>
	 Product
	 <p th:each="ProductData : ${products}">
	 	<span th:switch="${ProductData.id}">
	 	<span th:case="${CustomerOrder.orderID}" th:text="${ProductData.product.productName}"></span>
	 	</span>
	 	
	 </p>
	 
	<p><img src="${ProductData.product.image}"></img></p>
	<p><a href="remove">Remove</a></p>
	<p><a href="remove">Rate</a></p>
</li>
</ul>
		
</div>
	</body>
	
</html>