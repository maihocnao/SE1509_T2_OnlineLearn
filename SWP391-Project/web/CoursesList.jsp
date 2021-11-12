<%-- 
    Document   : SubjecList
    Created on : Oct 2, 2021, 8:46:41 AM
    Author     : ADMIN
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>List-Subject</title>
        
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
     <jsp:include page="header.jsp"></jsp:include>
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <h1 style="text-align: center; background: #2cccc4; color: white;">Browse Courses</h1>
           
            <br>
            <table style ="border: none; border-color:white" class="table table-bordered">
                <thead style="background-color: #5bc0de;color: white">
                    
                </thead>
                <tbody>
                    <c:forEach var="item" items="${listCourse}">
                        <tr>
                            <td  style="width:400px; height:370px;">
                                <img src="${item.thumbnail}" width="370" height="340" alt="blogThumnail"/>
                            </td>
                            <td colspan="2">
                                <h2>${item.name}</h2> <br>
                                ${item.description} <br>  <br>
                                  <a href="CourseDetailsController?subjectID=${item.subjectID}">  <input style="background-color: #2cccc4;border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block;font-size: 16px;" type="submit" value="GO TO COURSE" /> </a>
                                  <br>
                                  <br>
                                  <a href="CourseDetailsController?subjectID=${item.subjectID}">  <input style="background-color: #2cccc4;border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block;font-size: 16px;" type="submit" value="BUY COURSE" /> </a>
                            </td> 
                           
                            
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

<!--            <div class="pagination">
                <a href="#">&laquo;</a>
                <c:forEach var="item" items="${pageList}">
                    <a href="${pageContext.request.contextPath}/admin/list-user?role=${role}&gender=${gender}&status=${status}&pageIndex=${item}" class="${item == pageIndex ? 'active':''}">${item}</a>
                </c:forEach>
                <a href="#">&raquo;</a>
            </div>-->
        </section>
        <br>
        
    </body>
    <jsp:include page="footer.jsp"></jsp:include>
</html>
