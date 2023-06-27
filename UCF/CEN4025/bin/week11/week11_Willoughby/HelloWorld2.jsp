<%@page import="week11.HelloWorld"%>
<%@page language="java" contentType="text/html; charse=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
      <head>
        <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">
		<title>HelloWorld</title>		
        <% week11.HelloWorld hello = new week11.HelloWorld(); %>
      </head>

      <body>
		Version 2<br/>
        <%=hello.display()%>
      </body>

</html>