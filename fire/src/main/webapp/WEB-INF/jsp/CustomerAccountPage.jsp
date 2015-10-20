<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap/css/bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/ChooseAddress.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Register.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/CustomerAccount.css"/>

		<title>NB Gardens Add Details</title>
		
	</head>
	
	<body>


		<div class="wrapper">
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing">
      				<img id = "logo" alt = "NB Gardens" src = "ImageFolder\NBGardensLogo.png"/>
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
		        		<a href="Landing" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-home"></span>
		        		Home
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing" id = "home-button-top">
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
				            <li><a href="Basket">View basket</a></li>
				            <li><a href="OrderCheckout">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="Landing">Cancel Basket</a></li>
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
						 <li><a href="OrderHistory">Order History</a></li>
						  <li><a href="OrderTracking">Track an Order</a></li>
						  <li><a href="OutstandingOrders">Outstanding Orders</a></li>
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landing">Logout</a></li>
						</ul>
		        	
		        	</li>
		        
		        
		        	<li>
		        		<a href="About" id = "about-button-top">
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
			
				<h2> <b> Your Account </b> </h2>
				
				
						
			
			</div>		

		</div>
		
		
	<div class = "panel-body">
		       
       
       <div id="centre1">
		
		<a href = "OutstandingOrders.html"><button type="submit"><strong>Your Orders</strong></button></a>
        </div>
        <br/>
        <div id="centre3">
        <a href = "OrderHistory.html"><button type="submit"><strong>Order History</strong></button></a>
        </div>
        <br/>
        <div id="centre4">
        <a href = "OrderTracking.html"><button type="submit"><strong>Order Tracking</strong></button></a>
        </div>
        <br/>
        <div id="centre5">
        <a href = "PaymentAgreement.html"><button type="submit"><strong>Payment Agreement</strong></button></a>
	    </div>
        <div class="push"></div>
    </div>
</div>

		<div class = "panel-footer">
		<div class = "footer">
			
			<p>39 Gnomestreet Way, Manchester, United Kingdom, MO6 OAR  Email: service@nbgardens.com
			</p>
			
			<p>
				Terms of service:
			</p>
			
			<p>
				Privacy policy:
			</p>
		</div>
		</div>	
		
</body>
</html>