<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/restaurant.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h2>
<c:forEach var="foodlistofalibaba" items="${listOfFood}">
        ${foodlistofalibaba.food_item} Rs.${foodlistofalibaba.food_price} 
        <form action="Alibabarestaurantbooking" >
        <input hidden="text" name="foodlist" value="${foodlist}"/>
        <input hidden="text" name="customer_id"  value="${customer_id}"/>
        <input hidden="text" name="username"  value="${username}"/>
        <input hidden="text" name="food_id"  value="${foodlistofalibaba.food_id}"/>
         <input hidden="text" name="food_price"  value="${foodlistofalibaba.food_price}"/>
        <input hidden="text" name="food_item"  value="${foodlistofalibaba.food_item}"/>
        <input type="text" name="count"   id="count" required>
        <input type="submit" value="add" ><br><br>
   </form>
   </c:forEach><br></h2>
   
   <h2><form action="summationalibaba">
   <input hidden="text" name="sum"  value="${sum}"/>
   <input hidden="text" name="foodlist"  value="${foodlist}"/>
     <input hidden="text" name="customer_id"  value="${customer_id}"/>
        <input hidden="text" name="username"  value="${username}"/>
    <input hidden="text" name="sum"  value="${sum}"/>
   <input type="submit" value="order">
   </form></h2>
</body>
</html>