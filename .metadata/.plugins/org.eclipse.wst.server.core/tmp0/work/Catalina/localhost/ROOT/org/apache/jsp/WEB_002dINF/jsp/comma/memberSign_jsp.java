/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-12-12 12:01:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.comma;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public final class memberSign_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("jar:file:/C:/egov_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comma1004/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1450280850000L));
    _jspx_dependants.put("jar:file:/C:/egov_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comma1004/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1450280850000L));
    _jspx_dependants.put("jar:file:/C:/egov_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comma1004/WEB-INF/lib/egovframework.rte.ptl.mvc-3.7.0.jar!/META-INF/taglib.tld", Long.valueOf(1500280330000L));
    _jspx_dependants.put("jar:file:/C:/egov_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/comma1004/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/egovframework.rte.ptl.mvc-3.7.0.jar", Long.valueOf(1544257479959L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1544257473821L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar", Long.valueOf(1544257405246L));
    _jspx_dependants.put("/include/Top_Menu.jsp", Long.valueOf(1544603353872L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.fasterxml.jackson.annotation.JsonInclude.Include");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<style>\r\n");
      out.write(" \t\t.memberbutton {\r\n");
      out.write("\t\t\tborder-color: #41719C;\r\n");
      out.write("\t\t\tbackground-color:#80BCE1; \r\n");
      out.write("\t\t\tmargin-bottom:5px;\r\n");
      out.write("\t\t\theight:30px;\r\n");
      out.write("\t\t\tpadding: 0px 5px; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t.main{\r\n");
      out.write("\t\t\tborder-style:solid;\r\n");
      out.write("\t\t\tborder-color: #41719C;\r\n");
      out.write("\t\t\tborder-width:2px;\r\n");
      out.write("\t\t\twidth:27%;\r\n");
      out.write("\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t.main table{\r\n");
      out.write("\t\t\tmargin-top:10px;\r\n");
      out.write("\t\t\twidth:80%;\r\n");
      out.write("\t\t\ttext-align:left; \r\n");
      out.write("\t\t\t/* height: 350px;  */\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.main a{\r\n");
      out.write("\t\t\ttext-decoration:none; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.title {\r\n");
      out.write("\t\t    font-family: verdana;\r\n");
      out.write("\t\t    font-size: 15px;\r\n");
      out.write("\t\t    color:#80BCE1;\r\n");
      out.write("\t\t    margin-top:20px;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.check{\r\n");
      out.write("\t\t\tcolor:black; \r\n");
      out.write("\t\t\tborder-style:solid; \r\n");
      out.write("\t\t\tborder-width:1px; \r\n");
      out.write("\t\t\tborder-radius:2px;\r\n");
      out.write("\t\t\twidth:90%; \r\n");
      out.write("\t\t\ttext-align:center; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.check a:hover{\r\n");
      out.write("\t\t\tcolor:blue;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"/script/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/script/jquery-ui.js\"></script>\r\n");
      out.write("<title>회원 가입</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t$(\"#sign\").click(function(){\r\n");
      out.write("\t\tif($(\"#id\").val() == \"\") {\r\n");
      out.write("\t\t\talert(\"id을 입력해주세요.\");\r\n");
      out.write("\t\t\t$(\"#id\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif($(\"#pwd\").val() == \"\") {\r\n");
      out.write("\t\t\talert(\"암호를 입력해주세요.\");\r\n");
      out.write("\t\t\t$(\"#pwd\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif($(\"#pwd\").val() == $(\"pwd_comfirm\")){\r\n");
      out.write("\t\t\t\talert(\"암호가 일치하지 앖습니다..\");\r\n");
      out.write("\t\t\t\t$(\"#pwd\").focus();\r\n");
      out.write("\t\t\t\t$(\"#pwd_comfirm\").focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tif($(\"#name\").val() == \"\") {\r\n");
      out.write("\t\t\talert(\"이름을 입력해주세요.\");\r\n");
      out.write("\t\t\t$(\"#name\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#email\").val() == \"\" || $(\"#domain_site\").val() == \"no_select\" ) {\r\n");
      out.write("\t\t\talert(\"이메일 입력해주세요.\");\r\n");
      out.write("\t\t\t$(\"#email\").focus();\r\n");
      out.write("\t\t\t$(\"#domain_site\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#doubleCheck\").val() != \"2\") {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(\"중복체그를 해주세요.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(confirm(\"저장하시겠습니까?\")) {\t\r\n");
      out.write("\t\t\tvar str= $(\"#email\").val()+\"@\"+ $(\"#domain_site\").val();\r\n");
      out.write("\t \t\tvar formData = $(\"#member\").serialize();\r\n");
      out.write("\t \t\t$(\"#email\").val(str);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\t\tdata: formData,\r\n");
      out.write("\t\t\t\turl: \"/memberSave.do\",\r\n");
      out.write("\t\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\tif(data.result == \"ok\") {\r\n");
      out.write("\t\t\t\t\t\talert(\"회원가입 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\tlocation.href = \"/Login.do\";\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\talert(\"저장 실패했습니다. 다시 시도해 주세요.\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror: function () {\r\n");
      out.write("\t\t\t\t\talert(\"오류발생 \");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function idcheck(){\r\n");
      out.write("\tvar formData = $(\"#member\").serialize();\r\n");
      out.write("\tif($(\"#id\").val() == \"\") {\r\n");
      out.write("\t\talert(\"아이디를 입력해주세요.\");\r\n");
      out.write("\t\t$(\"#id\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: \"POST\",\r\n");
      out.write("\t\tdata: formData,\r\n");
      out.write("\t\turl: \"/idcheck.do\",\r\n");
      out.write("\t\tdataType: \"json\",\r\n");
      out.write("\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\tif(data.count == 0) {\r\n");
      out.write("\t\t\t\talert(\"중복없습니다.\");\r\n");
      out.write("\t\t\t\tdocument.member.doubleCheck.value=\"2\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"중복있습니다.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror: function () {\r\n");
      out.write("\t\t\talert(\"오류발생 \");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}); \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.top_link{\r\n");
      out.write("\t\t\tbackground-color:#80BCE1; \r\n");
      out.write("\t\t\tmargin-top:10px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\twidth: 85%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.top_link li{\r\n");
      out.write("\t\t\tbackground-color:#80BCE1;\r\n");
      out.write("\t\t\theight:auto;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\tfontsize:150%;\r\n");
      out.write("\t\t    color: black;\r\n");
      out.write("\t\t    width:20%; \r\n");
      out.write("\t\t\tmargin:0;\r\n");
      out.write("\t\t\tpadding: 15px;\r\n");
      out.write("    \t\tlist-style:none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.top_link li ul{\t\r\n");
      out.write("\t\t\tposition:absolute;\r\n");
      out.write("\t\t\tdisplay:none;\t\r\n");
      out.write("\t\t\tfontsize:150%;\r\n");
      out.write("\t\t    color: black;\r\n");
      out.write("\t\t    width:10%; \r\n");
      out.write("\t\t\tmargin:0px;\r\n");
      out.write("    \t\tlist-style:none;\r\n");
      out.write("    \t\tz-index:200px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.top_link li ul li{\r\n");
      out.write("\t\t\tbackground-color:#B3E0F4;\r\n");
      out.write("\t\t\tfontsize:150%;\r\n");
      out.write("\t\t    color: black;\r\n");
      out.write("\t\t\twidth:90%;\r\n");
      out.write("\t\t  /*  border-bottom:1px solid;  */\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.top_link  a{\r\n");
      out.write("\t\t\tfontsize:150%;\r\n");
      out.write("\t\t    color: black;\r\n");
      out.write("    \t\ttext-decoration: none;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.top_link li:hover ul {\r\n");
      out.write("\t\t\t\tdisplay:block;   /* 마우스 커서 올리면 서브메뉴 보이게 하기 */\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t.top_link li:hover  ul li:HOVER{\r\n");
      out.write("\t\t\tbackground-color: #91BCD8;\r\n");
      out.write("\t\t\tcolor:#ffffff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t.top_link li:hover{\r\n");
      out.write("\t\t    background-color: #007EA5;\r\n");
      out.write("\t\t\tcolor:#FFFFFF;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/* .top_link a{\r\n");
      out.write("\t\t    background-color: #007EA5;\r\n");
      out.write("\t\t\tcolor:#ffffff;\t\r\n");
      out.write("\t\t} */\r\n");
      out.write("\t\t.My_menu{\t\r\n");
      out.write("\t\t\tmargin-top:90px;\r\n");
      out.write("\t\t\toverflow: hidden;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t.My_menu a{\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.My_menu a:hover{\r\n");
      out.write("\t\t\tcolor: #41719C;\r\n");
      out.write("\t\t\tbackground-color:#FFFFFF;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction fn_logout() {\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\tdata: '',\r\n");
      out.write("\t\t\turl: \"/logOut.do\",\r\n");
      out.write("\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\tsuccess: function (data) {\r\n");
      out.write("\t\t\t\tif(data.result == \"ok\") {\r\n");
      out.write("\t\t\t\t\talert(\"로그아웃 처리 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t location.href = \"/MainPage.do\";\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"실패했습니다.!!!\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} \r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function (error) {\r\n");
      out.write("\t\t\t\talert(\"error : \" + error);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top_display\" style=\"width:100%;\">\r\n");
      out.write("\t\t<table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">\r\n");
      out.write("\t\t<div >\r\n");
      out.write("\t\t\t<p style=\"border:solid;  color:gray; border-radius:12px; margin-left:300px; margin-top:90px; margin-right:50px;\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"search\" placeholder=\"Search\" style=\"border-style:none; height:20px;  margin-left:3px;\" />\r\n");
      out.write("\t\t\t\t<a href=\"#\" ><img src=\"/images/basic_form/searchbutton.png\" style=\"height:20px;\"></a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"40%\" >\r\n");
      out.write("\t\t<div align=\"center\" >\r\n");
      out.write("\t\t\t<a href=\"MainPage.do\" >\r\n");
      out.write("\t\t\t\t<img src=\"/images/basic_form/logo.png\" style=\"height:100px;\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">\r\n");
      out.write("\t\t<div class=\"My_menu\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<div class=\"top_link\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><li>\t여행지\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>서울</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Busan.do\"><li>부산</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Daegu.do\"><li>대구</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Incheon.do\"><li>인천</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>광주</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>대전</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>울산</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>경기도</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>강원도</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>충천도</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>전라도</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>경상도</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><li>제주도</li></a>\r\n");
      out.write("\t\t\t\t\t\t</ul> \r\n");
      out.write("\t\t\t\t</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"/Springfestival.do\"><li>축제\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Springfestival.do\"><li>봄축제</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Summerfestival.do\"><li>여츰축제</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Fallfestival.do\"><li>가을축제</li></a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/Winterfestival.do\"><li>겨울축제</li></a>\r\n");
      out.write("\t\t\t\t\t\t</ul> \t\t\r\n");
      out.write("\t\t\t\t</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"/NoticeList.do\"><li>커뮤니티\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/NoticeList.do\"><li>공지사항</li></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/Review.do\"><li>여행후기</li></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/Event.do\"><li>이벤트</li></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/QA.do\"><li>Q&A</li></a>\r\n");
      out.write("\t\t\t\t\t</ul> \r\n");
      out.write("\t\t\t\t</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><li>주변여행지\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><li>주변여행지</li></a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><li>찾기</li></a>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li></a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("\t <div align=\"center\">\r\n");
      out.write("\t\t<p class=\"title\">쉼표 회원 가입</p>\t\r\n");
      out.write("\t\t<div class=\"main\">\r\n");
      out.write("\t\t<form name=\"member\" id=\"member\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"doubleCheck\" id=\"doubleCheck\" value=\"1\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<table border=\"0\" align=\"center\" height=\"350px\">\r\n");
      out.write("\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t<col width=\"35%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"25%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"25%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"15%\"/>\r\n");
      out.write("\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"id\" id=\"id\" style=\"width:97%;\"></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" onclick=\"idcheck()\">\r\n");
      out.write("\t\t\t\t\t<p class=\"check\">중복체크</p>\r\n");
      out.write("\t\t\t\t\t</a>\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pwd\" id=\"pwd\" style=\"width:97%;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>비밀번호 확인</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pwd_comfirm\" id=\"pwd_comfirm\" style=\"width:97%;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td algin=\"center\">이름</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"name\" id=\"name\" style=\"width:97%;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email\" id=\"email\" style=\"width:97%;\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t@\r\n");
      out.write("\t\t\t\t\t\t<select name=\"domain_site\" id=\"domain_site\" style=\"width:70%;\">\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"no_select\" selected=\"selected\">선택하시오</option> \t\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"daum.net\">daum.net</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"yahoo.com\">yahoo.com</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"nate.com\">nate.com</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>생년월일</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"date\" name=\"birthDay\" id=\"birthDay\" style=\"width:97%;\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table align=\"center\" border=\"0\">\r\n");
      out.write("\t\t\t\t<tr style=\"font-size:13px; \">\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"useCheck\" id=\"useCheck\" value=\"1\"> 이용약관에 동의(필수)\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"singleCheck\" id=\"singleCheck\" value=\"2\"> 개인정보 제공에 동의(필수)\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<input type=\"button\" name=\"sign\" id=\"sign\" value=\"회원가입\" class=\"memberbutton\">\r\n");
      out.write("\t\t\t<!-- <button>회원 가입</button> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /include/Top_Menu.jsp(129,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginCertification.userId != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<a href=\"#\" onClick=\"fn_logout()\">로그아웃</a> |  <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginCertification.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a> | <a href=\"/Mypage_Modify.do\" style=\"margin-right:300px;\">마이페이지</a>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /include/Top_Menu.jsp(132,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginCertification.userId == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<a href=\"/Login.do\">로그인</a> |  <a href=\"/memberSign.do\">회원가입</a> | <a href=\"#\" style=\"margin-right:300px;\">마이페이지</a>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
