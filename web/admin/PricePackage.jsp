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
        <title>PricePackage</title>
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
                width: 65%;
                align-self: center;
                margin: auto;
            }
            form input,select{
                width: 100%;
                height: 36px;
                margin-bottom: 10px;
                border: 1px solid #d6d6d6;
                font-size: 20px;
            }
            form textArea{
                width: 100%;
                margin-bottom: 10px;
                border: 1px solid #d6d6d6;
                font-size: 20px;
            }
            form label{
                font-size: 20px;
            }
        </style> 
    </head>

    <body>
        <jsp:include page="../common-layout/header.jsp" />
        <br>
        <section class="u-clearfix u-section-1 center" id="sec-955d">
            <div class="center">
                <label style="font-size: 30px; width: 100%;margin: auto; text-align: center">Edit PricePackage</label>
                <form action="${pageContext.request.contextPath}/admin/pricepackage/save" method="POST">
                    <input type="hidden" name="id" value="${data.getPricePackageID()}">
                    <label>PricePackage Name</label><br>
                    <input id='name' type="text" name="name" value="${data.getPPname()}" onfocusout="checkMaxInput(20,'name','errorName', 'Price Package Name')"/>
                    <label id="errorName" style="color:red; font-size:20px;display: none"></label>
                    <br>
                    <label>Duration</label><br>
                    <input type="number" name="duration" value="${data.getAccessDuration()}" min="1" required/>
                    <label>Stattus(read only)</label><br>
                    <select name="status" >
                        <option value="Active" ${data.getStatus() == 'Active' ? 'selected' :''}>Active</option>
                        <option value="Deactive" ${data.getStatus() == 'Deactive' ? 'selected' :''}>Deactive</option>
                    </select>
                    <label>List Price</label><br>
                    <input type="text" name="listPrice" id="priceList" value="${data.getListPrice()}" required min="1" onfocusout="checkFloat(100000000,'priceList', 'priceListError', 'List Price')"/>
                     <label id="priceListError" style="color:red; font-size:20px;display: none"></label>
                    <label>Sale Price</label><br>
                    <input type="text" name="salePrice"  id="salePrice" value="${data.getSalePrice()}" required min="1" onfocusout="checkFloat(100000000,'salePrice', 'priceSaleError', 'Sale Price')"/>
                     <label id="priceSaleError" style="color:red; font-size:20px;display: none"></label>
                    <label>Description</label><br>
                    <textarea rows="4" cols="50" name="description" >${data.getDescription()}</textarea>
                    <br>
                    <input class="btn btn-info" style="font-size: 20px; color: white; height: 45px" type="submit" value="Submit"/>
                </form>
                <br>
            </div>
        </section>
        <br>
        <jsp:include page="../common-layout/footer.jsp"/>
        <script>
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
            function checkFloat(checkVal, tagName, errorLabel, attributeName) {
                var val = document.getElementById(tagName);
                var floatVal =  parseFloat(val.value);
                if (floatVal > checkVal) {
                    document.getElementById(errorLabel).innerHTML = attributeName + " must be less than " + checkVal;
                    document.getElementById(errorLabel).style.display = 'block';
                } else {
                    document.getElementById(errorLabel).innerHTML = "";
                    document.getElementById(errorLabel).style.display = 'none';
                }
            }
        </script>
    </body>
</html>
