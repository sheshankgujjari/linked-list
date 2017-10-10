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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LinkedListTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public  void setUpStreams() {

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testGetSize() throws Exception {
        LinkedList linkedList = setup();
        assertEquals(6, linkedList.getSize());
    }

    @Test
    public void testGetSizeIfNoNodeAddedd() throws Exception {
        LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void testGetHeadNode() throws Exception {
        LinkedList linkedList = setup();
        assertEquals("98", linkedList.getHeadNode().data);
    }

    @Test
    public void testGetHeadNodeWhenNoNode() throws Exception {
        LinkedList linkedList = new LinkedList();
        assertEquals(null, linkedList.getHeadNode());
    }

    @Test
    public void testGet5thFromLast() throws Exception {
        LinkedList linkedList = setup();
        linkedList.getNthNodeFromLast(linkedList.getHeadNode(), 5, linkedList.getSize());
        String value = outContent.toString();
        assertTrue("5th element from the last is :4",
                value.contains("5th element from the last is :4"));
    }

    @Test
    public void testGet10thFromLast() throws Exception {
        LinkedList linkedList = setup();
        int count = linkedList.getSize();
        linkedList.getNthNodeFromLast(linkedList.getHeadNode(), 10, count);
        String value = outContent.toString();
        assertTrue("Total count is :" + count +", Which is less than the requested node value :",
                value.contains(" Which is less than the requested node value :"));
    }

    @Test
    public void insertNewNode() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNewNode(7);
        String value = outContent.toString();
        assertEquals(1, linkedList.getSize());
    }

    public LinkedList setup() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNewNode(7);
        linkedList.insertNewNode(4);
        linkedList.insertNewNode(98);
        linkedList.insertNewNode(7);
        linkedList.insertNewNode(4);
        linkedList.insertNewNode(98);
        return linkedList;
    }

}