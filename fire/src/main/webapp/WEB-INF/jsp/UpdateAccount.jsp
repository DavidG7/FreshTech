<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/UpdateAccount.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">
		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Update Details </b> </h2>			
			
			</div>		

		</div>
	

		<div class = "panel-body">
		
			<div id="container">
			
				<div align="center">
					<p class="subtitle"><strong>Current Details:</strong></p>
					<p id="writing"><strong>Contact Details:</strong></p>
					<br th:text="${customer.customerName}"></br>
					Home telephone:<br th:text="${customer.customerPhone}"></br>
					Mob telephone: 077 221 379 50<br/>
					E-mail:<p th:text="${customer.customerEmail}" ></p>
					<p id="writing"><strong>Default Delivery Address:</strong><br th:text="${customerAddress}" ></br></p>
					<p id="writing"><strong>Default Payment Details:</strong><br/>
					Visa Debit Card<br/>
					Card Number: 3456-9012-5678-1234<br/>
					Sort Code: 012345678<br/>
					Cardholder Name: MR G NOME</p>
					
				</div>
			
				<div id="fixit"><hr/></div>
				
				
				
				
				<div id="dropmenus">
		 			<div class="dropdown">
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 1" data-toggle="dropdown">Select Default Delivery Address
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a href="#">Various</a></li>
						<li><a href="#">saved</a></li>
						<li><a href="#">addresses</a></li>
						<li><a href="#">belong</a></li>
						<li><a href="#">here</a></li>
						</ul><p></p>
					</div>
					<div><a href="ChooseAddress"><button type="submit"><strong>Edit Address Details</strong></button></a></div>
				</div>
				
				<div id="dropmenus">
					<div class="dropdown">
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 2" data-toggle="dropdown">Select Default Payment Details
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a href="#">Various</a></li>
						<li><a href="#">saved</a></li>
						<li><a href="#">payment</a></li>
						<li><a href="#">methods</a></li>
						<li><a href="#">belong</a></li>
						<li><a href="#">here</a></li>
						</ul><p></p>
					</div>
					<div><a href="AddPaymentDetails"><button type="submit"><strong>Edit Payment Details</strong></button></a></div>
				</div>
				
				
				<div id="fixit"><hr/></div>
				
				<div id="column2">
  					<strong>Alternatively, please enter a<br/>new address below:</strong><br/><br/>
  					
					Address Line 1 :<br/>
					<input type = "text" name = "addressline1"/>
					<br/>
					<br/>
					Address Line 2 :<br/>
					<input type = "text" name = "addressline2"/>
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
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
			
				<div id="column2">
  					<strong>Alternatively, please enter a<br/>new payment method below:</strong><br/><br/>
  					
        			<div class="dropdown">
						
   		 				<button class="btn btn-success dropdown-toggle" type="button" id="dropdown menu 2" data-toggle="dropdown">Select Card Type
    					<span class="caret"></span></button>
						<ul class="dropdown-menu">
						<li><a>Mastercard</a></li>
						<li><a>Visa</a></li>
						<li><a>Visa Electron</a></li>
						<li><a>American Express</a></li>
						</ul><p></p>
					</div>
					Card Number :<br/>
					<input type = "text" name = "CardNumber"/>
					<br/>
					<br/>
					Sort Code :<br/>
					<input type = "text" name = "SortCode"/>
					<br/>
					<br/>
					CVV :<br/>
					<input type = "text" name = "CVV"/>
					<br/>
					<br/>
					Name on Card :<br/>
					<input type = "text" name = "NameonCard"/>
					<br/>
					<br/>
					Billing Address :<br/>
					<input type = "text" name = "BillAdd"/>
					<br/>
					<br/>
					Billing Postcode :<br/>
					<input type = "text" name = "BillPost"/>
					<br/>
					<br/>
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
       			
       			<div id="column2">
  					<strong>Update contact details<br/>if neccessary:</strong><br/><br/>
  					
					First Name :<br/>
					<input type = "text" name = "FirstName"/>
					<br/>
					<br/>
					Surname Name :<br/>
					<input type = "text" name = "SurnameName"/>
					<br/>
					<br/>
					Home Telephone :<br/>
					<input type = "text" name = "HomePhone"/>
					<br/>
					<br/>
					Mobile Telephone :<br/>
					<input type = "text" name = "MobilePhone"/>
					<br/>
					<br/>
					Email Address :<br/>
					<input type = "text" name = "Email"/>
					<br/>
					<br/>
					
       				<button type="submit"><strong>Submit</strong></button>
       			</div>
       		</div>
       		
		</div>
		<div class="push"></div>
		</div>
		
	</body>
	
</html>