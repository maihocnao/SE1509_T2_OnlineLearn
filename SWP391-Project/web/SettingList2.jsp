<%-- 
    Document   : SettingList2
    Created on : Oct 20, 2021, 12:39:09 PM
    Author     : Viettech88.vn
--%>
<%@page import="bean.UrlPath"%>
<%@page import="bean.Role"%>
<%@page import="bean.UrlPatternForRole"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <style>
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                text-decoration: none;
            }
            
            body {
                align-items: center;
                min-height: 100vh;
                background: #f6f6f6;
            }
            
            
          h2 {
                color: #fff;
               
                padding: 10px 20px;
                font-size: 20px;
                font-weight: 700;
                border-top-left-radius: 10px;
                border-top-right-radius: 10px;
                border-bottom-left-radius: 10px; 
                border-bottom-right-radius: 10px;
                margin: 10px;
                text-align: center;
            }
          table {
              width: 100%;
              border-collapse: collapse; 
              margin-bottom: 75px;
          }
          td,th {
              padding: 12px 15px;
              border: 1px solid #ddd;
              text-align: center;
              font-size: 16px;
          }
          th {
              background-color: #10a19a;
              color: #ffffff;
          }
          tbody tr:nth-child(even){
              background-color: #f5f5f5;
          }
          tr td:first-child {
              text-align: left;
          }
          tr td:first-child:hover {
              background: #10a19a;
          }
        </style>

    </head>
    <body>
        <%
            ArrayList<Role> arrRole= ( ArrayList<Role>) request.getAttribute("arrRole");
            ArrayList<UrlPath> arrURL= ( ArrayList<UrlPath>) request.getAttribute("arrURL");
            ArrayList<UrlPatternForRole> ur = (ArrayList<UrlPatternForRole>)request.getAttribute("arrURLrole");
            
        %>

       <header class="u-clearfix u-header u-palette-4-dark-1 u-header" id="sec-af13"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="200" data-image-height="200">
          <img src="images/da817cf6d1dc43f99b0dc8d48bcbeffb2.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 0.75rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Dashboard</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Blogs-List.html" target="_blank" style="padding: 10px;">Blogs List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Subjects List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Lessons List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Quizzes List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Users List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px;">Setting Lists</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Dashboard</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Blogs-List.html" target="_blank" style="padding: 10px;">Blogs List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Subjects List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Lessons List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Quizzes List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Users List</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px;">Setting Lists</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
       
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-2">
          <div class="menu-collapse" style="font-size: 0.75rem;">
            <a class="u-button-style u-nav-link" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-3"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Your-Profile.html">Your Profile</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Log-out.html">Log out</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-4"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Your-Profile.html">Your Profile</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Log-out.html">Log out</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
        <section class="listSetting">
            <h2>Admin Setting List</h2>
            <div class="box left">
               <table>
                   <thead>
                <tr>
                    <th>Pages</th>
                    <%
                        for(Role role: arrRole){
                            %>
                            <th><%= role.getRoleName() %></th>
                    <%    }
                    %>
                            <th>Details</th>
                </tr>
            </thead>
                   <tbody>
                <%ArrayList<String> ars = new ArrayList<String>();
                    for(UrlPath u: arrURL){
                %>
                       <tr>
                    
                    <td><%= u.getPageName() %></td>
                    <% 
                        ArrayList<String> arrays = new ArrayList<String>();
                        for(UrlPatternForRole aaaa: ur){
                            if (u.getUrlPath().equals(aaaa.getUrlPattern())){
                                arrays.add(String.valueOf(aaaa.getRoleID()));
                            }
                        }
                       System.out.println(arrays);
                        for(Role role: arrRole){
                           
                            
                            if(arrays.contains(role.getRoleID())){
                                %>
                                <td><input type="checkbox" checked>
                                 
                                </td>
                            <%}else{%>
                                  <td></td>

                            <%}%>
                          
                
                    <%    }
                        String str = u.getUrlPath().substring(1);
                    %>
                    <td><a href="SettingDetails?urlPath=<%= str %>">Details</a></td>
                    </tr>
                <%    }
                %>
                
            </tbody>
               </table>
            </div>
        </section>
         <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
