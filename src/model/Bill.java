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
public class Bill {
    
    private String billId;
    private User creator;
//    private ArrayList<User> users;
    private double cash;
    private double receipt;
    
    public Bill(User user, String billId){
        
        this.billId = billId;
        this.creator = user;
//        this.users = new ArrayList<User>();
//        this.users.add(user);
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

//    public <any> getUsers() {
//        return users;
//    }
//
//    public void setUsers(<any> users) {
//        this.users = users;
//    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getReceipt() {
        return receipt;
    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }
    
    public void addUser(User user){
        
//        this.users.add(user);
    }    

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
    
    
    
}
