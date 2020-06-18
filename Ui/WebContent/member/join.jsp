<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:include page="../include/header.jsp" />

<%-- 서브 메인 이미지 --%>
<div id="sub_img_member"></div>
<%--문제)css로 서브 메인 이미지를 나오게 한다. --%>
<div class="clear"></div>

<%-- 서브 메뉴 --%>
<div id="sub_menu">
<ul>
<li><a href="join.jsp">Join us</a></li>
<li><a href="#">Privacy policy</a></li>
</ul>
</div>

<%--서브 본문--%>
<div id="wel_cont">

</div>
<%--서브 본문 --%>
<div id="wel_cont">
<h1>Join Us</h1>
<form id="join">
<fieldset><%-- 그룹경계선을 만든다. --%>
<legend>Basic Info</legend><%-- legend 태그는 그룹에 대한 제목을 지정 --%>
<label>User ID</label>
<input type="text" class="id" />
<input type="button" value="dup.check" class="dup" /> <br/>
<label>Password</label>
<input type="password" class="pass" /><br/>
<label>Retype Password</label>
<input type="password" class="pass" /><br/>
<label>Name</label>
<input type="text" class="nick" /> <br/>
<label>E-Mail</label>
<input type="email" class="email" /><br/>
<label>Retype E-Mail</label>
<input type="email" class="email" /><br/>
</fieldset>
<fieldset>
<legend>Optional</legend>
<label>Address</label>
<input type="text" class="address" /><br/>
<label>Phone Number</label>
<input type="tel" class="phone" /><br/>
<label>Mobile Phone Number</label>
<input type="tel" class="phone" /> <br/>
</fieldset>
<div class="clear"></div>
<div id="buttons">
<input type="button" value="Submit" class="submit" />
<input type="button" value="Cancel" class="cancel" />
</div>
</form>
</div>
<jsp:include page="../include/footer.jsp" /> 