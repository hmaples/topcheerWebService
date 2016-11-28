<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<!-- put请求 -->
    <form action="users/put/hmaple1/hmaple2" method="post">
    	<!--<input type="text" name="user_name" value="hmm">
    	<input type="text" name="pass_word" value="hmm">
    	-->
    	<input type="hidden" name="_method" value="put">
    	<input type="submit" value="put提交">
    </form>
    
    <!-- post请求 -->
    <form action="users/post/hmaple3/hmaple3" method="post">
    	<!--<input type="text" name="user_name" value="hmm">
    	<input type="text" name="pass_word" value="hmm">
    	-->
    	<input type="hidden" name="_method" value="post">
    	<input type="submit" value="post提交">
    </form>
    
    <!-- delete请求 -->
    <form action="users/delete/hmaple1" method="post">
    	<!--<input type="text" name="user_name" value="hmm">
    	<input type="text" name="pass_word" value="hmm">
    	-->
    	<input type="hidden" name="_method" value="delete">
    	<input type="submit" value="delete提交">
    </form>
    
    <!-- get请求 http://localhost:8080/topcheerWebService/users/get/hmaple2 -->
  </body>
</html>
