package com.galvanize;

public class Closet {
    private int inventory;
    public Closet(){
        this.inventory=inventory;
    }

    public int getInventory(){
        return inventory;
    }
    public int addClothing(int addClothes){
        return inventory = inventory + addClothes;
    }
    public int removeClothing(int removeClothes){
        return inventory = inventory - removeClothes;
    }

}
