/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktrader.stockdatamodel;

/**
 *
 * @author swmichalak
 */
public class PhysicalStockItem extends StockItem{
    
    public PhysicalStockItem (String name)
    {
        this.name= name;
    }
    
    public PhysicalStockItem (String name, Integer qty)
    {
        this.name = name;
        this.quantityStock = qty;
    }
}
