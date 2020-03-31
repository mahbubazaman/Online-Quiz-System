package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Question;
import java.util.List;
import service.Service;

public final class cpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> CPANEL </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css\">\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf8\"\n");
      out.write("        src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("              $('#myTable').DataTable();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             function deleteQuestion(del_id){\n");
      out.write("             \n");
      out.write("             //alert(\"Delete id : \"+del_id);\n");
      out.write("             \n");
      out.write("             $.post(\"CpanelControler\",{\n");
      out.write("             opt_type: 'DELETE_DATA',\n");
      out.write("             del_id: del_id\n");
      out.write("             }, function(data, status){\n");
      out.write("             // alert(\"Data \"+data+\", Status : \"+status);\n");
      out.write("             \n");
      out.write("             request.getRequestDispatcher(\"cpanel.jsp\").forward(request, response);\n");
      out.write("             });\n");
      out.write("             \n");
      out.write("             }\n");
      out.write("             */\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <form  action=\"CpanelControler\" method=\"post\" style=\"margin-bottom:30px;\">\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"opt_type\" value=\"SAVE_DATA\"/>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Question : </td>\n");
      out.write("                        <td> <input class=\"form-control\" type=\"text-area\" name=\"ques\" required/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Option A : </td>\n");
      out.write("                        <td> <input class=\"form-control\" type=\"text\" name=\"a\" required/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Option B : </td>\n");
      out.write("                        <td> <input class=\"form-control\" type=\"text\" name=\"b\" required/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Option C : </td>\n");
      out.write("                        <td> <input class=\"form-control\" type=\"text\" name=\"c\" required/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Option D : </td>\n");
      out.write("                        <td> <input class=\"form-control\" type=\"text\" name=\"d\" required/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Select Answer : </td>\n");
      out.write("                        <td> \n");
      out.write("\n");
      out.write("                            <!--                        <input type=\"text\" name=\"ans\" required/> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label class=\"radio-inline\">\n");
      out.write("                                <input type=\"radio\" name=\"optradio\" checked value=\"a\">Option A\n");
      out.write("                            </label>\n");
      out.write("                            <label class=\"radio-inline\">\n");
      out.write("                                <input  type=\"radio\" name=\"optradio\" value=\"b\">Option B\n");
      out.write("                            </label>\n");
      out.write("                            <label class=\"radio-inline\">\n");
      out.write("                                <input type=\"radio\" name=\"optradio\" value=\"c\">Option C\n");
      out.write("                            </label>\n");
      out.write("                            <label class=\"radio-inline\">\n");
      out.write("                                <input type=\"radio\" name=\"optradio\" value=\"d\">Option D\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input class=\"btn btn-success\" type=\"submit\" value=\"Save Question\"/> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table id=\"myTable\" class=\"display \" >\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>SL No.</th>\n");
      out.write("                    <th>Question</th>\n");
      out.write("                    <th>Option A</th>\n");
      out.write("                    <th>Option B</th>\n");
      out.write("                    <th>Option C</th>\n");
      out.write("                    <th>Option D</th>\n");
      out.write("                    <th>Answer</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("\n");
      out.write("                ");

                    Service s = new Service();

                    List<Question> datalist = (List<Question>) s.getData();

                    for (int i = 0; i < datalist.size(); i++) {

                        Question data = datalist.get(i);
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(data.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getQues());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getA());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getB());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getC());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getD());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(data.getAns());
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td> \n");
      out.write("                        <form   action=\"CpanelControler\" method=\"post\" >\n");
      out.write("                            <input type=\"hidden\" name=\"opt_type\" value=\"DELETE_DATA\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"del_id\" value=\"");
      out.print(data.getId());
      out.write("\"/>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\"  value=\"Delete\">\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
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
