<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="java.util.Date"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Count of amazon</title>
</head>
<body>

<!-- declaration  tag  -->
<%! int count=0;     %>
<!--   scriptlet tag -->
<%
count++; %>
<!-- Expression tag -->
<h1>No of users ..<%=count %></h1>
<h2>Today's date is as <%=new Date() %></h2>
<hr>
<h2>Today's date is as <%=new Date() %></h2>
</body>
</html>