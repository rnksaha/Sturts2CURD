<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>DeleteProduct</title>
    </head>
    <body>
        <h2>Product Deleted</h2>
        <span><s:property value="productId" /></span><br><br>
        <a href="reportproduct">
            <button type="button">Report</button>
        </a>
    </body>
</html>
