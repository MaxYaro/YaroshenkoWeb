<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<dialog id="CreateOrder"><h1>Create Order</h1>
    <input required type="text" name="adress" form="order">
    <select required name="paymentType" form="order">
        <option value="Cash">Cash</option>
        <option value="Cashless">Cashless</option>
    </select>
    <input type="submit" form="order" value="Create Order">
    <button type="button" onclick="createOrderFormClose()">Close Form</button>

</dialog>