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
public class Manager<T> {
    
    private List<T> container;

    public void initiailzeManager(){
        container = new ArrayList<>();
    }
    
    public List<T> getContainer(){
        return this.container;
    }
    
    public T getItem(int index){
        return container.get(index);
    }
            
    public void addToContainer(T value){
        container.add(value);
    } 
 
}
