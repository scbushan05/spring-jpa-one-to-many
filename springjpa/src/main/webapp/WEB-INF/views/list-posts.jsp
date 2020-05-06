<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring JPA One to Many Mapping</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" 
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" 
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		<h3 class="mt-2">Spring JPA One-to-Many mapping 
			<span class="float-right">
				<a href="${contextRoot}/newpost" class="btn btn-success">New Post</a>
			</span>
		</h3><hr/>
		
		
		<div class="row">
		
			<c:if test="${posts.size() == 0}">
				<h4 class="text-center">No posts found</h4>
			</c:if>
			<c:if test="${posts.size() > 0}">
				<c:forEach items="${posts}" var="post">
			
					<div class="col-lg-4 col-md-6 mb-4">
			            <div class="card h-100">
			              <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
			              <div class="card-body">
			                <h4 class="card-title">
			                  <a href="${contextRoot}/viewpost/${post.id}">${post.title}</a>
			                </h4>
			                <h5>${post.description}</h5>
			                <p class="card-text text-truncate">${post.content}</p>
			              </div>
			              <div class="card-footer">
			                <a href="${contextRoot}/viewpost/${post.id}" class="btn btn-primary float-right">View post</a>
			              </div>
			            </div>
			        </div>
				
				</c:forEach>
			</c:if>
		
		</div>
		
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>