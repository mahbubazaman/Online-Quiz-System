<%-- 
    Document   : login.jsp
    Created on : Jul 23, 2019, 8:00:30 PM
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


        <script>


/*
            $(document).ready(function () {

                $("#login").click(function () {

                    var email = $("#email").val();
                    var pwd = $("#pwd").val();

                   alert("email : "+email+", pass : "+pwd);

                    $.post("LoginController", {
                        email: email,
                        pwd: pwd
                    }, function (data, status) {
                        
                        alert("data : "+Object.values(data)+", status : "+status);
                    });

                    //alert(email+"  "+pwd);


                });

            });
*/


        </script>

    </head>
    <body>



        <div class="container">


            <div>


                <div style="width:30%">
                    <h2>Login</h2>
                      <%
                        String error = (String) request.getAttribute("error");
                        if(error!=null){
                            %>
                            <p style="color: red"><%=error%></p>
                            <%
                        }
 
                    %>
                    <form action="LoginController" method="post">
                        <div class="form-group">
                            <label for="email">Email:</label>
                            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                        </div>
                        <div class="form-group">
                            <label for="pwd">Password:</label>
                            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
                        </div>
                      
                        <button type="submit" id="login" class="btn btn-primary">Login</button>
                    </form>
                    <a  href="registration.jsp" >Have not any account? Create an account.</a>
                </div>

            </div>



        </div>









    </body>
</html>
