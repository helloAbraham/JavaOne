package com.Abraham.LinkedList.LinkedList0;

public class LinkedList0 {

    /**
         The Node class represents a list node
     */

    private class Node {
        String val;
        Node next;

        /**
            Constructor.
            @param val The element to store in this node.
            @param n   The reference to the next node.
         */

        Node(String val, Node n) {
            this.val = val;   // here I did when class filed same variable like val, @param val
            next = n;         //Here I did different way Node constructor field
        }

        /**
          Constructor.
          @param val The element to store in this node.
         */
        Node(String val) {
            this.val = val;
            next = null;
        }
    }

        //Reference to the first node in the list
        private Node first = null;

        /**
            Constructor.
            Builds a linked list
         */
    public LinkedList0()
    {
        //incrementally build the list
        //Abraham Mike Junior Soyeb
        first = new Node("Mike");
        first.next = new Node("Junior");
        first.next.next = new Node("Soyeb");
        first = new Node("Abraham", first);

        String [] names = {"Ammer", "Taub"};

        //use a loop to add all names in the array to the
        //front of the linked list to build the list
        //Ammer Taub Abraham Mike Junior Soyeb

        for (String str: names)
        {
           // System.out.println(str + ", "); //This is line of code print
            first = new Node(str, first);
        }
    }

    /**
     The print method traverses the list
     and prints all of its elements.
     */
    public void print()
    {
        Node ref = first;
        while (ref != null)
        {
            System.out.println(ref.val + " " );
            ref = ref.next;
        }
    }

    /**
         The main method creates the linked list
         and invoke its print method.
     */

    public static void main(String[] args) {
        LinkedList0 myll = new LinkedList0();
       // String str = "The contents of the list are: "; // Do not need double line
        //System.out.println(str);
        System.out.println("The contents of the list are: ");
        myll.print();
    }

}
