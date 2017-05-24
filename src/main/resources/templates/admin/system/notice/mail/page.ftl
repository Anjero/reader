<#include "../../../../layout/admin/layout.ftl"/>
<@html page_tab="notice_setting">
<section class="content-header">
    <h1>
        添加邮件账号
        <small>邮件推送设置</small>
    </h1>
</section>

<section class="content">
    <div class="box box-success">

        <div class="box-header">
            <h3 class="box-title">账号列表</h3>
        </div>
        <div class="box-body">
            <div class="col-col-12">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <th>uniqueKey</th>
                        <th>标题</th>
                        <th>主题</th>
                        <th>host</th>
                        <th>账号</th>
                        <th>密码</th>
                        <th style="max-width: 20%">接收邮箱</th>
                        <th>编辑</th>
                    </tr>
                    </thead>
                    <tbody>
                        <#list page.list as mailAccount>
                        <tr id="datatr">
                            <td>${mailAccount.uniqueKey}</td>
                            <td>${mailAccount.title}</td>
                            <td>${mailAccount.subject}</td>
                            <td>${mailAccount.host}</td>
                            <td>${mailAccount.username}</td>
                            <td>****</td>
                            <td>${mailAccount.mails}</td>
                            <td><a class="btn btn-danger btn-xs btn-flat"
                                   href="/admin/notice/manager/mail/edit/${mailAccount.id}">修改</a></td>
                        </tr>
                        </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="page">
        <#include "../../../../components/paginate.ftl"/>
        <@paginate currentPage=page.getPageNo() totalPage=page.getTotalPage() actionUrl="/admin/notice/manager/mails" totalCount=page.getTotalCount()  />
    </div>
</section>
</@html>

<@javascript></@javascript>