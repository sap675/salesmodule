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

import com.tarini.sales.SalesRecord;

/**
 * The Class SalesRecordImpl.
 */
public class SalesRecordImpl implements SalesRecord {

    /** The id. */
    private String id;
    
    /** The product name. */
    private String productName;
    
    /** The quantity. */
    private String quantity;
    
    /** The item price. */
    private String itemPrice;
    
    /** The total price. */
    private String totalPrice;
    
    /* (non-Javadoc)
     * @see com.tarini.sales.SalesRecord#getID()
     */
    @Override
    public String getID() {
        return id;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.SalesRecord#getProduct()
     */
    @Override
    public String getProduct() {
        return productName;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.SalesRecord#getQuantity()
     */
    @Override
    public String getQuantity() {
        return quantity;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.SalesRecord#getItemPrice()
     */
    @Override
    public String getItemPrice() {
        return itemPrice;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.SalesRecord#getTotalPrice()
     */
    @Override
    public String getTotalPrice() {
        return totalPrice;
    }

}
