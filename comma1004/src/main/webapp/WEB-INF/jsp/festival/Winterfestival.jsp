<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
	<style>
		.side {
			display: inline-block;
			width: 10%;
			margin-left: 150px;
			padding: 30px 30px;
			vertical-align: top;
		}
		.content {
			display: inline-block;
			width: 43%;
			vertical-align: top;
			margin-left: 50px;
		}
		.rside{
			display:inline-block;
			width:17%;
			margin-left: 50px;
			margin-top: 30px;	
		}
		.title {
			border: 3px solid #41719C;
			text-align: center;
			font-size: 25px;
		}
</style>
<html>
<head>
<meta charset="UTF-8">
<title> 겨울 축제 </title>


<script src="/script/jquery-1.12.4.js"></script>
<script src="/script/jquery-ui.js"></script>

</head>

<body>
		
		<%@ include file="/include/Top_Menu.jsp" %> 
		<div class="side">
			<%@ include file="/include/sideFestival.jsp" %>
		</div>
		
		<div class="content">
			<div>
				<div class="title">겨울 축제</div>
			</div>
			
				<p> <img src="\images\festival\겨울축제1.PNG" width="500px" height="130px" /> </p>
			
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제2.PNG" width="500px" height="130px" /></p>
		
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제3.PNG" width="500px" height="130px" /></p>
			
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제4.PNG" width="500px" height="130px" /></p>
									
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제5.PNG" width="500px" height="130px" /></p>
									
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제6.PNG" width="500px" height="130px" /></p>			
						
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제7.PNG" width="500px" height="130px" /></p>
				
				<div style="border:1px solid #41719C; text-align:center"></div>
				<p> <img src="\images\festival\겨울축제8.PNG" width="500px" height="130px" /></p>
				
		</div>

			 <div class="rside">
		 		<%@ include file="/include/sideCalendar.jsp"%>
			</div>




	<br />
	
	<div style="margin-bottom: 20px; margin-top: 10px; margin-left: 150px;">
		<p>
			<img src="\images\basic_form\logo.png" width="60px" height="40px" />김영준
			김하나 오다혜 이나연 조익현
		</p>
	</div>


</body>
</html>



