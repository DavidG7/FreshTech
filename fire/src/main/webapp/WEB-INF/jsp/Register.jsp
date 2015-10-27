<!-- Author: Sam Raspin -->

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
<form th:action="@{postLogin}" method="post">
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
         <label for="addresssignup" class="uname" data-icon="u">Address:</label>
         <input id="addresssignup" name="addresssignup" required="required" type="text" placeholder="Address" />
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
    <option value="2007">2007</option>
	<option value="2006">2006</option>
	<option value="2005">2005</option>
	<option value="2004">2004</option>
	<option value="2003">2003</option>
	<option value="2002">2002</option>
	<option value="2001">2001</option>
	<option value="2000">2000</option>
	<option value="1999">1999</option>
	<option value="1998">1998</option>
	<option value="1997">1997</option>
	<option value="1996">1996</option>
	<option value="1995">1995</option>
	<option value="1994">1994</option>
	<option value="1993">1993</option>
	<option value="1992">1992</option>
	<option value="1991">1991</option>
	<option value="1990">1990</option>
	<option value="1989">1989</option>
	<option value="1988">1988</option>
	<option value="1987">1987</option>
	<option value="1986">1986</option>
	<option value="1985">1985</option>
	<option value="1984">1984</option>
	<option value="1983">1983</option>
	<option value="1982">1982</option>
	<option value="1981">1981</option>
	<option value="1980">1980</option>
	<option value="1979">1979</option>
	<option value="1978">1978</option>
	<option value="1977">1977</option>
	<option value="1976">1976</option>
	<option value="1975">1975</option>
	<option value="1974">1974</option>
	<option value="1973">1973</option>
	<option value="1972">1972</option>
	<option value="1971">1971</option>
	<option value="1970">1970</option>
	<option value="1969">1969</option>
	<option value="1968">1968</option>
	<option value="1967">1967</option>
	<option value="1966">1966</option>
	<option value="1965">1965</option>
	<option value="1964">1964</option>
	<option value="1963">1963</option>
	<option value="1962">1962</option>
	<option value="1961">1961</option>
	<option value="1960">1960</option>
	<option value="1959">1959</option>
	<option value="1958">1958</option>
	<option value="1957">1957</option>
	<option value="1956">1956</option>
	<option value="1955">1955</option>
	<option value="1954">1954</option>
	<option value="1953">1953</option>
	<option value="1952">1952</option>
	<option value="1951">1951</option>
	<option value="1950">1950</option>
	<option value="1949">1949</option>
	<option value="1948">1948</option>
	<option value="1947">1947</option>
	<option value="1946">1946</option>
	<option value="1945">1945</option>
	<option value="1944">1944</option>
	<option value="1943">1943</option>
	<option value="1942">1942</option>
	<option value="1941">1941</option>
	<option value="1940">1940</option>
	<option value="1939">1939</option>
	<option value="1938">1938</option>
	<option value="1937">1937</option>
	<option value="1936">1936</option>
	<option value="1935">1935</option>
	<option value="1934">1934</option>
	<option value="1933">1933</option>
	<option value="1932">1932</option>
	<option value="1931">1931</option>
	<option value="1930">1930</option>
	<option value="1929">1929</option>
	<option value="1928">1928</option>
	<option value="1927">1927</option>
	<option value="1926">1926</option>
	<option value="1925">1925</option>
	<option value="1924">1924</option>
	<option value="1923">1923</option>
	<option value="1922">1922</option>
	<option value="1921">1921</option>
	<option value="1920">1920</option>
	<option value="1919">1919</option>
	<option value="1918">1918</option>
	<option value="1917">1917</option>
	<option value="1916">1916</option>
	<option value="1915">1915</option>
	<option value="1914">1914</option>
	<option value="1913">1913</option>
	<option value="1912">1912</option>
	<option value="1911">1911</option>
	<option value="1910">1910</option>
	<option value="1909">1909</option>
	<option value="1908">1908</option>
	<option value="1907">1907</option>
	<option value="1906">1906</option>
	<option value="1905">1905</option>
	<option value="1904">1904</option>
	<option value="1903">1903</option>
	<option value="1902">1902</option>
	<option value="1901">1901</option>
	<option value="1900">1900</option>
   </select>
    </p>
    <br/>
    <br/>
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