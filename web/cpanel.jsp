<%-- 
    Document   : cpanel
    Created on : Jul 25, 2019, 10:24:30 AM
    Author     : mahbuba
--%>

<%@page import="model.Question"%>
<%@page import="java.util.List"%>
<%@page import="service.Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> CPANEL </title>


        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8"
        src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>

        <script>


            $(document).ready(function () {
              $('#myTable').DataTable();
            });

            /*
             function deleteQuestion(del_id){
             
             //alert("Delete id : "+del_id);
             
             $.post("CpanelControler",{
             opt_type: 'DELETE_DATA',
             del_id: del_id
             }, function(data, status){
             // alert("Data "+data+", Status : "+status);
             
             request.getRequestDispatcher("cpanel.jsp").forward(request, response);
             });
             
             }
             */



        </script>








    </head>
    <body>

        <div class="container">

            <form  action="CpanelControler" method="post" style="margin-bottom:30px;">

                <input type="hidden" name="opt_type" value="SAVE_DATA"/>
                <table>
                    <tr>
                        <td>Question : </td>
                        <td> <input class="form-control" type="text-area" name="ques" required/> </td>
                    </tr>
                    <tr>
                        <td>Option A : </td>
                        <td> <input class="form-control" type="text" name="a" required/> </td>
                    </tr>
                    <tr>
                        <td>Option B : </td>
                        <td> <input class="form-control" type="text" name="b" required/> </td>
                    </tr>
                    <tr>
                        <td>Option C : </td>
                        <td> <input class="form-control" type="text" name="c" required/> </td>
                    </tr>
                    <tr>
                        <td>Option D : </td>
                        <td> <input class="form-control" type="text" name="d" required/> </td>
                    </tr>
                    <tr>
                        <td> Select Answer : </td>
                        <td> 

                            <!--                        <input type="text" name="ans" required/> -->


                            <label class="radio-inline">
                                <input type="radio" name="optradio" checked value="a">Option A
                            </label>
                            <label class="radio-inline">
                                <input  type="radio" name="optradio" value="b">Option B
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="optradio" value="c">Option C
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="optradio" value="d">Option D
                            </label>

                        </td>
                    </tr>
                    <tr>
                        <td><input class="btn btn-success" type="submit" value="Save Question"/> </td>
                    </tr>

                </table>

            </form>



            <table id="myTable" class="display " >

                <thead>
                <tr>
                    <th>SL No.</th>
                    <th>Question</th>
                    <th>Option A</th>
                    <th>Option B</th>
                    <th>Option C</th>
                    <th>Option D</th>
                    <th>Answer</th>
                    <th>Delete</th>
                </tr>
                </thead>

                <%
                    Service s = new Service();

                    List<Question> datalist = (List<Question>) s.getData();

                    for (int i = 0; i < datalist.size(); i++) {

                        Question data = datalist.get(i);
                %>
                <tbody>
                <tr>
                    <td><%=data.getId()%></td>
                    <td><%=data.getQues()%></td>
                    <td><%=data.getA()%></td>
                    <td><%=data.getB()%></td>
                    <td><%=data.getC()%></td>
                    <td><%=data.getD()%></td>
                    <td><%=data.getAns()%></td>

                    <td> 
                        <form   action="CpanelControler" method="post" >
                            <input type="hidden" name="opt_type" value="DELETE_DATA"/>
                            <input type="hidden" name="del_id" value="<%=data.getId()%>"/>
                            <input type="submit" class="btn btn-danger"  value="Delete">

                        </form>
                    </td>
                </tr>
                </tbody>
                <%
                    }
                %>

            </table>

        </div>
    </body>
</html>
