<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Post</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		
		<h3 class="mt-2">Spring JPA One-to-Many mapping</h3>
		<hr/>
		<h5>New post</h5>
		<form:form action="${contextRoot}/post" method="post" modelAttribute="post">
			 
			<form:input path="title" placeholder="Enter post title" class="form-control" /><br/>
			
			<form:input path="description" placeholder="Enter post description" class="form-control" /><br/>
			
			<form:textarea path="content" placeholder="Enter post content" class="form-control" /><br/>
			
			<button type="submit" class="btn btn-primary">Save post</button>
			<a href="${contextRoot}/" class="btn btn-success ml-2">Back to posts</a>
			
		</form:form>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>