	<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
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

	
		
		<div class = "panel-body">
	    
	    
	    
<p>ITEM 1 - PLACEHOLDER EXAMPLE                 QUANTITY: 1</p> <div class="dropdown">
   		 <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Change Quantity
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#">6</a></li>
      <li><a href="#">7</a></li>
      <li><a href="#">8</a></li>
      <li><a href="#">9</a></li>
      </ul>
  </div>
  

  
  <br/>
  <p>ITEM 2 - PLACEHOLDER EXAMPLE                 QUANTITY: 5</p> <div class="dropdown">
   		 <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Change Quantity
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#">6</a></li>
      <li><a href="#">7</a></li>
      <li><a href="#">8</a></li>
      <li><a href="#">9</a></li>
      </ul>
  </div>
    <br/>
  

  <p>ITEM 3 - PLACEHOLDER EXAMPLE                 QUANTITY: 2</p> <div class="dropdown">
   		 <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Change Quantity
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#">6</a></li>
      <li><a href="#">7</a></li>
      <li><a href="#">8</a></li>
      <li><a href="#">9</a></li>
      </ul>
  </div>

<br/>
<br/>	    
<a href="OrderConfirmation"><button type="submit" value="Checkout">Checkout</button></a>
	<div class = "push"></div>	
			</div>


</div>

</body>
</html>