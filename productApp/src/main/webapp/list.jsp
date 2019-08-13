<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>List of products</h2>
<form action="cart" method="post">
	<table border = "1">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Category</th>
			<th>Quantity</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>${p.category}</td>
				<td><input type="checkbox" name="prds" value="${p.id}"/></td>
			</tr>
		</c:forEach>
	</table>
	<button type="submit">Add to cart</button>
</form>

</body>
</html>