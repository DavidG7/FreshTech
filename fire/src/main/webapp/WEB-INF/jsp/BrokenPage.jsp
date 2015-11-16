<!DOCTYPE html>
	<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
 <head th:fragment="header">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Page Error</title>
</head>
<body>

<div th:fragment="content">

<div class="panel panel-default">

		<div class = "jumbotron">
			
			<h2> <b> WHOOPS!!! </b> </h2>
<h4> It appears there has been an error, please return to previous page. </h4>


<img src= "ImageFolder/gnomegif.gif"/>


</div>
</div>
</div>

</body>
</html>