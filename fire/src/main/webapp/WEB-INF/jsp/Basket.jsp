<!-- Author: Sam Raspin -->

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link type="text/css" rel="stylesheet" href="css/Basket.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">
	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Your Basket </b> </h2>
				
				<h4> Please review items before checkout. </h4>				
			
			</div>		

		</div>

	
		
		<div class = "panel-body" >
		
					<label for="chooseAddress">Select Delivery Address</label> <br/>
					<select>
						<option id="chooseAddress" th:each="Address : ${addresses}" th:text="${Address.address}"/>
					</select><br/>


		<div class="squareasd" th:each="basket : ${basket}">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">

 		            	<form th:action="@{/info}" method = "post">
 		            		<input id="identify" class="img-thumbnail" width="40%" th:name="${basket.product.productId}" type="image" th:value="${basket.product.productName}" th:src="'ImageFolder/'+${basket.product.image}"/>
							<input th:name="${basket.product.productId}" type="image" th:value="${basket.product.productName}"/>
						</form>		                	

	                	<p>&pound;<span th:text="${#numbers.formatDecimal(basket.product.price, 0, 'COMMA', 2, 'POINT')}"></span></p>
	                	
	                	<p>Quantity: <span ><input th:value="${basket.quantity}" /></span></p>
	                	
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit"> <span th:text="${basket.product.productDescription}"></span></p>
		                
		               	<form th:action="@{removeBasket}" method="post">
		                	<button type="submit" id="basket" name="basket" th:value="${basket.basketID}"><strong>Remove</strong></button>
		            	</form>
		            </div>
		        </div>
		    </div>
		  </div>
		 </div>
		 
	<div>
		<form th:action="@{submitOrder}" method="post">
	 		<button id="checkout" type="submit" th:value="'Place order'"><strong>Submit Order</strong></button>
	 	</form>
	 </div>	 
		 
	<div class="push"></div>

</div>
</body>
</html>