<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html>
<% String name="Harpreet Saini" ; %>
<body>
<font size =4 >
<% for(int i=1;i<=10;i++){%>

Hello! <%=name %> The time is now <%= new Date() %>
<br>

<%} %>

</font>

</body>
</html>