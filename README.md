# Team Webproject_Rest
## 개발 도구
### Spring Farmework, JSP
### DB: Oracle DB
### JAVA, JavaScript

---
### DB 테이블 구조
#### ER 다이어그램
![ER 다이러그램](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B4%80%EA%B3%84.png)

#### 회원 테이블
![회원 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B7%B8%EB%A6%BC1.png)
#####  회원 테이블 DDL SQL
```
create table Member(
ID varchar(20) not null,
PWD varchar(20) not null,
name varchar(4) not null,
e-mail varchar(40), 
primary key(ID) 
set 
);
```
#### 게시판 테이블
![게시판 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B2%8C%EC%8B%9C%ED%8C%90Table.png)
##### 게시판 테이블 DDL SQL
```
create table board(
B-code int not null
title varchar(50) not null,
name vachar(4) not null,
content varchar(200),
hit int,
rdate date,
primary key(B-code)
)
```
#### 댓글 테이블
![댓글 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EB%8C%93%EA%B8%80%20%ED%83%9C%EC%9D%B4%EB%B8%94.png)
#### GPS 테이블
![지도 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/GPSTABLE.png)

---
## 회원가입(memberSign.jsp)
### ID 중복체크
#### Javascript
```
function idcheck(){
	var formData = $("#member").serialize();
	if($("#id").val() == "") {
		alert("아이디를 입력해주세요.");
		$("#id").focus();
		return;
	}
	$.ajax({
		type: "POST",
		data: formData,
		url: "/idcheck.do",
		dataType: "json",
		success: function(data) {
			if(data.count == 0) {
				alert("중복없습니다.");
				document.member.doubleCheck.value="2";
			} else {
				alert("중복있습니다.");
			}
		},
		error: function () {
			alert("오류발생 ");
		}
	}); 
}
```
#### Controller
```
/*id 중복확인*/
	@RequestMapping(value="/idcheck.do")
	@ResponseBody
	public Map<String,Object> selectMemberIdcheck (
			HttpServletResponse response,
			CommaVO vo) throws Exception {
		System.out.println("컨트롤 1");
		Map<String, Object> map = new HashMap<String, Object>();
		
		String result = "";
		
		 
		/* 저장 */
		int cnt = commaService.selectMemberIdcheck(vo);

		map.put("count", cnt);

		return map;
	}
```

#### DB
```
<select id="commaDAO.selectMemberIdPwdCheck" resultClass="commaVO">
		SELECT count(*)over() count,(SELECT name FROM MEMBER where id = '$id$' AND pwd = '$pwd$') name
		     FROM MEMBER 
					where id = '$id$' AND pwd = '$pwd$'
	</select>
```


