<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
	<style>
		.side{
			display:inline-block;
			width:10%;
			margin-left:150px;
			padding:30px 30px; 
		}
		.content{
			display:inline-block;
			width:60%;
			vertical-align:top; 
			margin-left:80px;
		
		}
		.title{
			border:3px solid #41719C; 
			text-align:center;
			font-size:25px;
		}
	</style>
<html>
<head>
<meta charset="UTF-8">
<title> 부산 여행지 </title>


<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>

</head>

<body>
		
		<%@ include file="/include/Top_Menu.jsp" %> 


	<div >
		<div class="side">
			<%@ include file="/include/sideArea.jsp" %>
		</div>
		<div class="content">
			<div>
				<div class="title">
				해수욕장
				
				</div>
				
				<p> <a href="https://bit.ly/2zwHWpE" target = "_blank"">
					<img src="\images\area\해수1.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2Q1z1qG" target = "_blank"">
					<img src="\images\area\해수2.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2zHuUWP" target = "_blank"">
					<img src="\images\area\해수3.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2So7egZ" target = "_blank"">
					<img src="\images\area\해수4.PNG" width="100%" height="150px" /></a>
			   
			  </p>
			</div>
			
			<div> 	
				<div class="title">
				문화마을/산책로
				</div>
				<p> <a href="https://bit.ly/2rfHZlu" target = "_blank"">
					<img src="\images\area\산책1.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2BJJ6Qj" target = "_blank"">
					<img src="\images\area\산책3.PNG" width="100%"x" height="150px" /></a>
					<a href="https://bit.ly/2zzS0P3" target = "_blank"">
					<img src="\images\area\산책2.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2FSJXlN" target = "_blank"">
					<img src="\images\area\산책4.PNG" width="100%" height="150px" /></a>
				</p>
			</div>
			
			<div >	
				<div class="title">
				섬/대교
				</div>
				<p> <a href="https://bit.ly/2RuIzHC" target = "_blank"">
					<img src="\images\area\섬1.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2FPJaSM" target = "_blank"">
					<img src="\images\area\섬3.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2Q3Cx42" target = "_blank"">
					<img src="\images\area\섬2.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2SjnAr6" target = "_blank"">
					<img src="\images\area\섬4.PNG" width="100%" height="150px" /></a>
				</p>
			</div>
			
			<div>	
				<div class="title">
				체험시설
				</div>
				<p> <a href="https://bit.ly/2U06HTS" target = "_blank"">
					<img src="\images\area\체험1.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2P8G2kc" target = "_blank"">
					<img src="\images\area\체험3.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2QqbM9i" target = "_blank"">
					<img src="\images\area\체험2.PNG" width="100%" height="150px" /></a>
					<a href="https://bit.ly/2zzQoVl" target = "_blank"">
					<img src="\images\area\체험4.PNG" width="100%" height="150px" /></a>
				</p>
			</div>
				

		</div>		
			
	</div>
			
			
			<br/>
			<div style="margin-bottom:20px; margin-top:10px; margin-left:150px;">
		        <p ><img src="\images\basic_form\logo.png" width="60px" height="40px"/>김영준 김하나 오다혜 이나연 조익현</p>
			</div>
		</div>

		  </body>
		</html>



