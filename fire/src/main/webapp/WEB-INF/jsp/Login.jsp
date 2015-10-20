<html>
	<head>
   		 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap/css/bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
			
		<link type = "text/css" rel = "stylesheet" href = "css/ChooseAddress.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Login.css"/>

		<title>NB Gardens Add Details</title>
		
	</head>
	
	<body>

		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			
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
				
			</div> 

			<div class="collapse navbar-collapse" id="navbar-collapse">
		      
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="ProductCatalogue" id = "home-button-top">
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
						  <li><a href="OrderTracking">Track an Order</a></li>
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
			
				<h2> <b> Login </b> </h2>
				
				<h4> Please enter Log in details </h4>
						
			
			</div>		

		</div>

		<div class = "panel-body">
	    
	   <div id="centre">
		    <p>Username :<br/>
			<input type = "text" name = "username"/>
			</p>
			
			<p>Password :<br/>
			<input type = "text" name = "password"/>
			</p>
			
				<a href = "#"><button type="submit"><strong>Log In</strong></button></a>
		</div>
	   

</div>

<div id = "space"></div>

		<div id = "footer" class = "panel-footer">
	
			<p> Credit to Bootstrap <i>(http://getbootstrap.com)</i> for the overall website design, 
				as well as Glyphicons <i>(http://glyphicons.com)</i> for the Halfling icon set.
			</p>
			<p>
				Using the Readable theme <i>(https://bootswatch.com/readable)</i> with our own modifications.
			</p>
		
		</div>	
		
</body>
</html>