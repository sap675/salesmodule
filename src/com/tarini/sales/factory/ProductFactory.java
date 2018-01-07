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

import java.util.HashMap;
import java.util.Map;

import com.tarini.sales.products.Product;

/**
 * A factory for creating Product objects.
 */
public class ProductFactory {

    private static ProductFactory instance;
    private Map<String, Product> productMap;
    
    private ProductFactory() {
        productMap = new HashMap<String, Product>();
    }
    
    public static ProductFactory getInstance() {
        if(instance == null) {
            instance = new ProductFactory();
        }
        return instance;
    }
    
    /**
     * Gets the product.
     *
     * @param id the id
     * @return the product
     */
    public Product getProduct(String id) {
        Product p = fetchProduct(id);
        if(productMap.containsKey(id)) {
            addToMap(p);
        }
        return null;
    }
    
    private Product fetchProduct(String id) {
        return null;
    }
    
    private void addToMap(Product p) {
        productMap.put(p.getProductID(), p);
    }
}
