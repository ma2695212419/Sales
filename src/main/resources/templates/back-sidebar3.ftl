<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
<div class="sidebar">

    <div class="sidebar-wrapper scrollbar-inner">
        <div class="sidebar-content">
            <ul class="nav">
                <li class="nav-item">
                    <a data-toggle="collapse" href="#base">
                        <i class="fas fa-layer-group"></i>
                        <p>产品管理</p>
                        <span class="caret"></span>
                    </a>
                    <div class="collapse" id="base">
                        <ul class="nav nav-collapse">
                            <li>
                                <a href="/back/chain/init">
                                    <span class="sub-item">产品线管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/back/type/init">
                                    <span class="sub-item">产品类别管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/back/series/init">
                                    <span class="sub-item">产品系列管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/back/number/init">
                                    <span class="sub-item">产品型号管理</span>
                                </a>
                            </li>
                            <li>
                                <a href="/back/accessories/init">
                                    <span class="sub-item">产品配件管理</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="nav-item">
                    <a data-toggle="collapse" href="#forms">
                        <i class="fas fa-pen-square"></i>
                        <p>配置单管理</p>
                        <span class="caret"></span>
                    </a>
                    <div class="collapse" id="forms">
                        <ul class="nav nav-collapse">
                            <li>
                                <a href="/back/configuration/init">
                                    <span class="sub-item">历史配置单管理</span>
                                </a>
                            </li>

                        </ul>
                    </div>
                </li>

                <li class="nav-item">
                    <a data-toggle="collapse" href="#tables">
                        <i class="fas fa-table"></i>
                        <p>售前人员管理</p>
                        <span class="caret"></span>
                    </a>
                    <div class="collapse show" id="tables">
                        <ul class="nav nav-collapse">
                            <li>
                                <a href="/back/user/init">
                                    <span class="sub-item">售前人员账号管理</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>