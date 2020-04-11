/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanagementsystem.HomeRegistration;

/**
 *
 * @author boker
 */
public class Items{
private    int id;
private   String  Name;
private   String  category;
private   String description ;
private   int itemprice ;



    public Items(int ItemId, String ItemName ,String ItemCategory, String  ItemDescription, int Price  ) {
        
        this.id=ItemId;
        this.Name=ItemName;
        this.category=ItemCategory;
        this.description=ItemDescription; 
        this.itemprice=Price;
        
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getitemPrice() {
        return itemprice;
    }
    
    
}
