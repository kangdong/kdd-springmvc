<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<html>
<head>
	<title></title>
</head>
<body style="padding:0">
<h1>${message}</h1>
Test
<div style="padding:10px;clear: both;">
	<div id="psLine" style="height:600px;"></div>
</div>
</body>
<script src="/js/echarts.min.js"></script>
<script src="/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	//图表
	var psLineChar = echarts.init(document.getElementById('psLine'));

	//查询
	function loadDrugs() {
		psLineChar.clear();
		psLineChar.showLoading({text: '正在努力的读取数据中...'});
		$.getJSON('/removecauses', function (data) {
			alert(data)
			if (data.success) {
				psLineChar.setOption(data.data, true);
				psLineChar.hideLoading();
			} else {
				alert('提示', data.msg);
			}
		});
	}
	//载入图表
	loadDrugs();
</script>
</html>