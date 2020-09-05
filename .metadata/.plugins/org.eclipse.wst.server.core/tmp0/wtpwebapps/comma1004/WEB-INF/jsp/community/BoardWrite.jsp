<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>

<script>
	function fn_action() {
		var f = document.frm100;

		if (f.title.value == "") {
			alert("제목을 입력해주세요.");
			return;
		}
		f.submit();
	}
</script>

<style>
.side {
	display: inline-block;
	width: 10%;
	margin-left: 150px;
	padding: 30px 30px;
}

.content {
	display: inline-block;
	width: 65%;
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
<title>글 쓰기</title>


<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>

</head>

<body>

	<%@ include file="/include/Top_Menu.jsp"%>


	<div>
		<div class="side">
			<%@ include file="/include/sideCom.jsp"%>
		</div>
		<div class="content">
			<div>
				<form name="frm100" method="post" action="#">
					<table>
						<tr>
							<td>
								<table width="100%" cellpadding="0" cellspacing="0" border="0">
									<tr style="text-align: center;">
										<td width="5"></td>
										<td>
											<p class="wirte">글쓰기</p>
										</td>
										<td width="5"><img src="img/table_right.gif" width="5"
											height="30" /></td>
									</tr>

									<table style="width: 120%; height: 65%;" border="0">
										<tr align="Left">
											<td>&nbsp;</td>

											<td colspan="2"><select name="board_kind"
												style="width: 15%; height: 25px;">
													<option value="no_select" selected="selected"
														style="text-align: center;">게시판 종류</option>
													<option value="notice" style="text-align: center;">공지사항</option>
													<option value="travel" style="text-align: center;">여행후기</option>
													<option value="event" style="text-align: center;">이벤트</option>
													<option value="Q&A" style="text-align: center;">Q&A</option>
											</select></td>
											<td>&nbsp;</td>
										</tr>
										<tr height="10" bgcolor="#FFFFFF">
											<td colspan="4"></td>
										</tr>
										</tr>
										<tr height="2" bgcolor="#dddddd">
											<td colspan="4"></td>
										</tr>
										<tr>
											<td>&nbsp;</td>
											<td align="Left" width="15%">
												<p style="border: 1px solid; text-align: center;">제목</p>

											</td>
											<td><input name="title" style="width: 85%" size="40"
												maxlength="100"></td>
											<td>&nbsp;</td>
										</tr>
										<tr height="1" bgcolor="#dddddd">
											<td colspan="4"></td>
										</tr>
										<tr>
											<td>&nbsp;</td>

											<td colspan="2"><textarea name="memo" cols="92"
													rows="13" style="width: 100%; height: 97%;"></textarea></td>
											<td>&nbsp;</td>
										</tr>
										<tr height="3" bgcolor="#dddddd">
											<td colspan="4"></td>
										</tr>
										<tr height="15" bgcolor="#FFFFFF">
											<td colspan="4"></td>
										</tr>
										<tr height="2" bgcolor="#82B5DF">
											<td colspan="4"></td>
										</tr>
										<tr height="15" bgcolor="#FFFFFF">
											<td colspan="4"></td>
										</tr>
										<tr align="center">
											<td>&nbsp;</td>
											<th colspan="2">
												<button type="button" onclick="fn_action()">저장</button>
												<button type="reset">취소</button>
											</th>
											<td>&nbsp;</td>
										</tr>
									</table>
									</td>
									</tr>
								</table>

								</form>

								</div>
								</div>

								</div> <br />
								<div
									style="margin-bottom: 20px; margin-top: 10px; margin-left: 150px;">
									<p>
										<img src="\images\basic_form\logo.png" width="60px"
											height="40px" />김영준 김하나 오다혜 이나연 조익현
									</p>
								</div>
								</div>
</body>
</html>



