<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="com.mchange.v2.c3p0.ComboPooledDataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath}/test/queryTest" target="_blank">test</a>
<h1>
    <%
        //c3p0连接池使用情况
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletConfig().getServletContext());
        ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        System.out.println("conn:"+conn);
        System.out.println("最大连接数:"+dataSource.getMaxPoolSize());// 最大连接数
        System.out.println("最小连接数:"+dataSource.getMinPoolSize());// 最小连接数
        System.out.println("正在使用连接数:"+dataSource.getNumBusyConnections());// 正在使用连接数
        System.out.println("空闲连接数:"+dataSource.getNumIdleConnections());// 空闲连接数
        System.out.println("总连接数:"+dataSource.getNumConnections());// 总连接数
    %>
</h1>
</body>
</html>
