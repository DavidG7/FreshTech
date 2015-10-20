	<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap/css/bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/ChooseAddress.css"/>

		<title>NB Gardens Edit Address</title>
		
	</head>
	
	<body>
	
		<div class="wrapper">

		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
		
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="Landing.jsp">
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
		        		<a href="ProductCatalogue.jsp" id = "home-button-top">
		        		<span class= "glyphicon glyphicon-home"></span>
		        		Home
		        		</a>
		        	</li>
		      	
		      	</ul>
		      	
		      	<ul class = "nav navbar-nav">
		      	
		      		<li>
		        		<a href="Landing.jsp" id = "home-button-top">
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
				            <li><a href="OrderCheckout.jsp">Checkout</a></li>
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
						  <li><a href="OutstandingOrders.jsp">Outstanding Orders</a></li>
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
			
				<h2> <b> Edit Address </b> </h2>
				
				<h4> Please follow the instructions to edit your addresses </h4>
			
			</div>

		</div>
		

		
		<div class = "panel-body">
	    
		 
	   <div class="dropdown">
   		 <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Choose Address to Edit
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">This</a></li>
      <li><a href="#">is</a></li>
      <li><a href="#">where</a></li>
      <li><a href="#">addresses</a></li>
      <li><a href="#">will</a></li>
      <li><a href="#">go</a></li>
      </ul>
  </div>
  
  <h4> Please edit the address as appropraite. </h4>
  
        First Name :<br/>
		<input type = "text" name = "firstname"/>
		<br/>
		<br/>
		Last Name :<br/>
		<input type = "text" name = "lastname"/>
		<br/>
		<br/>
		Address Line 1 :<br/>
		<input type = "text" name = "addressline1"/>
		<br/>
		<br/>
		Address Line 2 :<br/>
		<input type = "text" name = "addressline2"/>
		<br/>
		<br/>
		Address Line 3 :<br/>
		<input type = "text" name = "addressline3"/>
		<br/>
		<br/>
		City :<br/>
		<input type = "text" name = "city"/>
		<br/>
		<br/>
		County :<br/>
		<input type = "text" name = "county"/>
		<br/>
		<br/>
		Postcode :<br/>
		<input type = "text" name = "postcode"/>
		<br/>
		<br/>
        <a href = "Landing.jsp"><button type="submit"><strong>Submit</strong></button></a>
        <button type="submit"><strong>Delete</strong></button>
  
  <div class="push"></div>
		</div>
</div>

</body>
</html>