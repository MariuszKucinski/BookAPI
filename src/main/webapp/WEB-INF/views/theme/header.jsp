<%--
  Created by IntelliJ IDEA.
  User: kucin
  Date: 01/04/2022
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pl">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap CSS -->
    <link href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"/>" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css"  href="<c:url value="../theme/style.css"/>">
    <title>BOOK_API</title>
</head>
<body>
<header>

    <nav class="navbar navbar-light bg-warning navbar-expand-md">

        <div class="collapse navbar-collapse" id="mainmenu">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/admin/books/all">Books List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/books/add">Add Book</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/books/edit">Edit Book</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/books/show">Show Book</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/admin/books/delete">Delete Book</a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<br><br><br><br><br>
