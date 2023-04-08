<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>
	</head>
	<body>
		<h2>Home</h2>
		<jsp:include page="header.jsp"/>
		<p>
			You are on home page, click here to see the <a href="${pageContext.request.contextPath}/account.htm">account</a> details
		</p>
	</body>
</html>