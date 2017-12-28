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

import com.tarini.sales.products.Product;

/**
 * The Class ProductImpl.
 */
public class ProductImpl implements Product {

    /** The name. */
    private String name;
    
    /** The description. */
    private String description;
    
    /** The price. */
    private String price;
    
    /** The tax on product. */
    private String taxOnProduct;
    
    /** The actual price. */
    private Double actualPrice;
    
    private String id;
    
    /**
     * Instantiates a new product impl.
     *
     * @param name the name
     * @param description the description
     * @param price the price
     * @param taxOnProduct the tax on product
     * @param actualPrice the actual price
     */
    ProductImpl(String name, String description, 
            String price, String taxOnProduct, Double actualPrice, String id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxOnProduct = taxOnProduct;
        this.actualPrice = actualPrice;
        this.id = id;
    }
    
    /* (non-Javadoc)
     * @see com.tarini.sales.products.Product#getProductName()
     */
    @Override
    public String getProductName() {
        return name;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.products.Product#getProductDescription()
     */
    @Override
    public String getProductDescription() {
        return description;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.products.Product#getProductPrice()
     */
    @Override
    public String getProductPrice() {
        return price;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.products.Product#getProductTaxType()
     */
    @Override
    public String getProductTaxType() {
        return taxOnProduct;
    }

    /* (non-Javadoc)
     * @see com.tarini.sales.products.Product#getActualPrice()
     */
    @Override
    public Double getActualPrice() {
        return actualPrice;
    }

    @Override
    public String getProductID() {
        return id;
    }

}
