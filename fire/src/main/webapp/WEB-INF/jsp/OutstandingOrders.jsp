<!-- Author: Sam Raspin -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

<script src="bootstrap\js\bootstrap.js"></script>

<link type="text/css" rel="stylesheet"
	href="bootstrap\css\bootstrap_cosmo.css" />

<link type="text/css" rel="stylesheet" href="css/Template.css" />

<link type="text/css" rel="stylesheet" href="css/OutstandingOrders.css" />

<title>NB Gardens Outstanding Orders</title>

</head>

<body>

	<nav class="navbar navbar-default">

		<div class="container-fluid">

			<div class="navbar-header" id="navbar-header">

				<a class="btn btn-default navbar-toggle collapsed" type="button"
					data-toggle="collapse" data-target="#navbar-collapse"
					id="collapse-top"> <span class="glyphicon glyphicon-th-list"></span>
				</a> <a class="navbar-brand" href="Landing"> <img id="logo"
					alt="NB Gardens" src="ImageFolder/NBGardensLogo.png" />
				</a>

				<div class="row search-row" id="top-search">
					<div>
						<div class="input-group">
							<span class="input-group-btn"> <a class="btn btn-default"
								type="button" id="search-button"> <span
									class="glyphicon glyphicon-search"></span>
							</a>
							</span> <input class="form-control" type="text" id="search-bar" />

						</div>
					</div>
				</div>

			</div>
			

			<div class="collapse navbar-collapse" id="navbar-collapse">

				<ul class="nav navbar-nav">

					<li><a href="Landing" id="home-button-top"> <span
							class="glyphicon glyphicon-home"></span> Home
					</a></li>

				</ul>

				<ul class="nav navbar-nav">

					<li><a href="ProductCatalogue" id="home-button-top"> <span
							class="glyphicon glyphicon-gift"></span> Products
					</a></li>

				</ul>



				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href="#"
						class="button-top dropdown-toggle" id="basket-top"
						data-toggle="dropdown"> <span
							class="glyphicon glyphicon-shopping-cart"></span> Basket <span
							class="caret"></span>

					</a>

						<ul class="dropdown-menu" id="basket-dropdown">
							<li><a href="Basket">View basket</a></li>
							<li><a href="PaymentAgreement">Checkout</a></li>
							<li class="divider"></li>
							<li><a href="Landing">Cancel Basket</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" id="account-top"> <span
							class="glyphicon glyphicon-user"></span> My Account <span
							class="caret"></span>

					</a>


						<ul class="dropdown-menu" id="account-dropdown">
							<li><a>Logged in as: ... </a></li>
							<li><a href="OrderHistory">Order History</a></li>
							<li><a href="OrderTracking">Track an Order</a></li>
							<li><a href="UpdateAccount">Update your Account</a></li>
							<li><a href="ViewCreditDetails">View Credit</a></li>
							<li class="divider"></li>
							<li><a href="Landing">Logout</a></li>
						</ul></li>


					<li><a href="About" id="about-button-top"> <span
							class="glyphicon glyphicon-question-sign"></span> About NB
							Gardens
					</a></li>

				</ul>

			</div>
			

		</div>
		

	</nav>

	<div class="panel panel-default">

		<div class="jumbotron">

			<h2>
				<b> Outstanding Orders </b>
			</h2>

		</div>

	</div>

	<div class="panel-body">

		<div>
			<button type="submit">
				<strong>Pay for selected</strong>
			</button>
			&nbsp;
			<button type="submit">
				<strong>Pay for all</strong>
			</button>
		</div>

		<div>
			<hr />
			<img id="identify" class="img-thumbnail" alt="fancy gnome"
				src="ImageFolder/squarefancy.jpg" />
			<p class="subtitle" id="totheright">
				<strong>Delivery Address:</strong><br />1 Far Away Magical Place
				Road<br />Gnome Underground City<br />GUC 51K
			</p>
			<p class="subtitle">
				<br />
				<strong>FANCY GNOME<br />
				<br />Order Details
				</strong><br />Quantity: 3<br />Price: &pound;11.50 <br />Date of delivery:
				dd/mm/yyyy<br />
				<strong>Total Price: (price x quantity)</strong>
			</p>
			<br /> <label><input type="checkbox" value="" />Select this
				order</label>
		</div>

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
			<hr />
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
		<hr/>

	</div>

	<div id="footer" class="panel-footer">

		<p>
			Credit to Bootstrap <i>(http://getbootstrap.com)</i> for the overall
			website design, as well as Glyphicons <i>(http://glyphicons.com)</i>
			for the Halfling icon set.
		</p>
		<p>
			Using the Cosmo theme <i>(https://bootswatch.com/cosmo)</i> with our
			own modifications.
		</p>

	</div>

</body>

</html>