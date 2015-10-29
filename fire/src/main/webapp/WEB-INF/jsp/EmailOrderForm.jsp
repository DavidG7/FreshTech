<!DOCTYPE html>
	<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
		<link  type="text/css" rel="stylesheet" href="css/ChooseAddress.css" />
		<link  type="text/css" rel="stylesheet" href="css/EmailOrderForm.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">


	<div class="panel panel-default">
		
		<div class = "jumbotron">
			
			<h2> <b> E-mail Order Form </b> </h2>
				
			<h4> Please complete this form with your order and email it to "service@nbgardens.com" </h4>
						
			
		</div>		

	</div>

	<div class = "panel-body">
	    
	    <div id="titlemargin"><strong>E-mail Order Form</strong><br/><br/></div>
	    
		<div>
			<p id="formfont">
				<span id="identify">Date:__/__/____</span><br/><br/>
		    	<span id="firstcolumn">First Name:<span id="nameline"></span></span><span id="secondcolumn">Phone:<span id="nameline"></span></span><br/>
		    	<span id="firstcolumn">Surname:<span id="surnameline"></span></span><span id="secondcolumn">E-mail:<span id="nameline"></span></span><br/><br/>
		    	<span id="firstcolumn">Address:<span id="addressline"></span></span><br/><span id="xaddressline"></span><br/>
		    	<span id="firstcolumn">City:<span id="cityline"></span></span>County:<span id="cityline"></span>Postcode:<span id="postcodeline"></span><br/><br/>
		    	<span id="firstcolumn">Product Name:<span id="productgap"></span>Quantity:</span><br/><input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
		    	<input id="productbox" type="text"/><input id="quantitybox" type="text"/><br/>
			</p>
		
		<button id="demo" onclick="copyToClipboard(document.getElementById('demo').innerHTML)">This is what I want to copy</button>

     <script>
      function copyToClipboard(text) {
       window.prompt("Copy to clipboard: Ctrl+C, Enter", text);
      }
</script>
		
		</div>
	   
		<div class="push"></div>
	
	</div>

</div>
</body>
</html>