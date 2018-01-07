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
package com.tarini.sales.orders;

import java.util.List;

import com.tarini.sales.products.Product;

/**
 * The Interface OrderRequest.
 */
public interface OrderRequest {

    /**
     * Gets the request ID.
     *
     * @return the request ID
     */
    public String getRequestID();
    
    /**
     * Gets the product list.
     *
     * @return the product list
     */
    public List<Product> getProductList();
    
    /**
     * Gets the estimate price.
     *
     * @return the estimate price
     */
    public Double getEstimatePrice();
}
