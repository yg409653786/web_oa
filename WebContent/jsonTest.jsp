<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSON交互</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript">
	function jsonRequest() {
		$.ajax({
			type : "POST",
			contentType:"application/json;charset=utf-8",
			url : "json/jsonRequest.action",
			data : {
				"id":1,
				"username":"杨刚",
				"email":"409653786@qq.com"
				},
			success : function(msg) {
				alert("Data Saved: " + msg);
			}
		});
	}
	
	function keyvalueRequest() {
		$.ajax({
			type : "GET",
			url : "json/keyvalueRequest.action",
			data : "id=1&username=杨刚&email=409653786@qq.com",
			success : function(msg) {
				alert("Data Saved: " + msg);
			}
		});
	}
</script>
</head>
<body>

	<input type="button" value="jsonRequest" onclick="jsonRequest()" />
	<input type="button" value="keyvalueRequest" onclick="keyvalueRequest()" />

</body>
</html>