<%-- 
    Document   : index
    Created on : 31-Oct-2017, 15:24:11
    Author     : kamal
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>

<link href="${pageContext.request.contextPath}/asserts/css/style.css" rel="stylesheet" type="text/css"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <header>
                <h1>Hello World!</h1>
            </header>
            <section>
                <div id="menu-btn">
                    <ul><li><a href="">Menu</a></li></ul>
                </div>
                <div id="menu" class="col-2 menu">
                    <ul>
                        <li><a href="">Home</a></li>
                        <li><a href="">Product</a></li>
                        <li><a href="">Services</a></li>
                        <li><a href="">Contact</a></li>
                    </ul>
                </div>
            </section>