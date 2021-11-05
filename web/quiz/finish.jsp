<%-- 
    Document   : RegistUser
    Created on : Sep 23, 2021, 11:48:12 PM
    Author     : cyv2098
--%>

<%@page import="bean.Quiz"%>
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
            .center{
                width: 70%;
                align-self: center;
                margin: auto;
                height: 320px
            }
            .size-18{
                font-size:18px;
            }
            .margin-21{
                margin-top: 21px;
            }
            .margin-bottom-40{
                margin-bottom: 40px;
            }
            .margin-left-74{
                margin-left: 74px;
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
        </style>
        <script>
            localStorage.removeItem("timeLeft");
        </script>
        <%
            String durationText = "0m:0s";
            Quiz quiz = (Quiz) request.getAttribute("quiz");
            if (quiz != null) {
                int min = quiz.getDuration() / 60;
                int sec = quiz.getDuration() - min * 60;
                durationText = min + "m:" + sec + "s";
            }
        %>
    </head>
    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <section class="u-clearfix u-section-1 center" id="sec-955d">

            <h4 style="padding: 8px; text-decoration: underline">YOUR RESULT: </h4>
            <br>
            <table style="width:30%;font-size: 22px;height: 20%; margin-left: 10%">
                <tr>
                    <th style="width: 40%"></th>
                    <th></th>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td>${quiz.getLessonID()}</td>
                </tr>
                <tr>
                    <td>Score:</td>
                    <td>${score} - 
                        <span style="font-size: 23px;color: ${score >= quiz.getPassRate() ? 'green': 'red'}">
                            ${score >= quiz.getPassRate() ? 'Pass': 'Fail'}</span></td>
                </tr>
                <tr>
                    <td>Duration:</td>
                    <td><%=durationText%></td>
                </tr>
                  <tr>
                      <td><a href="#">Detail</a></td>
                    <td></td>
                </tr>
            </table>
            <br>
        </section>
        <jsp:include page="../common-layout/footer.jsp"/>
    </body>
</html>
