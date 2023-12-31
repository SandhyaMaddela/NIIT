package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
       List<String> itemList =new ArrayList<>();
       String newArray[]=electronicsItems.split(",");
       for(String i:newArray) {
           if(itemList.contains(i)){
           }
           else{
               itemList.add(i);
           }
       }
      return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        for(String s:itemList){
            if(s.equals(searchItem)){
                return 1;
            }
        }
        return -1;
    }
    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        Iterator<String> i=itemList.iterator();
        while (i.hasNext()){
            if(i.next().equals(removeItem)){
                i.remove();
                flag=true;
            }
        }
        return flag;
    }


}
