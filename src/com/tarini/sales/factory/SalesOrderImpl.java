package com.tarini.sales.factory;

import java.math.BigDecimal;
import java.util.List;

import com.tarini.sales.SaleOrder;
import com.tarini.sales.SalesRecord;

public class SalesOrderImpl implements SaleOrder {

    private String orderId;
    private List<SalesRecord> salesRecords;
    private String orderPrice;
    
    public SalesOrderImpl(String orderId, String orderPrice, List<SalesRecord> salesRecords) {
        this.orderId = orderId;
        this.salesRecords = salesRecords;
        this.orderPrice = orderPrice;
    }
    
    @Override
    public List<SalesRecord> getSaleRecords() {
        return salesRecords;
    }

    @Override
    public int getItemCount() {
        int result = 0;
        if(salesRecords!=null && !salesRecords.isEmpty()) {
            result = salesRecords.size();
        }
        return result;
    }

    @Override
    public String getTotalOrderPrice() {
        String result = "-0";
        if(salesRecords!=null && !salesRecords.isEmpty()) {
            BigDecimal total = new BigDecimal("0.0");
            for(SalesRecord salesRecord:salesRecords) {
                total.add(new BigDecimal(salesRecord.getTotalPrice()));
            }
            result = total.toString();
        }
        return result;
    }

    @Override
    public String getOrderID() {
        return orderId;
    }

}
