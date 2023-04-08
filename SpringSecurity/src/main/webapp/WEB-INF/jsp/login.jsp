<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
	</head>
	<body>
		<h2>Login</h2>
		<p style="color: red;">
			<c:if test="${param.error eq ''}">
				Bad Credentials
			</c:if>
		</p>
		<form method="post" action="${pageContext.request.contextPath}/jlogin.htm">
			Email Address: <input type="text" name="j_username"/><br/>
			Password: <input type="password" name="j_password"/><br/>
			<input type="submit" value="Login">
		</form>
	</body>
</html>