package com.Abraham.BigONotation;
/*n log n is the next class of algorithms.
 The running time grows in proportion to n log n of the input:
 */

public class NLogNTimeAlgorithms {

    public static void main(String[] args) {
        int n = 10;


        for (int i = 1; i<=n; i++){
            for(int j = 1; j < n; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
