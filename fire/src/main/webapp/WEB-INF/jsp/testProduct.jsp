<!-- Author: Sam Raspin -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<jsp:include page="../templates/template.jsp"/>

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Product </b> </h2>				
			
			</div>		

		</div>
	
		<div class = "panel-body">
	
			<div>
				<img id="identify" class="img-thumbnail" alt="Go Away Gnome" src="ImageFolder/badGnome.png" height="180" width="180"/>
				<p class="subtitle"><br><strong>PISSED OFF GNOME<br><br>Description:</strong><br>This is a basic gnome with anger issues.</p>
			</div><hr>
			<div class="rating">
				<p><strong>Item price: &pound1,000,000.05</strong></p>
				<strong>RATING: </strong><span> &#9734 </span><span>&#9734 </span><span>&#9734 </span><span>&#9734 </span><span>&#9734
				</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit"><img class="img-thumbnail" alt="hi" src="ImageFolder/shopCart.png" height="28" width="28"><strong> Add to cart</strong></button>
				<p/>
			</div><hr>
			<div>
				<p id="others" ><strong>Other items you may be interested in:</strong></p>
			</div>
			
			<div id="myCarousel" class="carousel slide container" style="width: 600px; margin: auto;" data-ride="carousel">
			
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
					<li data-target="#myCarousel" data-slide-to="3"></li>
				</ol>
				
				
				<div class="carousel-inner" role="listbox">
					<div class="item active">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newmooney.jpg" alt="newmooney"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newsavage.jpg" alt="newsavage"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newlittleFriend.jpg" alt="newlittleFriend"></a>
					</div>
				
					<div class="item">
					<a href="#"><img class="img-responsive center-block" src="ImageFolder/newfancy.jpg" alt="newfancy"></a>
					</div>
				</div>
	
			
				<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
			
			<div>
				<p class="subtitle"><strong>User Reviews:</strong></p><hr>
				<p>This is a basic user review telling you that the gnome is pretty good, but this page is so well designed!!!</p><hr>
				<p>I agree with the first review. This page is soooooo well designed!!!</p><hr>
			</div>
		
		</div>

	
	<footer class="panel-footer">
      <div class="container">
        <p class="text-muted">Place sticky footer content here.</p>
      </div>
    </footer>
		
		
		
	</body>
	
</html>