<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl study</title>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
  <div class="header">
    <img src="img/logo.png" alt="logo" />
  </div>

  <section class="top-container">
    <div class="top-title">
      <div>
        <div class="top-title-text">
          <h2>メリークリスマス</h2>
          <p>
            <b>
              東京＊＊＊＊＊ンドスペシャルイベント　<br />＊＊ズ＊ー・クリスマス
            </b>
          </p>
        </div>
      </div>
    </div>
    <div class="top-message">
      <p class="white">
        <!-- 2019年<big>11</big>月<big>8</big>日(金)〜<big>12</big>月<big>25</big>日(水)<br />
        ＊＊ズ＊ーならではのファンタジックで楽しいクリスマス！<br /> -->
        ${requestScope.dto.middleMessage}
      </p>
      <p class="lightgreen">
        ワールドバザールにはクリスマスツリーとともに期間限定の特別な演出も登場
      </p>
    </div>
  </section>
  <section>
    <div class="entertainment-title">
      <h2>観たい！</h2>
      <small>エンターテイメント</small>
    </div>
    <div class="entertainment-table">
    <c:forEach var="item" items="${requestScope.dto.contents}" varStatus="status">
      <c:if test="${item.diplayFlag}">
      <div class="entertainment-cell">
        <c:if test="${item.type == '1'}">
          <div style="background:red">
        </c:if>
        <c:if test="${item.type != '1'}">
          <div style="background:green">
        </c:if>
          <a href="#" class="nomarl">
            <img src="${item.imageUrl}" />
            <div class="entertainment-text">
              <p>
                <c:out value="${item.title}" />
              </p>
            </div>
          </a>
        </div>
      </div>
      </c:if>
    </c:forEach>



    </div>
</body>
</html>