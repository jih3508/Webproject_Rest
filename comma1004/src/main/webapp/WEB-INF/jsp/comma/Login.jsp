<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style>
		p {
		    font-family: verdana;
		    font-size: 15px;
		    color:#80BCE1;
		    margin-top:40px;
			}
		button{
				background-color:#80BCE1;	/* 버튼 배경 색 */ 
				width:100px;
				height:60px;
				font-size: 15px; /* 텍스트 사이즈 */
					
				}
		.main_form{
			margin-top: 50px;
			width:25%;
			border-style:solid; /* 테두리 형태 */
			border-width:2px;   /* 테두리 두께 */
			border-color:#80BCE1; /* 테두리 색깔 */
		}
	</style>
	<script>
		function fn_action() {
			if($("#id").val() == "") {
				alert("아이디 입력해주세요");
				return;
			}
			if($("#pwd").val() == "") {
				alert("패스워드 입력해주세요");
				return;
			}			
			$.ajax({
				type: 'POST',
				data: $("#member").serialize(),
				url: "/loginConf.do",
			
				dataType: "json",
				success: function (data) {
					if(data.result == "ok") {
						alert("로그인 처리 됬습니다.");
						location.href = "/MainPage.do?id="+data.userId+""; 
					} else if(data.result == "11") {
						alert("아이디와 패스워드가 일치하지 않습니다.");
					} else {
						alert("로그인 실패 관리자에게 문의");
					}
				},
				error: function (error) {
					alert("error : " + error);
				}
			});
		}
</script>
<head>
<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
	<%@ include file="/include/Top_Menu.jsp" %> 	
	<p align="center" style="margin-top:25px; margin-bottom:15px;">쉼표회원 로그인 </p>
	<div align="center">
	<div class="main_form">
		<form ame="member" id="member" method="post">
			<table style="width:80%; margin-top:40px" align="center">		
			<tr>
			<td>로그인</td>
			<td><input type="text" name="id" id="id"></td>
				<td rowspan="2">
					<!-- <img src="/images/basic_form/login.png"  style="width:80px; height:60px;"> -->
					<button type="button" name="sign" id="sign" onclick = "fn_action()" >
						로그인
					</button>
				</td>
			</tr>
			<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pwd" id="pwd"></td>
			<td></td>
			</tr>
			</table>
		</form>
		<table align="center" style="margin-top:20px; margin-bottom:40px;">
			<tr>
				<td><a href="#">아이디 / 비밀번호 찾기</a></td>
				<td style="width:20px"></td>
				<td><a href="/memberSign.do">회원 가입</a></td>
			</tr>
		</table>
	</div>
	</div>
</body>
</html>
