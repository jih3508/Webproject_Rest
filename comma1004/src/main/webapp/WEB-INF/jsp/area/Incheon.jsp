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
<title> 인천 여행지 </title>


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
				이색거리
				
				</div>
				
				<p> <a href="\link1.do">
			
					<img src="\images\area\이색거리1.PNG" width="100%" height="160px" /></a>
					<img src="\images\area\이색거리2.PNG" width="100%" height="160px" />
					<img src="\images\area\이색거리3.PNG" width="100%" height="160px" />
					<img src="\images\area\이색거리4.PNG" width="100%" height="160px" />
			   
			  </p>
			</div>
			
			<div> 	
				<div class="title">
				산책로
				</div>
				<p> <img src="\images\area\산책로1.PNG" width="100%" height="160px" />
					<img src="\images\area\산책로3.PNG" width="100%"x" height="160px" />
					<img src="\images\area\산책로2.PNG" width="100%" height="160px" />
					<img src="\images\area\산책로4.PNG" width="100%" height="160px" />
				</p>
			</div>
			
			<div >	
				<div class="title">
				자연경관
				</div>
				<p> <img src="\images\area\자연경관1.PNG" width="100%" height="160px" />
					<img src="\images\area\자연경관3.PNG" width="100%" height="160px" />
					<img src="\images\area\자연경관2.PNG" width="100%" height="160px" />
					<img src="\images\area\자연경관4.PNG" width="100%" height="160px" />
				</p>
			</div>
			
			<div>	
				<div class="title">
				공원
				</div>
				<p> <img src="\images\area\공원1.PNG" width="100%" height="160px" />
					<img src="\images\area\공원3.PNG" width="100%" height="160px" />
					<img src="\images\area\공원2.PNG" width="100%" height="160px" />
					<img src="\images\area\공원4.PNG" width="100%" height="160px" />
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



