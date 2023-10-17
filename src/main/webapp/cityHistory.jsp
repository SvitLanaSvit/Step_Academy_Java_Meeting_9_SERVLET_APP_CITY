<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 16.10.2023
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>History</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>History of Bielefeld</h1>
        <p>${history}</p>

        <div>
            <div class="card" style="width: 18rem;">
                <img src="${image1URL}" class="card-img-top" alt="Image 1">
                <div class="card-body">
                    <p class="card-text"></p>
                </div>
            </div>

            <div class="card" style="width: 18rem;">
                <img src="${image2URL}" class="card-img-top" alt="Image 2">
                <div class="card-body">
                    <p class="card-text"></p>
                </div>
            </div>
        </div>

        <div class="btn-group" style="margin-top: 20px">
            <a href="${link1URL}" class="btn btn-outline-primary">Learn more about Bielefeld's history on Wikipedia</a>
            <a href="${link2URL}" class="btn btn-outline-primary">Visit the official website of Bielefeld</a>
        </div>
    </div>
</body>
</html>
