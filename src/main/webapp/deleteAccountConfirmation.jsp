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
        <jsp:param name="page" value="Delete Account?"></jsp:param>
    </jsp:include>
    <main>
        <h3>Ben je zeker dat je jouw account wilt verwijderen?</h3>
        <p>Deze actie kan niet meer ongedaan gemaakt worden.</p>
        <form method="post" action="Servlet?command=DeleteAccountFinal">
            <p>
                <input type="submit" id="Ja" value="JA" name="submit">
                <input type="submit" id="Nee" value="Nee" name="submit">
            </p>
        </form>
    </main>
    <footer> &copy; Webontwikkeling 3, UC Leuven-Limburg </footer>
</div>
</body>
</html>