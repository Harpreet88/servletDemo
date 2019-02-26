<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<table>

<tr>
<td>associateId</td>
<td>${requestScope.associate.associateId}</td>
</tr>

<tr>
<td>password</td>
<td>${requestScope.associate.password}</td>
</tr>

<tr>
<td>communication</td>
<td>${requestScope.associate.communication}</td>
</tr>

<s:forEach var="comm" items="${requestScope.associate.communication}">
${comm} 
</s:forEach>

</table>
</body>
</html>