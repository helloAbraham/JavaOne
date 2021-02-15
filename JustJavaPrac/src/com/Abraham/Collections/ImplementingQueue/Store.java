package com.Abraham.Collections.ImplementingQueue;

import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList();
        //First added few customers in the queue
        queue.add(new Customer("Abraham"));
        queue.add(new Customer("Parker"));
        queue.add(new Customer("Jenifer"));
        queue.add(new Customer("Frank"));
        queue.add(new Customer("Danny"));
        //It will print all the customer name as added order
        System.out.println(queue);

        //After using the method serveCustomer as queue
        //we can print and see First Customer here Abraham has been serve and
        //remaining customer will stay in the queue
        serveCustomer(queue);
        System.out.println(queue);


        //Again if we use 2nd Customer will serve and remaining will be in the queue
        serveCustomer(queue);
        System.out.println(queue);


    }

    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
}
