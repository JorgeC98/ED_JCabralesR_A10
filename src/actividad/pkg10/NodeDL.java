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
public class NodeDL <T> {
    T data;
    NodeDL next;
    NodeDL back;
    
    NodeDL(T d){
        data = d;
        next = null;
        back = null;
    }
    
    
}