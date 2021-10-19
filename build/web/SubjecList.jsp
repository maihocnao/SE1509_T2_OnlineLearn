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
     
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div style="display: flex; justify-content: flex-end">
                <a href="#" class="btn btn-info" style="font-size: 18px">Add New User</a>
            </div>
          
            <br>
            <table class="table table-bordered">
                <thead style="background-color: #5bc0de;color: white">
                    <tr>
                        <th>SubjectID</th>
                        <th>Subject Name</th>
                        <th>Category</th>
                        <th>Thumbnails</th>
                        <th>Description</th>
                        <th>Status</th>
                        <th>Featured</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${listsubject}">
                        <tr>
                            <td>${item.getSubjectID()}</td>
                            <td>${item.getName()}</td>
                            <td>${item.getCategoryID()}</td>
                            <td>${item.getThumbnail()}</td>
                            <td>${item.getDescription()}</td>
                            <td>${item.getStatus()}</td>
                            <td>${item.getFeatured()}</td>
                            <td><a href="#">View</a> &nbsp;&nbsp; | &nbsp; &nbsp; <a href="#">Edit</a></td>
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
</html>
