package com.Abraham.Array.arrayUsingCollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsingCollectionFindLarge {
    public int getLargeElm(Integer[] a, int total){
        List<Integer> myList = Arrays.asList(a);
        Collections.sort(myList);
        int element = myList.get(total-1);
        return element;
    }
}
