<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>from dataprovider.jsp page</h1>
<jsp:include page="useData.jsp">
<jsp:param value="CTS" name="company1"/>
<jsp:param value="TCS" name="company2"/>
</jsp:include>
</body>
</html>