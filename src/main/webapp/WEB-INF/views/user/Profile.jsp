<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザプロフィール</title>
</head>
<body>
 <h1>ユーザプロフィール</h1>
 <p>ユーザID：${userProfileDto.userId}</p>
 <p>名前：${userProfileDto.name}</p>
 <p>メール：${userProfileDto.mail}</p>
</body>
</html>