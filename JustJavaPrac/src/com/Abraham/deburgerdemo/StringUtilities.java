package com.Abraham.deburgerdemo;

/**
 Here this.sBuilder.append(c) actually will make the problem which
 we can talk about the debugging
 After debugging we can see this reference making the problem
 */
public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;
    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }

}
