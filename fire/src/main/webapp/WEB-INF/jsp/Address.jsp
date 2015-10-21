  <html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
>
      
  <head>
    <title>Sample Application JSP Page</title>
  </head>

  <body style = "bgcolor = white;">

  <table border="0" cellpadding="10">
    <tr>
      <td style = "align=center;">
        <img src="images/springsource.png"/>
      </td>
      <td>
         <h1>Sample Application JSP Page</h1>
      </td>
    </tr>
  </table>

  <br />
  <p>This is the output of a JSP page that is part of the HelloWorld application.</p>

 <div class="item" th:each="address : ${addresses}">
       
        <span th:text="${addresses.postcode}"></span>
       
    
 </div>

  </body>
  </html>
