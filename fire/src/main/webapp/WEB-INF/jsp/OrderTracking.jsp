<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/About.css"/>

		<title>NB Gardens Template</title>
		
	</head>
	
	<body>
				
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			<!-- brand and toggle get grouped for better mobile display -->
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing">
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
				
			</div> <!-- /.navbar-header -->

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
		        		<a href="ProductCatalogue" id = "home-button-top">
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
				            <li><a href="Basket.html">View basket</a></li>
				            <li><a href="PaymentAgreement">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="Landing.html">Cancel Basket</a></li>
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
						  <li><a href="OrderTrackingl">Track an Order</a></li>
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landingl">Logout</a></li>
						</ul>
		        	
		        	</li>
		        
		        
		        	<li>
		        		<a href="About.html" id = "about-button-top">
		        		<span class="glyphicon glyphicon-question-sign"></span>
		        		About NB Gardens
		        		</a>
		        	</li>
	        
				</ul>
    
			</div><!-- /.navbar-collapse -->
    
		</div><!-- /.container-fluid -->	
		
		</nav>

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
		
	</body>
	
</html>