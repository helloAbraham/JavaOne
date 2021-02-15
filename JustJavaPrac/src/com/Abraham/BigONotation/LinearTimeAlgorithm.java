package com.Abraham.BigONotation;

/**
     This class example of
     After logarithmic time algorithms, we get the next fastest class: linear time algorithms.
    If we say something grows linearly, we mean that it grows directly proportional to the size of its inputs.
 */

public class LinearTimeAlgorithm {

    public static void main(String[] args) {

        //Think of simple look
        int n= 10;
        for (int i = 0; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }

    /*
    How many times does this for loop run? n times, of course! We don't know exactly
    how long it will take for this to run – and we don't worry about that.
    What we do know is that the simple algorithm presented above will grow linearly with the size of its input.
    We'd prefer a run time of 0.1n than (1000n + 1000), but both are still linear algorithms;
    they both grow directly in proportion to the size of their inputs.
    Again, if the algorithm was changed to the following:

    for (int i = 0; i < n; i++) {
    System.out.println("Hey - I'm busy looking at: " + i);
    System.out.println("Hmm.. Let's have another look at: " + i);
    System.out.println("And another: " + i);

    The runtime would still be linear in the size of its input, n.
    We denote linear algorithms as follows: O(n).
     */
}
