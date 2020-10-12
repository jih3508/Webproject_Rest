# Team Webproject_Rest
## 개발 도구
### Spring Farmework, JSP
### DB: Oracle DB
### JAVA, JavaScript

---
### DB 테이블 구조
#### ER 다이어그램
![ER 다이러그램](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B4%80%EA%B3%84.png)
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
#### 회원 테이블
![회원 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B7%B8%EB%A6%BC1.png)
```
```
#### 게시판 테이블
![게시판 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EA%B2%8C%EC%8B%9C%ED%8C%90Table.png)
#### 댓글 테이블
![댓글 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/%EB%8C%93%EA%B8%80%20%ED%83%9C%EC%9D%B4%EB%B8%94.png)
#### GPS 테이블
![지도 테이블](https://github.com/jih3508/Webproject_Rest/blob/master/DB%20%ED%85%8C%EC%9D%B4%EB%B8%94%20%EA%B5%AC%EC%A1%B0/GPSTABLE.png)
