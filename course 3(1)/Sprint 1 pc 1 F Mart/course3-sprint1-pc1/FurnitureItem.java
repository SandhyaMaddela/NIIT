public class FurnitureItem {
    /*attributes are:1)Company
                     2)colour-->red,blue,green
                     3)grades-->1,2,3
                     4)both indoor and outdoor use
                     5)Type of manufactured items-->tables,chairs,cupboards,stools
                     6)Price
     */
    String Company;
    String colour;
    int grade;
    boolean indoorUse;
    boolean OutDoorUse;
    String typeOfFurniture;
    int price;
    //Behaviour: give 5% discount if order type is outdoor
    public double discountedPrice(boolean outDoorUse,int price){
        if(outDoorUse==true){
            return price+(price*0.05);
        }
        else{
            return price;
        }
    }



}
