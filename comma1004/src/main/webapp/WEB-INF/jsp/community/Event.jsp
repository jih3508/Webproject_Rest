<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<style>
.side {
	display: inline-block;
	width: 10%;
	margin-left: 150px;
	padding: 30px 30px;
}

.content {
	display: inline-block;
	width: 60%;
	vertical-align: top;
	margin-left: 80px;
}

.title {
	border: 3px solid #41719C;
	text-align: center;
	font-size: 20px;
	width: 20%;
	margin-bottom: 5%;
}

.wirte {
	border: 1px solid #41719C;
	width: 120%;
	height: 25px;
	border-radius: 8px;
	vertical-align: text-bottom;
}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>이벤트</title>
</head>

<body>
	<%@ include file="/include/Top_Menu.jsp"%>
	<div>
		<div class="side">
			<%@ include file="/include/sideCom.jsp"%>
		</div>

		<div class="content">
			<div style="width: 600px; text-align: left;">
				<form name="srchForm" method="post" action="/Event.do">
					<select name="srchCond">
						<option value="title">제목</option>
						<option value="content">내용</option>
						<option value="titleCont">제목+내용</option>
					</select> <input type="text" name="srchWord" style="width: 150px;">
					<input type="submit" value="검색">
				</form>
			</div>


			<table width=90%" cellpadding="0" cellspacing="0" border="0">
				<tr height="5">
					<td width="5"></td>
				</tr>
				<tr
					style="background: url('/images/com/table_mid.gif') repeat-x; text-align: center;">
					<td width="5"><img src="/images/com/table_left.gif" width="5"
						height="30" /></td>
					<td width="50">번호</td>
					<td width="300">제목</td>
					<td width="50">작성자</td>
					<td width="100">작성일</td>

					<td width="7"><img src="/images/com/table_right.gif" width="5"
						height="30" /></td>
				</tr>
				<tr height="25" align="center">
				</tr>
				<tr height="1" bgcolor="#D2D2D2">
					<td colspan="6"></td>
				</tr>

				<tr height="1" bgcolor="#82B5DF">
					<td colspan="6" width="752"></td>
				</tr>
			</table>

			<table width="100%" cellpadding="0" cellspacing="0" border="0">
				<tr>
					<td colspan="4" height="5"></td>
				</tr>
				<tr align="center">
					<td><input type=button value="글쓰기"></td>
				</tr>


			<c:forEach var="a" items="${resultList}" varStatus="status">
				<tr align="center">
					<td>${status.count}</td>
					<td align="left"><c:forEach var="i" begin="1"
							end="${fn:length(a.thread)}">
						&nbsp;&nbsp;
					</c:forEach> <c:if test="${a.thread != 'a' }">
							[답글]
						</c:if> <a href="/reBoardDetail.do?unq=${a.unq}">${a.title}</a></td>
					<td>${a.name}</td>
					<td>${a.rdate}</td>
					<td>${a.hit}</td>
				</tr>
			</c:forEach>

			</table>

			<div style="width: 500px; height: 40px; text-align: center">

				<!-- for(int i=1; i<=${lastPage}; i++) -->
				<c:forEach var="i" begin="1" end="${lastPage}" step="1">

					<a href="/reBoardList.do?pageNo=${i}">${i}</a>

				</c:forEach>

			</div>
		</div>


		<div
			style="margin-bottom: 20px; margin-top: 10px; margin-left: 150px;">
			<p>
				<img src="\images\basic_form\logo.png" width="60px" height="40px" />김영준
				김하나 오다혜 이나연 조익현
			</p>
		</div>
	</div>

</body>
</html>
