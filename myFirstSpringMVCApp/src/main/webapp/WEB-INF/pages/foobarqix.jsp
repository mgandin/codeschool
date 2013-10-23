<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
	<h1>FooBarQix</h1>
	<table>
	    <c:forEach items="${foobarqixs}" var="foobarqix">
            <tr>
                <td>${foobarqix}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>