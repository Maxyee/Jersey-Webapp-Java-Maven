/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-23 15:26:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.*;
import org.json.JSONArray;

public final class site_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String error; String output; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/site.css\" type=\"text/css\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t");

	
	
 	 // Create Client
     Client client = Client.create();
 	 
     
     
     
     //-------------------FOLLOWING CODE USES jersey-webapp WEB SERVICE ----------------------
     
      WebResource webResource = client.resource("http://localhost:8080/catholicshop-webapp/webapi/books/");
     
     
     //GET.
     ClientResponse res = webResource.accept("application/json").get(ClientResponse.class);
 
     // Status 200 is successful..
     if (res.getStatus() != 200) {
     
         
         error = "Failed with HTTP Error code: " + response.getStatus()+"\n";
         error+= res.getEntity(String.class);
         
         out.println("Error: "+error);
         return;
     }
 
     output = res.getEntity(String.class);
 
     output+="\nOutput from Server .... \n";
     //out.println(output);
     
    JSONObject obj_json_object = new JSONObject(output);
     
     JSONArray obj_jsonarray = obj_json_object.getJSONArray("book");
     
     //JSONObject obj_json_object_single_book = obj_jsonarray.getJSONObject(0);
     //JSONObject book = obj_json_object.getJSONObject("book");
     //book.get("quantity");
     //obj_json_object.get("book");
     //JSONArray obj_jsonarray = obj_json_object.getJSONArray("book");
     //book.get("quantity");
     //out.println(book.get("quantity"));
     //out.println(book.get("id"));
     int total_value = obj_jsonarray.length();
     //out.println(total_value);
     //out.println(obj_jsonarray.get(0));
     
     //out.println(obj_json_object_single_book.get("quantity"));
     
     
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"fullContainer\">\r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1>Fitzory Catholic Bookshop</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--menu-->\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("              <li><a href=\"site.jsp\">Site Map</a></li>\r\n");
      out.write("              <li><a href=\"search.jsp\">Catalogue Search</a></li>\r\n");
      out.write("              <li><a href=\"result.jsp\">Result</a></li>\r\n");
      out.write("              <li><a href=\"maintain.jsp\">Maintenance</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Main Content Section -->\r\n");
      out.write("      <div class=\"mainContent\">\r\n");
      out.write("          <div class=\"wrapContent\">\r\n");
      out.write("              <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"siteHeader\">\r\n");
      out.write("                  <p>WebSite Overview</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"linkContent\">\r\n");
      out.write("                <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"showDataBox\">\r\n");
      out.write("                    <div class=\"sidesection\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"categories\">\r\n");
      out.write("                                <h3>Categories</h3>\r\n");
      out.write("                                <div class=\"sidenav\">\r\n");
      out.write("                                    <a href=\"book.jsp\"> Books</a>\r\n");
      out.write("                                    <a href=\"audiobooks.jsp\"> Audio Books</a>\r\n");
      out.write("                                    <a href=\"videos.jsp\">Videos</a>\r\n");
      out.write("                                    <a href=\"music.jsp\"> Music</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"publishers\">\r\n");
      out.write("                                <h3>Publishers</h3>\r\n");
      out.write("                                <div class=\"sidenav\">\r\n");
      out.write("                                    <a href=\"site.jsp\"> Harper Collins</a>\r\n");
      out.write("                                    <a href=\"site.jsp\"> Penguins</a>\r\n");
      out.write("                                    <a href=\"site.jsp\"> St Pauls Publication</a>\r\n");
      out.write("                                    <a href=\"site.jsp\"> Franciscan Media</a>\r\n");
      out.write("                                    <a href=\"site.jsp\"> Orbis</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"showDataBox\">\r\n");
      out.write("                      <div class=\"collectionphoto\">\r\n");
      out.write("                                <div class=\"dataBoxHeader\">\r\n");
      out.write("                                    <p>You Selected 'Site Map Page'</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"spacer\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- First Row Of Box -->\r\n");
      out.write("                                <div class=\"dataBoxMainSection\">\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                \t");

	                                	for(int i = 0; i < total_value; i++)
	                                    {
	                                		JSONObject obj_json_object_single_book = obj_jsonarray.getJSONObject(i);
	                                		
	                                		
	                                
      out.write("\r\n");
      out.write("\t                                <div class=\"Mainbox\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"boxHeader\">\r\n");
      out.write("                                                <p>");
 out.println(obj_json_object_single_book.get("title")); 
      out.write("</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"boxContent\">\r\n");
      out.write("                                                <img src=\"./img/products/5321.jpg\" alt=\"\">\r\n");
      out.write("                                                <p class=\"boxContentDescription\">ISBN - ");
 out.println(obj_json_object_single_book.get("isbn")); 
      out.write("</p>\r\n");
      out.write("                                                <p class=\"boxContentDescription\">PUBLISHERS - ");
 out.println(obj_json_object_single_book.get("publishers")); 
      out.write("</p>\r\n");
      out.write("                                                <p class=\"boxContentDescription\">PRICE - $");
 out.println(obj_json_object_single_book.get("price")); 
      out.write("</p>\r\n");
      out.write("                                                <button>Details</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                      </div>\r\n");
      out.write("\t                                \r\n");
      out.write("\t                                ");

	                                    }
                                	
      out.write("\r\n");
      out.write("                                      \r\n");
      out.write("                                      \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Secound Row of the Box -->\r\n");
      out.write("                                <div class=\"dataBoxMainSection2\">\r\n");
      out.write("                                      \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!--footer-->\r\n");
      out.write("      <div class=\"footerSite\">\r\n");
      out.write("        <p>Copyright 2018. All Rights Reserved by <b>Fitzory Catholic Bookshop</b>.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}