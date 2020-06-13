<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>person</title>
    <script type="text/javascript" src="/static/jquery-3.5.1.min.js"></script>
</head>
<body>

<span class="id"></span>
<span class="name"></span>
<span class="email"></span>
<span class="status"></span>

<script type="text/javascript">
    var url = "/person/selectPerson?id=1"
    $(function () {
        $.ajax({
            url: url,
            type: "post",
            dataType: "json",
            success: function (data) {
                $(".id").text(data.person.id);
                $(".name").text(data.person.name);
                $(".email").text(data.person.email);
                $(".status").text(data.person.status);
            },
            error: function () {
                alert("请求失败");
            }
        })
    })
</script>

</body>
</html>