<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="securtiy_auth">
<script src="http://cdn.datayin.com/assets/dtree/dtree.js"></script>
<section class="content-header">
    <h1>
        角色管理
        <small>添加</small>
    </h1>
</section>
<div class="invoice">
<form class="pure-form pure-form-aligned" action="save" method="post" >
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <div class="pure-control-group">
            <label for="name">角色名称</label>
            <input id="name" name="name" type="text"
                   placeholder="角色名称" class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <label for="auth">权限</label>
            <div id="content">
                <script type="text/javascript">
                    d = new dTree('d');
                    d.config.check = true;
                    d.config.name = "auth";
                        <#list auths as auth>
                        d.add(${auth.id},${auth.pid},'${auth.displayName}','#');
                        </#list>
                    document.write(d);
                    d.closeAll();
                </script>
            </div>
        </div>
        <div class="pure-control-group">
            <button type="submit" class="pure-button pure-button-primary open-right">提交</button>
        </div>
    </fieldset>
</form>

</@html>