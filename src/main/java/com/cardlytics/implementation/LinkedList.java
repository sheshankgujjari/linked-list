/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.implementation;

import com.cardlytics.interfaces.ILinkedList;
import com.cardlytics.model.Node;

public class LinkedList implements ILinkedList {

    private int size;
    private Node head;

    public int getSize() {
        return size;
    }

    public Node getHeadNode() {
        return head;
    }

    /**
     * Get the nth node from the last
     * @param head
     * @param value
     * @param count
     */
    public void getNthNodeFromLast(Node head, int value, int count) {
        if (head == null || value < 1) {
            System.out.println("No items found");
            return;
        }
        if(count< value) {
            System.out.println("Total count is :" + count + ", Which is less than the requested node value :" + value);
            return;
        }
        Node pointer = head;

        for (int j = 0; j < value - 1; ++j) {
            if (pointer == null) {
                return;
            }
            pointer = pointer.next;
        }
        System.out.println(value +"th element from the last is :" + pointer.data);
    }

    /**
     * Insert new integer data
     * @param data
     */
    public void insertNewNode(Integer data) {
        insertNewNode(data.toString());
    }

    /**
     * Insert new string data
     * @param data
     */
    public void insertNewNode(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
}
