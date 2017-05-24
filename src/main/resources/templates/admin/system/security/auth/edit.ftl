<#include "../../../../layout/admin/layout.ftl">
<@html page_tab="security_auth">
<section class="content-header">
    <h1>
        权限管理
        <small>编辑</small>
    </h1>
</section>
<div class="invoice">
<form class="form-horizontal" action="update" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset class="span6">
        <legend>角色修改</legend>
        <div class="control-group">
            <label class="control-label" for="name">权限名称</label>

            <div class="controls">
                <input id="displayName" name="displayName" type="text" value="${auth.displayName}"
                       placeholder="权限名称"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="name">权限标识</label>

            <div class="controls">
                <input id="name" name="name" type="text" value="${auth.name}"
                       placeholder="权限标识"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="url">权限URL</label>

            <div class="controls">
                <input id="url" name="url" type="text" value="${auth.url}"
                       placeholder="url" class="pure-input-1-2"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="displayIndex">显示顺序</label>
            <div class="controls">
                <input id="displayIndex" name="displayIndex" type="text" value="${auth.displayIndex}"/>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="pid">父权限ID</label>
            <div class="controls">
                <input id="pid" name="pid" type="text" value="${auth.pid}" placeholder="" class="pure-input-1-2"/>
            </div>
        </div>
        <div class="container">
            <div class="form-actions">
                <button type="submit" class="btn btn-primary">提交</button>
                <button type="reset" class="btn">取消</button>
            </div>
        </div>
    </fieldset>
</form>
</div>
</@html>
<@javascript>
</@javascript>