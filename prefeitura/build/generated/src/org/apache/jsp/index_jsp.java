package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/estilo.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-btn\">Usuario</a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a href=\"inserirusuario.jsp\">cadastrar usuario</a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-btn\">Paciente</a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a href=\"inserirpaciente.jsp\">cadastrar paciente</a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-btn\">Doença</a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a href=\"inserirdoenca.jsp\">cadastrar doença</a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-btn\">Consulta</a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a href=\"registrarconsulta.jsp\">registrar consulta</a>\n");
      out.write("                    <a href=\"#\">ver consulta</a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("             <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-btn\">Estatísticas</a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a href=\"verestatistica.jsp\">ver estatisticas</a>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </li>\n");
      out.write("            <li id=\"sair\"><a href=\"#\">Sair</a></li>\n");
      out.write("        </ul>\n");
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
