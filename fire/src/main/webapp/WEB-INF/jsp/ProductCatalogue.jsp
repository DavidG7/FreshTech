<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ProductCatalogue.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> Products</h2>
				
				<h4>NBGardens offers the best Gnomes in the world.....we sell garden stuff too.<br/></h4>
			
			</div>		

		</div>
		
		<ul class="rig columns-3">
<li><a href="Product"><h3>Samuel L Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/SamuelLGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
<li><a href="Product"><h3>Dino Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/DinoGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
	<li><a href="Product"><h3>Gnome</h3>
<p class ="price">£20 </p> 
		<img src="ImageFolder/badGnome.png"/>
		
		<p><strong>RATING: </strong><span> &#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734; </span><span>&#9734;
				</span>
				</p></a>
	</li>
</ul>
			

					


		<div id = "footer" class = "footer">
	
		
		
		</div>	
		
		
		</div>
		
	</body>
	
</html>