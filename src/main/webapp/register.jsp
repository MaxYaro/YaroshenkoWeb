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
            <h1 class="left right">Sign Up</h1>
            <form action="SignUp"  class="collumn flex " method="POST">
                <input type="text" class="left right" name="login" placeholder="Login">
                <input type="password" class="left right" required name="password" placeholder="Password">
                <input type="password" class="left right" required name="repeatPassword" placeholder="repeat Password">
                <input type="text" class="left right" required name="phoneNumber" maxlength="13" onkeyup="this.value = this.value.replace (/[^0-9+]/g, '')" placeholder="phone Number">
                <input type="text" class="left right" required name="secondName" placeholder="second Name">
                <input type="text" class="left right" required name="firstName" placeholder="first Name">
                <input type="submit" class="left right" value="Sign Up">
            </form>
            <c:if test="${loginLength}">
                <p class="left right" style="color:red">Login Length</p>
            </c:if>
            <c:if test="${passwordLength}">
                <p class="left right" style="color:red">Password Length</p>
            </c:if>
            <c:if test="${phoneExsist}">
                <p class="left right" style="color:red">Phone Exsist</p>
            </c:if>
            <c:if test="${passwordMismatch}">
                <p class="left right" style="color:red">Password Mismatch</p>
            </c:if>
            <c:if test="${userExsist}">
                <p class="left right" style="color:red">User Exsist</p>
            </c:if>
        </div>
    </div>
</body>
</html>