<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zxx_1
  Date: 2016/10/9
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<center>
  <div style="margin-left: auto;margin-right: auto;">
    <ul>
      <li>
        书名：<s:property value="Title"></s:property>
      </li>
      <li>
        作者编号：<s:property value="AuthorID"></s:property>
      </li>
      <li>
        作者：<s:property value="Name"></s:property>
      </li>
      <li>
        年龄：<s:property value="Age"></s:property>
      </li>
      <li>
        国籍：<s:property value="Country"></s:property>
      </li>
      <li>
        书号：<s:property value="ISBN"></s:property>
      </li>
      <li>
        出版社：<s:property value="Publisher"></s:property>
      </li>
      <li>
        出版日期：<s:property value="PublishDate"></s:property>
      </li>
      <li>
        价格：<s:property value="Price"></s:property>
      </li>
      <div style="margin-right: auto;margin-right: auto">
        <li>
          <s:a href="/">返回首页</s:a>
        </li>
        <li>
          <a href="/DeleteBook.action?ISBN=<s:property value='ISBN'/>">
            删除本书
          </a>
        </li>
      </div>
    </ul>
  </div>
  </center>
</body>
</html>
