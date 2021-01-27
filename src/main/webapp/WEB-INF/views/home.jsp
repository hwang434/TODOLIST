<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<c:choose>
		<c:when test="${login == true }">
			<nav class="navbar navbar-inverse">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <a class="navbar-brand" href="/todolist">Home</a>
			    </div>
			    <ul class="nav navbar-nav">
			      <li><a href="/todolist/writeFrm">글쓰기</a></li>
			      <li><a href="/todolist/board">글 목록</a></li>
			    </ul>
			    <ul class="nav navbar-nav navbar-right">
			      <li><a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp&nbsp${member.email }</a></li>
			      <li><a href="/todolist/logout"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
			    </ul>
			  </div>
			</nav>
		</c:when>
		<c:otherwise>
			<form action="/todolist/login" method="POST">
		  		<div class="form-group">
		    		<label for="email">Email address:</label>
		    		<input type="email" class="form-control" id="email" name="email">
		  		</div>
		  		<div class="form-group">
		    		<label for="pwd">Password:</label>
		    		<input type="password" class="form-control" id="pwd" name="password">
		  		</div>
		  		<div class="checkbox">
		    		<label><input type="checkbox"> Remember me</label>
		  		</div>
		  		<button type="submit" class="btn btn-default" style="width : 100%;">로그인</button>
		  		<a href="/todolist/registerFrm">회원가입</a>
			</form>
		</c:otherwise>
	</c:choose>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>