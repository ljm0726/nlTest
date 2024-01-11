<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  Hello
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href='${root}/board/list'>목록보기</a>
<a href='${root}/board/write'>글작성</a>
<a href='${root}/board/alist'>비동기 목록</a>
</body>
</html>
