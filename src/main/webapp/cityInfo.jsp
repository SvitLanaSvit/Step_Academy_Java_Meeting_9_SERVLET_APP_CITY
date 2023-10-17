<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 16.10.2023
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>City Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>${city.name}</h1>
        <p>Country: ${city.country}</p>
        <img style="width: 150px" src="${city.coatOfArms}" alt="Coat of Arms" />
        <p>Number of Residents: ${city.numberOfResidents}</p>
        <p>Description: ${city.description}</p>
        <div>
            <a href="menu.jsp" class="btn btn-primary">Go to menu</a>
        </div>
    </div>
</body>
</html>
