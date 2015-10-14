<%@page import="com.netbuilder.entities.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
   	<%String name = request.getParameter("firstnamesignup");%>
  	<%String lastname = request.getParameter("lastnamesignup");%>
    <%String username = request.getParameter("usernamesignup");%>
 	<%String password = request.getParameter("passwordsignup");%>
    <%String password2 = request.getParameter("passwordsignup_confirm");%>
    <%String email = request.getParameter("emailsignup");%>
    <% com.netbuilder.data.DummyData   data  = new  com.netbuilder.data.DummyData();
    java.util.ArrayList<Customer>  datas = data.getEntityList(new com.netbuilder.entities.Customer());
   	datas.add(new com.netbuilder.entities.Customer(10001,"00000000",5000,name ,email, username,password));
   	JspWriter out2=pageContext.getOut();
    for(int i=0; i<datas.size(); i++){
    		out2.println("<html>"+datas.get(i).getCustomerID()+"</html>");
    		out2.println("<html>"+datas.get(i).getCustomerPhone()+"</html>");
    		out2.println("<html>"+datas.get(i).getAvailableCredit()+"</html>");
    		out2.println("<html>"+datas.get(i).getCustomerName()+"</html>");
    		out2.println("<html>"+datas.get(i).getCustomerEmail()+"</html>");
    		out2.println("<html>"+datas.get(i).getCustomerUsername()+"</html>");
    }
    
    %>