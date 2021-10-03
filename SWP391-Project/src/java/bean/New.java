/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
public class New {
    Subject subject ; 
    PricePackage pricePackage ; 
    User user ; 
    Registration registration; 

    public New() {
    }
    
    public New(Subject subject, PricePackage pricePackage, User user, Registration registration) {
        this.subject = subject;
        this.pricePackage = pricePackage;
        this.user = user;
        this.registration = registration;
    }

   

    public Subject getSubject() {
        return subject;
    }

    public PricePackage getPricePackage() {
        return pricePackage;
    }

    public User getUser() {
        return user;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setPricePackage(PricePackage pricePackage) {
        this.pricePackage = pricePackage;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "New{" + "subject=" + subject + ", pricePackage=" + pricePackage + ", user=" + user + ", registration=" + registration + '}';
    }
    
    
    
}
