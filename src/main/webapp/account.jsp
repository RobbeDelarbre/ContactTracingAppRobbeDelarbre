<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">
    <jsp:include page="header.jsp">
        <jsp:param name="page" value="Account"></jsp:param>
    </jsp:include>
    <main>
        <c:choose>
            <c:when test="${not empty user}">
                <p>User ID: ${user.userid}
                    <br>Voornaam: ${user.firstName}
                    <br>Achternaam: ${user.lastName}
                    <br>Email: ${user.email}
                </p>

                <form method="post" action="Servlet?command=DeleteAccount">
                    <p><input type="submit" value="Delete your account!"></p>
                </form>
            </c:when>
            <c:otherwise>
                <h3>U bent niet ingelogd ga terug naar het home scherm om in te loggen.</h3>
            </c:otherwise>
        </c:choose>
    </main>
    <footer> &copy; Webontwikkeling 3, UC Leuven-Limburg </footer>
</div>
</body>
</html>