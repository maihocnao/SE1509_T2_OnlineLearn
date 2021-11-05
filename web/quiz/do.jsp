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
        <script type="text/javascript">
            if (localStorage["timeLeft"] === undefined || localStorage["timeLeft"] === null || localStorage["timeLeft"] === 'null') {
                localStorage["timeLeft"] = ${duration};
            }
        </script>
    </head>
    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <h4 style="padding: 8px; background-color: #acfcb6;width: 80%; border-radius: 18px;font-size: 20px;margin-top: 10px">Question ${index + 1}</h4>
            <h5 style="float: right;width: 16%"><span style="position: absolute"> Duration: </span><span id="timer" style="float: right">${durationText}</span></h5>
            <div style="font-size: 17px">
                <form id="form" action="${pageContext.request.contextPath}/quiz/do" method="POST">
                    <input type="hidden" id="actionType" name="actionType"/>
                    <input type="hidden" name="index" value="${index}"/>
                    <input type="hidden" id="duration" name="duration"/>
                    <label>${question.getContent()}</label><br><br>
                    <c:forEach var="ans" items="${question.getAnswer()}">
                        <input style="margin-bottom: 10px" type="radio" name="answer" 
                               value="${ans.getAnswerID()}" ${question.getUserAnswer() == ans.getAnswerID() ? 'checked':''}/>
                        &nbsp;&nbsp; ${ans.getContent()}<br>
                    </c:forEach>
                </form>
                <br>
                <div>
                    <button class="btn-quiz" onclick="submitForm('previous')">Previous</button>
                    <button class="btn-quiz" style="padding: 8px 36px"  onclick="submitForm('next')">Next</button>
                    <button class="btn-quiz" style="background-color: green;color: white;border-color: green"
                            onclick="submitForm('submit')">SUBMIT</button>
                </div>
                <br>
            </div>
        </section>
        <jsp:include page="../common-layout/footer.jsp"/>
        <script>
            setInterval(timer, 1000);
            function timer() {
                var duration = localStorage["timeLeft"];
                duration = duration - 1;
                //het thoi gian lam bai
                if (duration === 0) {
                    document.getElementById("actionType").value = 'timeup';
                    localStorage.removeItem("timeLeft");
                    clearInterval();
                    document.getElementById("form").submit();
                } else {
                    document.getElementById("timer").innerHTML = toTimer(duration);
                    localStorage["timeLeft"] = duration;
                }
            }
            function toTimer(duration) {
                var hour = Math.floor(duration / 3600);
                var min = Math.floor((duration - hour * 3600) / 60);
                var sec = duration - hour * 3600 - min * 60;
                return hour + "h" + min + "m" + sec + "s";
            }

            function submitForm(actionType) {
                var form = document.getElementById("form");
                document.getElementById("actionType").value = actionType;
                document.getElementById("duration").value = localStorage["timeLeft"];
                if (actionType === 'submit') {
                    var r = confirm("Do you want to submit?");
                    if (r === false) {
                        return;
                    }
                }
                form.submit();
            }
        </script>
    </body>
</html>
