<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> Credit Details</h2>
						
			</div>		

		</div>
			
		<div class = "panel-body" id="centre">

		<h2>Credit Score</h2>
		<br/>
		<br/>
		<div th:text="${session.sessionUser}"></div>
		<h3 th:text="${credit}"></h3>
		<br/>
		<br/>
		
		
  		<div class="push"></div>
   
		</div>
		</div>	
		
	</body>
	
</html>