<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>产品配件管理</title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport'/>
    <link rel="icon" href="../../img/icon.ico" type="image/x-icon"/>

    <!-- Fonts and icons -->
    <script src="../../js/plugin/webfont/webfont.min.js"></script>
    <script>
        WebFont.load({
            google: {"families": ["Open+Sans:300,400,600,700"]},
            custom: {
                "families": ["Flaticon", "Font Awesome 5 Solid", "Font Awesome 5 Regular", "Font Awesome 5 Brands"],
                urls: ['../../css/fonts.css']
            },
            active: function () {
                sessionStorage.fonts = true;
            }
        });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/azzara.min.css">
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel="stylesheet" href="../../css/demo.css">
    <#-- NoticeJSCSS-->
    <link rel="stylesheet" href="../../noticejs/css/animate.css">
    <link rel="stylesheet" href="../../noticejs/css/noticejs.css">
    <!--NoticeJS-->
    <script src="../../noticejs/js/notice.js"></script>
</head>
<body>
<div class="wrapper">
    <div class="main-header" data-background-color="purple">
        <!-- Logo Header -->
        <#include  "back-logo-header.ftl"/>
        <!-- Navbar Header -->
        <#include  "back-navbar-header.ftl"/>
    </div>
    <!-- Sidebar -->
    <#include  "back-sidebar1.ftl"/>

    <#--Table-->
    <div class="main-panel">
        <div class="content">
            <div class="page-inner">
                <div class="page-header">
                    <h4 class="page-title">历史配置单管理</h4>
                    <ul class="breadcrumbs">
                        <li class="nav-item">
                            <a href="#">历史配置单管理</a>
                        </li>
                        <li class="separator">
                            <i class="flaticon-right-arrow"></i>
                        </li>
                        <li class="nav-item">
                            <a href="#">查看历史配置单</a>
                        </li>
                    </ul>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="row clearfix">
                                    <div class="col-md-12 column">
                                        <div class="panel-group" id="panel-933089">
                                            <div class="panel panel-default" style="padding: 0px 10%">
                                                <div class="d-flex align-items-center" style="padding-left: 100%">
                                                    <a class="panel-title collapsed" data-toggle="collapse"
                                                       data-parent="#panel-933089" href="#panel-element-631472">
                                                        <button class="btn btn-info">
                                                            查询历史配置单
                                                        </button>
                                                    </a>
                                                </div>
                                                <div id="panel-element-631472" class="panel-collapse collapse">
                                                    <form action="/back/configuration/query" method="get">
                                                        <div class="panel-body">
                                                            <div class="form-inline">
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">售前人员姓名：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="uname" name="uname">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">报价日期：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="date" value=""
                                                                               id="saleDate" name="saleDate">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">报价单号：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="cid" name="cid">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3"></div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">客户名称：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="clientName" name="clientName">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">联系人：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="ucontactPerson"
                                                                               name="ucontactPerson">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">联系电话：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="uphone" name="uphone">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">Email：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="umail" name="umail">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">报价单位：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="quotationUnit" name="quotationUnit">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">联系人：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="ccontactPerson"
                                                                               name="ccontactPerson">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">联系电话：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="cphone" name="cphone">
                                                                    </div>
                                                                </div>
                                                                <div class="form-group row col-sm-3">
                                                                    <label for="example-date-input"
                                                                           class="col-sm-2 col-form-label">Email：</label>
                                                                    <div class="col-sm-10">
                                                                        <input class="form-control" type="text" value=""
                                                                               id="cmail" name="cmail">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="d-flex align-items-center">
                                                                <button type="submit" class="btn btn-primary btn-round ml-auto">
                                                                    查询
                                                                </button>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-head-bg-primary mt-4">
                                        <#if configurationList?? && (configurationList?size > 0) >
                                            <#list configurationList as configuration>
                                                <tr>
                                                    <td><span style="font-weight: bold">报价单号：</span>${configuration.cid}</td>
                                                    <td><span style="font-weight: bold">报价日期：</span>${configuration.saleDate}</td>
                                                    <td colspan="2"><span style="font-weight: bold">售前人员姓名：</span>${configuration.uname}</td>
                                                </tr>
                                                <tr>
                                                    <td><span style="font-weight: bold">商户名称：</span>${configuration.clientName}</td>
                                                    <td><span style="font-weight: bold">联系人：</span>${configuration.ucontactPerson}</td>
                                                    <td><span style="font-weight: bold">联系电弧：</span>${configuration.uphone}</td>
                                                    <td><span style="font-weight: bold">Email：</span>${configuration.umail}</td>
                                                </tr>
                                                <tr>
                                                    <td><span style="font-weight: bold">报价单位：</span>${configuration.quotationUnit}</td>
                                                    <td><span style="font-weight: bold">联系人：</span>${configuration.ccontactPerson}</td>
                                                    <td><span style="font-weight: bold">联系电弧：</span>${configuration.cphone}</td>
                                                    <td><span style="font-weight: bold">Email：</span>${configuration.cmail}</td>
                                                </tr>
                                                <#list configuration.configurationListsVo as cl>
                                                    <tr>
                                                        <td><span style="font-weight: bold">产品型号名称：</span>${cl.pnname}</td>
                                                        <td><span style="font-weight: bold">数量：</span>${cl.num}</td>
                                                        <td><span style="font-weight: bold">产品配件名称：</span>${cl.aname}</td>
                                                        <td><span style="font-weight: bold">套数：</span>${cl.packageNum}</td>
                                                        <td><span style="font-weight: bold">总计价格：</span>${cl.totalPrice}</td>
                                                    </tr>
                                                </#list>
                                                <tr>
                                                    <td colspan="5"><hr></td>
                                                </tr>
                                            </#list>
                                        <#else>
                                            <th colspan="4" style="text-align: center">没有数据！</th>
                                        </#if>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>
<!--   Core JS Files   -->
<script src="../../js/core/jquery.3.2.1.min.js"></script>
<script src="../../js/core/popper.min.js"></script>
<script src="../../js/core/bootstrap.min.js"></script>
<!-- jQuery UI -->
<script src="../../js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
<script src="../../js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>
<!-- Bootstrap Toggle -->
<script src="../../js/plugin/bootstrap-toggle/bootstrap-toggle.min.js"></script>
<!-- jQuery Scrollbar -->
<script src="../../js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
<!-- Datatables -->
<script src="../../js/plugin/datatables/datatables.min.js"></script>
<!-- Azzara JS -->
<script src="../../js/ready.min.js"></script>
<!-- Azzara DEMO methods, don't include it in your project! -->
<script src="../../js/setting-demo.js"></script>



</body>
</html>