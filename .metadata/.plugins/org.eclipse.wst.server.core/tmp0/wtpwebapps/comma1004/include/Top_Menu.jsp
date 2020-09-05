<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<style>
		.top_link{
			background-color:#80BCE1; 
			margin-top:10px;
			text-align: center;
			width: 85%;
		}
		.top_link li{
			background-color:#80BCE1;
			height:auto;
			display: inline-block;
			fontsize:150%;
		    color: black;
		    width:20%; 
			margin:0;
			padding: 15px;
    		list-style:none;
		}
		.top_link li ul{	
			position:absolute;
			display:none;	
			fontsize:150%;
		    color: black;
		    width:10%; 
			margin:0px;
    		list-style:none;
    		z-index:200px;
		}
		.top_link li ul li{
			background-color:#B3E0F4;
			fontsize:150%;
		    color: black;
			width:90%;
		  /*  border-bottom:1px solid;  */
		}
		.top_link  a{
			fontsize:150%;
		    color: black;
    		text-decoration: none;

		}
		.top_link li:hover ul {
				display:block;   /* 마우스 커서 올리면 서브메뉴 보이게 하기 */
			}
		.top_link li:hover  ul li:HOVER{
			background-color: #91BCD8;
			color:#ffffff;
			}
		.top_link li:hover{
		    background-color: #007EA5;
			color:#FFFFFF;	
		}
		/* .top_link a{
		    background-color: #007EA5;
			color:#ffffff;	
		} */
		.My_menu{	
			margin-top:90px;
			overflow: hidden;
			}
		.My_menu a{
			color: black;
			text-decoration: none;
		}
		.My_menu a:hover{
			color: #41719C;
			background-color:#FFFFFF;
		}
	</style>
	<script>
	function fn_logout() {

		$.ajax({
			type: 'POST',
			data: '',
			url: "/logOut.do",
			dataType: "json",
			success: function (data) {
				if(data.result == "ok") {
					alert("로그아웃 처리 되었습니다.");
					 location.href = "/MainPage.do";
				}else{
					alert("실패했습니다.!!!");
					
				} 
			},
			error: function (error) {
				alert("error : " + error);
			}
		});
	}
	</script>
	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="top_display" style="width:100%;">
		<table border="0" width="100%">
			<tr>
				<td width="30%">
		<div >
			<p style="border:solid;  color:gray; border-radius:12px; margin-left:300px; margin-top:90px; margin-right:50px;">
				<input type="text" name="search" placeholder="Search" style="border-style:none; height:20px;  margin-left:3px;" />
				<a href="#" ><img src="/images/basic_form/searchbutton.png" style="height:20px;"></a>
			</p>
		</div>
				</td>
				<td width="40%" >
		<div align="center" >
			<a href="MainPage.do" >
				<img src="/images/basic_form/logo.png" style="height:100px;">
			</a>
		</div>
				</td>
				<td width="30%">
		<div class="My_menu" align="right">
					<c:if test="${sessionScope.loginCertification.userId != null}">
						<a href="#" onClick="fn_logout()">로그아웃</a> |  <a href="#">${sessionScope.loginCertification.userName}</a> | <a href="/Mypage_Modify.do" style="margin-right:300px;">마이페이지</a>
					</c:if>
					<c:if test="${sessionScope.loginCertification.userId == null}" >
					<a href="/Login.do">로그인</a> |  <a href="/memberSign.do">회원가입</a> | <a href="#" style="margin-right:300px;">마이페이지</a>
					</c:if>
		</div>
				</td>
			</tr>
		</table>
	</div>	
		<br/>
		<div align="center">
			<div class="top_link">
				<ul>
				<a href="#"><li>	여행지
						<ul>
							<a href="#"><li>서울</li></a>
							<a href="/Busan.do"><li>부산</li></a>
							<a href="/Daegu.do"><li>대구</li></a>
							<a href="/Incheon.do"><li>인천</li></a>
							<a href="#"><li>광주</li></a>
							<a href="#"><li>대전</li></a>
							<a href="#"><li>울산</li></a>
							<a href="#"><li>경기도</li></a>
							<a href="#"><li>강원도</li></a>
							<a href="#"><li>충천도</li></a>
							<a href="#"><li>전라도</li></a>
							<a href="#"><li>경상도</li></a>
							<a href="#"><li>제주도</li></a>
						</ul> 
				</li></a>
				<a href="/Springfestival.do"><li>축제
						<ul>
							<a href="/Springfestival.do"><li>봄축제</li></a>
							<a href="/Summerfestival.do"><li>여츰축제</li></a>
							<a href="/Fallfestival.do"><li>가을축제</li></a>
							<a href="/Winterfestival.do"><li>겨울축제</li></a>
						</ul> 		
				</li></a>
				<a href="/NoticeList.do"><li>커뮤니티
					<ul>
						<a href="/NoticeList.do"><li>공지사항</li></a>
						<a href="/Review.do"><li>여행후기</li></a>
						<a href="/Event.do"><li>이벤트</li></a>
						<a href="/QA.do"><li>Q&A</li></a>
					</ul> 
				</li></a>
				<a href="#"><li>주변여행지
					<ul>
						<a href="#"><li>주변여행지</li></a>
						<a href="#"><li>찾기</li></a>
					</ul>
				</li></a>
			</ul>
			</div>
		</div>
		<br/>
</body>
</html>