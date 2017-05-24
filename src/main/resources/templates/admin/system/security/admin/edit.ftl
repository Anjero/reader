<#include "../../../../layout/admin/layout.ftl"> <@html page_tab="security_admin">
<section class="content-header">
    <h1>
        用户管理
        <small>编辑</small>
    </h1>
</section>
<div class="invoice">
<form class="form-horizontal" action="update" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <div class="control-group">
            <label class="control-label" for="username">用户名</label>

            <div class="controls">
                <input type="text" id="username" name="username" placeholder="用户名" value="${admin.username}">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="password">密码</label>

            <div class="controls">
                <input type="password" id="password" name="password" placeholder="密码" value="${admin.password}">

                <p><label style="color: #ff0000;display: none" id="mostCode"></label></p>
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputName">角色</label>

            <div class="controls">
                <#list roles as role>
                    <label class="checkbox">
                        <input type="checkbox" id="role${role.id!}" name="role" value="${role.id}"/>
                        ${role.name}
                    </label>
                </#list>

            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <button type="submit" class="btn btn-success">提交</button>
            </div>
        </div>
    </fieldset>
</form>
</div>
</@html>
<@javascript>
<script type='text/javascript'>
    $(document).ready(function () {
        $("input:radio").click(function () {
            var typeChecked = $("input:radio[id='typeDealer']").is(":checked");
            if (typeChecked) {
                $("#dealerCheck").show();
                $("#proCheck").show();
            } else {
                $("#dealerCheck").hide();
                $("#proCheck").hide();
            }
        });

        var ids = $("input[name='role']");
        ids.each(function () {
            <#list adminRoles as role>
                if ('${role.id}' == $(this).val()) {
                    $(this).attr("checked", 'true');
                }
            </#list>
        });

    });

</script>
</@javascript>