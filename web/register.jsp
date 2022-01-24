<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Register User</title>
        <style type="text/css">
            .button-register {background-color: green;color: white;}
            .button-report {background-color: #000000;color: white;margin-left: 30%;}
        </style>
    </head>
    <body>
        <jsp:include page="menu.jsp" />
        <h2>Register User</h2>
        
        <!--<a href="report"><button class="button-report" type="button">Report</button></a>-->
        <s:form action="registeruser.action" method="post">
            <s:textfield label="User Name" name="userName" />
            <s:textfield label="First Name" name="firstName" />
            <s:textfield label="Last Name" name="lastName" />
            <s:password label="Password" name="password" />
            <s:textfield label="Email" name="email" />
            <s:textfield label="Phone Number" name="phoneNumber" />
            <s:submit cssClass="button-register" value="Resgister" />
        </s:form>
        <s:if test="row>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
      
    </body>
</html>