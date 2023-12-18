public class FurnitureItem {
    String furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String colour;
    String furnitureUsage;
    int price;
    //no argument constructor
    FurnitureItem(){
        furnitureCode="A101";
        furnitureType="Tables";
        gradeOfFurniture="Grade 2";
        colour="red";
        furnitureUsage="indoor";
    }
    public void displayFurnitureItemDetails(){
        System.out.println("Code of the furniture item is "+furnitureCode);
        System.out.println("Type of the furniture is "+furnitureType);
        System.out.println("Grade of the furniture is "+gradeOfFurniture);
        System.out.println("colour of the furniture is "+colour);
        System.out.println("usage type of the furniture is "+furnitureUsage);
    }
    public double furnitureItemDiscount(String furnitureUsage,int price){
        double itemDiscount=0;
        if(furnitureUsage=="outdoor"){
            itemDiscount=price+(price*0.05);
        }
        return itemDiscount;
    }
}
