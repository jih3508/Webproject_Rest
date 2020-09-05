<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Calendar" %>
 <%
 Calendar cal = Calendar.getInstance();

 int y = 0;
 int m = 0;
 int day =0; //오늘 날짜 출력
 
	 y = cal.get(Calendar.YEAR);
	 m = cal.get(Calendar.MONTH);
	 day = cal.get(Calendar.DATE);
 
 cal.set(y,m,1);  // 출력 월의  1일날로 세팅 ( 1일날의 요일을 얻기 위해)
 
 int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);       // 1일날의 요일 
 int lastDay = cal.getActualMaximum(Calendar.DATE);   // 마지막 날짜 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	.calendar{
		overflow:hidden;
		border:2px solid #80BCE1;
		text-align:center;
	}
	.calendar table{
		width:90%;
	}
</style>
<div>
<div class="calendar" >
   <table border="0" align="center" style="margin-top:8px;" >
   <colgroup>
			<col width="18%"/>
			<col width="82%"/>

	</colgroup>
   <tr>
   	   	<td style="font-size:20px; witdh:5%;"><%=m+1 %>월</td><td style="vertical-align:bottom; text-align:left; "> ,축제속으로</td>
   </tr>
   </table>
<table border="0" align="center" width="10%;" height="250px" style="margin-top:5px;">
<tr>
<td style="color:red; ">일</td><td>월</td><td>화</td><td>수</td><td>목</td><td>금</td><td style="color:blue; ">토</td>
</tr>
<%
 for(int i=1; i<dayOfWeek; i++) {
 %>
       <td></td>
 <%
 }
 for(int d=1; d<=lastDay; d++) { 		

	 if(dayOfWeek%7 == 0)  {
		 if(d == day){
			%>
			<td style="background-color:#FF9436; color:blue;"><%=d %> </td>
			<%
		 }
		 else{
	
			 out.print("<td><font color=blue>"+d+"</font></td>");
		 
		 }
	 } else if(dayOfWeek%7 == 1) {
		 if(d==day){
		%>
		<td style="background-color:#FF9436; color:red;"><%=d %></td>
		<%
		 }
		 else{
		 out.print("<td><font color=red>"+d+"</font></td>");
		 }
	} else {
		if(d == day){
		%>
		<td style="background-color:#FF9436; color:#FFFFFF;"><%=d %></td>
		<% 		
		}
		else
		{
 	%>
          <td style="color:gray;"><%=d %> </td>
   <%
		}
	 }
     
	 if(dayOfWeek%7 == 0) {
   %> 
    </t><tr>
   <%
     }
     dayOfWeek++;
 }
 %>
 
    </tr>
</table>
<table align="center" border="0">
	<colgroup>
		<col width="60%"/>
		<col width="40%"/>
	</colgroup>
	<tr>
		<td colspan="2" align="left">영동곶감축제 2018</td>
	</tr>
	<tr>
		<td style="color:#00D8FF; text-align:left; ">2018.12.14~2018.12.16</td>
		<td style="color:gray; font-size:10px;  text-align:left; vertical-align:bottom; ">충정북도 영동군</td>
	</tr>
	<tr>
		<td colspan="2" align="left">보성차밭빛축제2019</td>
	</tr>
	<tr>
		<td style="color:#00D8FF; text-align:left; ">2018.12.14~2019.01.13</td>
		<td style="color:gray; font-size:10px;  text-align:left; vertical-align:bottom; ">전라남도 보성군</td>
	</tr>
	<tr>
		<td colspan="2" align="left">서울시향 마르쿠스 슈텐츠와 안드레아스 오텐자머 Ⅰ, Ⅱ  2018</td>
	</tr>
	<tr>
		<td style="color:#00D8FF; text-align:left; ">2018.12.14~2018.12.15</td>
		<td style="color:gray; font-size:10px;  text-align:left; vertical-align:bottom; ">서울 송파구</td>
	</tr>
</table>
</div>
</div>
</body>
</html>
