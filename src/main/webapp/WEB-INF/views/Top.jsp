<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 TOPページです！
 <br>
 <p>${requestScope.key}</p>
 <br>
 <p>name: ${requestScope.userDto.name}</p>
 <p>mail: ${requestScope.userDto.mail}</p>
 <p>tel: ${requestScope.userDto.tel}</p>
 <c:if test="${requestScope.dispFlg}">${requestScope.dispFlg }</c:if>

 <section>
  <h3>getサンプル</h3>
  <form action="/getsample" method="get">
   <p>
    <input type="text" name="id" />
   </p>
   <p>
    <input type="submit" name="submit" value="Getサンプルを開く" />
   </p>
  </form>
 </section>

 <section>
  <h3>postサンプル</h3>
  <form action="/postsample" method="post">
   <p>
    <input type="text" name="name" />
   </p>
   <p>
    <input type="text" name="tel" />
   </p>
   <p>
    <input type="text" name="mail" />
   </p>
   <p>
    <input type="submit"/>
   </p>
  </form>
 </section>

</body>
</html>