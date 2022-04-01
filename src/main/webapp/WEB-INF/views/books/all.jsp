<%--
  Created by IntelliJ IDEA.
  User: kucin
  Date: 01/04/2022
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h2>Currently Stored Books</h2>
 <table>
     <thead>
     <th>Id</th>
     <th>Title</th>
     <th>Author</th>
     <th>ISBN number</th>
     <th>Publisher</th>
     <th>Type</th>
     </thead>
     <tbody>
     <c:forEach items="${books}" var="book">
         <tr>
             <td>${book.id}</td>
             <td>${book.title}</td>
             <td>${book.author}</td>
             <td>${book.isbnNumber}</td>
             <td>${book.publisher}</td>
             <td>${book.type}</td>
         </tr>
     </c:forEach>
     </tbody>
 </table>
</body>
</html>
