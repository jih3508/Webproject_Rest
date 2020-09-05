<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		.subcontent {
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
			border: 2px solid #41719C;
			text-align: center;
			font-size: 25px;
		}
	</style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My present Position is..</title>

<script type="text/javascript"
		 src="//dapi.kakao.com/v2/maps/sdk.js?appkey=72e130bee9afcd63f98b52c20e49425d"></script>
<!-- 실제 지도를 그리는 api 불러오기, 반드시 실행코드보다 먼저 선언되어야 한다.-->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services,clusterer,drawing"></script>
<!-- 라이브러리 추가 -->

<script type="text/javascript" src="drawingmap.js"></script>
<script type="text/javascript" src="geolocation.js"></script>


<script>
	function init(){
		
		geoLocation();
	}
	window.onload=init();
	function geoLocation(){
		
		if(navigator.geolocation){
			navigator.geolocation.getCurrentPosition(showPosition, showError);
		}
		else{
			alert("Geolocation is not supported by this browser.");
		}
	}

	var nLat;
	var nLng;

	//위치 추적 성공
	function showPosition(position){
		
		nLat = position.coords.latitude;
		nLng = position.coords.longitude;
		console.log("nLat : "+nLat);
		console.log("nLng : "+nLng);
		
		// drawingmap.js
		map_initialize(nLat, nLng);
		
	}

	//위치 추적 실패
	function showError(error){
		switch(error.code){
			case error.PERMISSION_DENIED:
				alert("User denied the request for Geolocation");
				break;
			case error.POSITION_UNAVAILABLE:
				alert("Location information is unavailable");
				break;
			case error.TIMEOUT:
				alert("The request to get user location timed out");
				break;
			case error.UNKNOWN_ERROR:
				alert("An unknown error occurred");
				break;
		}
	}
	var map;

	function map_initialize(myLat, myLng){
		
		console.log("map_initialize2");
		var position = new daum.maps.LatLng(myLat, myLng);
		
		map=new daum.maps.Map(document.getElementById('map_canvas'),{
			center : position,
			level : 3,
			mapTypeId: daum.maps.MapTypeId.ROADMAP
		});
		
		DrawLocationMarker(myLat, myLng);
		
		DrawCircle(myLat, myLng, 1000);
		
	};

	function DrawLocationMarker(lat, lng){
		
		console.log("DrawLocationMarker");
		var imageSrc='./images/pin.png',
			imageSize = new daum.maps.Size(32, 37),//마커 이미지의 크기
			imageOption = {offset: new daum.maps.Point(16,37)};//마커 이미지의 옵션
		
		var markerImage = new daum.maps.MarkerImage(imageSrc, imageSize, imageOption),
			markerPosition = new daum.maps.LatLng(lat, lng);//마커가 표시될 위치
		
		var poiDaumMarker = new daum.maps.Marker({
			position: markerPosition,
			image: markerImage //마커 이미지 설정
		});
		poiDaumMarker.setMap(map);
	}

	var circle;
	var circleList=[];

	function DrawCircle(lat, lng, radius){
		
		console.log("DrawCircle");
		
		circle = new daum.maps.Circle({
			center : new daum.maps.LatLng(lat,lng),//원의 중심좌표
			radius: /* radius */ 100,//미터 단위의 원의 반지름
			strokeWeight:3, //선의 두께
			strokeColor: '#75B8FA', //선의 색깔
			strokeOpacity: 1, //선의 불투명도. 1에서 0사이의 값이며 0에 가까울수록 투명하다.
			strokeStyle: 'dashed',//선의 스타일
			fillColor: '#CFE7FF', //채우기 색깔
			fillOpacity: 0.3 //채우기 불투명도
		});
		
		circle.setMap(map);
		
	}

</script>

</head>
<body>
<%@ include file="/include/Top_Menu.jsp" %> 
		<div class="side">
		<%@ include file="/include/sideGps.jsp" %>
		</div>
		
			<div class="content">
				<div class="title">
				주변여행지
				</div>
			<br>
				<div id="map_canvas" style="width:100%;height:400px;"></div>
				<!-- 지도를 담을 영역 -->
						 
					<script>
						var container = document.getElementById('map_canvas');//지도를 담을 영역의 DOM 레퍼런스
						var options = {//지도를 생성할 때 필요한 기본 옵션
							center: new daum.maps.LatLng(33.450701, 126.570667),
							//지도의 중심좌표 -지도 생성 시 반드시 필요, 생성인자는 위도, 경도 순이다.
							level: 3//지도의 레벨(확대, 축소 정도)
						};
				
						var map = new daum.maps.Map(container, options);//지도 생성 및 객체 리턴
					</script>
					<!-- 지도를 띄우는 코드 작성 -->
			</div>
</body>

</html>