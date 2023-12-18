package com.jap.course3;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private int furniturePrice;
    static final int discount=5;

    public int getFurnitureCode(){
        return this.furnitureCode;
    }
    public void setFurnitureCode(int furnitureCode){
        this.furnitureCode=furnitureCode;
    }
    public String getFurnitureType(){
        return this.furnitureType;
    }
    public void setFurnitureType(String furnitureType){
        this.furnitureType=furnitureType;
    }
    public String getGradeOfFurniture(){
        return this.gradeOfFurniture;
    }
    public void setGradeOfFurniture(String gradeOfFurniture){
        this.gradeOfFurniture=gradeOfFurniture;
    }
    public String getFurnitureUsage(){
        return this.furnitureUsage;
    }
    public void setFurnitureUsage(String furnitureUsage){
        this.furnitureUsage=furnitureUsage;
    }
    public int getFurniturePrice(){
        return this.furniturePrice;
    }
    public void setFurniturePrice(int furniturePrice){
        this.furniturePrice=furniturePrice;
    }
    public float calculateDiscount(){
        if("grade 1".equals(getGradeOfFurniture()) && "outdoor".equals(getFurnitureUsage())) {
            return getFurniturePrice()-(getFurniturePrice()*(discount/100f));
        }
        else{
            return getFurniturePrice();
        }

    }
}
