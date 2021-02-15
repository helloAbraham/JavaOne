package com.Abraham.BigONotation;
// Consider this simple piece of code:
public class ConstantTime {

    public static void main(String[] args) {
        int n = 1000;
        System.out.println("Hey - your input is: " + n);

      /*
        Clearly, it doesn't matter what n is, above.
        This piece of code takes a constant amount of time to run.
        It's not dependent on the size of n.
       */

       // Similarly

        int number = 1000;
        System.out.println("Hey - your input is: " + number);
        System.out.println("Hmm.. I'm doing more stuff with: " + number);
        System.out.println("And more: " + number);

        /*
            The above example is also constant time.
            Even if it takes 3 times as long to run,
            it doesn't depend on the size of the input, number.
            We denote constant time algorithms as follows: O(1).
            Note that O(2), O(3) or even O(1000) would mean the same thing.
         */

        //We don't care about exactly how long it takes to run, only that it takes constant time.
    }
}
