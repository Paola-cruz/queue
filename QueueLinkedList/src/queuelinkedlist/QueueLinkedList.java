/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lilian
 */
public class QueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Queue <String> queue = new LinkedList();
       queue.add("Adrian");
       queue.add("jesus");
       queue.add("Daniel");
       queue.add("Daniel");
       queue.add("Susana");
       queue.add("Chivo");
       queue.add("ray");
       queue.add("quique");
       
       queue.offer("francisco");
       queue.remove();
       System.out.println("Se elimino a : " +queue.remove());
       queue.element();
       queue.peek();
        System.out.println(queue.element());
        System.out.println("Se elimino el elemento:  " + queue.peek());
        System.out.println("contenido" + queue.toString());
    }
    
}
