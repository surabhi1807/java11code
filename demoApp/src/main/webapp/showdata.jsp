<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> 1. String, Wrapper classes , Date</p>
<p>welcome ${requestScope.uname} you can see your data now</p>
<p>today is ${requestScope.date}</p>
<p>your enrollment number is ${requestScope.id}</p>
<p>2. Collection of String , Wrapper , Date</p>
<ul> 
<li>${requestScope.listOfCourse[0]}</li>
<li>${requestScope.listOfCourse[1]}</li>
<li>${requestScope.listOfCourse[2]}</li>
<li>${requestScope.listOfCourse[3]}</li>
</ul>
<p>2. Collection of String , Wrapper , Date using JSTL tag</p>

<c:forEach var="li" items="${requestScope.listOfCourse}">
<p>${li}</p>
 </c:forEach>
 
 <p>3. Collection of collections </p>
 <c:forEach var="li1" items="${requestScope.listOfList}">
<c:forEach var="fav" items="${li1}">
<p>${fav}</p>
</c:forEach>
 </c:forEach>
</body>
</html>