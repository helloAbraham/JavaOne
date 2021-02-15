package com.abraham;

public class FinallyDemo {
    public static void main(String[] args) {
        FinallyExm fe = new FinallyExm();

        for(int i =0; i<3; i++){
            fe.generateExec(i);
            System.out.println();
        }
    }
}
