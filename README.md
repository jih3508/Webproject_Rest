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
``` Javascript
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
	<select id="commaDAO.selectMemberIdcheck" resultClass="java.lang.Integer">
		SELECT count(*) FROM MEMBER 
		where id = '$id$' 
	</select>
```
### 회원 

#### JavaScript
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

### 로그인

#### Javascript
``` JavaScript
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

```

#### Controller
``` Java
@RequestMapping("/loginConf.do")
	@ResponseBody public Map<String,Object> loginCertification(
			CommaVO vo,	HttpServletRequest request) throws Exception {
			String result = "";
			int cnt = 0;
			HashMap<String, Object> map = new HashMap<String, Object>();		
			System.out.println("컨트롤1");
			String userID =vo.getId();
			String userPwd = vo.getPwd();
			vo = commaService.selectMemberIdPwdCheck(vo);
			System.out.println("컨트롤2");
			if(vo.getCount() > 0) {
			/* 인증 세션 생성 */
			map.put("userId", userID);
			map.put("userPwd", userPwd);
			map.put("userName", vo.getName());
			request.getSession().setAttribute("loginCertification", map); //세션 변수 생성
			result = "ok";
			} else  {
			result = "11";
			}
			System.out.println("컨트롤3");
			map.put("result", result);
			System.out.println(result);
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

### 로그아웃

#### Javascript
``` Javascript
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
```

#### Controller
```Java
@RequestMapping(value = "/logOut.do")
	@ResponseBody public Map<String, Object> logOutAction(CommaVO vo, HttpServletRequest request) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		request.getSession().setAttribute("loginCertification", null);
		map.put("result","ok");
		return map;
	}
```

### 회원 정보

### 회원 정보 불러 오기

#### JSP
``` JavaScript
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
```

#### Controller
``` Java
	@RequestMapping(value="Mypage_Modify.do")
	   public String selectMyinform(CommaVO vo, 
				ModelMap model, HttpServletRequest request) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		Map aa = (Map) request.getSession().getAttribute("loginCertification");
		String id = (String) aa.get("userId");
		vo.setId(id);
		
		vo = commaService.selectMyinform(vo);
		model.addAttribute("vo",vo);
		
		
	      return "comma/Mypage_Modify";
	   }
```

#### DB
```
	<select id="commaDAO.selectMyinformk" resultClass="commaVO">
	
		SELECT  ID,
				PWD,
				NAME,
				EMAIL,
				TO_CHAR(BIRTHDAY, 'YYYYMMDD') ,
				MANAGER_NO
					
		FROM 
				member
		WHERE
				id = #id#
	</select>
```
### 회원 정보 수정
#### Javascript
```Javascript
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
```

#### Controller
``` Java
	/*회원정보수정*/
	@RequestMapping(value="/memberUpdate.do")
	@ResponseBody
	public Map<String, Object> updateMember(CommaVO vo, ModelMap model, HttpServletRequest request) throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map aa = (Map) request.getSession().getAttribute("loginCertification");
		String id = (String) aa.get("userId");
		vo.setId(id);
		
		System.out.println("전달");
		// ret = 1  or 0
		int ret = commaService.updateMember(vo);
		System.out.println(ret+"전달완료");	
		if(ret == 0) {
			System.out.println(" >> 수정 처리 오류 (er) ");
		} else {
			System.out.println(" >> 수정 처리 완료 (ok) ");
		}
		map.put("result", ret);
		System.out.println("ret:"+ret);
		return map;
	}
	
```

#### DB
```
	<update id="commaDAO.updateMember">	
			UPDATE member 
			SET 
					pwd = '$pwd$',
					email = '$email$',
					birthday = '$birthDay$'
			WHERE
				id = '$id$'
	</update>
```

### 게시판 저장

#### Controller
``` Java
	@RequestMapping(value="/boardWriteSave.do")
	public String insertBoard(BoardVO vo) throws Exception {
	
		vo.setHit(100);
		// ret => 결과 값 ;; ok : null ; fail : x
		String ret = boardService.insertBoard(vo);
		return "redirect:/boardList.do";
	
	}
```

#### DB
```
<insert id="boardDAO.insertBoard">	
	INSERT INTO board ( title,
						pwd,
						name,
						content,
						hit,
						rdate )
				VALUES ( '$title$',
						 '$pwd$',
						 '$name$',
						 '$content$',
						 '$hit$',
						 now() )
	</insert>
```

### 게시판 리스트

#### Controller
```Java
	@RequestMapping(value="/boardList.do")
	public String selectBoardList(BoardVO vo, ModelMap model) throws Exception {

		System.out.println(">>> 11 : " + vo.getSrchCond());
		System.out.println(">>> 22 : " + vo.getSrchWord());
		
		List<?> list = boardService.selectBoardList(vo);
		
		model.addAttribute("resultList",list);
		return "board/boardList";
	}
```

#### DB
```
	<select id="boardDAO.selectBoardList" resultClass="egovMap">
		SELECT  unq,
				title,
				pwd,
				name,
				content,
				hit,
				DATE_FORMAT(rdate ,'%Y/%m/%d') as rdate
		FROM 
				board
		WHERE
			1=1
		
		<isNotNull property="srchCond">

			<isEqual  property="srchCond" compareValue="titleCont">
			AND ( title LIKE '%$srchWord$%'
						OR content LIKE '%$srchWord$%' )
			</isEqual>
			
			<isNotEqual  property="srchCond" compareValue="titleCont">
			AND  $srchCond$ LIKE '%$srchWord$%'
			</isNotEqual>
		
		</isNotNull>

		ORDER BY 
				unq DESC 
	</select> 
```

### 게시판 내용

#### Controller
```  Java
	@RequestMapping(value="/boardDetail.do")
	public String selectBoardDetil(BoardVO vo, 
				ModelMap model) throws Exception {
		
		vo = boardService.selectBoardDetail(vo);
		model.addAttribute("vo",vo);
		
		return "board/boardDetail";
	}
```

#### DB
```
	<select id="boardDAO.selectBoardDetail" resultClass="boardVO">
	
		SELECT  unq,
				title,
				pwd,
				name,
				content
		FROM 
				board
		WHERE
				unq = #unq#
	</select>
```

### 게시판 수정
#### Controller
```
	@RequestMapping(value="/boardDetailSave.do")
	public String updateBoard(BoardVO vo) throws Exception {

		// ret = 1  or 0
		int ret = boardService.updateBoard(vo);
		
		if(ret == 0) {
			System.out.println(" >> 수정 처리 오류 (er) ");
		} else {
			System.out.println(" >> 수정 처리 완료 (ok) ");
		}

		return "redirect:/boardList.do";
	}
```
#### DB
```
	<update id="boardDAO.updateBoard">	
			UPDATE board SET 
					title = #title#,
					name = #name#,
					content = #content#,
					hit = 0,
					rdate = now()
			WHERE
				unq = #unq#
	</update>
```

### 게시판 삭제
#### Controller
```
	@RequestMapping(value="/boardDelete.do")
	public String deleteBoard(BoardVO vo) throws Exception {

		// ret = 1  or 0
		int ret = boardService.deleteBoard(vo);
		
		if(ret == 0) {
			System.out.println(" >> 삭제 처리 오류 (er) ");
		} else {
			System.out.println(" >> 삭제 처리 완료 (ok) ");
		}

		return "redirect:/boardList.do";
	}
```
#### DB
```
	<delete id="boardDAO.deleteBoard">
		DELETE FROM board
			WHERE
				unq = #unq# 
	</delete>
```
