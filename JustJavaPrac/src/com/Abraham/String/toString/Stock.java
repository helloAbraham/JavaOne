package com.Abraham.String.toString;

/**
    This is the simple program- The Stock class holds data about a stock
    here we are going to use toString method
 */
public class Stock {
    private String symbol;
    private double sharePrice;

    /**
        Constructor
        @param symbol The stock's trading symbol
        @param sharePrice The stock's share price
     */

    public Stock(String symbol, double sharePrice) {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    @Override
    public String toString(){
        String str = "Trading symbol: " + symbol +
                    "\nShare Price $ " + sharePrice;

        return str;
    }

}
