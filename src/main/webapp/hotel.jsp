<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 16.10.2023
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotel</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
  <div class="container">
    <h1>Hotels in Bielefeld</h1>
    <div style="display: flex; flex-wrap: wrap; justify-content: space-between;">
      <c:forEach items="${pointsOfInterest}" var="poi">
        <div class="point-of-interest">
          <h2>${poi.name}</h2>
          <p>${poi.description}</p>
          <h3>Images</h3>
          <c:forEach items="${poi.imageUrls}" var="imageUrl">
            <img style="width: 150px" src="${imageUrl}" alt="Image" />
          </c:forEach>
          <h5>External Resource</h5>
          <a href="${poi.externalResourceLink}" class="btn btn-outline-primary">Learn more about ${poi.name}</a>
        </div>
      </c:forEach>
    </div>
  </div>
</body>
</html>
