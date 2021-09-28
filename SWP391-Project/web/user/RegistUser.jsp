<%-- 
    Document   : RegistUser
    Created on : Sep 23, 2021, 11:48:12 PM
    Author     : cyv2098
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Sign up</title>
        <link rel="stylesheet" href="../nicepage.css" media="screen">
        <link rel="stylesheet" href="../2-Sign-up.css" media="screen">
        <script class="u-script" type="text/javascript" src="../jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="../nicepage.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="../static/js/register.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.25.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">

        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="2 Sign up">
        <meta property="og:type" content="website">
        <style>
            .error-alert
            {
                padding: 5px 0px 0px 10px;
                color: red;
                font-size: 14px;
            }
        </style>
    </head>
    <body class="u-body">
        <jsp:include page="../common-layout/header.jsp" />
        <section class="u-clearfix u-section-1" id="sec-955d">
            <div class="u-clearfix u-sheet u-sheet-1">
                <h3 class="u-text u-text-default u-text-1">Sign up</h3>
                <div class="u-form u-form-1">
                    <form action="register" method="POST" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" name="form" style="padding: 10px;" onsubmit="return onSubmitRegister()">
                        <div class="u-form-group u-form-name" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="name-8945" class="u-label">Full name</label>
                            <input type="text" placeholder="Enter your Name" id="name-8945" name="name" value = "${name}" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                            <label class="error-alert"></label>
                        </div>
                        <div class="u-form-email u-form-group u-form-partition-factor-2" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="email-8945" class="u-label">Email</label>
                            <input type="email" placeholder="Enter a valid email address" id="email-8945" name="email" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" value =  "${email}" required="">
                            <label  class="error-alert"></label>
                        </div>
                        <div class="u-form-group u-form-partition-factor-2 u-form-group-3" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="text-19ae" class="u-label">Mobile</label>
                            <input type="text" placeholder="Enter your phone number" id="text-19ae" name="phonenumber" value="${phonenumber}" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" onfocusout="displayTextPhoneNumber()">
                            <label id="message-client-phone" class="error-alert"></label>
                        </div>
                        <div class="u-form-group u-form-partition-factor-2 u-form-group-4" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="text-5226" class="u-label">Address</label>
                            <input type="text" placeholder="Enter your address" id="text-5226" name="address" value = "${address}" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                            <label class="error-alert"></label>
                        </div>
                        <div class="u-form-group u-form-partition-factor-2 u-form-select u-form-group-5" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="select-7477" class="u-label">Gender</label>
                            <div class="u-form-select-wrapper">
                                <select id="select-7477" name="gender" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                                    <option value="Male" ${gender == 'Male' ? 'selected' : ''}>Male</option>
                                    <option value="Female" ${gender == 'Female' ? 'selected' : ''}>Female</option>
                                    <option value="Other" ${gender == 'Other' ? 'selected' : ''}>Other</option>
                                </select>
                            </div>
                            <label class="error-alert"></label>
                        </div>
                        <div class="u-form-group u-form-group-6" style="padding-bottom: 0px; margin-bottom: 0px;">
                            <label for="text-547b" class="u-label">Password</label>
                            <input type="password" placeholder="Enter your password" id="text-547b" name="password" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="" onfocusout="checkReEnterPassword('0')">
                            <label class="error-alert"></label>
                        </div>
                        <div class="u-form-group u-form-group-7">
                            <label for="text-1571" class="u-form-control-hidden u-label"></label>
                            <input type="password" placeholder="Re-enter password" id="text-1571" name="re-password" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="" onfocusout="checkReEnterPassword('1')">
                            <div id="message-client-password" class="error-alert"></div>                     
                        </div>
                        <div class="u-align-left u-form-group u-form-submit">
                            <button class="u-border-none u-btn u-btn-submit u-button-style u-palette-4-base u-btn-1">Submit</button>
                            <input type="submit" value="Submit" class="u-form-control-hidden">
                        </div>
                        <c:forEach var="item" items="${ERRORS}">
                            <div id="message-server">
                                <div class="error-alert"> <c:out value="${item}"/></div>
                            </div>
                            </c:forEach>
                    </form>
                </div>
                </div>
        </section>

        <jsp:include page="../common-layout/footer.jsp"/>
        <c:if test = "${CREATE_USER_STATUS  == 'true'}">
            <script type="text/javascript">
                alert("Create success");
            </script>
        </c:if>
        <c:if test = "${CREATE_USER_STATUS  == 'false'}">
            <script type="text/javascript">
                alert("Create fail");
            </script>
        </c:if>   
    </body>
</html>
