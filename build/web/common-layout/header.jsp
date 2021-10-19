<%-- 
    Document   : RegistUser
    Created on : Sep 23, 2021, 11:48:12 PM
    Author     : cyv2098
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <header class="u-clearfix u-header u-palette-4-dark-1 u-header" id="sec-af13"><div class="u-clearfix u-sheet u-sheet-1">
                <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="200" data-image-height="200">

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
    </body>
</html>
