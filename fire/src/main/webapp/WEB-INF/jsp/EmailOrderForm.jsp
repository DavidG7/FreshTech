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
			
				<h2> E-Mail Order Form</h2>
				
				</div>		
				
			</div>

		</div>
<p>		
<label for="firstname" class="fname" data-icon="u">First Name:</label>
 <input id="firstnamesignup" name="firstnamesignup" required="required" type="text" placeholder="Last" />
    </p>
 
<p>		
<label for="lastname" class="fname" data-icon="u">Last Name:</label>
 <input id="lastnamesignup" name="lastnamesignup" required="required" type="text" placeholder="Last" />
    </p>
    
<p>		
<label for="email" class="email" data-icon="u">E-mail address:</label>
 <input id="emialsignup" name="emailsignup" required="required" type="text" placeholder="Email" />
    </p>


<p>
**PLACEHOLDER** ORDERS GO HERE **PLACEHOLDER**
</p> 

 
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