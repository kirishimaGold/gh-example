<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl study</title>
</head>
<body>

 <c:forEach var="contactDto" items="${requestScope.contactDtoList}" varStatus="status">
  <div class=table">
   <c:if test="${contactDto.status != '取下'}">
    <div class="cell">${contactDto.title}</div>
    <div class="cell">${contactDto.content}</div>
    <div class="cell">${contactDto.ungency}</div>
    <div class="cell">${contactDto.limit}</div>
    <div class="cell">${contactDto.drafter}</div>
    <div class="cell">${contactDto.status}</div>
    <div class="cell">${contactDto.title}</div>
    <div class="cell">${contactDto.responser}</div>
    <div class="cell">${contactDto.category}</div>
   </c:if>
  </div>
 </c:forEach>
 <style>
.table {
  display: table;
}

.cell {
  display: table-cell;
  padding: 2px 10px;
}
</style>


</body>
</html>