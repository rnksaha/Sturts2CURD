<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>UpdateProduct</title>
    </head>
    <body>
        <jsp:include page="menu.jsp" />
        <h2>Update Product</h2>
        <form action=updatedetailsproduct method="post">
            
                <table>
                    <tr>
                        <td><b>Product ID:</b></td>
                        <td><input type="text" name="productId" value='<s:property value="productId"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Product Name:</b></td>
                        <td><input type="text"  name="productName" value='<s:property value="productName"/>'>
                        </td>
                    </tr>
                    <tr>
                        <td><b>Product Make:</b></td>
                        <td><input type="text" name="productMake" value='<s:property value="productMake"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Price:</b></td>
                        <td><input type="text" name="price" value='<s:property value="price"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Product Availability:</b></td>
                        <td><input type="text" name="availability" value='<s:property value="availability"/>'></td>
                    </tr>
                </table> 
                    
            <button name="submitType" value="update" type="submit">Update</button>

        </form>
        <s:if test="ctr>0">
            <span style="color: red;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: green;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>
