package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>LOGIN</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("/*\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $(\"#login\").click(function () {\n");
      out.write("\n");
      out.write("                    var email = $(\"#email\").val();\n");
      out.write("                    var pwd = $(\"#pwd\").val();\n");
      out.write("\n");
      out.write("                   alert(\"email : \"+email+\", pass : \"+pwd);\n");
      out.write("\n");
      out.write("                    $.post(\"LoginController\", {\n");
      out.write("                        email: email,\n");
      out.write("                        pwd: pwd\n");
      out.write("                    }, function (data, status) {\n");
      out.write("                        \n");
      out.write("                        alert(\"data : \"+Object.values(data)+\", status : \"+status);\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    //alert(email+\"  \"+pwd);\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("*/\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div style=\"width:30%\">\n");
      out.write("                    <h2>Login</h2>\n");
      out.write("                      ");

                        String error = (String) request.getAttribute("error");
                        if(error!=null){
                            
      out.write("\n");
      out.write("                            <p style=\"color: red\">");
      out.print(error);
      out.write("</p>\n");
      out.write("                            ");

                        }
 
                    
      out.write("\n");
      out.write("                    <form action=\"LoginController\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\">Email:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">Password:</label>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pwd\">\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <button type=\"submit\" id=\"login\" class=\"btn btn-primary\">Login</button>\n");
      out.write("                    </form>\n");
      out.write("                    <a  href=\"registration.jsp\" >Have not any account? Create an account.</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
