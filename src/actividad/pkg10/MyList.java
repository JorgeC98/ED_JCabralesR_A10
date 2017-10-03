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
public class MyList <T> {
    Node first;
    Node last;
    Node pointer;
    int length;
    
    //Builder
    MyList(){
        first = null;
        last = null;
        pointer = null;
        length = 0;
    }
    
    MyList(T d){
        Node node = new Node (d);
        first = node;
        last = node;
        node.next = null;
        length++;
    }
    
    public boolean isEmpty(){
        return first==null;
    /*    if(first==null){
            return true;
        }else{
            return false;
        }*/
    }
    
    public void insertFirst (T d){
        Node node = new Node (d);
        if(isEmpty()){ //Caso Lista vacia
            first = node;
            last = node;
            node.next = null;
    }else{ //Caso:lista con elementos
            node.next = first;
            first = node;
        }
        length++;
    }
    
    public void insertLast(T d){
        Node node = new Node (d);
        if(isEmpty()){ //Caso: Lista vacia
            first = node;
            last = node;
            node.next = null;
        }else{ //Caso:lista con elementos
            last.next = node;
            last = node;
        }
        length++;
    }
    
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next == null){ //si la lista solo tiene un elemento
            //if(first == last){
                first = null;
                last = null;
            }else{ //si la lista tiene mas de un elemento
                first = first.next;
            }
            length--;
        }
    }
    
    public void deleteLast(){
        if(!isEmpty()){
            if(first == last){ //si la lista solo tiene un elemento
            //if(first.next == null){
                first = last = null;
            }else{ //buscar last
                pointer  = first;
                while(pointer.next!=last){
                    pointer = pointer.next;
                }
                last = pointer;
                last.next = pointer = null;
            }
            length--;
        }
    }
    
    //Eliminar nodo
    public boolean deleteNode(T n){
        Node p=fetchBack(n);
        if (p!=null){//Si encuentra el elemento
            if(p.data==n){//Si es el primero o el unico elemento de la lista
                deleteFirst();
            }else{//Si esta dentro de la lista
                p.next=p.next.next;
                length--;
            }
            return true;
        }
        return false;
    }
    
    public Node fetch(T n){
        //Si no esta vacia la lista
        if(!isEmpty()){
            if(first==last){//Si hay un solo elemento en la lista y es el elemento que busco
                if(first.data==n)
                    return first;
            }else{
                pointer=first;
            }
        }
        return null;
    }
    
    public Node fetchBack (T n){
        pointer=first;
        if(!isEmpty()){
            if(first==last){//Si hay un solo elemento
                if(first. data==n){//Es el elemento que busco?
                    return first;//Se devuelve a si mismo
                }else{
                    return null;
                }
            }else{//si hay mas elementos en la lista
                if(first.data==n){
                    return first;
                }else{
                    pointer=first;
                    while(pointer.next!=null){
                        if(pointer.next.data==n){
                            return pointer;
                        }
                        pointer=pointer.next;
                    }
                }
            }
        }
        return null;
    }
    
    public void showList(){
        pointer=first;
        System.out.print("¨first->");
        for(int i=0; i<length; i++){
            System.out.print("["+pointer.data.toString()+"]->");
            pointer = pointer.next;
        }
        System.out.println("null");
    }
    
}
