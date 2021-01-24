<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="register" method="POST">
  		<div class="form-group">
    		<label for="email">Email address:</label>
    		<input type="email" class="form-control" id="email" name="email">
		</div>
  		<div class="form-group">
    		<label for="pwd">Password:</label>
    		<input type="password" class="form-control" id="pwd" name="password">
  		</div>
  		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>