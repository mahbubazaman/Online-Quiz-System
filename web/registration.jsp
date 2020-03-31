<%-- 
    Document   : registration
    Created on : Jul 23, 2019, 8:00:45 PM
    Author     : mahbuba

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRATION</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    </head>
    <body>





        <div class="container">

            <div>
                <div style="width:30%">
                    <h2>Sign Up Here</h2>

                    <%
                        String error = (String) request.getAttribute("error");
                        if(error!=null){
                            %>
                            <p style="color: red"><%=error%></p>
                            <%
                        }
 
                    %>

                    <form action="RegistrationController" method="post">
                        <div class="form-group">
                            <label for="email">Username:</label>
                            <input type="text" class="form-control"  placeholder="Enter email" name="username">
                        </div>
                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" class="form-control"  placeholder="Enter email" name="email">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" placeholder="Enter password" name="pwd">
                        </div>

                        <button type="submit" id="login" class="btn btn-primary">Sign up</button>
                    </form>
                </div>

            </div>



        </div>











    </body>
</html>
