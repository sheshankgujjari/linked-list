/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.model;

public class Node {
    public String data;
    public Node next;

    /**
     * Constructor
     * @param dataIn
     */
    public Node(String dataIn) {
        data = dataIn;
        next = null;
    }
}
