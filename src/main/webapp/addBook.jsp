<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <title>Document</title>
</head>
<header>
    <jsp:include page="header.jsp" />
</header>
<body>
    <div class="all-content">
        <div class="authorized center collumn"> 
            <h1 class="left right">Add Product</h1>
            <form action="AddBook"  class="collumn flex " method="POST">
                <input type="text" class="left right" required name="articule" placeholder="Articule">
                <select name="providerId" class="left right " required>
                    <c:forEach var="providerList" items="${providerList}">
                    <option value="${providerList.providerId}">
                        ${providerList.name}
                    </option>
                </c:forEach>
                </select>
                <input type="number" class="left right" step="0.05" required name="price" placeholder="Price">
                <input type="text" class="left right" required name="name" placeholder="Name">
                <input type="text" class="left right" required name="type" placeholder="Type">
                <input type="text" class="left right" required name="genre" placeholder="Genre">
                <input type="number" class="left right"step="1" required name="pages" placeholder="Pages">
                <input type="submit" class="left right" value="Add Book">
            </form>
        </div>
    </div>
</body>
</html>