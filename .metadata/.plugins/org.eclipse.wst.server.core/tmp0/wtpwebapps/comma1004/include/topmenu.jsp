<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String id = (String)session.getAttribute("SessionMemberId");
%>

<div style="width:100%;">

	<div class="div_topmenu">
	<table align="center" cellspacing="0">
		<colgroup>
			<col width="17%"/>
			<col width="17%"/>
			<col width="17%"/>
			<col width="17%"/>
			<col width="17%"/>
			<col width="17%"/>
		</colgroup>
		<tr >
			<td><a href="/MainHome.do">홈</a></td>
	   		<td><a href="/boardList.do">여행지</a></td>
	    	<td><a href="/reBoardList.do">축제</a></td>
	    	<td><a href="/rschList.do">커뮤니티</a></td>
	    	<td><a href="/rschList.do">주변여행지</a></td>
	
		</tr>
	</table>
	</div>
</div>
