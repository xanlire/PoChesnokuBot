/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author HP
 */
public class Bills {
    
    private static List<Bill> bills = new ArrayList<Bill>();
        
    public static void createBill(User user){     
        bills.add(new Bill(user, generateUniqueId()));
    }    
    
    private static String generateUniqueId(){
        return Integer.toString(bills.size());
    }
    
    public static void connectToBill(User user){

        bills.get(bills.size() - 1).addUser(user);
    }
    
    public static void connectToBill(User user, String billId){
        
        for(Bill bill : bills){
            if(billId.equals(bill.getBillId())){
                bill.addUser(user);
            }
        }
    }
}
