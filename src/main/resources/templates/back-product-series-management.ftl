<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>产品系列管理</title>
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
                    <h4 class="page-title">产品系列管理</h4>
                    <ul class="breadcrumbs">
                        <li class="nav-item">
                            <a href="#">产品管理</a>
                        </li>
                        <li class="separator">
                            <i class="flaticon-right-arrow"></i>
                        </li>
                        <li class="nav-item">
                            <a href="#">产品系列管理</a>
                        </li>
                    </ul>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header">
                                <div class="d-flex align-items-center">
                                    <button class="btn btn-primary btn-round ml-auto" data-toggle="modal"
                                            data-target="#addRowModal">
                                        <i class="fa fa-plus"></i>
                                        添加产品系列
                                    </button>
                                </div>
                            </div>
                            <div class="card-body">
                                <!-- Modal -->
                                <div class="modal fade" id="addRowModal" tabindex="-1" role="dialog" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header no-bd">
                                                <h5 class="modal-title">
                                                    <span class="fw-mediumbold">添加新的产品系列</span>
                                                </h5>
                                                <button type="button" class="close" data-dismiss="modal"
                                                        aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                <form>
                                                    <div class="col-sm-12">
                                                        <div class="form-group form-floating-label">
                                                            <input style="height: calc(2.4rem + 2px)" id="addpsname"
                                                                   name="addpsname" type="text"
                                                                   class="form-control input-border-bottom"
                                                                   required>
                                                            <label for="psname"
                                                                   class="placeholder">产品系列名称</label>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-12">
                                                        <div class="form-group form-floating-label">
                                                            <select style="height: calc(2.4rem + 2px)"
                                                                    class="form-control input-border-bottom"
                                                                    id="addptid" name="addptid" required>
                                                                <option value="" style="display: none"></option>
                                                                <#list type as type>
                                                                    <option value="${type.ptid}">${type.ptname}</option>
                                                                </#list>
                                                            </select>
                                                            <label for="ptid" class="placeholder">隶属产品类别名称</label>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                            <div class="modal-footer no-bd">
                                                <button type="button" id="addRowButton" class="btn btn-primary">添加
                                                </button>
                                                <button type="button" class="btn btn-danger" data-dismiss="modal">取消
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="table-responsive">
                                    <table id="add-row" class="display table table-striped table-hover">
                                        <thead align="center">
                                        <tr>
                                            <th style="width: 40%">产品系列名称</th>
                                            <th style="width: 40%">隶属产品类别名称</th>
                                            <th style="width: 20%">操作</th>
                                        </tr>
                                        </thead>
                                        <tbody align="center">
                                        <#list seriesVo as series>
                                            <tr id="tr${series.psid}">
                                                <td>${series.psname}</td>
                                                <td>${series.productType.ptname}</td>
                                                <td>
                                                    <div class="form-button-action">
                                                        <button type="button" data-toggle="modal" title=""
                                                                class="btn btn-link btn-primary btn-lg"
                                                                data-original-title="查看或修改"
                                                                data-target="#upd${series.psid}">
                                                            <i class="fa fa-edit"></i>
                                                        </button>
                                                        <button type="button" data-toggle="tooltip" title=""
                                                                class="btn btn-link btn-danger"
                                                                data-original-title="删除"
                                                                id="del${series.psid}" name="del${series.psid}"
                                                                onclick="del(${series.psid})">
                                                            <i class="fa fa-times"></i>
                                                        </button>
                                                    </div>

                                                    <div class="modal fade" id="upd${series.psid}" tabindex="-1"
                                                         role="dialog"
                                                         aria-hidden="true">
                                                        <div class="modal-dialog" role="document">
                                                            <div class="modal-content">
                                                                <div class="modal-header no-bd">
                                                                    <h5 class="modal-title">
                                                                        <span class="fw-mediumbold">查看或编辑</span>
                                                                    </h5>
                                                                    <button type="button" class="close"
                                                                            data-dismiss="modal"
                                                                            aria-label="Close">
                                                                        <span aria-hidden="true">&times;</span>
                                                                    </button>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <form>
                                                                        <div class="col-sm-12">
                                                                            <div class="form-group form-floating-label">
                                                                                <input style="height: calc(2.4rem + 2px)"
                                                                                       id="updpsname${series.psid}"
                                                                                       name="updpsname${series.psid}"
                                                                                       type="text"
                                                                                       class="form-control input-border-bottom"
                                                                                       value="${series.psname}"
                                                                                       required="required">
                                                                                <label for="ptname"
                                                                                       class="placeholder">产品系列名称</label>
                                                                            </div>
                                                                        </div>
                                                                        <div class="col-sm-12">
                                                                            <div class="form-group form-floating-label">
                                                                                <select style="height: calc(2.4rem + 2px)"
                                                                                        class="form-control input-border-bottom"
                                                                                        id="updptid${series.psid}"
                                                                                        name="updptid${series.psid}"
                                                                                        required>
                                                                                    <option value=""
                                                                                            style="display: none"></option>
                                                                                    <#list type as type>
                                                                                        <#if type.ptid==series.ptid>
                                                                                            <option selected="selected"
                                                                                                    value="${type.ptid}">${type.ptname}</option>
                                                                                        <#else>
                                                                                            <option value="${type.ptid}">
                                                                                                ${type.ptname}</option>
                                                                                        </#if>
                                                                                    </#list>
                                                                                </select>
                                                                                <label for="pcid" class="placeholder">隶属产品类别名称</label>
                                                                            </div>
                                                                        </div>
                                                                    </form>
                                                                </div>
                                                                <div class="modal-footer no-bd">
                                                                    <button type="button" id="updBtn"
                                                                            onclick="upd(${series.psid})"
                                                                            class="btn btn-primary"
                                                                            data-dismiss="modal">确认
                                                                    </button>
                                                                    <button type="button" class="btn btn-danger"
                                                                            data-dismiss="modal">取消
                                                                    </button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>


                                                </td>
                                            </tr>
                                        </#list>
                                        </tbody>
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
<!--NoticeJS-->
<script src="../../noticejs/js/notice.js"></script>

<script>
    $(document).ready(function () {

        // Add Row
        $('#add-row').DataTable({
            "pageLength": 8,
            "bLengthChange": false, //开关，是否显示每页显示多少条数据的下拉框
            "aLengthMenu": [8],//设置每页显示数据条数的下拉选项
            'bFilter': true,  //是否使用内置的过滤功能（是否去掉搜索框）
            "bInfo": true, //开关，是否显示表格的一些信息(当前显示XX-XX条数据，共XX条)
            "bPaginate": true, //开关，是否显示分页器
            "bSort": false, //是否可排序
            "oLanguage": {
                "sProcessing": "正在加载数据，请稍后...",
                "sLengthMenu": "每页显示 _MENU_ 条记录",
                "sZeroRecords": "没有数据！",
                "sEmptyTable": "表中无数据存在！",
                "sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录",
                "sInfoEmpty": "显示0到0条记录",
                "sInfoFiltered": "共有 _MAX_ 条记录",
                "sSearch": "搜索:",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "上一页",
                    "sNext": "下一页",
                    "sLast": "末页"
                }
            },
        });

        $('#addRowButton').click(function () {
            sessionStorage.setItem("psadd", "init");
            let addpsname = document.getElementById('addpsname').value;
            let addptid = document.getElementById('addptid').value;
            if (addpsname == null || addpsname == "") {
                new NoticeJs({
                    type: 'warning',
                    text: '请填写产品系列名称',
                    position: 'topCenter',
                    animation: {
                        open: 'animated zoomIn',
                        close: 'animated zoomOut'
                    }
                }).show();
            } else if (!(addptid > 0)) {
                new NoticeJs({
                    type: 'warning',
                    text: '请选择产品类别名称',
                    position: 'topCenter',
                    animation: {
                        open: 'animated zoomIn',
                        close: 'animated zoomOut'
                    }
                }).show();
            } else {
                $.ajax({
                    async: true,
                    type: "post",
                    url: "/back/series/add",
                    data: {
                        ptid: addptid,
                        psname: addpsname
                    },
                    dataType: "json",
                    success: function (data) {
                        if (data == true) {
                            sessionStorage.setItem("psadd", "success");
                            $('#addRowModal').modal('hide');
                            location.reload()
                        } else {
                            new NoticeJs({
                                type: 'warning',
                                text: '添加失败',
                                position: 'topCenter',
                                animation: {
                                    open: 'animated zoomIn',
                                    close: 'animated zoomOut'
                                }
                            }).show();
                        }
                    },
                })
            }

        });

        let upd = sessionStorage.getItem("psupd");
        if (upd == "success") {
            new NoticeJs({
                text: '修改成功',
                position: 'topCenter',
                animation: {
                    open: 'animated zoomIn',
                    close: 'animated zoomOut'
                }
            }).show();
            sessionStorage.setItem("psupd", "init");
        }


        let add = sessionStorage.getItem("psadd");
        if (add == "success") {
            new NoticeJs({
                text: '添加成功',
                position: 'topCenter',
                animation: {
                    open: 'animated zoomIn',
                    close: 'animated zoomOut'
                }
            }).show();
            sessionStorage.setItem("psadd", "init");
        }
    });
</script>

<script>
    function del(psid) {
        $.ajax({
            async: true,
            type: "post",
            url: "/back/series/del",
            data: {
                psid: psid,
            },
            dataType: "json",
            success: function (data) {
                if (data == true) {
                    $("#tr" + psid).remove();
                    new NoticeJs({
                        text: '删除成功',
                        position: 'topCenter',
                        animation: {
                            open: 'animated zoomIn',
                            close: 'animated zoomOut'
                        }
                    }).show();
                } else {
                    new NoticeJs({
                        type: 'warning',
                        text: '删除失败',
                        position: 'topCenter',
                        animation: {
                            open: 'animated zoomIn',
                            close: 'animated zoomOut'
                        }
                    }).show();
                }
            },
        })
    }
</script>

<script>
    function upd(psid) {
        sessionStorage.setItem("psupd", "init");
        let updpsname = document.getElementById('updpsname' + psid).value;
        let updptid = document.getElementById('updptid' + psid).value;
        if (updpsname == null || updpsname == "") {
            new NoticeJs({
                type: 'warning',
                text: '请填写产品系列名称',
                position: 'topCenter',
                animation: {
                    open: 'animated zoomIn',
                    close: 'animated zoomOut'
                }
            }).show();
        } else if (!(updptid > 0)) {
            new NoticeJs({
                type: 'warning',
                text: '请选择产品类别名称',
                position: 'topCenter',
                animation: {
                    open: 'animated zoomIn',
                    close: 'animated zoomOut'
                }
            }).show();
        } else {
            $.ajax({
                async: true,
                type: "post",
                url: "/back/series/upd",
                data: {
                    psid: psid,
                    ptid: updptid,
                    psname: updpsname
                },
                dataType: "json",
                success: function (data) {
                    if (data == true) {
                        sessionStorage.setItem("psupd", "success");
                        location.reload()
                    } else {
                        new NoticeJs({
                            type: 'warning',
                            text: '修改失败',
                            position: 'topCenter',
                            animation: {
                                open: 'animated zoomIn',
                                close: 'animated zoomOut'
                            }
                        }).show();
                    }
                },
            })
        }
    }
</script>


</body>
</html>