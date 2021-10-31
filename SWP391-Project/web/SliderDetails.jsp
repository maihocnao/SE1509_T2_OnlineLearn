<%-- 
    Document   : SliderDetails
    Created on : Oct 13, 2021, 11:01:47 AM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Slider Detail</title>
    <link rel="stylesheet" href="css/Marketing_CSS.css" media="screen">
<link rel="stylesheet" href="css/22-SliderDetails.css" media="screen">
    <script class="u-script" type="text/javascript" src="js/Marketing_jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="js/Marketing_js.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.26.0, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "Marketing",
		"logo": "images/da817cf6d1dc43f99b0dc8d48bcbeffb.png",
		"sameAs": []
}</script>
    <meta name="theme-color" content="#1934fd">
    <meta property="og:title" content="22-SliderDetails">
    <meta property="og:type" content="website">
  </head>  
  <body class="u-body">
      <header>
      <jsp:include page="header.jsp"></jsp:include>
      </header>
   <img src="${slider.image}" alt="User Avatar">
            <table style ="border: none; border-color:white; width:100%; float: right;" class="table table-bordered">
                <tbody>
                    <tr>
                        <td>Full name</td>
                        <td> ${slider.title}</td>
                    </tr>
                    <tr>
                        <td>Back link</td>
                        <td> ${slider.backlink}</td>
                    </tr>
                    <tr>
                        <td>ID</td>
                        <td> ${slider.sliderID}</td>
                    </tr>
               
                </tbody>
            </table>
                    <footer>
         <jsp:include page="footer.jsp"></jsp:include>
  </footer>
    </body>
</html>
