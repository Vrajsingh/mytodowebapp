<html>
    <head>
        <title>"Login Page"</title>
    </head>
    <body>
        <div class="container"></div>
            <h1>Login</h1>
    
            <pre>${errorMessage}</pre>
    
            <!-- Note : By default method type is GET. To make sure the value of name and
                 password is no coming in the link (not secure) we use post method for storing
                 cred as payload  -->
    
            <form method="post">
                Name: <input type="text" name="name">
                Password: <input type="password" name="password">
                <input type="submit"> 
            </form>
        </div>
    </body>
</html>