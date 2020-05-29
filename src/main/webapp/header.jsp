<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<div class="header row">
    <div class="left half vertical flex">
        <a href="/bookstore/" class="">BookLand</a>
    </div>
    <div class="right half vertical flex">
        <c:if test="${sessionScope.loginSession == null}">
        <a href="/bookstore/login.jsp" class="">Sign In</a>
        <a href="/bookstore/register.jsp" class="">Sign Up</a>
        
    </c:if>
    <c:if test="${sessionScope.loginSession != null}">
        <c:if test="${permission==1}">
            <a href="/bookstore/AddBookLoad" class="">Add Book</a>
            <a href="/bookstore/addProvider.jsp" class="">Add Provider</a>
        </c:if>
        <a href="#" onclick="createOrderFormOpen()">Create Order</a>
        <a href="" class="">${sessionScope.loginSession}</a>
        <a href="/bookstore/LogOut" class="">Log Out</a>
        </c:if>
    </div>
</div>