<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ゲットサンプル</title>
</head>
<body>
 <p>name:${requestScope.userDto.name}</p>
 <p>tel:${requestScope.userDto.tel}</p>
 <p>mail:${requestScope.userDto.mail}</p>
</body>
</html>