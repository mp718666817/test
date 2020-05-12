<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table  border="1">
		<tr>
			<td>雇员编号</td>
			<td>雇员名称</td>
			<td>雇员工资</td>
			<td>雇员性别</td>
			<td>入职日期</td>
			<td>操作</td>
		</tr>
	
	
	<c:forEach items="${pageBean.datas}" var="emp">
		<tr>
				<td> ${emp.empId } </td>
				<td>${emp.empName }</td>
				<td>${emp.empSalary }</td>
				<td>${emp.empSex }</td>
				<td>${emp.empJoinTime }</td>
				<td>删除 修改</td>
			</tr>
	</c:forEach>
	
	<tr>
		<td colspan="6">
		
			<a href="${pageContext.request.contextPath }/FindPageDatas?pageNo=${pageBean.pageNo-1 }&methodName=findpage">上一页 </a>  当前${pageBean.pageNo } 页 <a href="${pageContext.request.contextPath }/FindPageDatas?pageNo=${pageBean.pageNo+1 }&methodName=findpage">下一页  </a>
		</td>
	</tr>
	</table>


</body>
</html>