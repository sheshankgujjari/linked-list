/******************************************************************************
 * Copyright (c) 2017 Cardlytics. All rights reserved.                        *
 *                                                                            *
 * The computer software herein is the property of Cardlytics. The            *
 * software may be used and/or copied only with the written permission of     *
 * Cardlytics or in accordance with the terms and conditions                  *
 * stipulated in the agreement/contract under which the software has been     *
 * supplied.                                                                  *
 ******************************************************************************/

package com.cardlytics.interfaces;

import com.cardlytics.model.Node;

public interface ILinkedList {

    void getNthNodeFromLast(Node head, int n, int count);

    void insertNewNode(Integer data);

    void insertNewNode(String data);

    int getSize();

    Node getHeadNode();
}
