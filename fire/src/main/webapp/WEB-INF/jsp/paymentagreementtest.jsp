<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<jsp:include page="WEB-INF/templates/template.jsp"/>
	<!--------------------------------------------->
	<!------Top banner (Jumbotron)------------------>
	<!--------------------------------------------->
	<div class="panel panel-default">
		<div class="jumbotron">
			<h2><b> Payment Agreement </b></h2>
			<h4>Please review your items below before proceeding to payment.</h4>
		</div>
	</div>
	<!--------------------------------------------->
	<!------INSERT PAGE BODY HERE------------------>
	<!--------------------------------------------->
	<div class="panel-body">
		<form action="action_page.php">
			<div id="leftpanel">
				<c:forEach var="checkoutitems" items="${checkoutitems}">
					<td>${product.name}</td>
					<div id="soandso">
						<a href=#><img class="img-responsive left-block" src="${product.image}" alt="${product.name}" id="gnome1"></a>
					</div>
					<td>${product.price}</td>
					<p>ITEMS SELECED FOR CHECKOUT WILL GO HERE</p>					
				</c:forEach>
			</div>
			<br> <br> <br> <br> <br> <br>
			<h4>To be delivered to:</h4>
			<p>Bob Jones</p>
			<p>12 Gnomeway Drive</p>
			<p>Gnomington</p>
			<p>Cheshire</p>
			<p>England</p>
			<p>M45 5GH</p>
			<br> <br> 
			<a href="Basket.html"><img class="img-responsive left-block" src="ImageFolder/Proceedtocheckout.png" alt="Proceedtocheckout"></a>
			<br> <br> 
			<a href="ChooseAddress.html"><img class="img-responsive left-block" src="ImageFolder/Editdeliverydetails.png" alt="Editdeliverydetails"></a>
		</form>
	</div>
	<div id="space"></div>