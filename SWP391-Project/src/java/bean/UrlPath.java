/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Viettech88.vn
 */
public class UrlPath {
    String urlPath;
    String pageName;
    String pageDescription;

    public UrlPath() {
    }

    public UrlPath(String urlPath, String pageName, String pageDescription) {
        this.urlPath = urlPath;
        this.pageName = pageName;
        this.pageDescription = pageDescription;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription;
    }

    @Override
    public String toString() {
        return "UrlPath{" + "urlPath=" + urlPath + ", pageName=" + pageName + ", pageDescription=" + pageDescription + '}';
    }
    
}
