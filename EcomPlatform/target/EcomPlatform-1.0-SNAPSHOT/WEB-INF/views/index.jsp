<%@include file="./shared/header.jsp" %>
<div>
<div class="col-5 content">
   
    <c:forEach var="c" items="${requestScope.products}">
        <div class="circle"><a href="${SITE_URL}/product?id=${product.id}">${product.name}</a></div>
        </c:forEach>
</div>

<footer></footer>
</div>
 <script>
        function $(key) {
            return document.getElementById(key);
        }
        $("menu-btn").onclick = function () {
            $("menu").style.display = "block";
        };
    </script>
</body>
</html>
