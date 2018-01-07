/***************************************************************************************
 * This software is Copyright (C) 2017 by Suman Mummaneni 
 * This software is licensed under LGPL License agreement 
 * This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 ***************************************************************************************/
package com.tarini.sales.factory;

import com.tarini.sales.orders.OrderApproval;
import com.tarini.sales.orders.OrderRecord;
import com.tarini.sales.orders.OrderRequest;

/**
 * The Class OrderRecordImpl.
 */
public class OrderRecordImpl implements OrderRecord {

    /** The order request. */
    private OrderRequest orderRequest;
    
    /** The order approval. */
    private OrderApproval orderApproval;
    
    /** The id. */
    private String id;
    
    /**
     * Instantiates a new order record impl.
     *
     * @param id the id
     * @param orderRequest the order request
     * @param orderApproval the order approval
     */
    OrderRecordImpl(String id, OrderRequest orderRequest, OrderApproval orderApproval) {
        this.id = id;
        this.orderRequest = orderRequest;
        this.orderApproval = orderApproval;
    }
    
    /**
     * @see com.tarini.sales.orders.OrderRecord#getOrderRequest()
     */
    @Override
    public OrderRequest getOrderRequest() {
        return this.orderRequest;
    }

    /**
     * @see com.tarini.sales.orders.OrderRecord#getOrderID()
     */
    @Override
    public String getOrderID() {
        return this.id;
    }

    /**
     * @see com.tarini.sales.orders.OrderRecord#getOrderApproval()
     */
    @Override
    public OrderApproval getOrderApproval() {
        return this.orderApproval;
    }
}
