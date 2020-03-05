<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Login</title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <link rel="icon" href="../img/icon.ico" type="image/x-icon"/>

    <!-- Fonts and icons -->
    <script src="../js/plugin/webfont/webfont.min.js"></script>
    <script>
        WebFont.load({
            google: {"families":["Open+Sans:300,400,600,700"]},
            custom: {"families":["Flaticon", "Font Awesome 5 Solid", "Font Awesome 5 Regular", "Font Awesome 5 Brands"], urls: ['../assets/css/fonts.css']},
            active: function() {
                sessionStorage.fonts = true;
            }
        });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/azzara.min.css">
</head>
<body class="login">
<div class="wrapper wrapper-login">
    <div class="container container-login animated fadeIn">
        <h3 class="text-center">管理员登录</h3>
        <form id="from" action="/loginByUserNameAndPassword" method="post">
            <div class="login-form">
            <div class="form-group form-floating-label">
                <input id="uname" name="uname" type="text" class="form-control input-border-bottom" required>
                <label for="uname" class="placeholder">账号</label>
            </div>
            <div class="form-group form-floating-label">
                <input id="upassword" name="upassword" type="password" class="form-control input-border-bottom" required>
                <label for="upassword" class="placeholder">密码</label>
                <div class="show-password">
                    <i class="flaticon-interface"></i>
                </div>
            </div>
            <div class="row form-sub m-0">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="rememberme">
                    <label class="custom-control-label" for="rememberme">记住我</label>
                </div>

            </div>
            <div class="form-action mb-3">
                <a href="#" onclick="login()" class="btn btn-primary btn-rounded btn-login">登录</a>
            </div>

        </div>
        </form>
    </div>
</div>
<script src="../js/core/jquery.3.2.1.min.js"></script>
<script src="../js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="../js/core/popper.min.js"></script>
<script src="../js/core/bootstrap.min.js"></script>
<script src="../js/ready.js"></script>
<script>
    function login() {
        $("#from").submit()
    }
</script>
</body>
</html>