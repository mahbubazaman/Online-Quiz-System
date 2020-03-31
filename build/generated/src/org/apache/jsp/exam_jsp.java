package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EXAM</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css\">\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\"\n");
      out.write("        src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                // alert(\"hi\");\n");
      out.write("\n");
      out.write("                $(\"#submitBtn\").hide();\n");
      out.write("                $(\"#cancelBtn\").hide();\n");
      out.write("                $(\"#startBtn\").click(function () {\n");
      out.write("\n");
      out.write("                    $(\"#submitBtn\").show();\n");
      out.write("                    $(\"#cancelBtn\").show();\n");
      out.write("                    num_of_ques = $(\"#selectedQues\").val();\n");
      out.write("                    // alert(num_of_ques);\n");
      out.write("\n");
      out.write("                    $.post(\"ExamController\", {num_of_ques: num_of_ques}, function (data, status) {\n");
      out.write("\n");
      out.write("                        // alert(data);\n");
      out.write("                        $(\"#startBtn\").hide(200);\n");
      out.write("\n");
      out.write("                        keySet = Object.keys(data);\n");
      out.write("                        valueSet = Object.values(data);\n");
      out.write("\n");
      out.write("                        //alert(keySet);\n");
      out.write("                        //alert(valueSet[0]['ques']);\n");
      out.write("                        createQuesList(valueSet);\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                function createQuesList(data)\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    tblData = \"\";\n");
      out.write("\n");
      out.write("                    //alert(data.length);\n");
      out.write("                    for (i = 0; i < data.length; i++) {\n");
      out.write("\n");
      out.write("                        //alert(data[i][\"id\"]);\n");
      out.write("                        q = data[i];\n");
      out.write("                        tblData += \"<div id=\" + i + \">\";\n");
      out.write("                        tblData += \"<h4 > \"+(1+i)+\". \"+ q[\"ques\"] + \"</h4> \";\n");
      out.write("                        tblData += \" <input type = 'radio' name = \" + i + \" value='a' > \" + q[\"a\"] + \"<br/>\";\n");
      out.write("\n");
      out.write("                        tblData += \" <input type = 'radio' name =  \" + i + \" value='b' > \" + q['b'] + \"<br/>\";\n");
      out.write("                        tblData += \"  <input type = 'radio' name =  \" + i + \" value='c' > \" + q['c'] + \"<br/>\";\n");
      out.write("                        tblData += \" <input type = 'radio' name =  \" + i + \" value='d' > \" + q['d'] + \"<br/>\";\n");
      out.write("                        tblData += \" </div><br/>\";\n");
      out.write("\n");
      out.write("                        $(\"#quesHolder\").empty();\n");
      out.write("                        $(\"#quesHolder\").append(tblData);\n");
      out.write("\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                $(\"#submitBtn\").click(function () {\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    child = $(\"#quesHolder\").children(\"div\");\n");
      out.write("\n");
      out.write("                    wrongAns = 0;\n");
      out.write("                    rightAns = 0;\n");
      out.write("                    noAns = 0;\n");
      out.write("\n");
      out.write("                    for (x of child)\n");
      out.write("                    {\n");
      out.write("                        //id = x[\"id\"];\n");
      out.write("                        id = $(x).attr(\"id\");\n");
      out.write("                        myans = $(\"#\" + id + \" input[name=\" + id + \"]:checked\").val();\n");
      out.write("                        //alert(id);\n");
      out.write("\n");
      out.write("                        if (myans === undefined) {\n");
      out.write("                            noAns++;\n");
      out.write("                        } else {\n");
      out.write("\n");
      out.write("                            curans = valueSet[id][\"ans\"];\n");
      out.write("                            if (myans === curans) {\n");
      out.write("                                rightAns++;\n");
      out.write("                            } else {\n");
      out.write("                                wrongAns++;\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            //alert(\"My ANS : \" + myans + \", ANS : \");\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    displayResult();\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                function displayResult()\n");
      out.write("                {\n");
      out.write("                    $(\"#startBtn\").show(200);\n");
      out.write("                    $(\"#submitBtn\").hide();\n");
      out.write("                    $(\"#cancelBtn\").hide();\n");
      out.write("                    $(\"#quesHolder\").empty();\n");
      out.write("\n");
      out.write("                    alert(\"Right : \" + rightAns + \"\\nWrong : \" + wrongAns + \"\\nNo Ans : \" + noAns);\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                $(\"#cancelBtn\").click(function(){\n");
      out.write("                    \n");
      out.write("                     $(\"#startBtn\").show(200);\n");
      out.write("                    $(\"#submitBtn\").hide();\n");
      out.write("                    $(\"#cancelBtn\").hide();\n");
      out.write("                    $(\"#quesHolder\").empty();\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div style=\"padding: 50px; \" class=\"col-sm-3\">\n");
      out.write("\n");
      out.write("               \n");
      out.write("                <select id=\"selectedQues\"  class=\"form-control\" >\n");
      out.write("                    \n");
      out.write("                    <option>5</option>\n");
      out.write("                    <option>10</option>\n");
      out.write("                    <option>15</option>\n");
      out.write("                    <option>20</option>\n");
      out.write("                    <option>25</option>\n");
      out.write("                    <option>30</option>\n");
      out.write("                    <option>35</option>\n");
      out.write("                    <option>40</option>\n");
      out.write("                    <option>45</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button id=\"startBtn\" style=\"margin-top:20px;\"  class=\"btn btn-primary\" >Start Exam</button>\n");
      out.write("                <br/>\n");
      out.write("                <button id=\"submitBtn\" style=\"margin-top:60px;\" class=\"btn btn-success\" >Submit</button>\n");
      out.write("                <button id=\"cancelBtn\" style=\"margin-top:60px;\" class=\"btn btn-danger\" >Cancel</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"padding: 50px;\" class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("                <div id=\"quesHolder\">\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
