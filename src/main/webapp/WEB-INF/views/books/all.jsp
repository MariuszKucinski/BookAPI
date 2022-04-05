<%--
  Created by IntelliJ IDEA.
  User: kucin
  Date: 01/04/2022
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../theme/header.jsp"/>
 <h2>Currently Stored Books</h2>
<button type="button"  name="addbook" onclick="window.location='/admin/books/add'">Add New User</button>
 <table class="cinereousTable">
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
             <td><a href="/admin/books/edit/${book.id}">EDIT</a> </td>
             <td><a href="/admin/books/delete/${book.id}">DELETE</a> </td>
             <td><a href="/admin/books/show/${book.id}">SHOW</a> </td>
         </tr>
     </c:forEach>
     </tbody>
 </table>
<jsp:include page="../theme/footer.jsp"/>
