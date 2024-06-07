package com.Abraham.UUIDgenerate;

import java.util.UUID;

public class MyUuidApp {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println("We randomly generate UUID is " + "\n" + uuidAsString );
        System.out.println();
        //Now let's convert from a String to a UUID

        /**
            Although it is rare, in some circumstances you might need
            convert from a string representation of an uuid.
         */

        UUID sameUuid = UUID.fromString(uuidAsString);
        assert sameUuid.equals(uuid);

        // System.out.println(sameUuid);
    }
}
