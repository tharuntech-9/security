<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<p>
	<c:choose>
		<c:when test="${not empty pageContext.request.userPrincipal.name}">
			Welcome ${pageContext.request.userPrincipal.name} | <a href="${pageContext.request.contextPath}/jlogout.htm">logout</a>
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath}/login.htm">login</a>
		</c:otherwise>
	</c:choose>
</p>