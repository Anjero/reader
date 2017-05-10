<#macro left page_tab="">
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
  <!-- sidebar: style can be found in sidebar.less -->
  <section class="sidebar">
    <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu">
      <li class="header">MAIN NAVIGATION</li>
      <li <#if page_tab=='dashboard'>class="active"</#if>>
        <a href="/admin/dashboard">
          <i class="fa fa-dashboard"></i>
          <span>主页</span>
        </a>
      </li>
      <li class="treeview <#if page_tab=='user_list'
      || page_tab=='user_pv_uv'
      || page_tab=='user_smstpl'
      || page_tab=='user_edu'>active</#if>">
        <a href="#">
          <i class="fa fa-user"></i> <span>用户中心</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/loan/user/list">
              <i class="fa fa-circle-o"></i>
              用户列表
            </a>
          </li>
          <li <#if page_tab=='user_pv_uv'>class="active"</#if>>
            <a href="/admin/loan/user/list_pv_uv">
              <i class="fa fa-circle-o"></i>
              pv_uv列表
            </a>
          </li>
          <li <#if page_tab=='user_smstpl'>class="active"</#if>>
            <a href="/admin/loan/tplSms/page">
              <i class="fa fa-circle-o"></i>
              短信模板
            </a>
          </li>
          <li <#if page_tab=='user_edu'>class="active"</#if>>
            <a href="/admin/edu/list">
              <i class="fa fa-circle-o"></i>
              华尔街英语
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis_dailycount'
      || page_tab=='analysis_sendtime'
      || page_tab=='analysis_amount'
      || page_tab=='analysis_province'>active</#if>">
        <a href="#">
          <i class="fa fa-line-chart"></i> <span>数据分析</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='analysis_dailycount'>class="active"</#if>>
            <a href="/admin/loan/analysis/dailycount">
              <i class="fa fa-circle-o"></i>
              留资统计
            </a>
          </li>
          <li <#if page_tab=='analysis_sendtime'>class="active"</#if>>
            <a href="/admin/loan/analysis/sendtime">
              <i class="fa fa-circle-o"></i>
              发送时间统计
            </a>
          </li>
          <li <#if page_tab=='analysis_amount'>class="active"</#if>>
            <a href="/admin/loan/analysis/amount">
              <i class="fa fa-circle-o"></i>
              贷款金额分布
            </a>
          </li>
          <li <#if page_tab=='analysis_province'>class="active"</#if>>
            <a href="/admin/loan/analysis/province">
              <i class="fa fa-circle-o"></i>
              省市分布统计
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='invest_page'>active</#if>">
        <a href="#">
          <i class="fa fa-headphones"></i> <span>客服外呼</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/loan/index">
              <i class="fa fa-circle-o"></i>
              列表页面
            </a>
          </li>
          <li <#if page_tab=='invest_page'>class="active"</#if>>
            <a href="/admin/invest/page">
              <i class="fa fa-circle-o"></i>
              客服列表
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='sms_list' || page_tab=='sms_safe'  || page_tab=='sms_warning'  || page_tab=='sms_balance'>active</#if>">
        <a href="#">
          <i class="fa fa-commenting"></i> <span>短信</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='sms_list'>class="active"</#if>>
            <a href="/admin/sms/list">
              <i class="fa fa-circle-o"></i>
              发送明细
            </a>
          </li>
          <li <#if page_tab=='sms_safe'>class="active"</#if>>
            <a href="/admin/sms/safe">
              <i class="fa fa-circle-o"></i>
              安全控制
            </a>
          </li>
          <li <#if page_tab=='sms_warning'>class="active"</#if>>
            <a href="/admin/sms/warning">
              <i class="fa fa-circle-o"></i>
              预警
            </a>
          </li>
          <li <#if page_tab=='sms_balance'>class="active"</#if>>
            <a href="/admin/sms/balance">
              <i class="fa fa-circle-o"></i>
              渠道余额查询
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis'>active</#if>">
        <a href="#">
          <i class="fa fa-users"></i> <span>客服管理</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/serviceManage/list">
              <i class="fa fa-circle-o"></i>
              客服状态
            </a>
          </li>
          <li <#if page_tab=='user_pv_uv'>class="active"</#if>>
            <a href="/admin/serviceManage/page">
              <i class="fa fa-circle-o"></i>
              已分配数据
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis'>active</#if>">
        <a href="#">
          <i class="fa fa-barcode"></i> <span>数据统计</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/loan/count/index">
              <i class="fa fa-circle-o"></i>
              客服工作分析表
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis'>active</#if>">
        <a href="#">
          <i class="fa fa-cogs"></i> <span>选项管理</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/option/list">
              <i class="fa fa-circle-o"></i>
              选项列表
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis'>active</#if>">
        <a href="#">
          <i class="fa fa-tasks"></i> <span>轻松贷</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/loan/product/page">
              <i class="fa fa-circle-o"></i>
              产品列表
            </a>
          </li>
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/loan/product/add">
              <i class="fa fa-circle-o"></i>
              添加产品
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab?index_of("ezdai_")==0>active</#if>">
        <a href="#">
          <i class="fa fa-tasks"></i> <span>容易贷(EZDAI)</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='ezdai_user_list'>class="active"</#if>>
            <a href="/admin/ezdai/account/list">
              <i class="fa fa-circle-o"></i>
              用户列表
            </a>
          </li>
          <li <#if page_tab=='ezdai_faq'>class="active"</#if>>
            <a href="/admin/ezdai/faq/list">
              <i class="fa fa-circle-o"></i>
              FAQ
            </a>
          </li>
          <li <#if page_tab=='ezdai_carousel'>class="active"</#if>>
            <a href="/admin/ezdai/carousel/list">
              <i class="fa fa-circle-o"></i>
              轮播图设置
            </a>
          </li>
          <li <#if page_tab=='ezdai_product'>class="active"</#if>>
            <a href="/admin/ezdai/product/list">
              <i class="fa fa-circle-o"></i>
              产品管理
            </a>
          </li>
          <li <#if page_tab=='ezdai_loan_list'>class="active"</#if>>
            <a href="/admin/ezdai/loan/list">
              <i class="fa fa-circle-o"></i>
              贷款列表
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='analysis'>active</#if>">
        <a href="#">
          <i class="fa fa-wrench"></i> <span>系统工具</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='global_surl'>class="active"</#if>>
            <a href="/admin/global/surl/index">
              <i class="fa fa-circle-o"></i>
              生成短链
            </a>
          </li>
        </ul>
      </li>
      <li class="treeview <#if page_tab=='security_auth'|| page_tab=='security_role'|| page_tab=='security_admin'>active</#if>">
        <a href="#">
          <i class="fa fa-cogs"></i> <span>系统管理</span>
          <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
          <li <#if page_tab=='user_list'>class="active"</#if>>
            <a href="/admin/schedule/list">
              <i class="fa fa-circle-o"></i>
              定时任务
            </a>
          </li>
          <li <#if page_tab=='notice_setting'>class="active"</#if>>
            <a href="/admin/notice/manager/mails">
              <i class="fa fa-circle-o"></i>
              推送设置
            </a>
          </li>
          <li <#if page_tab=='security_auth'>class="active"</#if>>
            <a href="/admin/security/auth/list">
              <i class="fa fa-circle-o"></i>
              权限设置
            </a>
          </li>
          <li <#if page_tab=='security_role'>class="active"</#if>>
            <a href="/admin/security/role/list">
              <i class="fa fa-circle-o"></i>
              角色管理
            </a>
          </li>
          <li <#if page_tab=='security_admin'>class="active"</#if>>
            <a href="/admin/security/adminuser/list">
              <i class="fa fa-circle-o"></i>
              用户管理
            </a>
          </li>
        </ul>
      </li>
      <li>
        <a href="/admin/logout">
          <i class="fa fa-sign-out"></i>
          <span>退出</span>
        </a>
      </li>
    </ul>
  </section>
  <!-- /.sidebar -->
</aside>
<!-- /.control-sidebar -->
</#macro>