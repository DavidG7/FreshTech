<!-- Authors: Vincent Tomlinson & Sam Raspin -->

	<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "PaymentAgreement.css"/>

		<title>NB Gardens Checkout</title>
		
	</head>
	
	<body>
<!----------------------------------------------------------------------------------->
<!------ Top navbar. Contains logo, search bar and dropdown for mobile--------------->
<!----------------------------------------------------------------------------------->		
				
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			<!-- Brand and toggle get grouped for better mobile display -->
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing.html">
      				<img id = "logo" alt = "NB Gardens" src = "bootstrap\NBGardensLogo.png"/>
      			</a>

	    		<div class="row search-row" id = "top-search">
	  				<div>
	    				<div class="input-group">
	    					<span class="input-group-btn">
	    						<a class="btn btn-default" type="button" id="search-button">
	      							<span class="glyphicon glyphicon-search"></span>
	      						</a>
	      					</span>
	     					

	     					<input class="form-control" type="text" id="search-bar">
	     					
	    				</div>
					</div>
				</div>
				
			</div> <!-- /.navbar-header -->
			
    		
<!------------------------------------------------------------------------------->
<!---------- Collect the nav links, forms, and other content for toggling ------->
<!------------------------------------------------------------------------------->

			<div class="collapse navbar-collapse" id="navbar-collapse">
		      
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing.html" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-home"></span>
		        		Home
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="ProductCatalogue.html" id = "home-button-top">
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
				            <li><a href="OrderCheckout.html">Checkout</a></li>
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
						  <li><a href="OrderHistory.html">Order History</a></li>
						  <li><a href="OrderTracking.html">Track an Order</a></li>
						  <li><a href="OutstandingOrders.html">Outstanding Orders</a></li>
						  <li><a href="UpdateAccount.html">Update your Account</a></li>
						  <li><a href="ViewCreditDetails.html">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landing.html">Logout</a></li>
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

<!--------------------------------------------->
<!------Top banner (Jumbotron)------------------>		
<!--------------------------------------------->
	
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Checkout </b> </h2>			
			
			</div>		

		</div>
		
<!--------------------------------------------->
<!------INSERT PAGE BODY HERE------------------>		
<!--------------------------------------------->
			
		
		<div class = "panel-body">
			<div id=container>
			<div>
				<div id="leftpanel">	 
					<a href=# ><img class="img-thumbnail" src="ImageFolder/squarelittleFriend.jpg" alt="newlittleFriend" id="gnome1"></a>
					<!-- <img id="identify" class="img-thumbnail" alt="savage gnome" src="ImageFolder/squaresavage.jpg"/> -->
				</div>
				<p class="subtitle" id="leftpanel"><strong>FANCY GNOME<br><br><br>Quantity: 3
				<br>Total Price: (price x quantity)</strong><br><br><label><input type="checkbox" value="">Remove this order</label></p>
				<p class="subtitle" id="totheright"><strong>Delivery Address:</strong><br>1 Far Away Magical Place Road<br>Gnome Underground City<br>GUC 51K</p>
			</div>
			<div id="fixit"><hr></div>
			
			<div>
				<div id="leftpanel">	 
					<a href=# ><img class="img-thumbnail" src="ImageFolder/squarefancy.jpg" alt="newlittleFriend" id="gnome1"></a>  
				</div>
				<p class="subtitle" id="leftpanel"><strong>FANCY GNOME<br><br><br>Quantity: 3
				<br>Total Price: (price x quantity)</strong><br><br><label><input type="checkbox" value="">Remove this order</label></p>
				<p class="subtitle" id="totheright"><strong>Delivery Address:</strong><br>1 Far Away Magical Place Road<br>Gnome Underground City<br>GUC 51K</p>
			</div>
			<div id="fixit"><hr></div>
			
			
			<div id="leftpanel">	 
				<a href=# ><img class="img-thumbnail" src="ImageFolder/squaresavage.jpg" alt="newlittleFriend" id="gnome1"></a>  
			</div>
			<p class="subtitle" id="leftpanel"><strong>FANCY GNOME<br><br><br>Quantity: 3
				<br>Total Price: (price x quantity)</strong><br><br><label><input type="checkbox" value="">Remove this order</label></p>
				<p class="subtitle" id="totheright"><strong>Delivery Address:</strong><br>1 Far Away Magical Place Road<br>Gnome Underground City<br>GUC 51K</p>
			<div id="fixit"><hr></div>
			
			
			<div id="leftpanel">	 
				<a href=# ><img class="img-thumbnail" src="ImageFolder/squaremooney.jpg" alt="newlittleFriend" id="gnome1"></a>  
			</div>
			<p class="subtitle" id="leftpanel"><strong>FANCY GNOME<br><br><br>Quantity: 3
				<br>Total Price: (price x quantity)</strong><br><br><label><input type="checkbox" value="">Remove this order</label></p>
				<p class="subtitle" id="totheright"><strong>Delivery Address:</strong><br>1 Far Away Magical Place Road<br>Gnome Underground City<br>GUC 51K</p>
			<div id="fixit"><hr></div>
			
			
			<div id="leftpanel">	 
				<a href=# ><img class="img-thumbnail" src="ImageFolder/squarelittleFriend.jpg" alt="newlittleFriend" id="gnome1"></a>  
			</div>
			<p class="subtitle" id="leftpanel"><strong>FANCY GNOME<br><br><br>Quantity: 3
				<br>Total Price: (price x quantity)</strong><br><br><label><input type="checkbox" value="">Remove this order</label></p>
				<p class="subtitle" id="totheright"><strong>Delivery Address:</strong><br>1 Far Away Magical Place Road<br>Gnome Underground City<br>GUC 51K</p>
			<div id="fixit"><hr></div>
			
			
			<br>
			<br>
				<a href = "PaymentConfirmation.html"><button type="submit"><strong>Pay using default payment method</strong></button></a>
				<button type="submit"><strong>Remove selected orders</strong></button>
			
		</div>
		</div>
<div id = "space"></div>

<!----------------------------->
<!------Footer----------------->		
<!----------------------------->
		
		<div id = "footer" class = "panel-footer">
			
			<p>39 Gnomestreet Way, Manchester, United Kingdom, MO6 OAR &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			Telephone: 01234567573 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Email: service@nbgardens.com
			</p>
			
			<p>
				Terms of service:
			</p>
			
			<p>
				Privacy policy:
			</p>
		
		</div>	
		
</body>
</html>