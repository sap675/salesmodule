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

/**
 * The Interface OrderApproval.
 */
public interface OrderApproval {

    /**
     * Gets the order approval ID.
     *
     * @return the order approval ID
     */
    public String getOrderApprovalID();
    
    /**
     * Checks if is order approved.
     *
     * @return the boolean
     */
    public Boolean isOrderApproved();
    
    /**
     * Gets the verification string.
     *
     * @return the verification string
     */
    public String getVerificationString();
    
    /**
     * Gets the order request.
     *
     * @return the order request
     */
    public OrderRequest getOrderRequest();
    
}
