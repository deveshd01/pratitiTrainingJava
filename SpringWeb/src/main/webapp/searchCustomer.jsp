<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search-customer">
		Enter Email: <input name="email" />
		<button type="submit">Search</button>
	</form>
	<br />
	<form action="search-customer-id">
		Enter ID: <input name="id" />
		<button type="submit">ID</button>
	</form>
	<br />
	<br />
	<form action="search-customer-all">
		<button type="submit">FETCH ALL</button>
	</form>

	<c:if test="${c != null }">
		<c:forEach items="${ c }" var = "i">
			<p>
				name is ${i.name} <br /> city is ${i.city}
			</p>
		</c:forEach>
	</c:if>
</body>
</html>