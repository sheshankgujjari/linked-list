/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics;

import com.cardlytics.implementation.LinkedList;
import com.cardlytics.interfaces.ILinkedList;
import com.cardlytics.util.Constants;
import com.cardlytics.util.LinkedListHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a character " + "'i'"   + " to proceed with integer values or character " + "'s'" +
                " to deal with string values in linked-list");

        ILinkedList linkedList = new LinkedList();
        try {

            String value = br.readLine();
            LinkedListHelper.checkValidInput(value);

            System.out.println("Enter the length/size of all the values you want to create a linked list: " );
            String lengthValue = br.readLine();

            LinkedListHelper.checkValidInteger(lengthValue, true);
            int length = Integer.parseInt(lengthValue);

            for(int i = 0; i < length; i++) {
                System.out.println("Please enter a value for element " +i +": ");
                if (value.equals(Constants.Integer)) {
                    String integerValue = br.readLine();
                    LinkedListHelper.checkValidInteger(integerValue, false);

                    linkedList.insertNewNode(Integer.parseInt(integerValue));

                } else if (value.equals(Constants.String)) {
                    String stringValue = br.readLine();
                    linkedList.insertNewNode(stringValue);
                }
            }
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }

        int size = linkedList.getSize();

        System.out.println("Size of the linkedList is : " + size);

        linkedList.getNthNodeFromLast(linkedList.getHeadNode(), Constants.Required, size);
    }


}

