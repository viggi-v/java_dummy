<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
</head>
<body>
<h2>Shopping Cart</h2>

<c:if test="${fn:length(cart) gt 0}">
   <ul>
   	<c:forEach items = "${cart}" var = "p">
   		<li>${p.name}</li>
   	</c:forEach>
   </ul>
</c:if>
<c:if test="${fn:length(cart) eq 0}">
Add something to the cart!!!
</c:if> 

</body>
</html>