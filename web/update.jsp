<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Update User</title>
    </head>
    <body>
        <jsp:include page="menu.jsp" />
        <h2>Update User</h2>
        <form action=updatedetails method="post">
            
                <table>
                    <tr>
                        <td><b>User Name:</b></td>
                        <td><input type="text" name="userName" value='<s:property value="userName"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Password:</b></td>
                        <td><input type="text"  name="password" value='<s:property value="password"/>'>
                            <input type="hidden" name="hdnuserName" value='<s:property value="userName"/>'>
                        </td>
                    </tr>
                    <tr>
                        <td><b>First Name:</b></td>
                        <td><input type="text" name="firstName" value='<s:property value="firstName"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Last Name:</b></td>
                        <td><input type="text" name="lastName" value='<s:property value="lastName"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Email:</b></td>
                        <td><input type="email" name="email" value='<s:property value="email"/>'></td>
                    </tr>
                    <tr>
                        <td><b>Phone Number:</b></td>
                        <td><input type="text" name="phoneNumber" value='<s:property value="phoneNumber"/>'></td>
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
