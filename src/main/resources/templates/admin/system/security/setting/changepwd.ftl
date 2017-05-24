<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="securtiy_auth">
<section class="content-header">
    <h1>
        修改密码
    </h1>
</section>
<div class="invoice">
<form class="form-horizontal" action="/admin/setting/pwd/update" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <div class="control-group">
            <label class="control-label" for="password">原密码</label>

            <div class="controls">
                <input type="password" id="oldpassword" name="oldpassword" placeholder="原密码">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="newpassword">新密码</label>

            <div class="controls">
                <input type="password" id="newpassword" name="newpassword" placeholder="">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="newpassword1">确认新密码</label>

            <div class="controls">
                <input type="password" id="newpassword1" name="newpassword1" placeholder="">
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button style="submit" class="btn btn-primary">修改</button>
            </div>
        </div>
    </fieldset>
</form>
</div>
</@html>
<@javascript>
</@javascript>