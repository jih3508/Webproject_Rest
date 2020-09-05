<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
.tcontent {
	border-collapse: collapse;
	border-color: #4374D9;
	width: 90%;
	height: 420px;
}

.tcontent img {
	width: 90%;
	margin-top: 5px;
	margin-bottom: 5px;
}

.img_slide {
	width: 100%;	
	background-color:#FFFFFF; 
}
</style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>매인화면</title>

<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
	rel="stylesheet" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

</head>
<body>

	<%@ include file="/include/Top_Menu.jsp"%>
	<div width="100%">
		<div align="center">
			<table border="0" width="78%">
				<colgroup>
					<col width="24%">
					<col width="23%">
					<col width="23%">
					<col width="23%">
				</colgroup>
				<tr>
					
					<td rowspan="3" style="vertical-align: top;">
					<%@ include	file="/include/sideCalendar.jsp"%>
					<div align="center" style="margin-top:20px; ">
					<a href="#"><img src="/images/basic_form/fb.png"></a>
					<a href="#"><img src="/images/basic_form/ins.png"></a>
					<a href="#"><img src="/images/basic_form/tw.png"></a>
					</div>
					</td>
							
					<td colspan="3">	
					<div align="center">	
					<div style="width:97%;" align="center">
						<div id="myCarousel" class="carousel slide" data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								<li data-target="#myCarousel" data-slide-to="1"></li>
								<li data-target="#myCarousel" data-slide-to="2"></li>
								<li data-target="#myCarousel" data-slide-to="3"></li>
							</ol>

							<div class="carousel-inner">
								<div class="item active">
									<img src="/images/basic_form/main1.png" alt="First slide"
										height="400px" class="img_slide">
									<div class="container">
										<div class="carousel-caption"></div>
									</div>
								</div>
								<div class="item">
									<img src="/images/basic_form/main2.png" data-src=""
										alt="Second slide" height="400px" class="img_slide">
									<div class="container">
										<div class="carousel-caption"></div>
									</div>
								</div>
								<div class="item">
									<img src="/images/basic_form/main3.png" data-src=""
										alt="Third slide" height="400px" class="img_slide">
									<div class="container">
										<div class="carousel-caption"></div>
									</div>
								</div>
								<div class="item">
									<img src="/images/basic_form/main4.png" data-src=""
										alt="Third slide" height="400px" class="img_slide">
									<div class="container">
										<div class="carousel-caption"></div>
									</div>
								</div>


							</div>

							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev"><span
								class="glyphicon glyphicon-chevron-left"></span></a> <a
								class="right carousel-control" href="#myCarousel"
								data-slide="next"><span
								class="glyphicon glyphicon-chevron-right"></span></a>
						</div>
					</div>
					</div>
					</td>
				</tr>
				<tr height="10">
					<td colspan="3"></td>

				</tr>
				<tr>
					<td style="vertical-align: top;">
						<table border="1" class="tcontent" align="center">
							<tr>
								<td align="center" style="color: #80BCE1;">이달의 이벤트!!!!</td>
							</tr>
							<tr>
								<td align="center"><img
									src="/images/basic_form/maintest2.png"></td>
							</tr>
						</table>
					</td>
					<td style="vertical-align: top;">
						<table border="1" class="tcontent" align="center">
							<tr>
								<td align="center" style="color: #80BCE1;">CITY TOUR</td>
							</tr>
							<tr>
								<td align="center"><img
									src="/images/basic_form/maintest1.png"></td>
							</tr>
						</table>
					</td>
					<td style="vertical-align: top;">
						<table border="1" class="tcontent" align="center">
							<tr height="11%">
								<td align="center" style="color: #80BCE1;">공지사항</td>
							</tr>
							<tr>
								<td align="center"></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>