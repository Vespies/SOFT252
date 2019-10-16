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
public class StockItem {
    
    protected String name = "UNKNOWN";
    protected Integer quantityStock= 0;
    protected Double sellingPrice = 100000.00;
    protected Double costPrice = 1000000.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
                this.name = name;
        }
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        if(quantityStock != null && quantityStock>= 0){
            this.quantityStock = quantityStock;
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice !=null && sellingPrice >= this.costPrice && sellingPrice >=0){
            this.sellingPrice = sellingPrice;   
        }
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if(costPrice !=null && costPrice >= 0) {
                   this.costPrice = costPrice; 
        }
    }
    
    public Boolean isInStock()
    {
        Boolean inStock = false;
        if(this.quantityStock > 0) {
            inStock = true;
        }
        return inStock;
    }
    
    
}

