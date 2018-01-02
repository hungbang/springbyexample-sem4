<%--
  Created by IntelliJ IDEA.
  User: KAI
  Date: 12/26/17
  Time: 7:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
<h2>All Customers in System</h2>

<table border="1">
    <tr>
        <th>Address</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.address}</td>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
