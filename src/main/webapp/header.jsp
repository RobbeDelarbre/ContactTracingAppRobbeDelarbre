<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <h1>
        <span>XXX</span>
    </h1>
    <nav>
        <ul>
            <li ${param.page eq 'Home'? 'id="actual"':""}><a href="Servlet">Home</a></li>
            <li ${param.page eq 'Overview'? 'id="actual"':""}><a href="Servlet?command=Overview">Overview</a></li>
            <li ${param.page eq 'Register'? 'id="actual"':""}><a href="Servlet?command=Register">Register</a></li>
            <c:if test="${not empty user}">
                <li ${param.page eq 'Account'? 'id="actual"':""}><a href="Servlet?command=Account">Account</a></li>
            </c:if>
        </ul>
    </nav>
    <h2>${param.page}</h2>

</header>