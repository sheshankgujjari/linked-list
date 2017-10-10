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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LinkedListHelperTest {
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
    public void testCheckValidInput() throws Exception {
        LinkedListHelper.checkValidInput("i");
        assertTrue("As you have selected character i, please enter valid positive integer values to find " +
               "the 5th element", outContent.toString().contains("selected character i"));
        LinkedListHelper.checkValidInput("s");
        assertTrue("As you have selected character s, please enter valid positive integer values to find " +
                "the 5th element", outContent.toString().contains("selected character s"));
    }


    @Test
    public void checkValidLength() throws Exception {
        try {
            LinkedListHelper.checkValidInteger("5", true);
        } catch (Exception e){
            assertNull(e);
        }
    }

    @Test
    public void checkValidInteger() throws Exception {
        try {
            LinkedListHelper.checkValidInteger("10", false);
        } catch (Exception e){
            assertNull(e);
        }
    }

}