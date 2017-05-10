<#macro html page_tab="">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>车映商用数据平台</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="http://cdn.datayin.com/assets/AdminLTE/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="http://cdn.datayin.com/assets/AdminLTE/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/dist/css/skins/_all-skins.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/iCheck/all.css">
  <!-- Morris chart -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/morris/morris.css">
  <!-- jvectormap -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <!-- Date Picker -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/datepicker/datepicker3.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/daterangepicker/daterangepicker.css">
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/datatables/dataTables.bootstrap.css">
  <link rel="stylesheet" href="//cdn.datayin.com/assets/AdminLTE/plugins/daterangepicker/daterangepicker.css">
  <!-- bootstrap wysihtml5 - text editor -->
  <link rel="stylesheet"
        href="//cdn.datayin.com/assets/AdminLTE/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="//oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
  <script src="//cdn.datayin.com/assets/dtree/dtree.js"></script>

    <style>
        table td{
            font-size: 13px;
        }
    </style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="//cdn.datayin.com/assets/AdminLTE/index2.html" class="logo">
      <span class="logo-mini"><b>N</b>uo</span>
      <span class="logo-lg"><b>Nuoying</b>console</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="//cdn.datayin.com/assets/AdminLTE/#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
    </nav>
  </header>

  <#include "left.ftl">
  <@left page_tab=page_tab/>
  <div class="content-wrapper">
    <#nested>
  </div>
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.6
    </div>
    <strong>Copyright &copy; 2014-2017 <a href="www.datayin.com">Datayin.com</a>.</strong> All rights
    reserved.
  </footer>
  <div class="control-sidebar-bg"></div>
</div>

<script src="//cdn.datayin.com/assets/AdminLTE/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="//cdn.datayin.com/assets/AdminLTE/bootstrap/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/knob/jquery.knob.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/daterangepicker/daterangepicker.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/fastclick/fastclick.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/dist/js/app.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/plugins/iCheck/icheck.min.js"></script>
<script src="//cdn.datayin.com/assets/AdminLTE/dist/js/demo.js"></script>
<script src="//cdn.datayin.com/assets/layer/layer.js"></script>
<script src="//cdn.datayin.com/assets/echarts/echarts.min.js"></script>
</body>
</html>
</#macro>
<#--jascript-->
<#macro javascript>
  <#nested>

</#macro>