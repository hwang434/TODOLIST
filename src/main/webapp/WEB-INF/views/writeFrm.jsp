<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="write" method="POST">
		<input type="text" name="title" placeholder="제목"><br>
		<input type="text" name="content" placeholder="내용"><br>
		<input type="checkbox" name="isComplete" placeholder="완료 여부"><br>
		<input type="submit" value="작성하기"><br>
	</form>
</body>
</html>