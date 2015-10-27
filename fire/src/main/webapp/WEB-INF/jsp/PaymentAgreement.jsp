<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/PaymentAgreement.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

	<div class="panel panel-default">

		<div class="jumbotron">

			<h2>
				<b> Checkout </b>
			</h2>

		</div>

	</div>

	<div class="panel-body">
		<div id="container">
			<div>
				<div id="leftpanel">
					<a href="#"><img class="img-thumbnail" src="ImageFolder/squarelittleFriend.jpg" alt="newlittleFriend" id="gnome1" /></a>
					<!-- <img id="identify" class="img-thumbnail" alt="savage gnome" src="ImageFolder/squaresavage.jpg"/> -->
				</div>
				<p class="subtitle" id="leftpanel">
					<strong>FANCY GNOME<br />
					<br />
					<br />Quantity: 3 <br />Total Price: (price x quantity)
					</strong><br />
					<br />
					<label><input type="checkbox" value=""/>Remove this
						order</label>
				</p>
				<p class="subtitle" id="totheright">
					<strong>Delivery Address:</strong><br />1 Far Away Magical Place
					Road<br />Gnome Underground City<br />GUC 51K
				</p>
			</div>
			<div id="fixit">
				<hr/>
			</div>

			<div>
				<div id="leftpanel">
					<a href="#"><img class="img-thumbnail" src="ImageFolder/squarefancy.jpg" alt="newlittleFriend" id="gnome1"/></a>
				</div>
				<p class="subtitle" id="leftpanel">
					<strong>FANCY GNOME<br />
					<br />
					<br />Quantity: 3 <br />Total Price: (price x quantity)
					</strong><br />
					<br />
					<label><input type="checkbox" value=""/>Remove this
						order</label>
				</p>
				<p class="subtitle" id="totheright">
					<strong>Delivery Address:</strong><br />1 Far Away Magical Place
					Road<br />Gnome Underground City<br />GUC 51K
				</p>
			</div>
			<div id="fixit">
				<hr/>
			</div>


			<div id="leftpanel">
				<a href="#"><img class="img-thumbnail" src="ImageFolder/squaresavage.jpg" alt="newlittleFriend" id="gnome1"/></a>
			</div>
			<p class="subtitle" id="leftpanel">
				<strong>FANCY GNOME<br />
				<br />
				<br />Quantity: 3 <br />Total Price: (price x quantity)
				</strong><br />
				<br />
				<label><input type="checkbox" value=""/>Remove this
					order</label>
			</p>
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />1 Far Away Magical Place
				Road<br />Gnome Underground City<br />GUC 51K
			</p>
			<div id="fixit">
				<hr/>
			</div>


			<div id="leftpanel">
				<a href="#"><img class="img-thumbnail" src="ImageFolder/squaremooney.jpg" alt="newlittleFriend" id="gnome1"/></a>
			</div>
			<p class="subtitle" id="leftpanel">
				<strong>FANCY GNOME<br />
				<br />
				<br />Quantity: 3 <br />Total Price: (price x quantity)
				</strong><br />
				<br />
				<label><input type="checkbox" value=""/>Remove this
					order</label>
			</p>
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />1 Far Away Magical Place
				Road<br />Gnome Underground City<br />GUC 51K
			</p>
			<div id="fixit">
				<hr/>
			</div>


			<div id="leftpanel">
				<a href="#"><img class="img-thumbnail" src="ImageFolder/squarelittleFriend.jpg" alt="newlittleFriend" id="gnome1"/></a>
			</div>
			<p class="subtitle" id="leftpanel">
				<strong>FANCY GNOME<br />
				<br />
				<br />Quantity: 3 <br />Total Price: (price x quantity)
				</strong><br />
				<br />
				<label><input type="checkbox" value=""/>Remove this
					order</label>
			</p>
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />1 Far Away Magical Place
				Road<br />Gnome Underground City<br />GUC 51K
			</p>
			<div id="fixit">
				<hr/>
			</div>


			<br /> <br />
			<a href="PaymentConfirmation"><button type="submit"><strong>Pay using default payment method</strong></button></a>
			<button type="submit"><strong>Remove selected orders</strong></button>

		</div>
		<div class="push"></div>
	</div>

	</div>

</body>
</html>