<%@page import="com.cg.project.beans.Associate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<div align="left">
<%Associate associate=(Associate)request.getAttribute("associate"); %>
Welcome<%=associate.getAssociateId() %>

<!-- or we can write it as -->

${requestScope.associate.associateId}
</div>
</body>
</html>