<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:out value="${title}"></c:out>
<c:out value="${dr}"></c:out>
<form action="/post" method="post">  
FirstName:<input type="text" name="fname"/><br/>  
LastName:<input type="text" name="lname"/><br/>  
<input type="submit" value="submit"/>  
</form>  