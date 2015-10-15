<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "Landing.css"/>

		<title>NB Gardens Home</title>
		
	</head>
	
	<body>
	
<!----------------------------------------------------------------------------------->
<!------Top navbar. Contains logo, search bar and dropdown for mobile---------------->
<!----------------------------------------------------------------------------------->		
				
		<nav class="navbar navbar-default">
		  
		<div class="container-fluid">
		
			<!-- Brand and toggle get grouped for better mobile display -->
    		<div class="navbar-header" id="navbar-header">
    		
   				<a class="btn btn-default navbar-toggle collapsed" type="button" data-toggle="collapse" data-target="#navbar-collapse" id="collapse-top">
			        <span class="glyphicon glyphicon-th-list"></span>
	      		</a>
   		
    			<a class="navbar-brand" href="/">
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
				            <li><a href="PaymentAgreement">Checkout</a></li>
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
						  <li><a href="OrderHistory">Order History</a></li>
						  <li><a href="OrderTracking">Track an Order</a></li>
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="/">Logout</a></li>
						</ul>
		        	
		        	</li>
		        
		        
		        	<li>
		        		<a href="About" id = "about-button-top">
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
		
			<h2> Welcome to NB Gardens</h2>
			
			<h4>NB Gardens specialises in high quality gnomes and other garden furniture.</h4>
		
		</div>	
		
	</div>	

		
<!--------------------------------------------->
<!------Main carousel-------------------------->		
<!--------------------------------------------->
		
		<div id="carousel-main" class="carousel slide" data-ride="carousel">
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		  
		    <div class="item active">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-02.jpg" alt="...">
		      <div class="carousel-caption">
		        ...
		      </div>
		    </div>
		    
		    <div class="item">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-04.jpg" alt="...">
		      <div class="carousel-caption">
		      </div>
		    </div>
		    
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-main" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-main" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>
		
<!--------------------------------------------------------->
<!------Left panel - Discontinued-------------------------->		
<!--------------------------------------------------------->

	<div id = "left-panel">
		
		
		<div class = "jumbotron jumbotron-bottom">
		
			<h2> Special offers </h2>
			
			<h4></h4>
		
		</div>
		
		<div id="carousel-left" class="carousel slide" data-ride="carousel">
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		  
		    <div class="item active">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-02.jpg" alt="...">
		      <div class="carousel-caption">
		        ...
		      </div>
		    </div>
		    
		    <div class="item">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-04.jpg" alt="...">
		      <div class="carousel-caption">
		      </div>
		    </div>
		    
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-left" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-left" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		  
		</div>
		
		
	</div>


<!--------------------------------------------------->
<!------Right panel - Sales-------------------------->		
<!--------------------------------------------------->

	<div id = "right-panel">
	
	
		<div class = "jumbotron jumbotron-bottom">
		
			<h2> Limited availability </h2>
			
			<h4></h4>
		
		</div>

		<div id="carousel-right" class="carousel slide" data-ride="carousel">
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		  
		    <div class="item active">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-02.jpg" alt="...">
		      <div class="carousel-caption">
		        ...
		      </div>
		    </div>
		    
		    <div class="item">
		      <img src="http://weknowyourdreams.com/images/gnome/gnome-04.jpg" alt="...">
		      <div class="carousel-caption">
		      </div>
		    </div>
		    
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-right" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-right" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>
	
	
	</div>

<!----------------------------->
<!------Footer----------------->		
<!----------------------------->
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