<html>
<head><title>First JSP</title></head>
<body>
  <%!
  int i;
    public void  printAll (){
	  	for(i=0; i<100; i++){
	  		System.out.println(i);
	  	}
	 };
	 
	 
%>

     
 <% printAll();%>
       




  <a href="/Landing.html"><h3>Try Again</h3></a>
</body>
</html>