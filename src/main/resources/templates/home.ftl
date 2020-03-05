<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>进存销系统</title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <link rel="icon" href="../img/icon.ico" type="image/x-icon"/>

    <!-- Fonts and icons -->
    <script src="../js/plugin/webfont/webfont.min.js"></script>
    <script>
        WebFont.load({
            google: {"families":["Open+Sans:300,400,600,700"]},
            custom: {"families":["Flaticon", "Font Awesome 5 Solid", "Font Awesome 5 Regular", "Font Awesome 5 Brands"], urls: ['../css/fonts.css']},
            active: function() {
                sessionStorage.fonts = true;
            }
        });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/azzara.min.css">

    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="../css/demo.css">
</head>
<body>
<div class="wrapper">
    <!--
        Tip 1: You can change the background color of the main header using: data-background-color="blue | purple | light-blue | green | orange | red"
    -->
    <div class="main-header" data-background-color="purple">
        <!-- logo header -->
        <div class="logo-header">

            <a href="home" class="logo">
               <span style="color: cornsilk">销售系统</span>
            </a>
            <button class="navbar-toggler sidenav-toggler ml-auto" type="button" data-toggle="collapse" data-target="collapse" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon">
						<i class="fa fa-bars"></i>
					</span>
            </button>
            <button class="topbar-toggler more"><i class="fa fa-ellipsis-v"></i></button>
            <div class="navbar-minimize">
                <button class="btn btn-minimize btn-rounded">
                    <i class="fa fa-bars"></i>
                </button>
            </div>
        </div>
        <!-- End Logo Header -->


        <!-- Navbar Header -->
        <nav class="navbar navbar-header navbar-expand-lg">

            <div class="container-fluid">
                <div class="collapse" id="search-nav">
                    <a href="#111" style="color: cornsilk">历史销售订单</a>
                </div>
                <ul class="navbar-nav topbar-nav ml-md-auto align-items-center">
                    <li class="nav-item toggle-nav-search hidden-caret">
                        <a class="nav-link" data-toggle="collapse" href="#search-nav" role="button" aria-expanded="false" aria-controls="search-nav">
                            <i class="fa fa-search"></i>
                        </a>
                    </li>
                    <li class="nav-item dropdown hidden-caret">
                        <a class="dropdown-toggle profile-pic" data-toggle="dropdown" href="#" aria-expanded="false">
                            <div class="avatar-sm">
                                <img src="../img/profile.jpg" alt="..." class="avatar-img rounded-circle">
                            </div>
                        </a>
                        <ul class="dropdown-menu dropdown-user animated fadeIn">
                            <li>
                                <div class="user-box">
                                    <div class="avatar-lg"><img src="../img/profile.jpg" alt="image profile" class="avatar-img rounded"></div>
                                    <div class="u-text">
                                        <h4>Hizrian</h4>
                                        <p class="text-muted">hello@example.com</p><a href="profile.html" class="btn btn-rounded btn-danger btn-sm">View Profile</a>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">My Profile</a>
                                <a class="dropdown-item" href="#">My Balance</a>
                                <a class="dropdown-item" href="#">Inbox</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Account Setting</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- End Navbar -->
    </div>
    <div class="main-panel">
        <div class="content">
            <div class="page-inner">
                <div class="page-header">
                    <h4 class="page-title">Forms</h4>
                    <ul class="breadcrumbs">
                        <li class="nav-home">
                            <a href="/home">
                                <i class="flaticon-home"></i>
                            </a>
                        </li>
                        <li class="separator">
                            <i class="flaticon-right-arrow"></i>
                        </li>
                        <li class="nav-item">
                            <a href="#">Forms</a>
                        </li>
                        <li class="separator">
                            <i class="flaticon-right-arrow"></i>
                        </li>
                        <li class="nav-item">
                            <a href="#">Basic Form</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>

    <!-- Sidebar -->
    <div class="sidebar">

        <div class="sidebar-background"></div>
        <div class="sidebar-wrapper scrollbar-inner">
            <div class="sidebar-content">
                <div class="user">
                    <div class="avatar-sm float-left mr-2">
                        <img src="../img/profile.jpg" alt="..." class="avatar-img rounded-circle">
                    </div>
                    <div class="info">
                        <a data-toggle="collapse" href="#collapseExample" aria-expanded="true">
								<span>
									Hizrian
									<span class="user-level">Administrator</span>
									<span class="caret"></span>
								</span>
                        </a>
                        <div class="clearfix"></div>

                        <div class="collapse in" id="collapseExample">
                            <ul class="nav">
                                <li>
                                    <a href="#profile">
                                        <span class="link-collapse">My Profile</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#edit">
                                        <span class="link-collapse">Edit Profile</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#settings">
                                        <span class="link-collapse">Settings</span>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
<#--                侧边栏-->
                <ul class="nav">
                    <li class="nav-section">
							<span class="sidebar-mini-icon">
								<i class="fa fa-ellipsis-h"></i>
							</span>
                        <h4 class="text-section">产品线</h4>
                    </li>
                    <#list productChains as productChain>
                        <li class="nav-item">
                            <#if !(productChain.productTypeList?size > 0)>
                                <a href="#">
                                    <i class="fas fa-desktop"></i>
                                    <p>${productChain.pcname}</p>
                                    <span class="badge badge-count badge-info">暂无分类</span>
                                </a>
                                <#else >
                                    <a data-toggle="collapse" href="#${productChain.pcid}">
                                        <i class="fas fa-layer-group"></i>
                                        <p>${productChain.pcname}</p>
                                        <span class="caret"></span>
                                    </a>
                            </#if>
                            <#if !(productChain.productTypeList?size > 0)>

                            <#else >
                                <div class="collapse" id="${productChain.pcid}">
                                <ul class="nav nav-collapse">
                                    <#list productChain.productTypeList as productType>
                                        <#if !(productType.productSeriesList?size > 0)>
                                            <a href="#">
                                                <p>${productType.ptname}</p>
                                                <span class="badge badge-count badge-info">暂无分类</span>
                                            </a>
                                        <#else >
                                            <a data-toggle="collapse" href="#${productType.ptname}">
                                                <p>${productType.ptname}</p>
                                                <span class="caret"></span>
                                            </a>
                                        </#if>
                                        <div class="collapse" id="${productType.ptname}">
                                            <ul class="nav nav-collapse">
                                                <#list productType.productSeriesList as productSeries>
                                                    <li>
                                                        <a href="ca'h${productSeries.psid}">
                                                            <span class="sub-item">${productSeries.psname}</span>
                                                        </a>
                                                    </li>
                                                </#list>
                                            </ul>
                                        </div>
                                    </#list>
                                </ul>
                            </div>
                            </#if>
                        </li>
                    </#list>
                </ul>
            </div>
        </div>
    </div>
</div>
</div>
<!--   Core JS Files   -->
<script src="../js/core/jquery.3.2.1.min.js"></script>
<script src="../js/core/popper.min.js"></script>
<script src="../js/core/bootstrap.min.js"></script>

<!-- jQuery UI -->
<script src="../js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="../js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>

<!-- jQuery Scrollbar -->
<script src="../js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>

<!-- Moment JS -->
<script src="../js/plugin/moment/moment.min.js"></script>

<!-- Chart JS -->
<script src="../js/plugin/chart.js/chart.min.js"></script>

<!-- jQuery Sparkline -->
<script src="../js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>

<!-- Chart Circle -->
<script src="../js/plugin/chart-circle/circles.min.js"></script>

<!-- Datatables -->
<script src="../js/plugin/datatables/datatables.min.js"></script>

<!-- Bootstrap Notify -->
<script src="../js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script>

<!-- Bootstrap Toggle -->
<script src="../js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>

<!-- jQuery Vector Maps -->
<script src="../js/plugin/jqvmap/jquery.vmap.min.js"></script>
<script src="../js/plugin/jqvmap/maps/jquery.vmap.world.js"></script>

<!-- Google Maps Plugin -->
<script src="../js/plugin/gmaps/gmaps.js"></script>

<!-- Sweet Alert -->
<script src="../js/plugin/sweetalert/sweetalert.min.js"></script>

<!-- Azzara JS -->
<script src="../js/ready.min.js"></script>

<!-- Azzara DEMO methods, don't include it in your project! -->
<script src="../js/setting-demo.js"></script>
<script src="../js/demo.js"></script>
</body>
</html>