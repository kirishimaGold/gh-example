<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コンテンツ登録</title>
</head>
<body>
 <h1>コンテンツ登録</h1>
 <form action="/contents/regster" method="post">
  <div>
   タイトル<input type="text" name="title" />
  </div>
  <div>
   ファイル名<input type="text" name="imageFileName" />
  </div>
  <div>
   <input type="submit" />
  </div>
 </form>
</body>
</html>