<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    errorPage="errorHandler.jsp"
    isErrorPage="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processing data file </title>
</head>
<body>
<%! int a=20,b=0,result; 
%>


<%
b=Integer.parseInt(request.getParameter("t1"));
result=a+b;
out.write("<h1>Result  of  "+b+" and  "+a+"= "+result+"</h1>");
%>
</body>
</html>