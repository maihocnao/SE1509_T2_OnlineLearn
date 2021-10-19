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
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div style="display: flex; justify-content: flex-end">
                <a href="#" class="btn btn-info" style="font-size: 18px">Add New User</a>
            </div>
            <form class="container" action="../admin/list-user" method="POST">
                <div class="row">
                    <div class="col-sm">
                        User's Role
                    </div>
                    <div class="col-sm">
                        Gender
                    </div>
                    <div class="col-sm">
                        Status
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm">
                        <select name = "role">
                            <option >All</option>
                            <c:forEach var="item" items="${roles}">
                                <option value="${item.getRoleID()}" ${role == item.getRoleID() ? 'selected' :''}>${item.getRoleDescription()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col-sm">
                        <select name ="gender">
                            <option ${gender == "" ? 'selected' :''}>All</option>
                            <option value ="Male" ${gender == "Male" ? 'selected' :''}>Male</option>
                            <option value ="Female" ${gender == "Female" ? 'selected' :''}>Female</option>
                            <option value ="Other" ${gender == "" ? 'selected' :''}>Other</option>
                        </select>
                    </div>
                    <div class="col-sm">
                        <select name="status">
                            <option>All</option>
                            <option value = "Active">Active</option>
                            <option value ="Deactive">Deactive</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-info" style="margin-top: 10px; font-size: 18px;width: 83px">Filter</button>
            </form>
            <br>
            <table class="table table-bordered">
                <thead style="background-color: #5bc0de;color: white">
                    <tr>
                        <th>User</th>
                        <th>Email</th>
                        <th>Mobile</th>
                        <th>Gender</th>
                        <th>Role</th>
                        <th>Status</th>
                        <th>View/Edit</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${dataUser}">
                        <tr>
                            <td>${item.getFullname()}</td>
                            <td>${item.getEmail()}</td>
                            <td>${item.getPhone()}</td>
                            <td>${item.getGender()}</td>
                            <td>${item.getRole()}</td>
                            <td>${item.getStatus()}</td>
                            <td><a href="#">View</a> &nbsp;&nbsp; | &nbsp; &nbsp; <a href="#">Edit</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <div class="pagination">
                <a href="#">&laquo;</a>
                <c:forEach var="item" items="${pageList}">
                    <a href="${pageContext.request.contextPath}/adminview/list-user?role=${role}&gender=${gender}&status=${status}&pageIndex=${item}" class="${item == pageIndex ? 'active':''}">${item}</a>
                </c:forEach>
                <a href="#">&raquo;</a>
            </div>
        </section>
        <br>
        <jsp:include page="../common-layout/footer.jsp"/>
    </body>
</html>
