<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StoreBook</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<header>
    <jsp:include page="header.jsp" />
</header>
<body>
    <div class="all-content">
        <div class="main down left right collumn">
                <c:forEach var="books" items="${books}">
                   <h1>${books.name}</h1>
                   <h4>${books.articule}</h4>
                   <h2>${books.price} uah</h2>
                   <h2>${books.type}</h2>
                   <h2>${books.genre}</h2>
                   <h2>${books.pages}</h2>
                </c:forEach>
        </div>
    </div>
</body>
</html>