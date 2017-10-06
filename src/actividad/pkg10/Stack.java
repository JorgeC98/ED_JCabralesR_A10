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
public class Stack <T> {
    private NodeS<T> top;
    private int size;
    
    Stack(){
        top = null;
        size = 0;
    }
    
    Stack(T d){
        NodeS<T> node = new NodeS<>(d);
        top = node;
        size = 1;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push(T d){
        NodeS<T> node = new NodeS<>(d);
        node.next = top;
        top = node;
        size++;
    }
    
    public T pop(){
        T d;
        if (!isEmpty()){
            d = top.data;
            top = top.next;
            size--;
        } else {
            d = null;
        }
        return d;
    }
    
    public T getTop(){
        if (!isEmpty()){
            return top.data;
        } else {
            return null;
        }
    }
    
    public void showStack(){
        NodeS<T> t = top;
        while (t != null) {
            t.printS();
            t = t.next;
        }
        System.out.println("Null");
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    
    
    

    
}
