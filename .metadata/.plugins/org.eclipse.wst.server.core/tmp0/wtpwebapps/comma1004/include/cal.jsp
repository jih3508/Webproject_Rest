<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Calendar" %>
<%
 Calendar cal = Calendar.getInstance();

 int y = 0;
 int m = 0;
 
 String y1 = request.getParameter("year");    // 출력 년도
 String m1 = request.getParameter("month");   // 출력 개월
 
 if(y1 == null || m1 == null) {
	 y = cal.get(Calendar.YEAR);
	 m = cal.get(Calendar.MONTH);
 } else {
	 y = Integer.parseInt(y1);
	 m = Integer.parseInt(m1) - 1;
 }
 
 cal.set(y,m,1);  // 출력 월의  1일날로 세팅 ( 1일날의 요일을 얻기 위해)
 
 int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);       // 1일날의 요일 
 int lastDay = cal.getActualMaximum(Calendar.DATE);   // 마지막 날짜 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력</title>
</head>
<body>
<!-- <form  name="frm"  method="post" action="/cal.do">

</form> -->

<%=y %>년 <%=m+1 %>월
<table border="1" width="40px" height="60px">
	<tr>
		<th>S</th>
		<th>M</th>
		<th>T</th>
		<th>W</th>
		<th>T</th>
		<th>F</th>
		<th>S</th>
	</tr>
	
<%
 for(int i=1; i<dayOfWeek; i++) {
 %>
       <td></td>
 <%
 }
 for(int d=1; d<=lastDay; d++) {
 
	 if(dayOfWeek%7 == 0)  {
		 out.print("<td><font color=blue>"+d+"</font></td>");
	 } else if(dayOfWeek%7 == 1) {
		 out.print("<td><font color=red>"+d+"</font></td>");
	 } else {
 %>
          <td><%=d %> </td>
   <%
	 }
     
	 if(dayOfWeek%7 == 0) {
   %> 
    </tr><tr>
   <%
     }
     dayOfWeek++;
 }
 %>
 
    </tr>
</table>

</body>
</html> 
