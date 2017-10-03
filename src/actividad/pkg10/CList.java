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
public class CList <T>{
    CNode<T> pivot;
    CNode<T> pointer;
    int length;
    
    CList(){
        pivot = pointer = null;
        length = 0;
    }
    
    CList(T d){
        CNode<T> node = new CNode<>(d);
	pivot = node.next = node;
	length++;
    }
    
    public boolean isEmpty(){
        return length == 0;
    }
    
    public void insert(T d){
        CNode<T> node = new CNode<>(d);
        if (isEmpty()) {
            pivot = node.next = node;
        } else {
            node.next = pivot.next;
            pivot.next = node;
        }
        length++;
    }
    
    public void deleteNode(T d){
        if (!isEmpty()){
            pointer = pivot;
            for (int i = 1; i<= length; i++){
                if (pointer.data == d){
                    pointer.next = pointer.next.next;
                    if (pivot.data == d){
                        pivot = pointer;
                    }
                    length--;
                    pointer = null;
                    i = length + 1;
                }
                pointer = pointer.next;
            }
        }
    }
    
    public void deleteList(){
        pivot = pointer = null;
    }
}
