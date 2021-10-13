<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html style="font-size: 16px;">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>21 Slider List</title>
        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/common.css">
        <link rel="stylesheet" href="css/21-Slider-List.css" media="screen">
        <meta name="generator" content="Nicepage 3.25.0, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">








        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "",
            "logo": "images/da817cf6d1dc43f99b0dc8d48bcbeffb.png",
            "sameAs": []
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="21 Slider List">
        <meta property="og:type" content="website">
    </head>
    <body class="u-body">

        <!--=================END HEADER-->
        <!--================LIST SLIDER===================-->
        <jsp:useBean id= "StatusType" scope= "request" class= "dao.impl.StatusTypeDAOImpl"> </jsp:useBean>
                <!--=========== HEADER=============-->
        <jsp:include page="header.jsp"></jsp:include>  
        <div class="ml-10 mr-10" style =" margin-left:40px; margin-right: 40px;" >
            <!--=========== SEARCH SLIDER===========-->
            <div style =" margin-bottom: 15px; margin-top: 20px;" >
                <form action="searchslidercontroller" method="post">
                    <div>
                        <label>Search by  title</label>
                        <input type="text" placeholder="enter slide" name="txtNameSearch" value="${nameSearch}"> 
                    </div>
                    <div>
                        <label>Choose Status</label>
                        <select name="txtStatus">
                            <option value="0">All</option>
                            <c:forEach items="${StatusType.getAllType()}" var="type">
                                <option value="${type.id}" ${type.id eq statusTypeId ? "selected" : ""}>${type.status}</option>   
                            </c:forEach>
                        </select> 
                    </div>
                    <input type="submit" value="Submit" />
                </form>
                <a href="#">Add Slider</a>
            </div>
            <!--==========END SEARCH=======-->
            <div class="u-expanded-width u-table u-table-responsive u-table-1">
                <table class="u-table-entity">
                    <thead class="u-palette-4-base u-table-header u-table-header-1">
                        <tr style="height: 21px;">
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Slider</th>
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Title</th>
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Image</th>
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Backlink</th>
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Status</th>
                            <th class="u-border-1 u-border-palette-4-base u-table-cell">Hide Show Edit</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listSlider}" var="listslider" varStatus="loop">
                            <tr style="height: 75px;">
                                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-7">${loop.index +1}</td>
                                <td class="u-border-1 u-border-grey-30 u-table-cell">${listslider.title}</td>
                                <td class="u-border-1 u-border-grey-30 u-table-cell"><img src="${listslider.image}" alt="Avatar" style=" width: 100% ; height : 65px;"></td>
                                <td class="u-border-1 u-border-grey-30 u-table-cell">${listslider.backlink}</td>
                                <td class="u-border-1 u-border-grey-30 u-table-cell">${StatusType.getOneStatusTypeById(listslider.statusTypeId).status}</td>
                                <td class="u-border-1 u-border-grey-30 u-table-cell">
                                    <a href="PublicHomePage.jsp">Hide</a>
                                    <a href="PublicHomePage.jsp">Show</a>
                                    <a href="PublicHomePage.jsp">Edit</a>
                                </td>
                            </tr>
                        </c:forEach>
                        <c:if test="${notify ne null}">
                            <tr>
                                <td  style="text-align: center" colspan="6">
                                    <h5>${notify}</h5>
                                </td>
                            </tr>
                        </c:if>
                    </tbody>
                </table>
            </div>
        </div>

        <!--===================END SLIDER=================-->
        <!--=================PAGGING=================-->
        <c:if test="${maxPage > 1}">
            <div class="pagination-style">
                <c:choose>
                    <c:when test="${isSearch == 1}">
                        <div class="pagination mt-10 mb-10">
                            <c:if test="${backPage > 0}">
                                <a href="searchslidercontroller?pageIndex=${backPage}&txtNameSearch=${nameSearch}&txtStatus=${statusTypeId}">&laquo;</a>
                            </c:if>
                            <c:forEach begin="1" end="${maxPage}" step="1" var="i" >
                                <c:if test="${i == pageIndex}">
                                    <a class="active-true" href="searchslidercontroller?pageIndex=${i}&txtNameSearch=${nameSearch}&txtStatus=${statusTypeId}">${i}</a>
                                </c:if>
                                <c:if test="${i != pageIndex}">
                                    <a class="active-false" href="searchslidercontroller?pageIndex=${i}&txtNameSearch=${nameSearch}&txtStatus=${statusTypeId}" >${i}</a>
                                </c:if>
                            </c:forEach>                                         
                            <c:if test="${nextPage < maxPage+1}">
                                <a href="searchslidercontroller?pageIndex=${nextPage}&txtNameSearch=${nameSearch}&txtStatus=${statusTypeId}">&raquo;</a>
                            </c:if>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="pagination mt-10 mb-10">
                            <c:if test="${backPage > 0}">
                                <a href="sliderlistcontroller?pageIndex=${backPage}">&laquo;</a>
                            </c:if>
                            <c:forEach begin="1" end="${maxPage}" step="1" var="i" >
                                <c:if test="${i == pageIndex}">
                                    <a class="active-true" href="sliderlistcontroller?pageIndex=${i}" >${i}</a>
                                </c:if>
                                <c:if test="${i != pageIndex}">
                                    <a class="active-false" href="sliderlistcontroller?pageIndex=${i}" style="padding-right: 5px;" >${i} </a>
                                </c:if>
                            </c:forEach>                                         
                            <c:if test="${nextPage < maxPage+1}">
                                <a href="sliderlistcontroller?pageIndex=${nextPage}">&raquo;</a>
                            </c:if>
                        </div>
                    </c:otherwise>
                </c:choose>
            </div>
        </c:if>
        <!--===================END PAGGING================-->

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
