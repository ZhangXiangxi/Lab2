<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zxx_1
  Date: 2016/10/9
  Time: 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>IZU图书管理系统</title>
  </head>
  <body>
    </div>
    <center>
      <h1 style="text-align: center">欢迎来到IZU图书管理系统</h1>
      <div style="margin-left:auto;margin-right:auto">
        <s:form action="search" cssStyle="align-content: center">
          <s:textfield name="authorName" label="作者名" cssStyle="align-self: center"></s:textfield>
          <s:submit value="搜索" cssStyle="align-self: center"></s:submit>
        </s:form>
      </div>
    </center>
  </body>
</html>
