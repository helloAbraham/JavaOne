package com.abraham.GenericTest;

public class Getpair<T, S> {

    private T first;
    private S second;

    public Getpair(){
    }
    public Getpair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

}
