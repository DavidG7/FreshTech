	<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Edit Address </b> </h2>
				
				<h4> Please follow the instructions to edit your addresses </h4>
			
			</div>

		</div>
		

		
		<div class = "panel-body">
	    
		 
	   <div class="dropdown">
   		 <button class="btn btn-success dropdown-toggle" type="button" data-toggle="dropdown">Choose Address to Edit
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">This</a></li>
      <li><a href="#">is</a></li>
      <li><a href="#">where</a></li>
      <li><a href="#">addresses</a></li>
      <li><a href="#">will</a></li>
      <li><a href="#">go</a></li>
      </ul>
  </div>
  
  <h4> Please edit the address as appropriate. </h4>
  
        First Name :<br/>
		<input type = "text" name = "firstname"/>
		<br/>
		<br/>
		Last Name :<br/>
		<input type = "text" name = "lastname"/>
		<br/>
		<br/>
		Address Line 1 :<br/>
		<input type = "text" name = "addressline1"/>
		<br/>
		<br/>
		Address Line 2 :<br/>
		<input type = "text" name = "addressline2"/>
		<br/>
		<br/>
		Address Line 3 :<br/>
		<input type = "text" name = "addressline3"/>
		<br/>
		<br/>
		City :<br/>
		<input type = "text" name = "city"/>
		<br/>
		<br/>
		County :<br/>
		<input type = "text" name = "county"/>
		<br/>
		<br/>
		Postcode :<br/>
		<input type = "text" name = "postcode"/>
		<br/>
		<br/>
        <a href = "/"><button type="submit"><strong>Submit</strong></button></a>
        <button type="submit"><strong>Delete</strong></button>
  
  <div class="push"></div>
		</div>
</div>

</body>
</html>