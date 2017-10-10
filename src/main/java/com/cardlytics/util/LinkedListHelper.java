/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.util;

public class LinkedListHelper {

    public static void checkValidInput(String value) {
        if(value.equals("i")) {
            System.out.println("As you have selected character i, please enter valid positive integer values to find the 5th element\n");
        } else if(value.equals("s")) {
            System.out.println("As you have selected character s, lease enter valid string values to find the 5th element\n");
        } else {
            System.out.println("Not a valid input");
            System.exit(0);
        }
    }

    /**
     * Check for valid integer
     * @param value
     */
    public static void checkValidInteger(String value, boolean forLength) {
        try {
            int i = Integer.parseInt(value);
            if(i<0 && forLength) {
                System.out.println("Valid positive integer value is not provided");
                System.exit(0);
            }

        } catch (Exception ex) {
            System.out.println("Valid integer value is not provided");
            System.out.println("Aborting the process");
            System.exit(0);
        }
    }
}