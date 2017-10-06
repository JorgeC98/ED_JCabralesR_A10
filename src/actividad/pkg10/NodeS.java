/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg10;

/**
 *
 * @author JorgeRicardo
 */
 public class NodeS <T> {
    T data;
    NodeS next;
    
    NodeS(T d){
        this.data = d;
        this.next = null;
    }
    
    NodeS (){
        next = null;
    }
    
    public void print(){
        System.out.println(data+"->");
    }
    
    public void printS(){
        System.out.println(data);
        System.out.println("↓");
    }
}
