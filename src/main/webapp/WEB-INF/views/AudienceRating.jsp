<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>放送中番組の視聴率</h2>
  <table>
    <tr>
      <th>No</th>
      <th>番組名</th>
      <th>曜日</th>
      <th>放送時間</th>
      <th>世帯視聴率</th>
      <th>全体視聴率</th>
    </tr>
    <c:forEach var="audienceRatingDto"
      items="${requestScope.audienceRatingDtoList}" varStatus="status">
      <c:if test="${audienceRatingDto.aired}">
        <c:if test="${audienceRatingDto.allAudienceRate >= 15}">
          <tr style="background:pink">
        </c:if>
        <c:if test="${audienceRatingDto.allAudienceRate < 15}">
          <tr>
        </c:if>
        <td><c:out value="${status.index + 1}" /></td>
        <td><c:out value="${audienceRatingDto.programName}" /></td>
        <td><c:out value="${audienceRatingDto.day}" /></td>
        <td><c:out value="${audienceRatingDto.time}" /></td>
        <td><c:out value="${audienceRatingDto.houseAudienceRate}" /></td>
        <td><c:out value="${audienceRatingDto.allAudienceRate}" /></td>
        </tr>
      </c:if>
    </c:forEach>
  </table>
  <br>
  <h2>放送終了番組の視聴率</h2>
  <table>
    <tr>
      <th>No</th>
      <th>番組名</th>
      <th>曜日</th>
      <th>放送時間</th>
      <th>世帯視聴率</th>
      <th>全体視聴率</th>
    </tr>
    <c:forEach var="audienceRatingDto"
      items="${requestScope.audienceRatingDtoList}" varStatus="status">
      <c:if test="${!audienceRatingDto.aired}">
        <c:if test="${audienceRatingDto.allAudienceRate >= 15}">
          <tr style="background:pink">
        </c:if>
        <c:if test="${audienceRatingDto.allAudienceRate < 15}">
          <tr>
        </c:if>
        <td><c:out value="${status.index + 1}" /></td>
        <td><c:out value="${audienceRatingDto.programName}" /></td>
        <td><c:out value="${audienceRatingDto.day}" /></td>
        <td><c:out value="${audienceRatingDto.time}" /></td>
        <td><c:out value="${audienceRatingDto.houseAudienceRate}" /></td>
        <td><c:out value="${audienceRatingDto.allAudienceRate}" /></td>
        </tr>
      </c:if>
    </c:forEach>
  </table>
</body>
<style>
table {
  border-collapse: separate;
  border-spacing: 0;
}

table th:first-child {
  border-radius: 5px 0 0 0;
}

table th:last-child {
  border-radius: 0 5px 0 0;
  border-right: 1px solid #3c6690;
}

table th {
  text-align: left;
  color: white;
  background: linear-gradient(#829ebc, #225588);
  border-left: 1px solid #3c6690;
  border-top: 1px solid #3c6690;
  border-bottom: 1px solid #3c6690;
  box-shadow: 0px 1px 1px rgba(255, 255, 255, 0.3) inset;
  padding: 10px;
}

table td {
  text-align: left;
  border-left: 1px solid #a8b7c5;
  border-bottom: 1px solid #a8b7c5;
  border-top: none;
  box-shadow: 0px -3px 5px 1px #eee inset;
  padding: 10px;
}

table td:last-child {
  border-right: 1px solid #a8b7c5;
}

table tr:last-child td:first-child {
  border-radius: 0 0 0 5px;
}

table tr:last-child td:last-child {
  border-radius: 0 0 5px 0;
}
}
</style>
</html>