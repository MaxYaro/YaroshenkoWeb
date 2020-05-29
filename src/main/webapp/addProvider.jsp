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
            <h1 class="left right">Add Provider</h1>
            <form action="AddProvider"  class="collumn flex " method="POST">
                <input type="text" class="left right" required name="site" placeholder="Site">
                <input type="text" class="left right" required name="phoneNumber" maxlength="13" onkeyup="this.value = this.value.replace (/[^0-9+]/g, '')" placeholder="phone Number">
                <input type="text" class="left right" required name="adress" placeholder="Adress">
                <input type="text" class="left right" required name="name" placeholder="Name">
                <input type="submit" class="left right" value="Add Provider">
            </form>
        </div>
    </div>
</body>
</html>