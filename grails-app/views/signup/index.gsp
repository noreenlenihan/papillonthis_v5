<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Register</title>
    <meta name="layout" content="main"/>
</head>

<body>

<h1>Signup</h1>

<g:if test="${flash.message}">
    <div class="alert alert-info">${flash.message}</div>
</g:if>

<g:hasErrors bean="${user}">
    <div class="alert alert-error">
        <g:renderErrors bean="${user}" as="list"/>
    </div>
</g:hasErrors>

<g:form action="register">
    <p>
        <label for="username">Username</label>
        <g:textField name="username" value="${user.username}"/>
    </p>

    <p>
        <label for="password">Password</label>
        <g:passwordField name="password" value=""/>
    </p>

    <p>
        <label for="password">Confirm Password</label>
        <g:passwordField name="password2" value=""/>
    </p>

    <p>
        <g:submitButton name="submit" value="Submit"/>
    </p>
</g:form>

</body>
</html>