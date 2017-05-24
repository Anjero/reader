<#include "../../../../layout/admin/layout.ftl"/>
<@html page_tab="notice_setting">
<section class="content-header">
    <h1>
        添加邮件账号
        <small>邮件推送设置</small>
    </h1>
</section>

<div class="content">
    <div class="content">
        <form class="form-horizontal" action="/admin/notice/manager/mail/save" method="post" enctype="multipart/form-data">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="title">uniqueKey</label>
                <div class="col-sm-9">
                    <input type="text" id="uniqueKey" name="uniqueKey" placeholder="uniqueKey" value=""
                           class="form-control">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="title">标题</label>
                <div class="col-sm-9">
                    <input type="text" id="title" name="title" placeholder="标题" value="" class="form-control">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="subject">主题</label>
                <div class="col-sm-9">
                    <input type="text" id="subject" name="subject" value="" placeholder="主题" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="wxName">host</label>
                <div class="col-sm-9">
                    <input type="text" id="host" name="host" value="" placeholder="HOST" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="username">username</label>
                <div class="col-sm-9">
                    <input type="text" id="username" name="username" value="" placeholder="username"
                           class="form-control">
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="wxName">password</label>
                <div class="col-sm-9">
                    <input type="text" id="password" name="password" value="" placeholder="password"
                           class="form-control">
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-3 control-label no-padding-right" for="mails">接收邮箱</label>
                <div class="col-sm-9">
                    <input type="text" id="mails" name="mails" value="" placeholder="接收邮箱" class="form-control">
                </div>
            </div>
            <div class="box-footer" style="clear:both;">
                <div class="col-md-offset-3 col-md-9">
                    <button class="btn btn-primary btn-flat" type="submit" id="submitBTN">
                        <i class="ace-icon fa fa-check bigger-110"></i>
                        修改
                    </button>

                    &nbsp; &nbsp; &nbsp;
                    <button class="btn btn-flat" type="button">
                        <i class="ace-icon fa fa-undo bigger-110"></i>
                        返回
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
</@html>

<@javascript></@javascript>