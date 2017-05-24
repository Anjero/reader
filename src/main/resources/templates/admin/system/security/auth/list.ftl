<#include "../../../../layout/admin/layout.ftl">
<@html page_tab="security_auth">
<section class="content-header">
    <h1>
        权限管理
        <small>列表</small>
    </h1>
</section>
<div class="invoice">
    <a href="/admin/security/auth/add?pid=${id}"
       class="btn btn-info btn-xs pull-right">添加</a>
    <div class="row">
        <div class="col-sm-3">
            <p>
                <a href="javascript: d.openAll();">打开全部</a>
                | <a href="javascript: d.closeAll();">关闭</a>
            </p>
            <script type="text/javascript">
                d = new dTree('d');
                    <#list auths as auth>
                    d.add(${auth.id},${auth.pid} , '${auth.displayName}', 'list?pid=${auth.id}');
                    </#list>
                document.write(d);
                d.closeAll();
                d.openTo(${id}, true);
            </script>
        </div>
        <div class="col-sm-9">
            <div class="l-box">
                <table class="table table-striped table-bordered table-hover">
                    <thead>
                    <tr>
                        <th>权限名称</th>
                        <th>权限标识</th>
                        <th>权限URL</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                        <#list list as auth>
                        <tr>
                            <td>${auth.displayName}</td>
                            <td>${auth.name}</td>
                            <td>${auth.url}</td>
                            <td>
                                <a class="btn btn-info btn-xs"
                                   href="/admin/security/auth/${auth.id}/edit">修改</a>
                                <a class="btn btn-danger btn-xs"
                                   href="javascript:if(confirm('确实要删除权限{${auth.name}吗?'))location='/admin/security/auth/${auth.id}/delete'">删除</a>
                            </td>
                        </tr>
                        </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</@html>
<@javascript>
</@javascript>