/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader;

import stocktrader.stockdatamodel.*;

/**
 *
 * @author swmichalak
 */
public class StockTrader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PhysicalStockItem objPhysicalItem =
                new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 100);
        ServiceStockItem objVirtualItem =
                new ServiceStockItem("Wintersmith: A Diskworld ebook by Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName()
                + ", Is in Stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityStock();
        System.out.println(strMessage);
        strMessage = objVirtualItem.getName()
                + ", Is in stock = " + objVirtualItem.isInStock() 
                + ", Qty in stock: " + objVirtualItem.getQuantityStock();
        System.out.println(strMessage);
    }
    
}
