<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/OrderHistory.css"/>

		<title>NB Gardens Template</title>
		
	</head>
	
	<body>

		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="/">
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
		        		<a href="/" id = "home-button-top">
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
				            <li><a href="Basket">View basket</a></li>
				            <li><a href="PaymentAgreementl">Checkout</a></li>
				            <li class="divider"></li>
				            <li><a href="/">Cancel Basket</a></li>
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
						  						  <li><a href="OrderHistory.html">Order History</a></li>
						  <li><a href="OrderTracking">Track an Order</a></li>
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="/l">Logout</a></li>
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
			
				<h2> Order History</h2>
			
			</div>		

		</div>
		
		<ul class="rig columns-2">
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
<li><p>Order ID: 02927363484 </p>
<p class ="price"> Order Total: £20 </p> 
<p>Order Date: 05/10/1992 </p>
		<img src="ImageFolder/badGnome.png"/>
		<div class = "trash">
		<a href ="#"> <span class="glyphicon glyphicon-trash"></span> Remove Order</a>
		</div>
		<div class = "star">
		<a href ="#"> <span class="glyphicon glyphicon-star"></span> Rate Order</a>
		</div>
	</li>
</ul>
		<div id = "footer" class = "footer">
	
		
		
		</div>	
		
	</body>
	
</html>