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
package com.tarini.sales;

/**
 * The Interface SalesRecord.
 */
public interface SalesRecord {

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getID();
    
    /**
     * Gets the product.
     *
     * @return the product
     */
    public String getProduct();
    
    /**
     * Gets the quantity.
     *
     * @return the quantity
     */
    public String getQuantity();
    
    /**
     * Gets the item price.
     *
     * @return the item price
     */
    public String getItemPrice();
    
    /**
     * Gets the total price.
     *
     * @return the total price
     */
    public String getTotalPrice();
}
