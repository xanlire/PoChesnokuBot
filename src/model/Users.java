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
public class Users{
    
    private static List<User> users = new ArrayList<User>();
    
    public static void createUserManager(String name){
        users.add(new User(name));
    }
    
    public static void addUser(User user){
        boolean findUserNotFlag = false;
        for(User userFromList : users){
            if(userFromList.getUserId().equals(user.getUserId())){
                return;  
            }                     
        }        
        
        if(findUserNotFlag){
            users.add(user);    
        }
    }
}
