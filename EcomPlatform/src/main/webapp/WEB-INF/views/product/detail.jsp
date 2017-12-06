<%@include file="../shared/header.jsp" %>
<div class="col-5 content">
    <h1>${product.name}</h1>
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
