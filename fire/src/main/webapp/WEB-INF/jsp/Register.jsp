<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      th:include="Template :: page">
      
    <head th:fragment="header">
    	<link  type="text/css" rel="stylesheet" href="css/Register.css" />
	<title>NB Gardens</title>
    </head>
    <body>
    
<div th:fragment="content">

		<div class="panel panel-default">
		
			<div class = "jumbotron">
			
				<h2> <b> Log in/Register </b> </h2>
				
				<h4>Existing customers log in. New customers please register your details</h4>
						
			
			</div>		

		</div>
		</div>
		<div th:fragment="content">
<div class="col-md-6">	
<form th:action="@{/postLogin}" method="post">
	  <div id="centre">
				<p id="regtext2345"><strong>Log in</strong></p>
		   			 <p><strong>Username :</strong><br/>
						<input type = "text" name = "username"/></p>
							<p><strong>Password :</strong><br/>
								<input type = "text" name = "password"/></p>
									<button type="submit"><strong>Log In</strong></button></div></form></div>
									
<form th:action="@{/postReg}" method="post">
<div class="col-md-6">
		<div class = "panel-body">
		<div id = "centre">
		<p id="regtext2345"><strong>Register</strong></p>
		<p> 
         <label for="firstnamesignup" class="fname" data-icon="u">First Name:</label>
         <input id="firstnamesignup" name="firstnamesignup" required="required" type="text" placeholder="First" />
    </p>
    <p> 
         <label for="lastnamesignup" class="lname" data-icon="u">Last Name:</label>
         <input id="lastnamesignup" name="lastnamesignup" required="required" type="text" placeholder="Last" />
    </p>
    <p> 
         <label for="usernamesignup" class="uname" data-icon="u">Username:</label>
         <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="Username" />
    </p>
    <p> 
         <label for="passwordsignup" class="youpasswd" data-icon="p">Password:</label>
         <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="Password"/>
    </p>
    <p> 
         <label for="passwordsignup_confirm" class="password" data-icon="p">Confirm Password:</label>
         <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="Password"/>
    </p>
    <p> 
         <label for="emailsignup" class="youmail" data-icon="e" >Email:</label>
         <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="example@domain.com"/> 
    </p>
    <p> 
         <label>Date of Birth:</label>
         <select name="month" onChange="changeDate(this.options[selectedIndex].value);">
         <option value="na">Month</option>
         <option value="1">January</option>
         <option value="2">February</option>
         <option value="3">March</option>
         <option value="4">April</option>
         <option value="5">May</option>
         <option value="6">June</option>
         <option value="7">July</option>
         <option value="8">August</option>
         <option value="9">September</option> 
         <option value="10">October</option>
         <option value="11">November</option>
         <option value="12">December</option>
         </select>
         <select name="day" id="day">
         <option value="na">Day</option>
         <option value="1">1</option>
         <option value="2">2</option>
         <option value="3">3</option>
         <option value="4">4</option>
         <option value="5">5</option>
         <option value="6">6</option>
         <option value="7">7</option>
         <option value="8">8</option>
         <option value="9">9</option> 
         <option value="10">10</option>
         <option value="11">11</option>
         <option value="12">12</option>
         <option value="10">13</option>
         <option value="10">14</option>
         <option value="10">15</option>
         <option value="10">16</option>
         <option value="10">17</option>
         <option value="10">18</option>
         <option value="10">19</option>
         <option value="11">20</option>
         <option value="12">21</option>
         <option value="10">22</option>
         <option value="10">23</option>
         <option value="10">24</option>
         <option value="10">25</option>
         <option value="10">26</option>
         <option value="10">27</option>
         <option value="11">28</option>
         <option value="12">29</option>
         <option value="10">30</option>
         <option value="10">31</option>
         </select>
         <select name="year" id="year">
         <option value="na">Year</option>
         </select>
         <script type="text/javascript">
         function changeDate(i){
         var e = document.getElementById('day');
         while(e.length>0)
         e.remove(e.length-1);
         var j=-1;
         if(i=="na")
         k=0;
         else if(i==2)
         k=28;
         else if(i==4||i==6||i==9||i==11)
         k=30;
         else
         k=31;
         while(j++<k>){
         var s=document.createElement('option');
         var e=document.getElementById('day');
         if(j==0){
         s.text="Day";
         s.value="na";
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}
         else{
         s.text=j;
         s.value=j;
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}}}
         y = 1998;
         while (y-->1908){
         var s = document.createElement('option');
         var e = document.getElementById('year');
         s.text=y;
         s.value=y;
         try{
         e.add(s,null);}
         catch(ex){
         e.add(s);}}
         </k>
         </script> 
    </p>
    <p> 
         <label>Gender:</label>
         <select name="Gender">
         <option value="male">Male</option>
         <option value="female">Female</option>
         </select>
    </p>
    	<button type="submit"><strong>Register</strong></button>
</div>
<div class="push"></div>
</div>
</div>

</form>
</div>

		
</body>
</html>