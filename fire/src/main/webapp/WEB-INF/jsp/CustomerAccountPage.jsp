<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link  type="text/css" rel="stylesheet" href="css/Register.css" />
		<link  type="text/css" rel="stylesheet" href="css/CustomerAccount.css" />
		
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

	
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
	
		
</body>
</html>