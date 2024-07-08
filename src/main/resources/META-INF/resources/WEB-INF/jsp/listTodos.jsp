<%@ taglib prefix="c" uri="jakarta.tags.core" %>

    <html>

    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <!-- <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet"> -->
        <title>"List Todos Page"</title>

        <!-- /META-INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
        /META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js
        /META-INF/resources/webjars/jquery/3.6.0/jquery.min.js -->
    </head>

    <body>

        <div class="container">
            <h1>Your Todos</h1>
            <table class="table">
                <thead>
                    <tr>
                        <!-- <th>Id</th> -->
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done ?</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <!-- <td>${todo.id}</td> -->
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                            <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="add-todo" class="btn btn-success">Add Todo</a>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <!-- <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">  // bootstrap datepicker documentation
            $('#targetDate').datepicker({
                format: 'yyyy-mm-dd' // in datepicker months will be denoted by "mm"
            }); 
        </script> -->
    </body>

    </html>