	<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
	<head>
		<meta charset="ISO-8859-1"/>
	
		<script src = "http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		
		<script src = "bootstrap\js\bootstrap.js"></script>		
		
		<link type = "text/css" rel = "stylesheet" href = "bootstrap\css\bootstrap_cosmo.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Template.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/hooseAddress.css"/>
		
		<link type = "text/css" rel = "stylesheet" href = "css/Register.css"/>

		<title>NB Gardens Add Details</title>
		
	</head>
	
	<body>
				
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
						  <li><a href="UpdateAccount">Update your Account</a></li>
						  <li><a href="ViewCreditDetails">View Credit</a></li>
						  <li class="divider"></li>
						  <li><a href="Landing">Logout</a></li>
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
			
				<h2> <b> Register </b> </h2>
				
				<h4> Please fill in the form below to register your details </h4>
						
			
			</div>		

		</div>
<form th:action="@{/postReg}" method="post" >
		<div class = "panel-body">
		<div id = "centre">
		<p> 
         <label for="firstnamesignup" class="fname" data-icon="u">First Name:</label>
         <input id="firstnamesignup" name="firstnamesignup" required="required" type="text" placeholder="First" />
    </p>
    <p> 
         <label for="lastnamesignup" class="lname" data-icon="u">Last Name:</label>
         <input id="lastnamesignup" name="lastnamesignup" required="required" type="text" placeholder="Last" />
    </p>
    <p> 
         <label for="usernamesignup" class="uname" data-icon="u">Username:</label>
         <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="Username" />
    </p>
    <p> 
         <label for="passwordsignup" class="youpasswd" data-icon="p">Password:</label>
         <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="Password"/>
    </p>
    <p> 
         <label for="passwordsignup_confirm" class="password" data-icon="p">Confirm Password:</label>
         <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="Password"/>
    </p>
    <p> 
         <label for="emailsignup" class="youmail" data-icon="e" >Email:</label>
         <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="example@domain.com"/> 
    </p>
    <p> 
         <label>Date of Birth:</label>
         <select name="month" onChange="changeDate(this.options[selectedIndex].value);">
         <option value="na">Month</option>
         <option value="1">January</option>
         <option value="2">February</option>
         <option value="3">March</option>
         <option value="4">April</option>
         <option value="5">May</option>
         <option value="6">June</option>
         <option value="7">July</option>
         <option value="8">August</option>
         <option value="9">September</option> 
         <option value="10">October</option>
         <option value="11">November</option>
         <option value="12">December</option>
         </select>
         <select name="day" id="day">
         <option value="na">Day</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option> 
         <option value="10">10</option>
         <option value="11">11</option>
         <option value="12">12</option>
         <option value="10">13</option>
         <option value="10">14</option>
         <option value="10">15</option>
         <option value="10">16</option>
         <option value="10">17</option>
         <option value="10">18</option>
         <option value="10">19</option>
         <option value="11">20</option>
         <option value="12">21</option>
         <option value="10">22</option>
         <option value="10">23</option>
         <option value="10">24</option>
         <option value="10">25</option>
         <option value="10">26</option>
         <option value="10">27</option>
         <option value="11">28</option>
         <option value="12">29</option>
         <option value="10">30</option>
         <option value="10">31</option>
         </select>
         <select name="year" id="year">
         <option value="na">Year</option>
         </select>
         <script language="JavaScript" type="text/javascript">
         function changeDate(i){
         var e = document.getElementById('day');
         while(e.length>0)
         e.remove(e.length-1);
         var j=-1;
         if(i=="na")
         k=0;
         else if(i==2)
         k=28;
         else if(i==4||i==6||i==9||i==11)
         k=30;
         else
         k=31;
         while(j++<k>){
         var s=document.createElement('option');
         var e=document.getElementById('day');
         if(j==0){
         s.text="Day";
         s.value="na";
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}
         else{
         s.text=j;
         s.value=j;
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}}}
         y = 1998;
         while (y-->1908){
         var s = document.createElement('option');
         var e = document.getElementById('year');
         s.text=y;
         s.value=y;
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}
         </k>
         </script> 
    </p>
    <p> 
         <label>Gender:</label>
         <select name="Gender">
         <option value="male">Male</option>
         <option value="female">Female</option>
         </select>
    </p>
    	<button type="submit"><strong>Register</strong></button>
</div>
</div>
</form>

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