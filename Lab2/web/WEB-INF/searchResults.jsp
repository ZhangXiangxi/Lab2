<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zxx_1
  Date: 2016/10/9
  Time: 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
      IZU图书管理系统搜索结果
    </title>
</head>
<body>
    <center>
    <div>
        作者：<s:property value="authorName" default="xiangxi"/>
    </div>
    <s:if test="searchResults.size()==0">
        没有此作者的相关书目。
    </s:if>
    <s:iterator value="searchResults">
        <ul>
            <li>
                <div>
                    <h4>
                        <s:property value="Title"></s:property>
                        <a href="detailedInfo.action?ISBN=<s:property value='ISBN'/>" target="_blank">
                            显示更多信息
                        </a>
                    </h4>
                </div>
            </li>
        </ul>
    </s:iterator>
        <li>
            <s:a href="/">返回首页</s:a>
        </li>
    </center>
</body>
</html>
