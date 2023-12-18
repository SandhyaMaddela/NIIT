package com.jap.customers;



import java.util.*;

public class CustomerService{
    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
        List<String> sortedList=new ArrayList<>();
        Collections.sort(customerList);
        for(Customer i:customerList){
            sortedList.add(i.getCustomerName());
        }
    return sortedList;
}


}
