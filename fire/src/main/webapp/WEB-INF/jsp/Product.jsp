<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/Product.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Product </b> </h2>				
			
			</div>		

		</div>
	

			
		<div class = "panel-body">
	
			<div>
				<img id="identify" class="img-thumbnail"
					th:alt="${product.productName}" th:src="'ImageFolder/'+${product.image}"
					height="180" width="180" />
				<p class="subtitle">
					<br />
					<strong> <span th:text="${product.productName}"></span> <br />
					<br />Description:
					</strong><br /> <span th:text="${product.productDescription}"></span>
				</p>
			</div>
			<hr />
			<div class="rating">
				<p>
					<strong>Item price: <span
						th:text="'&pound;'+${product.price}"></span></strong>
				</p>

				<strong>RATING: </strong> 
				
				<span th:switch="${product.rating}">
					<span th:case="0">
						<span th:each="i : ${#numbers.sequence( 1, 5)}"> &#9734; </span>
					</span>
					<span th:case="5">
						<span th:each="i : ${#numbers.sequence( 1, 5)}"> &#9733; </span>
					</span>
					<span th:case="*">
						<span th:each="i : ${#numbers.sequence( 1, product.rating)}">
						&#9733; </span> 
						<span th:each="i : ${#numbers.sequence( 1, 5-product.rating)}">
						&#9734; </span> 
					</span>
				</span>

				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit">
					<img class="img-thumbnail" alt="hi" src="ImageFolder/shopCart.png"
						height="28" width="28" /><strong> Add to cart</strong>
				</button>
				<p />
			</div>
			<hr />
			
			<div>
				<p id="others">
					<strong>Other items you may be interested in:</strong>
				</p>
			</div>
			
			<div id="carousel-main" class="carousel slide" data-ride="carousel">
			
				<div class="carousel-inner">
					<div class="item active">
						<h3>Special Offers</h3>
					</div>
				
					<div class="item" th:each="product : ${offerProducts}">
		      		<img th:src="'ImageFolder/' + ${product.image}" th:alt="${product.productName}"/>
		    		</div>

				</div>
	
			
				<a class="left carousel-control" href="#carousel-main" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span> 
				</a>
				<a class="right carousel-control" href="#carousel-main" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			
			<div>
				<p class="subtitle"><strong>User Reviews:</strong></p><hr/>
				<p>This is a basic user review telling you that the gnome is pretty good, but this page is so well designed!!!</p><hr/>
				<p>I agree with the first review. This page is soooooo well designed!!!</p><hr/>
			</div>
			<div class="push"></div>
		</div>
		
		</div>
	</body>
	
</html>