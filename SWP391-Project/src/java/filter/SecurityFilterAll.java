/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import bean.User;
import bean.UrlPatternForRole;
import dao.UrlPatternDAO;
import dao.impl.UrlFilter;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import utils.UrlPatternUtils;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Viettech88.vn
 */
public class SecurityFilterAll implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter1");
        
        HttpServletRequest req = (HttpServletRequest) request;
	HttpServletResponse resp = (HttpServletResponse) response;

	String servletPath = req.getServletPath();   System.out.println(servletPath);
        HttpSession session = req.getSession();
        UrlPatternDAO urlCheck = new UrlFilter();
        try{
            
            User u = (User) session.getAttribute("user");
            System.out.println("ulatr");
            boolean checkUrlOf =false;
            if (u==null){
                
                ArrayList<UrlPatternForRole> arr = urlCheck.urlbyRole("6");
                for(UrlPatternForRole ur: arr) {
                    if(ur.getUrlPattern().equalsIgnoreCase(servletPath)){
                        checkUrlOf = true;
                    }
                }
               
             
                if (checkUrlOf==true){
                    chain.doFilter(request, response);
                    
                }
            }else{
                ArrayList<UrlPatternForRole> arr = urlCheck.urlbyRole(u.getRoleID());
                 for(UrlPatternForRole ur: arr) {
                    if(ur.getUrlPattern().equalsIgnoreCase(servletPath)){
                        checkUrlOf = true;
                    }
                }
                 if (checkUrlOf==true){
                    chain.doFilter(request, response);
                    
                }
            }
        }catch(Exception e){
            
        }
        
    }

    @Override
    public void destroy() {
       
    }
    
}
