<!-- Author: Sam Raspin -->

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link type="text/css" rel="stylesheet" href="css/Login.css" />
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

		<div class="squareasd" th:each="basket : ${basket}">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            
 		            <form th:action="@{postUpdate}" method="post">
 		            
 		            	<img class="img-thumbnail" id="identify" th:src="'ImageFolder/'+${basket.product.image}" th:alt="${basket.product.productName}" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong th:text="${basket.product.productName}"></strong></a></p>
		                	<p>&pound;<span th:text="${basket.product.price}"></span></p>
		                	<p>Quantity: <span th:text="${basket.quantity}"></span></p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit"> <span th:text="${basket.product.productDescription}"></span></p>
		                
		                <button type="submit" id="basket" name="basket" th:value="${basket.product.productName}"><strong>Remove</strong></button>
		            
		            </form>
		            
		            </div>
		        </div>
		    </div>
		  </div>
		 </div>
		
		<!-- 
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/redgnomebroken.png" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Smashy Gnome</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/newgame.jpg" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Game of Gnomes</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>	
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/DinoGnome.png" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Tasty Gnomes</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/squarelittleFriend.jpg" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Original Gnome</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/redgnomebroken.png" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Smashy Gnome</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>	
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/newgame.jpg" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Game of Gnomes</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
		<div class="squareasd">
 		    <div class="contentasd">
 		        <div class="tableasd">
 		            <div class="table-cellasd">
 		            	<img class="img-thumbnail" id="identify" src="ImageFolder/DinoGnome.png" alt="newlittleFriend" width="40%"/>
 		            	<span id="sortgaps">
		                	<p id="underlined"><a href="Product"><strong>Tasty Gnome</strong></a></p>
		                	<p>&pound;10.00</p>
		                	<p>Quantity: 3</p>
		                </span>
		                <p id="clearingit"><span id="underlined">Description:</span></p><p id="clearingit">This is a high quality gnome!</p>
		                <button type="submit"><strong>Remove</strong></button>
		            </div>
		        </div>
		    </div>
		</div>
	<div id="buttonmargin">
		<a href="PaymentAgreement"><button type="submit"><strong>Proceed to Checkout</strong></button></a>
	</div>
	-->
	<div class="push"></div>

</div>
</body>
</html>