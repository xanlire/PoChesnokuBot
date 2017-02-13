/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
public class User {
    
    private String userId;
    private String userName;
    private double currentBalance;
    private double currentCash;

    public User(String name){
        this.userName = name;
        this.currentBalance = 0.0;
        this.currentCash = 0.0;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(double currentCash) {
        this.currentCash = currentCash;
    } 
    
    
    
}
