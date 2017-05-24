<#include "../../../../layout/admin/layout.ftl"/>
<@html page_tab="notice_setting">
<section class="content-header">
    <h1>
        短信账号列表
        <small>推送设置</small>
    </h1>
</section>

<section class="content">
    <div class="box box-success">

        <div class="box-header">
            <h3 class="box-title">短信列表</h3>
        </div>
        <div class="box-body">
            <div class="col-col-12">
                <table class="table table-bordered table-hover">
                    <thead>
                    <tr>
                        <th>uniqueKey</th>
                        <th>标题</th>
                        <th>主题</th>
                        ##            <th>添加时间</th>
                        ##            <th>修改时间</th>
                        <th>type</th>
                        <th>source</th>
                        <th>REFER</th>
                        <th>PASS</th>
                        <th>编辑</th>
                    </tr>
                    </thead>
                    <tbody>
                        <#list page.list as noticeSms>
                        <tr id="datatr">
                            <td>${noticeSms.uniqueKey}</td>
                            <td>${noticeSms.title}</td>
                            <td>${noticeSms.remark}</td>
                            <td>${noticeSms.smsType}</td>
                            <td>${noticeSms.smsSource}</td>
                            <td>${noticeSms.smsRefer}</td>
                            <td>${noticeSms.smsPass}</td>
                            <td><a class="btn btn-danger btn-sm" href="#springUrl('/')admin/notice/manager/sms/edit/${noticeSms.id}">修改</a></td>
                        </tr>
                        </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="page">
        <#include "../../../../components/paginate.ftl"/>
        <@paginate currentPage=page.getPageNo() totalPage=page.getTotalPage() actionUrl="/admin/notice/manager/sms/index" totalCount=page.getTotalCount()  />
    </div>
</section>
</@html>
<@javascript></@javascript>