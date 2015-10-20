<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		


		<title>NB Gardens Template</title>
		
	</head>
	
	<body>	
				
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing.j">
      				<img id = "logo" alt = "NB Gardens" src = "ImageFolder/NBGardensLogo.png"/>
      			</a>

	    		<div class="row search-row" id = "top-search">
	  				<div>
	    				<div class="input-group">
	    					<span class="input-group-btn">
	    						<a class="btn btn-default" type="button" id="search-button">
	      							<span class="glyphicon glyphicon-search"></span>
	      						</a>
	      					</span>
	     					

	     					<input class="form-control" type="text" id="search-bar"/>
	     					
	    				</div>
					</div>
				</div>
				
			</div> 

			<div class="collapse navbar-collapse" id="navbar-collapse">
		      
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing.jsp" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-home"></span>
		        		Home
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="ProductCatalogue.jsp" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-gift"></span>
		        		Products
		        		</a>
		        	</li>
		      	
		      	</ul>
		      
		      	<ul class="nav navbar-nav navbar-right">
		        
		        	<li class="dropdown">
		        
		          		<a href="#" class="button-top dropdown-toggle" id = "basket-top" data-toggle="dropdown">	      
		          	
	  						<span class= "glyphicon glyphicon-shopping-cart"></span>
						          
			          		Basket
			          
			          		<span class="caret"></span>
		          
		          		</a>
		          
			          	<ul class="dropdown-menu" id="basket-dropdown">
				            <li><a href="Basket.jsp">View basket</a></li>
				            <li><a href="PaymentAgreement.jsp">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="Landing.jsp">Cancel Basket</a></li>
			          	</ul>
		          
		        	</li>
		        
		        	<li class="dropdown">
		          		
		          		<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="account-top">
		          			
		          			<span class="glyphicon glyphicon-user"></span>
		          		     
		          		    My Account
		    		     		
		     				<span class="caret"></span>
		     				
						</a>
		     		
		          
						<ul class="dropdown-menu" id="account-dropdown">
						  <li><a>Logged in as: ... </a></li>
						  <li><a href="OrderHistory.jsp">Order History</a></li>
						  <li><a href="OrderTracking.jsp">Track an Order</a></li>
						  <li><a href="UpdateAccount.jsp">Update your Account</a></li>
						  <li><a href="ViewCreditDetails.jsp">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landing.jsp">Logout</a></li>
						</ul>
		        	
		        	</li>

		        	<li>
		        		<a href="About.jsp" id = "about-button-top">
		        		<span class="glyphicon glyphicon-question-sign"></span>
		        		About NB Gardens
		        		</a>
		        	</li>
	        
				</ul>
    
			</div>
    
		</div>
		</nav>

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Create Payments </b> </h2>
				
				<h4> Please follow the instructions below to create a new payment method </h4>				
			
			</div>		

		</div>

		<div class = "panel-body">
	    <form action="action_page.php"></form>
		Name on Card:<br/>
		<input type = "text" name = "firstname"/>
		<br/>
		<br/>
		Card Number:<br/>
		<input type = "text" name = "cardnumber"/>
		<br/> 
		<br/>
		Card Expiry Date: 
	   <div class="dropdown">
   		 <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Please choose year
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">2015</a></li>
      <li><a href="#">2016</a></li>
      <li><a href="#">2017</a></li>
      <li><a href="#">2018</a></li>
      <li><a href="#">2019</a></li>
      <li><a href="#">2020</a></li>
      </ul>
  </div>
		<br/>
		Security Number:<br/>
		<input type = "text" name = "securitynumber"/>
		<br/>
		<br/>		
		<a href = "Landing.jsp"><button type="submit"><strong>Submit</strong></button></a>

</div>
		
</body>
</html>