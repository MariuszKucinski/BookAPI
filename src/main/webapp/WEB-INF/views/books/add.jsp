<%--
  Created by IntelliJ IDEA.
  User: kucin
  Date: 01/04/2022
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form:form modelAttribute="book" method="post" action="/admin/books/add">
     <label>Book title:</label>
     <form:input path="title"/>

     <label>Book author:</label>
     <form:input path="author"/>

     <label>Book ISBN number:</label>
     <form:input path="isbnNumber"/>

     <label>Book publisher:</label>
     <form:input path="publisher"/>

     <label>Book type:</label>
     <form:input path="type"/>
     <input type="submit" value="Submit"/>
 </form:form>
</body>
</html>
