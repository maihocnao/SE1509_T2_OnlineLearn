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
            .table {
                width: 70%;
                margin:  0 auto;
            }
            th,td{
                width: 50%;
            }
            .table td{
                margin: 15px 5px;
            }
            .table input {
                border: none;
                padding: 10px 5px;
                font-size: 19px;
            }
            .table input:focus{
                outline: none;
            }
            .table .left-side{
                background-color: #ededed;
                vertical-align: middle;
                font-size: 19px
            }
        </style> 
    </head>

    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div class="container">
                <div style="text-align: center; font-size: 40px;margin-top: -20px">
                    Add New Subject
                </div>
                <br>
                <form action="add" method="post" enctype="multipart/form-data">
                    <c:if test = "${ERROR  == '-1' || ERROR == '0'}">
                        <div style= "margin-left: 138px;">
                            <c:if test = "${ERROR == '0'}">
                                <label style="color: green; font-size: 30px">Create Success !</label>
                            </c:if>
                            <c:if test = "${ERROR == '-1'}">
                                <label style="color: red; font-size: 30px">Create fail !</label>
                            </c:if>
                        </div>
                    </c:if>
                    <table class="table table-bordered">
                        <thead style="background-color: #2cccc4">
                            <tr>
                                <th>Attributes</th>
                                <th>Information</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="left-side">Subject Code</td>
                                <td><input autofocus style="width: 100%; height: 100%" type="text" name="subjectCode" placeholder="enter subjbect code..." required />
                                    <c:if test = "${ERROR  == '1'}">
                                        <label style="color: red;font-size: 20px">SubjectID existed, Please enter again</label></td>
                                    </c:if>
                            </tr>
                            <tr>
                                <td class="left-side">Name</td>
                                <td><input type="text" required name="subjectName" placeholder="enter subjbect name..." value="${subjectName}"/></td>
                            </tr>
                            <tr>
                                <td class="left-side">Thumbnail Image</td>
                                <td><input type="file" required onchange="readURL(this);" id="thumbnailImage" name="thumbnailImage" accept="image/*" onchange="validateFileType()"/>
                                    <img style="visibility: hidden" id="blah" src="#" alt="your image" />
                                </td>
                            </tr>
                            <tr>
                                <td class="left-side">Category</td>
                                <td><select name="category" style="width: 80%;font-size: 18px">
                                        <c:forEach var="item" items="${categories}">
                                            <option value="${item.getCategoryID()}" ${category == item.getCategoryID() ? 'selected' : ''}>${item.getCategoryName()}</option>
                                        </c:forEach>
                                    </select></td>
                            </tr>
                            <tr>
                                <td class="left-side">Featured Flag</td>
                                <td><input type="text" name="featuredFlg" value="${featuredFlg}" placeholder="enter featured flag..."/></td>
                            </tr>
                            <tr>
                                <td class="left-side">Owner</td>
                                <td><input type="text" required name="owner" value="${featuredFlg}" placeholder="enter owner..."/></td>
                            </tr>
                            <tr>
                                <td class="left-side">Status</td>
                                <td><div class="row">
                                        <div class="col">
                                            <input type="radio" name="status" checked value="active" ${status == 'active' ? 'checked' : ''}/> &nbsp;Active
                                        </div>
                                        <div class="col">
                                            <input type="radio" name="status" value="deactive" ${status == 'deactive' ? 'checked' : ''}/>&nbsp;Inactive
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td  class="left-side">Description</td>
                                <td><input type="text" required placeholder="enter description..." name ="description"/></td>
                            </tr>
                        </tbody>
                    </table>
                    <div style="text-align: center;margin-top: 15px">
                        <input class="btn btn-info" style="font-size: 16px; color: white;border-radius: 30px;width: 90px" type="submit" value="Save"/>
                        &nbsp; &nbsp; &nbsp;
                        <input class="btn" style="background-color: #bdbcbb;font-size: 16px; color: black;border-radius: 30px;width: 90px" type="submit" value="Cancel"/>
                    </div>
                </form>
            </div>
        </section>
        <br>
        <jsp:include page="../common-layout/footer.jsp"/>
        <script type="text/javascript">
            function validateFileType() {
                var fileName = document.getElementById("thumbnailImage").value;
                var idxDot = fileName.lastIndexOf(".") + 1;
                var extFile = fileName.substr(idxDot, fileName.length).toLowerCase();
                if (extFile === "jpg" || extFile === "jpeg" || extFile === "png") {
                    //TO DO
                } else {
                    alert("Only jpg/jpeg and png files are allowed!");
                    document.getElementById("thumbnailImage").value = "";
                }
            }
            function readURL(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        $('#blah')
                                .attr('src', e.target.result)
                                .width(150)
                                .height(200);
                    };

                    reader.readAsDataURL(input.files[0]);
                }
                document.getElementById("blah").style.visibility ='visible';
            }
        </script>
    </body>
</html>
