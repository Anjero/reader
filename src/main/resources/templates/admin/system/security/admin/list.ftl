<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="security_admin">
<section class="content-header">
    <h1>
        用户管理
        <small>列表</small>
    </h1>
</section>
<div class="invoice">
<div class="form-group" action="/admin/security/adminuser/list" method="post">
    <form class="form-inline">
        <label class="" for="username"> 账户:</label>
        <input style="width: 120px" type="text" id="username" name="username">
        <label class="" for="userStatus"> 账户状态:</label>
        <select id="userStatus" name="userStatus" style="width:100px;">
            <option value="">请选择</option>
            <option value="0">停用</option>
            <option value="1">启用</option>
        </select>
        <button type="submit" class="btn btn-info btn-sm" style="height: 30px;" onchange="query()">
            查 询
        </button>
    </form>
</div>

<div class="open-breadcrumb">
    <div class="open-right">
        <a href="/admin/security/adminuser/add" class="btn btn-info btn-xs pull-right">添加</a>
    </div>
</div>
<table class="table table-striped table-bordered table-hover">
    <thead>
    <tr>
        <th>用户名</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <#list page.list as map>
        <tr #if($velocityCount%2==1)class="pure-table-odd"#end>
            <td>${map.username}</td>
            <td>
                <a class="btn btn-info btn-xs" href="/admin/security/adminuser/${map.id}/edit">修改</a>
                <#if map.isEnable ==1>
                <a class="btn btn-danger btn-xs"
                   href="javascript:if(confirm('确实要停用用户{${map.username}吗?'))location='/admin/security/adminuser/${map.id}/isEnable?isEnable=0'">停用</a>
                <#elseif map.isEnable ==0>
                <a class="btn btn-success btn-xs"
                   href="javascript:if(confirm('确实要启用用户{${map.username}吗?'))location='/admin/security/adminuser/${map.id}/isEnable?isEnable=1'">启用</a>
                </#if>
        </tr>
        </#list>
    </tbody>
</table>

<div class="hr hr-10 dotted"></div>

<div class="page">
    <#include "../../../components/paginate.ftl"/>
    <@paginate currentPage=page.getPageNum() totalPage=page.getPages() actionUrl="/admin/security/adminuser/list" urlParams="&username=${username!}&userStatus=${userStatus!}"/>
</div>
</div>
</@html>
<@javascript>
<script>
    $("#username").val('${username!}');
    $("#userStatus").val('${userStatus!}');
</script>
</@javascript>
