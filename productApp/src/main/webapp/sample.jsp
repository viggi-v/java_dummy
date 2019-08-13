<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Dummy content</h2>
<%
	// simple java statement
	for(int i = 2501; i < 2600; i++){
		%>
		Hehe <%= i %> looks like &#<%= i %>; <br>
		<% 
	}
%>
</body>
</html>