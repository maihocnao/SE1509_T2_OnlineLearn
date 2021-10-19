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
        <script src="https://cdn.ckeditor.com/ckeditor5/30.0.0/classic/ckeditor.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="2 Sign up">
        <meta property="og:type" content="website">
        <style>
            .ck-editor__editable {
                min-height: 400px;
                margin: 0;
            }
            .ck-editor__editable p{
                margin:  0;
            }
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
            .center{
                width: 80%;
                align-self: center;
                margin: auto;
            }
        </style> 
    </head>

    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div style="font-size: 25px">
                Lesson Detail
            </div>
            <form action="save" method="POST">
                <input type="hidden" name="id" value ="${data.getLessonID()}"/>
                <div class="col" style="width: 70%">
                    <div class="row mb-2" >
                        <div class="col-md-6"> 
                            <label>Name</label><br>
                            <input type="text" name="name" id="name" value="${data.getLessonName()}" style="width: 100%"onfocusout="checkMaxInput(50,'name', 'errorName','Name')"/>
                            <label id="errorName" style="color:red; font-size:20px;display: none"></label>
                        </div>
                        <div class="col-md-6">       
                            <label>Type</label><br>
                            <select class="col" style="width: 100%;height: 30px" name="type">
                                <option value="Youtube" ${data.getLessonType() == 'Youtube'? 'selected':''}>Youtube</option>
                                <option value="Quiz" ${data.getLessonType() == 'Quiz'? 'selected':''}>Quiz</option>
                                <option value="Lesson" ${data.getLessonType() == 'Lesson'? 'selected':''}>Lesson</option>
                            </select>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <div class="col-md-6">  
                            <label>SubjectID</label><br>
                            <select class="col" style="width: 100%;height: 30px">
                                <option>JAVAcore</option>
                                <option>ENG101</option>
                                <option>JPD123</option>
                                <option>Wed201c</option>
                            </select>
                        </div>

                    </div>
                    <div class="row mb-2">
                        <div class="col"> 
                            <label>Video Link</label><br>
                            <input type="text" name="link" value="${data.getYoutubeLink()}" style="width: 100%"/>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <div class="col"> 
                            <label>HTML Content</label><br>
                            <textarea name="content"  id="editor" onfocusout="checkMaxInputTextArea(50,'editor', 'errorContent', 'Content')">${data.getContent()}</textarea>
                        </div>
                        <label id="errorContent" style="color:red; font-size:20px;display: none"></label>
                    </div>
                    <div class="row mb-2">
                        <input class="btn btn-info" style="width: 20%;margin-left: 15px;font-size: 16px; color: white;" type="submit" value="Submit"/>
                    </div>
                </div>
            </form>
        </section>
        <br>
        <jsp:include page="../common-layout/footer.jsp"/>
        <script type="text/javascript">
            ClassicEditor
                    .create(document.querySelector('#editor'))
                    .catch(error => {
                        console.error(error);
                    });
            CKEDITOR.replace('editor2', {
                height: 260,
                /* Default CKEditor 4 styles are included as well to avoid copying default styles. */
                contentsCss: [
                    'http://cdn.ckeditor.com/4.16.2/full-all/contents.css',
                    'https://ckeditor.com/docs/ckeditor4/4.16.2/examples/assets/css/classic.css'
                ],
                removeButtons: 'PasteFromWord'
            });

            function checkMaxInput(maxLen, tagId, errorLabel, attributeName) {
                var tagVal = document.getElementById(tagId).value;
                if (tagVal.length > maxLen) {

                    document.getElementById(errorLabel).innerHTML = attributeName + " must be less than " + maxLen;
                    document.getElementById(errorLabel).style.display = 'block';
                } else {
                    document.getElementById(errorLabel).innerHTML = "";
                    document.getElementById(errorLabel).style.display = 'none';
                }
            }
             function checkMaxInputTextArea(maxLen, tagId, errorLabel, attributeName) {
                var tagVal = document.getElementById(tagId).innerHTML;
                alert(tagVal);
                if (tagVal.length > maxLen) {

                    document.getElementById(errorLabel).innerHTML = attributeName + " must be less than " + maxLen;
                    document.getElementById(errorLabel).style.display = 'block';
                } else {
                    document.getElementById(errorLabel).innerHTML = "";
                    document.getElementById(errorLabel).style.display = 'none';
                }
            }
        </script>
    </body>
</html>
