<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.netbuilder.entities.Address"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%
List<Address> addresses = (List<Address>) request.getAttribute( "addresses" );
%>
<%
for (Address address : addresses) {
pageContext.setAttribute("postcode", address.getPostcode() );
%>
<div>${postcode}</div>
<%
}
%>
</body>
</html>