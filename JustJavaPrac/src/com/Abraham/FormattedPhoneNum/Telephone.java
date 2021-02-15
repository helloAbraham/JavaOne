package com.Abraham.FormattedPhoneNum;

/**
 The Telephone class provides static methods
 for formatting and unformatting U.S. telephone numbers
 */

import java.util.*;

public class Telephone {

    //This constant fields hold the valid lengths of
    //strings that are formatted and unformatted

    public final static int FORMATTED_LENGTH = 13;
    public final static int UNFORMATTED_LENGTH = 10;

    /**
     The isFormatted method determines whether a string
     properly formatted as a U.S. telephone number in the following manner:
     (xxx)xxx-xxxx
     @param str The string to test
     @return true if the string is properly formatted,
     or false otherwise.
     */

    public static boolean isFormatted(String str)
    {
        boolean valid;  //flag to indicate valid format

        //determine whether str is properly formatted.
        if(str.length() == FORMATTED_LENGTH &&
                str.charAt(0) == '('
                && str.charAt(4) == ')'
                && str.charAt(8) == '-')
            valid = true;
        else
            valid = false;

        //It's time to return the value of the valid flag.

        return valid;
    }

    public static String unformat(String str)
    {
        //Create a StringBuilder initialized with str.
        StringBuilder strb = new StringBuilder(str);

        //If the argument is properly formatted, then unformat it.

        if (isFormatted(str))
        {
            //first, delete the left paren at position 0.
            strb.deleteCharAt(0);

            //Next, delete the right paren. Becuase of the previous deletion it is now loacted
            //position 3

            strb.deleteCharAt(3);

            //Next, delete the hyphen. Becuase of the prevous deletions it is now located at
            //position 6

            strb.deleteCharAt(6);
        }

        //it's time to return unformatted string which a user inputs (718)450-4150

        return strb.toString();

    }

    /**
     The format method formats a string as:
     (xxx)xxx-xxxx
     IF the length of the argment is UNFORMATTED_LENGTH the method return the formatted string.
     Oterhwiese, it return the orginal argument.
     @param str the string to format.
     @return  A string formatted as a U.S. telephone number.
     */

    public static String format(String str)
    {
        StringBuilder strb = new StringBuilder(str);

        if(str.length() == UNFORMATTED_LENGTH)
        {
            strb.insert(0, "(");
            strb.insert(4, ")");
            strb.insert(8, "-");
        }

        return strb.toString();
    }


}

