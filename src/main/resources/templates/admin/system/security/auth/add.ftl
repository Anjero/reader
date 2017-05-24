<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="security_auth">
<section class="content-header">
    <h1>
        权限管理
        <small>添加</small>
    </h1>
</section>
<div class="invoice">
<form class="form-horizontal" action="save" method="post" >
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <div class="pure-control-group">
            <label for="displayName">权限名称</label>
            <input id="displayName" name="displayName" type="text"
                placeholder="权限名称" class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <label for="name">权限标识</label>
            <input id="name" name="name" type="text"
                placeholder="权限标识" class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <label for="url">权限URL</label>
            <input id="url" name="url" type="text"
                placeholder="url" class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <label for="displayIndex">显示顺序</label>
            <input id="displayIndex" name="displayIndex" type="text" value="${displayIndex}"	class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <label for="pid">父权限ID</label>
            <input id="pid" name="pid" type="text" value="${pid}"	placeholder="" class="pure-input-1-2"/>
        </div>
        <div class="pure-control-group">
            <button type="submit" class="pure-button pure-button-primary open-right">提交</button>
        </div>
    </fieldset>
</form>
</div>
</@html>
<@javascript>
</@javascript>