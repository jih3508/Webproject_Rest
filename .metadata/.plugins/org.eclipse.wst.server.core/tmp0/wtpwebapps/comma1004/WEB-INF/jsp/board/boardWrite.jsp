<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css"/>
<link rel="stylesheet" href="/css/jquery-ui.css">
<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>
</head>

<script>
function fn_action() {
	var f = document.frm100;
	
	if(f.title.value == "") {
		alert("제목을 입력해주세요.");
		return;
	}
	if(f.pwd.value == "") {
		alert("암호를 입력해주세요.");
		return;
	}
	f.submit();
}
</script>

<body>
<div id="jb-container">
	<div id="jb-header">

<%@ include file="/include/topmenu.jsp" %> 	

	</div>
 	<div id="jb-content">

<form name="frm100" method="post" action="/boardWriteSave.do">
<table border="1" width="600">
	<tr>
		<th>제목</th>
		<td><input type="text" name="title"></td>
	</tr>
	<tr>
		<th>암호</th>
		<td><input type="password" name="pwd"></td>
	</tr>
	<tr>
		<th>글쓴이</th>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td>
		<textarea name="content" rows="5" cols="70"></textarea>
		</td>
	</tr>
	<tr>
		<th colspan="2">
			<button type="button" onclick="fn_action()">저장</button>
			<button type="reset">취소</button>
			<!-- <input type="button" value="저장" onclick="fn_action()">
			<input type="reset"  value="취소"> -->
		</th>
	</tr>
</table>
</form>

	</div>
	<div id="jb-sidebar">
        <h2>Sidebar</h2>
        <ul>
          <li>Lorem</li>
          <li>Ipsum</li>
          <li>Dolor</li>
        </ul>
	</div>
	<div id="jb-footer">
        <p>Copyright</p>
	</div>
</div>
  </body>
</html>



