<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Add Customer Form</title>
    <style>
        .error
        {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>

<body>
<h2><spring:message code="lbl.page" text="Add New Customer" /></h2>
<br/>
<form:form method="post" modelAttribute="customer">
    <table>
        <tr>
            <td><spring:message code="lbl.firstName" /></td>
            <td><form:input path="firstName" /></td>
            <td><form:errors path="firstName" cssClass="error" /></td>
        </tr>
        <tr>
            <td><spring:message code="lbl.lastName" text="Last Name" /></td>
            <td><form:input path="lastName" /></td>
            <td><form:errors path="lastName" cssClass="error" /></td>
        </tr>
        <tr>
            <td><spring:message code="lbl.address" text="Address" /></td>
            <td><form:input path="address" /></td>
            <td><form:errors path="address" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Customer"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>