package com.jap.course3;

public class FurnitureItemImpl {
    public static void main(String args[]){
        FurnitureItem fm=new FurnitureItem();
        fm.setFurnitureCode(101);
        fm.setFurnitureType("table");
        fm.setGradeOfFurniture("grade 1");
        fm.setFurnitureUsage("outdoor");
        fm.setFurniturePrice(10);
        System.out.println("Discounted price is "+fm.calculateDiscount());

    }
}
