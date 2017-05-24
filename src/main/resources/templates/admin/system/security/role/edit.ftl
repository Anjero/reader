<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="security_role">
<section class="content-header">
    <h1>
        角色管理
        <small>编辑</small>
    </h1>
</section>
<div class="invoice">
<form class="form-horizontal" action="update" method="post" >
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset class="span6">
        <legend>角色修改</legend>
        <div class="control-group">
            <label class="control-label" for="name">角色名称</label>

            <div class="controls">
                <input id="name" name="name" type="text" placeholder="角色名称" value="${role.name}"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="auth">权限</label>

            <div class="controls">
                <div id="content">
                    <script type="text/javascript">
                        d = new dTree('d');
                        d.config.check = true;
                        d.config.name = "auth";
                        <#list auths as auth>
                        d.add(${auth.id},${auth.pid},'${auth.displayName}','#');
                        </#list>
                        document.write(d);
                        <#list roleAuths as auth>
                            d.check(${auth.id},true);
                        </#list>
                        d.closeAll();
                    </script>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="form-actions">
                <button type="submit" class="btn btn-primary">提交</button>
                <button type="reset" class="btn">Cancel</button>
            </div>
        </div>
    </fieldset>
</form>
</div>
</@html>
<@javascript>
</@javascript>