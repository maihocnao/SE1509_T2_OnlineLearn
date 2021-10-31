<%-- 
    Document   : SubjectLesson
    Created on : Oct 14, 2021, 7:44:18 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Subject Lessons">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Subject Lesson</title>
        <link rel="stylesheet" href="css/Expert_CSS.css" media="screen">
        <link rel="stylesheet" href="css/28_Subject-Lesson.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/Expert_jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/Expert_JS.js" defer=""></script>
        <meta name="generator" content="Nicepage 3.26.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">


        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "Expert",
            "logo": "images/da817cf6d1dc43f99b0dc8d48bcbeffb.png",
            "sameAs": []
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="28_Subject Lesson">
        <meta property="og:type" content="website">
    </head>
    <body class="u-body">
        <jsp:include page="header.jsp"></jsp:include>
            <section class="u-clearfix u-section-1" id="sec-48eb">
                <div class="u-clearfix u-sheet u-sheet-1">
                    <h2 class="u-subtitle u-text u-text-default u-text-1">Subject Lessons</h2>
                    <p class="u-large-text u-text u-text-variant u-text-2">Subject Name: Software Testing</p>
                    <div class="u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-form u-form-1">
                        <form action="#" method="POST" class="u-clearfix u-form-spacing-7 u-form-vertical u-inner-form" source="custom" name="form" style="padding: 10px;">
                            <div class="u-form-group u-form-partition-factor-3 u-form-select u-form-group-1">
                                <label for="select-9c79" class="u-label">Sort by lesson group</label>
                                <div class="u-form-select-wrapper">
                                    <select id="select-9c79" name="select" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                                        <option value="All">All</option>
                                    <c:forEach var = "s" items ="${sublist}">
                                        <option value ="${s.subjectID}">{s.name}></option>                
                                    </c:forEach>
                                </select>
                                <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                            </div>
                        </div>
                        <div class="u-form-group u-form-partition-factor-3 u-form-select u-form-group-2">
                            <label for="select-d5b8" class="u-label">Status</label>
                            <div class="u-form-select-wrapper">
                                <select id="select-d5b8" name="select-1" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                                    <option value="Active">Active</option>
                                    <option value="Inactive">Inactive</option>
                                </select>
                                <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret"><path fill="currentColor" d="M4 8L0 4h8z"></path></svg>
                            </div>
                        </div>
                        <div class="u-form-group u-form-partition-factor-3 u-form-group-3">
                            <label for="text-ed1f" class="u-form-control-hidden u-label"></label>
                            <input type="text" placeholder="Type Lesson name to search" id="text-ed1f" name="text" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white">
                        </div>
                        <div class="u-align-right u-form-group u-form-submit">
                            <a href="#" class="u-border-none u-btn u-btn-submit u-button-style u-white u-btn-1">Submit</a>
                            <input type="submit" value="submit" class="u-form-control-hidden">
                        </div>
                        <div class="u-form-send-message u-form-send-success"> Thank you! Your message has been sent. </div>
                        <div class="u-form-send-error u-form-send-message"> Unable to send your message. Please fix errors then try again. </div>
                        <input type="hidden" value="" name="recaptchaResponse">
                    </form>
                </div>
                <div class="u-expanded-width-lg u-expanded-width-md u-expanded-width-sm u-expanded-width-xl u-table u-table-responsive u-table-1">
                    <table class="u-table-entity">
                        <colgroup>
                            <col width="7.5%">
                            <col width="19.3%">
                            <col width="5.4%">
                            <col width="17.9%">
                            <col width="24.3%">
                            <col width="25.6%">
                        </colgroup>
                        <thead class="u-palette-4-base u-table-header u-table-header-1">
                            <tr style="height: 47px;">
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">ID</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">Lesson</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">Order</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">Type</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">Status</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">SubjectID</th>
                                <th class="u-border-1 u-border-palette-4-base u-table-cell">Action</th>
                            </tr>
                        </thead>
                        <tbody class="u-table-body">
                            <c:forEach var="item" items="${lesson}">
                                <tr>
                                    <td>${item.getLessonID()}</td>
                                    <td>${item.getLessonName()}</td>
                                    <td><img src="${item.getYoutubeLink()}" width="120" height="80" alt="anh Blog"/></td>
                                    <td>${item.getLessonType()}</td>
                                    <td>${item.getStatus()}</td>
                                    
                                    <td><a href="#">View</a> &nbsp;&nbsp; | &nbsp; &nbsp; <a href="#">Edit</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section>



    </body>
        <jsp:include page="footer.jsp"></jsp:include>
</html>
