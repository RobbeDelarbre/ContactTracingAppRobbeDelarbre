<header>
    <h1>
        <span>XXX</span>
    </h1>
    <nav>
        <ul>
            <li ${param.page eq 'Home'? 'id="actual"':""}><a href="Servlet">Home</a></li>
            <li ${param.page eq 'Overview'? 'id="actual"':""}><a href="Servlet?command=Overview">Overview</a></li>
            <li ${param.page eq 'Register'? 'id="actual"':""}><a href="Servlet?command=Register">Register</a></li>
        </ul>
    </nav>
    <h2>${param.page}</h2>

</header>