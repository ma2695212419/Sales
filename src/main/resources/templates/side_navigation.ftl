<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
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
</body>
</html>