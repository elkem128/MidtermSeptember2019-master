package datastructure;

import java.util.LinkedList;
import java.util.Queue;


public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(28);
        q.add(11);
        q.add(7);
        q.add(19);

        if(q.peek()==28){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
        ((LinkedList<Integer>) q).removeLast();

        System.out.println(q);
        q.poll();
        System.out.println(q);
    }

}
