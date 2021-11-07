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
        <title>Profile</title>
        <link rel="stylesheet" href="../nicepage.css" media="screen">
        <link rel="stylesheet" href="../2-Sign-up.css" media="screen">
        <script class="u-script" type="text/javascript" src="../jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="../nicepage.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="../static/js/register.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.25.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="2 Sign up">
        <meta property="og:type" content="website">
        <style>
            .error-alert
            {
                padding: 10px 0px 0px 10px;
                color: red;
                font-size: 20px;
            }
            .center{
                width: 80%;
                align-self: center;
                margin: auto;
            }
            .btn-quiz{
                border-radius: 6px;
                border: 1px solid #2cccc4;
                background-color: #2cccc4;
                color: white;
                font-size: 19px;
                padding:  8px 20px;
                margin-right: 25px
            }
            .btn-import{
                background-color: #2cccc4;
                color: white;
                border-color: white;
                margin: 0 auto;
                display: block;
            }
        </style>
    </head>
    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div class="container" style="width: 75%;height: 400px">
                <form action="import" method="POST" enctype="multipart/form-data">
                    <table style="width: 100%">
                        <tr>
                            <th style="width: 40%"></th>
                            <th style="width: 40%;"></th>

                        </tr>
                        <tr>
                            <td align="left"><h3>Import Question</h3></td>
                            <td align="left" style="height: 100px;" > <a href="${pageContext.request.contextPath}/quizlet/down-template" style="font-size: 20px">Download template</a></td>
                        </tr>
                        <tr>
                            <td align="left" style="font-size: 20px">Choose file to Import Question</td>
                            <td align="left" style="height: 100px">
                                <input style="font-size: 20px" type="file" name="multiPartServlet"/></td>
                        </tr>
                    </table>
                    <br>
                    <button class="btn-quiz btn-import" >
                        IMPORT</button>
                    <br>
                    <label style="font-size: 22px; color: green;margin:  0 auto;text-align:  center;display: block">${message}</label>
                </form>
            </div>
        </section>
        <jsp:include page="../common-layout/footer.jsp"/>
    </body>
</html>
