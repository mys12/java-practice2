<%@ page contentType="text/html; charset=UTF-8"%>
<%-- jsp주석문 기호. jsp주석문 기호는 html주석문과는 같게 브라우저 출력창에
나오지 않는 것은 같지만 html과는 다르게 소스보기에서는 보이지 않아서 보안성이 우수하다. 
--%>
<%-- %@룰 지시자라 한다. 어떤 정의문을 내릴 때 사용한다. contentType속성값은 브라우
저에 출력되는 문자/태그 정의, charset은 언어코딩 타입을 UTF-8 로 설정. --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Fun Web</title>
<link rel="stylesheet" type="text/css" href="../css/default.css" />
<link rel="stylesheet" type="text/css" href="../css/welcome.css" />
<link rel="stylesheet" type="text/css" href="../css/notice.css" />
<link rel="stylesheet" type="text/css" href="../css/member.css" />
</head>
<body>
 <div id="wrap">
  <%-- 상단영역 --%>
  <header>
   <div id="login">
    <a href="#">login</a> | <a href="../member/join.jsp">Join</a>
   </div>
   <div class="clear"></div>
   <%--회사 로고--%>
   <div id="logo">
   <img src="../images/logo.gif" width="265" height="62" 
   alt="Fun Web" />
   </div>
   <%--메뉴구성 --%>
   <nav>
     <ul>
      <li><a href="../index.jsp">HOME</a></li>
      <li><a href="../company/welcome.jsp">COMPANY</a></li>
      <li><a href="#">SOLUTIONS</a></li>
      <li><a href="../center/notice.jsp">CUSTOMER CENTER</a></li>
      <li><a href="#">CONTACT US</a></li>
     </ul>
   </nav>
  </header>
  
  <div class="clear"></div>
  
  
  