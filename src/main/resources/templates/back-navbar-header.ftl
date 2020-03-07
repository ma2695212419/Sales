<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<style>
    .out {
        color: white;
    }

    .out:hover {
        color: darkblue;
    }
</style>
<body>

<nav class="navbar navbar-header navbar-expand-lg">
    <div class="container-fluid">
        <ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
            <li class="nav-item dropdown hidden-caret">

                <div>
                    <button style="background: #716aca;border: 0px">
                        <h3 class="out" style="margin-top: auto;">退出</h3>
                    </button>
                </div>
                </a>
            </li>

        </ul>
    </div>
</nav>

<script src="../../js/core/jquery.3.2.1.min.js"></script>

<script>
    $("button").click(function () {
        localStorage.clear()
        window.location.href = '/login';
    });
</script>

</body>
</html>