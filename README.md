# Team Webproject_Rest
## 개발 도구
### Spring Farmework, JSP, JQuery, MyBatis
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
``` Java
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
### 회원 

### JavaScript
``` Javascript
$(function(){
	$("#sign").click(function(){
		if($("#id").val() == "") {
			alert("id을 입력해주세요.");
			$("#id").focus();
			return;
		}
			
		if($("#pwd").val() == "") {
			alert("암호를 입력해주세요.");
			$("#pwd").focus();
			return;
		}else{
			if($("#pwd").val() == $("pwd_comfirm")){
				alert("암호가 일치하지 앖습니다..");
				$("#pwd").focus();
				$("#pwd_comfirm").focus();
				return;
			}
			}
		if($("#name").val() == "") {
			alert("이름을 입력해주세요.");
			$("#name").focus();
			return;
		}
		if($("#email").val() == "" || $("#domain_site").val() == "no_select" ) {
			alert("이메일 입력해주세요.");
			$("#email").focus();
			$("#domain_site").focus();
			return;
		}
		
		if($("#doubleCheck").val() != "2") {
			
			alert("중복체그를 해주세요.");
			return;
		}
		
		
		if(confirm("저장하시겠습니까?")) {	
			var str= $("#email").val()+"@"+ $("#domain_site").val();
	 		var formData = $("#member").serialize();
	 		$("#email").val(str);
			$.ajax({
				type: "POST",
				data: formData,
				url: "/memberSave.do",
				dataType: "json",
				
				success: function(data) {
					if(data.result == "ok") {
						alert("회원가입 되었습니다.");
						location.href = "/Login.do";
					} else {
						alert("저장 실패했습니다. 다시 시도해 주세요.");
					}
				},
				error: function () {
					alert("오류발생 ");
				}
			}); 
		}
	});
});


```

#### Controller
``` Java
@RequestMapping(value="/memberSave.do")
	@ResponseBody
	public Map<String,Object> insertMember (
			HttpServletResponse response,
			CommaVO vo) throws Exception {
		System.out.println("컨트롤 1");
		Map<String, Object> map = new HashMap<String, Object>();
		
		String result = "";
		
		 System.out.println(vo.getId()+" "+ vo.getPwd()+" "+vo.getEmail()+" "+vo.getBirthDay()+" "+vo.getName());	 
		/* 저장 */
		result = commaService.insertMember(vo);
		 System.out.println("컨트롤 2");
		if(result==null)  result = "ok";
		map.put("result", result);
		 System.out.println("컨트롤3");
		return map;
	}

```

#### DB

``` xml
<insert id="commaDAO.insertMember">	
			INSERT INTO MEMBER ( ID,
						PWD,
						NAME,
						EMAIL,
						BIRTHDAY,
						MANAGER_NO
						)
			VALUES ( 	'$id$',
						'$pwd$',
						'$name$',
						'$email$',
						'$birthDay$',
						'0'
						)
	</insert>
```
