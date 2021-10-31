<%-- 
    Document   : QuỉzReview
    Created on : Oct 31, 2021, 4:22:55 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
   <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>List-User</title>
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
            select{
                width: 83%;
                height: 35px;
                border-color: #d2d4d6;
            }
            .pagination {
                display: inline-block;
            }

            .pagination a {
                color: black;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
            }

            .pagination a.active {
                background-color: #4CAF50;
                color: white;
                border-radius: 5px;
            }

            .pagination a:hover:not(.active) {
                background-color: #ddd;
                border-radius: 5px;
            }
        </style>
    </head>

    <body>
      <jsp:include page="../common-layout/header.jsp" />
    <div class="review-progress">
        <h2>Review Progress</h2>
        <div class="review-card">
            <c:forEach var="question" items="${questionList}">
                <c:choose>
                    <c:when test="${question.value[0]!=null}">
                        <div id="question-${question.key.questionID}" class="review-box" style="background: green;">
                            <p>${question.key.questionID}</p>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div id="question-${question.key.questionID}" class="review-box">
                            <p>${question.key.questionID}</p>
                        </div>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </div>
    </div>
    <div class="question-infomation">
        <input type="hidden" value="${radioList}"> 
        <c:set var="highscore"  value="0" scope="page"/>
        <c:forEach var="question" items="${questionList}">
            <div class="question-card">
                <p>${question.key.content}</p>
                <c:choose>
                    <c:when test="${question.value[0]!=null}">
                        <input type="radio" value="${question.value[0]}" checked="checked">${question.value[0]} <br>
                        <c:forEach var="answerList" items="${answerList}">
                            <c:if test="${answerList.questionID==question.key.questionID}">
                                <c:if test="${question.value[0]!=answerList.content}">
                                    <input type="radio" value="${answerList.content}" disabled="disabled">${answerList.content}</p>
                                </c:if>
                            </c:if>
                        </c:forEach>
                        <c:forEach var="correctList" items="${correctList}">       
                            <c:if test="${correctList.questionID==question.key.questionID}">
                                <c:choose>
                                    <c:when test="${question.value[0]==correctList.content}">
                                        <div class="correct-answer" > This is correct </div>
                                        <button id="myBtn" class="popup"
                                                onclick="document.getElementById('${question.key.questionID}').style.display = 'block'">
                                            Peak At Answer </button>
                                        <div id="${question.key.questionID}" class="modal">
                                            <c:if test="${correctList.questionID==question.key.questionID}">
                                                <div class="modal-content">
                                                    <span class="close"
                                                          onclick="document.getElementById('${question.key.questionID}').style.display = 'none'">&times;</span>
                                                    <p> The correct answer is ${correctList.content} </p>
                                                </div>
                                            </c:if>
                                        </div>
                                        <c:set var="highscore" value="${highscore + 1 }" scope="page"/>
                                    </c:when>
                                    <c:when test="${question.value[0] != correctList.content}">
                                        <div class="incorrect-confirm"> This is not correct </div>
                                        <button id="myBtn" class="popup"
                                                onclick="document.getElementById('${question.key.questionID}').style.display = 'block'">
                                            Peak At Answer </button>
                                        <div id="${question.key.questionID}" class="modal">
                                            <c:if test="${correctList.questionID==question.key.questionID}">
                                                <div class="modal-content">
                                                    <span class="close"
                                                          onclick="document.getElementById('${question.key.questionID}').style.display = 'none'">&times;</span>
                                                    <p> The correct answer is ${correctList.content} </p>
                                                </div>
                                            </c:if>
                                        </div>
                                    </c:when>
                                </c:choose>
                            </c:if>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <c:forEach var="answerList" items="${answerList}">
                            <c:if test="${answerList.questionID==question.key.questionID}"> 
                                <input type="radio" id="ans-${answerList.answerID}" name="${question.key.questionID}"disabled="disabled">
                                <label for="ans-${answerList.answerID}">${answerList.content}</label><br>
                            </c:if>
                        </c:forEach>
                        <p> You did not answer </p>
                        <button id="myBtn" class="popup"
                                onclick="document.getElementById('${question.key.questionID}').style.display = 'block'">
                            Peak At Answer </button>
                        <div id="${question.key.questionID}" class="modal">
                            <c:forEach var="correctList" items="${correctList}">
                                <c:if test="${correctList.questionID==question.key.questionID}">
                                    <div class="modal-content">
                                        <span class="close" onclick="document.getElementById('${question.key.questionID}').style.display = 'none'">&times;</span>
                                        <p> The correct answer is ${correctList.content}</p>
                                    </div>
                                </c:if>
                            </c:forEach>
                        </div>
                    </c:otherwise>
                </c:choose>
            </div>
        </c:forEach>
        Your score is :${highscore}/${questionList.size()}
        <form action="Submit" method="POST">
            <input type="hidden" name="score" value="${highscore}"/>
             <input type="hidden" name="quizID" value="${requestScope.quizID}">
            <footer  style="color:white;">           
                <input type="submit" value="Go back" > </a> 
            </footer>
        </form>
    </div>       
            <jsp:include page="../common-layout/footer.jsp"/>
</body>

</html>