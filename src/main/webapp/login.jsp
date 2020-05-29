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
            <h1 class="left right">Login</h1>
            <form action="SignIn"  class="collumn flex " method="POST">
                <input type="text" class="left right" required name="login" placeholder="Login">
                <input type="password" class="left right" required name="password" placeholder="Password">
                <input type="submit" class="left right" value="Sign In">
            </form>
            <c:if test="${wrongLoginOrPassword}">
                <p class="left right" style="color:red">Wrong login or password</p>
            </c:if>
            <c:if test="${registrationSuccessful}">
                <p class="left right" style="color:rgb(9, 255, 0)">Registration Successful</p>
            </c:if>
        </div>
    </div>
</body>
</html>