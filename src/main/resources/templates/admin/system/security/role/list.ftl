<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="security_role">
<section class="content-header">
    <h1>
        角色管理
        <small>列表</small>
    </h1>
</section>
<div class="invoice">
<table class="table table-striped table-bordered table-hover">
    <h3>
        <a href="/admin/security/role/add" class="btn btn-info btn-xs pull-right">添加</a>
    </h3>
    <thead>
    <tr>
        <th>角色名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <#list list as role>
        <tr>
            <td>${role.name}</td>
            <td>
                <a class="btn btn-info btn-xs"  href="/admin/security/role/${role.id}/edit">修改</a>
                <a class="btn btn-danger btn-xs"  href="javascript:if(confirm('确实要删除吗?'))location='/admin/security/role/${role.id}/delete'">删除</a>
            </td>
        </tr>
        </#list>
    </tbody>
</table>
</div>
</@html>
<@javascript>
</@javascript>