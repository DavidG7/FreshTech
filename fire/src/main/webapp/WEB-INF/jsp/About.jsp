<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/About.css" />
	<title>NB Gardens</title>
	
	<script src="https://maps.googleapis.com/maps/api/js"></script>
    <script>
      function initialize() {
        var mapCanvas = document.getElementById('map');
        var mapOptions = {
          center: new google.maps.LatLng(53.4792, -2.3),
          zoom: 9,
          mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(mapCanvas, mapOptions)
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
    </head>
    
    <body>
<div th:fragment="content">

<div class="panel panel-default">
				<div class = "jumbotron">
					<h2> About</h2>
				<h4>NBGardens is a unique garden furniture and Gnome sales
	business providing top quality products to our huge customer
	base. We offer the highest quality of service and a huge array
	of products. We have one of the biggest Gnome collections on
   earth and are proud to have been in business for over 100 years.<br/></h4></div></div>

			
<div class ="contact">
		 <h2> Contact Information<br/> </h2>
		</div>
	
  
   <p class ="telephone">
  <span class= "glyphicon glyphicon-earphone"> Telephone: </span><br/> 01234567573
   </p>
   
   <p class = "address">
 <span class= "glyphicon glyphicon-pencil"> Address: </span> <br/>39 Gnomestreet Way<br/>
			Manchester<br/>
			United Kingdom<br/>
			MO6OAR<br/>
   </p>
   
   <p class = "email">

  <span class= "glyphicon glyphicon-envelope"> Email: </span><br/> service@nbgardens.com
		</p>
	
		<div class = "image">
<!--  <img src="ImageFolder\200.gif" alt="Theres no business like Gnome business" style="width:310px;height:220px;">-->
</div>
		
				    <div id="map"></div>
</div>
		<div class="push"></div>
	</body>
	
</html>