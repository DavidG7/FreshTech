<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/OutstandingOrders.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

	<div class="panel panel-default">

		<div class="jumbotron">

			<h2>
				<b> Outstanding Orders </b>
			</h2>

		</div>

	</div>

	<div class="panel-body">

		<div>
			<a href="PaymentAgreement"><button type="submit"><strong>Pay for selected</strong></button></a>
			&nbsp;
			<a href="PaymentAgreement"><button type="submit"><strong>Pay for all</strong></button></a>
		</div>

		<div th:each="customerOrders : ${customerOrders}">
			<hr />
			<img id="identify" class="img-thumbnail" alt="fancy gnome" th:src="'ImageFolder/'+${products.image}" width="140"/>
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br /><span th:text = "${address.address}"></span><br/><span th:text = "${address.postcode}"></span>
			</p>
			<p class="subtitle">
				<br />
				<span th:text="${products.productName}"></span><br />
				<br /><strong>Order Details
				</strong><br />Quantity: 3<br />Price: <span th:text = "'&pound;'+${products.price}+'0'"></span><br/>Date of delivery:
				dd/mm/yyyy<br />
				<strong>Total Price: (price x quantity)</strong>
			</p>
			<br /> <label><input type="checkbox" value="" />Select this
				order</label>
		</div>
<!-- 
		<div>
			<hr />
			<img id="identify" class="img-thumbnail" alt="savage gnome"
				src="ImageFolder/squaresavage.jpg" />
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />1 Far Away Magical Place
				Road<br />Gnome Underground City<br />GUC 51K
			</p>
			<p class="subtitle">
				<br />
				<strong>SAVAGE GNOME<br />
				<br />Order Details
				</strong><br />Quantity: 1<br />Price: &pound;19.50 <br />Date of delivery:
				dd/mm/yyyy<br />
				<strong>Total Price: (price x quantity)</strong>
			</p>
			<br /> <label><input type="checkbox" value="" />Select this
				order</label>
		</div>

		<div>
			<hr/>
			<img id="identify" class="img-thumbnail" alt="little friend gnome"
				src="ImageFolder/squarelittleFriend.jpg" />
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />17 Gnome's Mum's Road<br />Gnome
				Underground City<br />GUC 10L
			</p>
			<p class="subtitle">
				<br />
				<strong>LITTLE FRIEND GNOME<br />
				<br />Order Details
				</strong><br />Quantity: 4<br />Price: &pound;8.00 <br />Date of delivery:
				dd/mm/yyyy<br />
				<strong>Total Price: (price x quantity)</strong>
			</p>
			<br /> <label><input type="checkbox" value="" />Select this
				order</label>
		</div>
-->
		<hr/>
		<div class="push"></div>
	</div>
	
	</div>

</body>

</html>