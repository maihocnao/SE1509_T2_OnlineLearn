<%-- 
    Document   : 25-Subject-Detail-Dimension
    Created on : Oct 5, 2021, 8:33:00 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="bean.Category" %>
<!DOCTYPE html>
<%
    ArrayList<Category> clist = (ArrayList<Category>) request.getAttribute("clist");
%>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>25 Subject Detail Dimesion</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="25-Subject-Detail-Dimesion.css" media="screen">
    <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="nicepage.js" defer=""></script>
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
    <meta property="og:title" content="25 Subject Detail Dimesion">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body"><header class="u-clearfix u-header u-palette-4-dark-1 u-header" id="sec-af13"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="200" data-image-height="200">
          <img src="images/da817cf6d1dc43f99b0dc8d48bcbeffb.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 0.875rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Homepage.html" style="padding: 10px 20px;">Homepage</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="19-Dashboard.html" style="padding: 10px 20px;">Blogs</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">Browse Courses</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">About Us</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Homepage.html" style="padding: 10px 20px;">Homepage</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="19-Dashboard.html" style="padding: 10px 20px;">Blogs</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px 20px;">Browse Courses</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px 20px;">About Us</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-2">
          <div class="menu-collapse" style="font-size: 0.875rem;">
            <a class="u-button-style u-nav-link" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-3"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="1-Login.html">Login</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="2-Sign-up.html">Sign up</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-4"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="1-Login.html">Login</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="2-Sign-up.html">Sign up</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
        <form action="#" method="get" class="u-border-1 u-border-grey-30 u-search u-search-left u-white u-search-1">
          <button class="u-search-button" type="submit">
            <span class="u-search-icon u-spacing-10">
              <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 56.966 56.966"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-3429"></use></svg>
              <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-3429" x="0px" y="0px" viewBox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve" class="u-svg-content"><path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23  s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92  c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17  s-17-7.626-17-17S14.61,6,23.984,6z"></path></svg>
            </span>
          </button>
          <input class="u-search-input u-search-input-1" type="search" name="search" value="" placeholder="Search">
        </form>
      </div></header>
    <section class="u-align-center u-clearfix u-grey-15 u-section-1" id="sec-af53">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-expanded-width u-tabs u-tabs-1">
          <ul class="u-tab-list u-unstyled" role="tablist">
            <li class="u-tab-item" role="presentation">
              <a class="active u-active-white u-button-style u-tab-link u-tab-link-1" id="link-tab-0da5" href="#tab-0da5" role="tab" aria-controls="tab-0da5" aria-selected="true">Overview</a>
            </li>
            <li class="u-tab-item" role="presentation">
              <a class="u-active-white u-button-style u-tab-link u-tab-link-2" id="link-tab-14b7" href="#tab-14b7" role="tab" aria-controls="tab-14b7" aria-selected="false">Dimension</a>
            </li>
            <li class="u-tab-item" role="presentation">
              <a class="u-active-white u-button-style u-tab-link u-tab-link-3" id="link-tab-2917" href="#tab-2917" role="tab" aria-controls="tab-2917" aria-selected="false">Price Package</a>
            </li>
          </ul>
          <div class="u-tab-content">
            <div class="u-container-style u-tab-active u-tab-pane u-white u-tab-pane-1" id="tab-0da5" role="tabpanel" aria-labelledby="link-tab-0da5">
              <div class="u-container-layout u-container-layout-1"></div>
            </div>
            <div class="u-align-left u-container-style u-tab-pane u-white u-tab-pane-2" id="tab-14b7" role="tabpanel" aria-labelledby="link-tab-14b7">
              <div class="u-container-layout u-container-layout-2">
                <a href="https://nicepage.com/one-page-template" class="u-active-none u-border-2 u-border-active-palette-2-dark-1 u-border-hover-palette-2-base u-border-palette-1-base u-btn u-button-style u-hover-none u-none u-text-hover-palette-2-base u-text-palette-1-base u-btn-1">Add New&nbsp;</a>
                <a class="u-btn u-button-link u-button-style u-none u-text-palette-1-base u-btn-2" href="https://nicepage.com">Edit</a>
                <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-palette-1-base u-btn-3" href="https://nicepage.com">Delete</a>
                <a class="u-btn u-button-link u-button-style u-none u-text-palette-1-base u-btn-4" href="https://nicepage.com">Edit</a>
                <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-palette-1-base u-btn-5" href="https://nicepage.com">Delete</a>
                <a class="u-btn u-button-link u-button-style u-none u-text-palette-1-base u-btn-6" href="https://nicepage.com">Edit</a>
                <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-palette-1-base u-btn-7" href="https://nicepage.com">Delete</a>
                <a class="u-btn u-button-link u-button-style u-none u-text-palette-1-base u-btn-8" href="https://nicepage.com">Edit</a>
                <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-palette-1-base u-btn-9" href="https://nicepage.com">Delete</a>
              </div>
            </div>
            <div class="u-container-style u-tab-pane u-white u-tab-pane-3" id="tab-2917" role="tabpanel" aria-labelledby="link-tab-2917">
              <div class="u-container-layout u-container-layout-3">
                <h4 class="u-text u-text-default u-text-1">Be The First To Review This Product!</h4>
                <p class="u-text u-text-default u-text-2">Sample text. Click to select the text box. Click again or double click to start editing the text.</p>
                <a href="" class="u-btn u-button-style u-btn-10">write product review</a>
              </div>
            </div>
          </div>
        </div>
        <div class="u-expanded-width u-table u-table-responsive u-table-1">
          <table class="u-table-entity">
            <colgroup>
              <col width="9.2%">
              <col width="20.5%">
              <col width="44.7%">
              <col width="25.6%">
            </colgroup>
            <thead class="u-palette-4-base u-table-header u-table-header-1">
              <tr style="height: 21px;">
                <th class="u-border-1 u-border-palette-4-base u-table-cell"># </th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Type</th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Dimension</th>
                <th class="u-border-1 u-border-palette-4-base u-table-cell">Action&nbsp;</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
                <%for(Category c: clist){%>
              <tr style="height: 75px;">
                <td class="u-border-1 u-border-grey-30 u-first-column u-grey-5 u-table-cell u-table-cell-5"><%= c.getCategoryID() %></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= c.getType() %></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell"><%= c.getCategoryName() %></td>
                <td class="u-border-1 u-border-grey-30 u-table-cell u-table-cell-8"><a href="UpdateDimensionController?id=<%= c.getCategoryID() %>">Edit</a><br><a href="DeleteDimensionController?id=<%= c.getCategoryID() %>">Delete</a></td>
              </tr>
              <%}%>
            </tbody>
          </table>
        </div>
            <a href="26-Add-Dimension.jsp" class="u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-palette-4-base u-radius-6 u-btn-1">Add Dimension<span style="font-size: 1rem;">
            <span style="font-weight: 400;"></span>
          </span>
        </a>
      </div>
    </section>
    <section class="u-align-center u-clearfix u-section-2" id="sec-5b51">
      <div class="u-clearfix u-sheet u-sheet-1"></div>
    </section>
    
    
    
    
    
    
    
    <footer class="u-align-center-md u-align-center-sm u-align-center-xs u-clearfix u-footer u-grey-80" id="sec-459d"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="Homepage.html" data-page-id="854929311" class="u-border-2 u-border-palette-1-base u-image u-logo u-image-1" data-image-width="200" data-image-height="200" title="Homepage">
          <img src="images/da817cf6d1dc43f99b0dc8d48bcbeffb.png" class="u-logo-image u-logo-image-1">
        </a>
        <div class="u-align-left u-social-icons u-spacing-10 u-social-icons-1">
          <a class="u-social-url" title="facebook" target="_blank" href=""><span class="u-icon u-social-facebook u-social-icon u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-b0c0"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-b0c0"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M73.5,31.6h-9.1c-1.4,0-3.6,0.8-3.6,3.9v8.5h12.6L72,58.3H60.8v40.8H43.9V58.3h-8V43.9h8v-9.2
            c0-6.7,3.1-17,17-17h12.5v13.9H73.5z"></path></svg></span>
          </a>
          <a class="u-social-url" title="twitter" target="_blank" href=""><span class="u-icon u-social-icon u-social-twitter u-icon-2"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-1f09"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-1f09"><circle fill="currentColor" class="st0" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M83.8,47.3c0,0.6,0,1.2,0,1.7c0,17.7-13.5,38.2-38.2,38.2C38,87.2,31,85,25,81.2c1,0.1,2.1,0.2,3.2,0.2
            c6.3,0,12.1-2.1,16.7-5.7c-5.9-0.1-10.8-4-12.5-9.3c0.8,0.2,1.7,0.2,2.5,0.2c1.2,0,2.4-0.2,3.5-0.5c-6.1-1.2-10.8-6.7-10.8-13.1
            c0-0.1,0-0.1,0-0.2c1.8,1,3.9,1.6,6.1,1.7c-3.6-2.4-6-6.5-6-11.2c0-2.5,0.7-4.8,1.8-6.7c6.6,8.1,16.5,13.5,27.6,14
            c-0.2-1-0.3-2-0.3-3.1c0-7.4,6-13.4,13.4-13.4c3.9,0,7.3,1.6,9.8,4.2c3.1-0.6,5.9-1.7,8.5-3.3c-1,3.1-3.1,5.8-5.9,7.4
            c2.7-0.3,5.3-1,7.7-2.1C88.7,43,86.4,45.4,83.8,47.3z"></path></svg></span>
          </a>
          <a class="u-social-url" title="instagram" target="_blank" href=""><span class="u-icon u-social-icon u-social-instagram u-icon-3"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-d625"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-d625"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M55.9,38.2c-9.9,0-17.9,8-17.9,17.9C38,66,46,74,55.9,74c9.9,0,17.9-8,17.9-17.9C73.8,46.2,65.8,38.2,55.9,38.2
            z M55.9,66.4c-5.7,0-10.3-4.6-10.3-10.3c-0.1-5.7,4.6-10.3,10.3-10.3c5.7,0,10.3,4.6,10.3,10.3C66.2,61.8,61.6,66.4,55.9,66.4z"></path><path fill="#FFFFFF" d="M74.3,33.5c-2.3,0-4.2,1.9-4.2,4.2s1.9,4.2,4.2,4.2s4.2-1.9,4.2-4.2S76.6,33.5,74.3,33.5z"></path><path fill="#FFFFFF" d="M73.1,21.3H38.6c-9.7,0-17.5,7.9-17.5,17.5v34.5c0,9.7,7.9,17.6,17.5,17.6h34.5c9.7,0,17.5-7.9,17.5-17.5V38.8
            C90.6,29.1,82.7,21.3,73.1,21.3z M83,73.3c0,5.5-4.5,9.9-9.9,9.9H38.6c-5.5,0-9.9-4.5-9.9-9.9V38.8c0-5.5,4.5-9.9,9.9-9.9h34.5
            c5.5,0,9.9,4.5,9.9,9.9V73.3z"></path></svg></span>
          </a>
          <a class="u-social-url" title="linkedin" target="_blank" href=""><span class="u-icon u-social-icon u-social-linkedin u-icon-4"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 112 112" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-c818"></use></svg><svg class="u-svg-content" viewBox="0 0 112 112" x="0" y="0" id="svg-c818"><circle fill="currentColor" cx="56.1" cy="56.1" r="55"></circle><path fill="#FFFFFF" d="M41.3,83.7H27.9V43.4h13.4V83.7z M34.6,37.9L34.6,37.9c-4.6,0-7.5-3.1-7.5-7c0-4,3-7,7.6-7s7.4,3,7.5,7
            C42.2,34.8,39.2,37.9,34.6,37.9z M89.6,83.7H76.2V62.2c0-5.4-1.9-9.1-6.8-9.1c-3.7,0-5.9,2.5-6.9,4.9c-0.4,0.9-0.4,2.1-0.4,3.3v22.5
            H48.7c0,0,0.2-36.5,0-40.3h13.4v5.7c1.8-2.7,5-6.7,12.1-6.7c8.8,0,15.4,5.8,15.4,18.1V83.7z"></path></svg></span>
          </a>
        </div>
        <p class="u-align-center-lg u-align-center-md u-align-center-xl u-text u-text-1">A Product of TEAM2 </p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/website-templates" target="_blank">
        <span>Website Templates</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.com/" target="_blank">
        <span>Website Builder Software</span>
      </a>. 
    </section>
  </body>
</html>
