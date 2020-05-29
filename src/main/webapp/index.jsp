<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>StoreBook</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <script type="text/javascript" src="js/createOrderForm.js"></script>
</head>
<header>
    <jsp:include page="header.jsp" />
</header>
<body>
    <jsp:include page="createOrder.jsp" />
    <div class="all-content">
        <div class="main down left right collumn">
            <form action="CreateOrder" method="POST" id="order">
                <c:forEach var="books" items="${books}">
                    <div class="panel left right vertical">
                        <a href="/bookstore/Show?articule=${books.articule}">${books.name}</a>
                        <input type="checkbox"  value="${books.productsId}" name="checked" class="right">
                    </div>
                </c:forEach>
            </form>
        </div>
    </div>
</body>
</html>