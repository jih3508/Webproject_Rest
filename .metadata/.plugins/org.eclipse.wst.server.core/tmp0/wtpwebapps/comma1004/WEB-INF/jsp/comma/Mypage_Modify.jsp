<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style>
		button{
			margin-top:10px;
			border-color:#41719C;
			background-color: #80BCE1;
			width:60px;
			height:30px;
		}
		p {
		    font-family: verdana;
		    font-size: 20px;
		    color:#80BCE1;
		    margin-top:20px;
		}

		.single_modify{
			margin-top:10px;
			display:inline-block; /*  */
			margin-left:250px;
			float:center;
			border-style:outset;
			width:30%;
			height:400px;
			
		}
		.single_side{
			margin-top:70px;
		 	margin-left:250px;
			display:inline-block;
		 	float:left;
		 	border-color:#353535;
		 	border-style:solid;
		 	border-width: 2px;
		 	width:10%;
		 	text-align:center; 
			
		
		}
		.single_side a{
			text-decoration:none;
			color:black;
		}
		.modify_main{
			margin-top:70px;
			height:300px;
			
		}
		
	</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 수정</title>
<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>

 <script>
$(function(){
	$("#update").click(function(){
		if($("#pwd").val() == "") {
			alert("암호를 입력해주세요.");
			$("#pwd").focus();
			return;
		}else{
			if($("#pwd").val() == $("#password").val()){
				alert("암호가 일치하지 앖습니다..");
				$("#pwd").focus();
				$("#password").focus();
				return;
			} 
		}
		if($("#email").val() == "") {
			alert("이메일 입력해주세요.");
			$("#email").focus();
			return;
		}
		
		if($("#oldpwd_check").val() == $("#old_pwd").val()){
			alert("현재 비밀번호가 일치하지 않습니다.");
			$("#old_pwd").focus();
			return;
		}

		if($("#birthDay").val() == "") {
			alert("생년월일을 입력해주세요.");
			$("#birthday").focus();
			return;
		}
		
		if(confirm("저장하시겠습니까?")) {	
			var formData = $("#frm").serialize();
			$.ajax({
				type: "POST",
				data: formData,
				url: "/memberUpdate.do",
				dataType: "json",

				success: function(data) {
					if(data.result == 1) {
						alert("회원수정 되었습니다. 다시 로그인 하세요");
						location.href ="/Login.do";
					}
				},
				error: function () {
					alert("오류발생 ");
				}
			}); 
		} 
	
	});
});


</script>

</head>
<body>
	<%@ include file="/include/Top_Menu.jsp" %> 	

	<p align="center">쉼터 회원정보수정</p><br/>

		<div class="single_modify">
		<form name="frm" id="frm" method="post">
		<input type="hidden" name="oldpwd_check" id="oldpwd_check" value="${vo.pwd}">
			<table class="modify_main" align="center" border="0">
				<tr>
					<td>아이디</td>
					<td>${vo.id}</td>
				</tr>
				<tr>
					<td>현재 비밀번호</td>
					<td><input type="password" name="old_pwd" id="old_pwd"></td>
				</tr>
				<tr>
					<td>새 비밀번호</td>
					<td><input type="password" name="pwd" id="pwd" onblur=checkvalue();></td>
				</tr>
				<tr>
					<td>새 비밀번호 확인</td>
					<td><input type="password" name="password" name="password" onblur=checkvalue();></td>
					<td>
					<input type="text" name="status"
							class="status" readonly onfocus="this.blur();" value=""
							style="text-align:center; color:blue; border-style:none;">
					</td>
					
	
				</tr>
				<tr >
					<td>이메일</td>
					<td><input type="text" name="email" id="email"value="${vo.email}"></td>
				</tr>
				<tr >
					<td>생년월일</td>
					<td><input type="date" name="birthDay" id="birthDay" style="width:95%;" value="${vo.birthDay}"></td>
				</tr>
				<tr>
					<td><button type="button" name="update" id="update">저장</button></td>
					<td> <button type="reset">취소</button></td>
				</tr>
			</table>
		</form>
		</div>
	
		<div class="single_side">
			<p style="pading:10px 10px; ">마이페이지</p>
        	
          	<h4><a href="/Mypage_Modify.do">회원 정보수정</a></h4>
          	<h4><a href="#">작성글 보기</a></h4>
	
		</div>

</body>
</html>