<%-- 
    Document   : contact
    Created on : Sept 22, 2021, 4:29:39 PM
    Author     : Mai Nguyen
--%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Post 1 Headline, Post 2 Headline, About Us, Course">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Homepage</title>
    <link rel="stylesheet" href="nicepage.css" media="screen">
<link rel="stylesheet" href="7-Homepage.css" media="screen">
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
    <meta property="og:title" content="7 Homepage">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body">
      <jsp:include page="header.jsp"></jsp:include>
      
      
       <%-- Slider--%>
    <section class="u-align-center u-clearfix u-section-1" id="sec-de65">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h1 class="u-text u-text-1">Popular posts</h1>
        
       <%-- start--%>
        <div class="pointer-event u-carousel u-expanded-width-xs u-gallery u-layout-carousel u-lightbox u-no-transition u-show-text-always u-gallery-1" id="carousel-e131" data-interval="5000" data-u-ride="carousel">
          <div class="u-carousel-inner u-gallery-inner" role="listbox">
              <%--loop start here--%>
              <c:forEach items="${listSlider}" var="slider">
                  <c:if test="${slider.sliderID==1}">
                   <div class="u-active u-carousel-item u-gallery-item u-carousel-item-1">
              <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                <img class="u-back-image u-expanded" src="images/64b9d9a44015348cd26b8a76ab4614cbf6204d06308b34582aca38f7e7a6852c004685b6de2d601953e74c2601ba06fd61e74d1445a7491fa4ba6a_1280.jpg">
              </div>
              <div class="u-over-slide u-over-slide-1">
                <h3 class="u-gallery-heading">Sample Title</h3>
                <p class="u-gallery-text">Sample Text</p>
              </div>
            </div>
                  </c:if>   
                  <c:if test="${slider.sliderID==2}">
                       <div class="u-carousel-item u-gallery-item u-carousel-item-2">
              <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                <img class="u-back-image u-expanded" src="images/f814e757e81643899e2471a8466fa2e9da3aa470d242dec7a15acaa67c3385291d4fb7dc4fd100dffc8b5d76059e11d27b9e8cf3c2ac4b281acd0e_1280.jpg">
              </div>
              <div class="u-over-slide u-over-slide-2">
                <h3 class="u-gallery-heading">Sample Title</h3>
                <p class="u-gallery-text">Sample Text</p>
              </div>
            </div>
                  </c:if>
                  <c:if test="${slider.sliderID==3}">
                       <div class="u-carousel-item u-gallery-item u-carousel-item-3" data-image-width="2836" data-image-height="1875">
              <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                <img class="u-back-image u-expanded" src="images/05a4691a6a8c25443fe1afa9d68b7179c22479d624700180d397afca4e2dd80884ac2697d045f256d4e1354076c4c38e9ca340e9004a5c9d6dcad5_1280.jpg">
              </div>
              <div class="u-over-slide u-over-slide-3">
                <h3 class="u-gallery-heading">Title 1</h3>
                <p class="u-gallery-text">Sample Text</p>
              </div>
              
            </div>
                  </c:if>
              </c:forEach>
          </div>
          <a class="u-absolute-vcenter u-carousel-control u-carousel-control-prev u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-carousel-control-1" href="#carousel-e131" role="button" data-u-slide="prev">
            <span aria-hidden="true">
              <svg viewBox="0 0 451.847 451.847"><path d="M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0
c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744
c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z"></path></svg>
            </span>
            <span class="sr-only">
              <svg viewBox="0 0 451.847 451.847"><path d="M97.141,225.92c0-8.095,3.091-16.192,9.259-22.366L300.689,9.27c12.359-12.359,32.397-12.359,44.751,0
c12.354,12.354,12.354,32.388,0,44.748L173.525,225.92l171.903,171.909c12.354,12.354,12.354,32.391,0,44.744
c-12.354,12.365-32.386,12.365-44.745,0l-194.29-194.281C100.226,242.115,97.141,234.018,97.141,225.92z"></path></svg>
            </span>
          </a>
          <a class="u-absolute-vcenter u-carousel-control u-carousel-control-next u-grey-70 u-icon-circle u-opacity u-opacity-70 u-spacing-10 u-text-white u-carousel-control-2" href="#carousel-e131" role="button" data-u-slide="next">
            <span aria-hidden="true">
              <svg viewBox="0 0 451.846 451.847"><path d="M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744
L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284
c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z"></path></svg>
            </span>
            <span class="sr-only">
              <svg viewBox="0 0 451.846 451.847"><path d="M345.441,248.292L151.154,442.573c-12.359,12.365-32.397,12.365-44.75,0c-12.354-12.354-12.354-32.391,0-44.744
L278.318,225.92L106.409,54.017c-12.354-12.359-12.354-32.394,0-44.748c12.354-12.359,32.391-12.359,44.75,0l194.287,194.284
c6.177,6.18,9.262,14.271,9.262,22.366C354.708,234.018,351.617,242.115,345.441,248.292z"></path></svg>
            </span>
          </a>
        </div>
            
            <%--end--%>
      </div>
    </section>
    
     <%-- Slider--%>
     
      <%--Post Blog Section start here--%>
    <section class="u-clearfix u-section-2" id="sec-a7d7">
      <div class="u-clearfix u-sheet u-sheet-1"><!--blog--><!--blog_options_json--><!--{"type":"Recent","source":"","tags":"","count":""}--><!--/blog_options_json-->
        <div class="u-blog u-expanded-width u-blog-1">
          <div class="u-repeater u-repeater-1"><!--blog_post-->
              
            
              <c:forEach items="${list2Post}" var="blog">

                  <c:if test="${blog.blogID==1}">
                      <div class="u-blog-post u-container-style u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-1"><!--blog_post_header-->
                <h2 class="u-blog-control u-text">
                  <a class="u-post-header-link" href="blog/post.html"><!--blog_post_header_content-->${blog.title}<!--/blog_post_header_content--></a>
                </h2><!--/blog_post_header-->
                <a class="u-post-header-link" href="blog/post.html"><!--blog_post_image-->
                  <img alt="" class="u-blog-control u-expanded-width u-image u-image-default u-image-1" src="${blog.thumbnail}"><!--/blog_post_image-->
                </a><!--blog_post_content-->
                <div class="u-blog-control u-post-content u-text u-text-2"><!--blog_post_content_content-->${blog.userID}<!--/blog_post_content_content--></div><!--/blog_post_content--><!--blog_post_metadata-->
                <div class="u-blog-control u-metadata u-metadata-1"><!--blog_post_metadata_date-->
                  <span class="u-meta-date u-meta-icon"><!--blog_post_metadata_date_content-->${blog.updatedDate}<!--/blog_post_metadata_date_content--></span><!--/blog_post_metadata_date-->
                </div><!--/blog_post_metadata--><!--blog_post_readmore-->
                <a href="blog/post.html" class="u-active-none u-blog-control u-border-2 u-border-palette-1-base u-btn u-btn-rectangle u-button-style u-hover-none u-none u-btn-1"><!--blog_post_readmore_content--><!--options_json--><!--{"content":""}--><!--/options_json-->Read More<!--/blog_post_readmore_content--></a><!--/blog_post_readmore-->
              </div>
            </div><!--/blog_post--><!--blog_post-->
                  </c:if>
            
            <c:if test="${blog.blogID==2}">
                
            <div class="u-blog-post u-container-style u-repeater-item">
              <div class="u-container-layout u-similar-container u-container-layout-2"><!--blog_post_header-->
                <h2 class="u-blog-control u-text">
                  <a class="u-post-header-link" href="blog/post-1.html"><!--blog_post_header_content-->${blog.title}<!--/blog_post_header_content--></a>
                </h2><!--/blog_post_header-->
                <a class="u-post-header-link" href="blog/post-1.html"><!--blog_post_image-->
                  <img alt="" class="u-blog-control u-expanded-width u-image u-image-default u-image-2" src="${blog.thumbnail}" data-image-width="1280" data-image-height="853"><!--/blog_post_image-->
                </a><!--blog_post_content-->
                <div class="u-blog-control u-post-content u-text u-text-4"><!--blog_post_content_content-->${blog.userID}<!--/blog_post_content_content--></div><!--/blog_post_content--><!--blog_post_metadata-->
                <div class="u-blog-control u-metadata u-metadata-2"><!--blog_post_metadata_date-->
                  <span class="u-meta-date u-meta-icon"><!--blog_post_metadata_date_content-->${blog.updatedDate}<!--/blog_post_metadata_date_content--></span><!--/blog_post_metadata_date-->
                </div><!--/blog_post_metadata--><!--blog_post_readmore-->
                <a href="blog/post-1.html" class="u-active-none u-blog-control u-border-2 u-border-palette-1-base u-btn u-btn-rectangle u-button-style u-hover-none u-none u-btn-2"><!--blog_post_readmore_content--><!--options_json--><!--{"content":""}--><!--/options_json-->Read More<!--/blog_post_readmore_content--></a><!--/blog_post_readmore-->
              </div>
            </div><!--/blog_post-->    
            </c:if>
              </c:forEach>  
          
          </div>
        </div><!--/blog-->
      </div>
    </section>
       <%-- Post Blog section end here --%>
         <%-- Subject start here --%>
    <section class="u-align-center u-clearfix u-section-3" id="sec-231c">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1">Featured Courses</h2>
        <p class="u-text u-text-2">Sample text. Click to select the text box. Click again or double click to start editing the text.</p>
        <div class="u-expanded-width u-gallery u-layout-grid u-lightbox u-show-text-on-hover u-gallery-1">
          <div class="u-gallery-inner u-gallery-inner-1">
              <%--start loop for subject here--%>
              <c:forEach items="${listSubject}" var="subject">
                  <c:if test="${subject.subjectID=='ASSL'}">
                        <div class="u-effect-fade u-gallery-item">
                          <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                            <img class="u-back-image u-expanded" src="${subject.thumbnail}">
                          </div>
                          <div class="u-over-slide u-shading u-over-slide-1">
                            <h3 class="u-gallery-heading">${subject.name}</h3>
                            <p class="u-gallery-text"></p>
                          </div>
                        </div>
                  </c:if>
                  <c:if test="${subject.subjectID=='ITE302c'}">
                        <div class="u-effect-fade u-gallery-item">
                          <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                            <img class="u-back-image u-expanded" src="${subject.thumbnail}">
                          </div>
                          <div class="u-over-slide u-shading u-over-slide-1">
                            <h3 class="u-gallery-heading">${subject.name}</h3>
                            <p class="u-gallery-text"></p>
                          </div>
                        </div>
                  </c:if>
                   <c:if test="${subject.subjectID=='SDE101'}">
                        <div class="u-effect-fade u-gallery-item">
                            <div class="u-back-slide" data-image-width="1280" data-image-height="853">
                             <img class="u-back-image u-expanded" src="${subject.thumbnail}">
                         </div>
                        <div class="u-over-slide u-shading u-over-slide-3">
                        <h3 class="u-gallery-heading">${subject.name}</h3>
                         <p class="u-gallery-text"></p>
                        </div>
                        </div>
                  </c:if>
                  <c:if test="${subject.subjectID=='SSL'}">
                      <div class="u-effect-fade u-gallery-item">
              <div class="u-back-slide" data-image-width="1280" data-image-height="960">
                <img class="u-back-image u-expanded" src="${subject.thumbnail}">
              </div>
              <div class="u-over-slide u-shading u-over-slide-4">
                <h3 class="u-gallery-heading">${subject.name}</h3>
                <p class="u-gallery-text"></p>
              </div>
            </div>
                  </c:if>
                  <c:if test="${subject.subjectID=='SWE201'}">
                      <div class="u-effect-fade u-gallery-item">
              <div class="u-back-slide" data-image-width="150" data-image-height="100">
                <img class="u-back-image u-expanded" src="${subject.thumbnail}">
              </div>
              <div class="u-over-slide u-shading u-over-slide-5">
                <h3 class="u-gallery-heading">${subject.name}</h3>
                <p class="u-gallery-text"></p>
              </div>
            </div>
                  </c:if>
                  <c:if test="${subject.subjectID=='WED102'}">
                      <div class="u-effect-fade u-gallery-item">
              <div class="u-back-slide" data-image-width="1280" data-image-height="830">
                <img class="u-back-image u-expanded" src="${subject.thumbnail}">
              </div>
              <div class="u-over-slide u-shading u-over-slide-6">
                <h3 class="u-gallery-heading">${subject.name}</h3>
                <p class="u-gallery-text"></p>
              </div>
            </div>
                  </c:if>
           
              </c:forEach>
                
             
            
            
            
            
           
            <%--start loop for subject here--%>
          </div>
        </div>
      </div>
    </section>
      <%--subject end here--%>
    
    
    
    
    
    
    <jsp:include page="footer.jsp"></jsp:include>
   
  </body>
</html>