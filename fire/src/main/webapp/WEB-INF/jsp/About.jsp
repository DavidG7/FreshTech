<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/About.css" />
	<title>NB Gardens</title>
	
	<script src="http://maps.googleapis.com/maps/api/js"></script>
    <script>
      function initialize() {
        var mapProp = {
        	center:new google.maps.LatLng(0.196671, -176.477006),
        	zoom:10,
        	mapTypeId:google.maps.MapTypeId.ROADMAP
        };
        var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
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
	
<div class="telephone">
  <p>
  <span class= "glyphicon glyphicon-earphone"> Telephone: </span><br/> 01234567573
  </p>
</div>
<div class="address">
   <p>
 <span class= "glyphicon glyphicon-pencil"> Address: </span> <br/>39 Gnomestreet Way<br/>
			Manchester<br/>
			United Kingdom<br/>
			MO6OAR<br/>
   </p>
</div>
<div class="email">
   <p>

  <span class= "glyphicon glyphicon-envelope"> Email: </span><br/> service@nbgardens.com
		</p>
</div>	
<br/>
<br/>
<br/>	
<br/>
<br/>
<br/>				    
<div id="googleMap" style="width:500px;height:380px;"></div>	    
<br/>
<br/>
<br/>	
<br/>
<br/>
<br/>	
		
</div>

	</body>
	
</html>