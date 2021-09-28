<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Start Now, Start Now, Start Now, Start Now, Login">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>1 Login</title>
    <link rel="stylesheet" href="static/css/nicepage.css" media="screen">
<link rel="stylesheet" href="static/css/1-Login.css" media="screen">
    <script class="u-script" type="text/javascript" src="static/js/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="static/js/nicepage.js" defer=""></script>
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
    <meta property="og:title" content="1 Login">
    <meta property="og:type" content="website">
  </head>
  
  
  
  <body class="u-body">
      
      <jsp:include page="common-layout/header.jsp"></jsp:include>
      
    <section class="u-align-center u-clearfix u-grey-5 u-section-1" id="sec-c6eb">
      <div class="u-clearfix u-expanded-width u-layout-wrap u-layout-wrap-1">
        <div class="u-layout">
          <div class="u-layout-row">
            <div class="u-align-left u-container-style u-image u-layout-cell u-size-31 u-image-1" data-image-width="1280" data-image-height="853">
                <img src="static/images/blog2.jpg" class="u-logo-image u-logo-image-1">
              <div class="u-container-layout u-container-layout-1"></div>
            </div>
            <div class="u-align-center-sm u-align-center-xs u-container-style u-layout-cell u-shape-rectangle u-size-29 u-white u-layout-cell-2">
              <div class="u-container-layout u-valign-middle u-container-layout-2">
                <h3 class="u-align-center-lg u-align-center-md u-align-center-xl u-text u-text-default u-text-1">Welcome</h3>
                <div class="u-image u-image-circle u-image-2" data-image-width="1280" data-image-height="853"></div>
                <div class="u-expanded-width-xs u-form u-login-control u-form-1">
                  <form action="loginservlet" method="POST" class="u-clearfix u-form-custom-backend u-form-spacing-15 u-form-vertical u-inner-form" source="custom" name="form-3" style="padding: 0px;">
                    <div class="u-form-group u-form-name">
                      <label for="username-5b0a" class="u-form-control-hidden u-label"></label>
                      <input type="text" placeholder="Enter your Email" id="username-5b0a" name="email" class="u-border-2 u-border-black u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
                    </div>
                    <div class="u-form-group u-form-password">
                      <label for="password-5b0a" class="u-form-control-hidden u-label"></label>
                      <input type="password" placeholder="Enter your Password" id="password-5b0a" name="password" class="u-border-2 u-border-black u-border-no-left u-border-no-right u-border-no-top u-input u-input-rectangle" required="">
                    </div>
                    <div class="u-form-checkbox u-form-group">
                      <input type="checkbox" id="checkbox-5b0a" name="remember" value="On">
                      <label for="checkbox-5b0a" class="u-label">Remember me</label>
                    </div>
                    <div class="u-align-center u-form-group u-form-submit">
                      <a href="#" class="u-active-palette-1-light-1 u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-1-light-1 u-palette-4-base u-radius-50 u-text-body-alt-color u-btn-1">Login</a>
                      <input type="submit" value="submit" class="u-form-control-hidden">
                    </div>
                    <input type="hidden" value="" name="recaptchaResponse">
                  </form>
                </div>
                <a href="#" class="u-border-1 u-border-active-palette-1-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-palette-1-base u-btn-2">Don't have an account?</a>
                <a href="#" class="u-border-1 u-border-active-palette-1-base u-border-hover-palette-1-base u-btn u-button-style u-login-control u-login-forgot-password u-none u-text-palette-1-base u-btn-3">Forgot password?</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
      <jsp:include page="common-layout/footer.jsp"></jsp:include>
  
  </body>
</html>