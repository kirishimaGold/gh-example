<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録</title>
</head>
<body>
 <h1>ユーザ登録</h1>
 <form action="/user/register" method="post">
  <div>
   メール<input type="text" name="mail" />
  </div>
  <div>
   名前<input type="text" name="name" />
  </div>
  <div>
   <input type="submit" />
  </div>
 </form>
</body>
</html>