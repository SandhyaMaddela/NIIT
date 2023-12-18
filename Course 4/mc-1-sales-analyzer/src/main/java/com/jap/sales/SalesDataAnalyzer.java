package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesDataAnalyzer {


    //This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {
        SalesRecord sale;
        SalesRecord[] salesData;
        int countLine=0;
        try(FileReader f=new FileReader(fileName);
            BufferedReader br=new BufferedReader(f)){
            String line=br.readLine();
            System.out.println("line="+line);
            while((line=br.readLine())!=null){
                countLine++;
            }
        }catch (IOException e){
            System.out.println(e);
        }
        salesData=new SalesRecord[countLine];
        try(FileReader f=new FileReader(fileName);
            BufferedReader br=new BufferedReader(f)) {
            String line=br.readLine();
            int index=0;
            while((line=br.readLine())!=null){
                String data[]=line.split(",");
                sale=new SalesRecord();
                sale.setDate(data[0]);
                sale.setCustomer_id(Integer.parseInt(data[1]));
                sale.setProduct_category(Integer.parseInt(data[2]));
                sale.setPayment_method(data[3]);
                sale.setAmount(Double.parseDouble(data[4]));
                sale.setTime_on_site(Double.parseDouble(data[5]));
                sale.setClicks_in_site(Integer.parseInt(data[6]));
                salesData[index]=sale;
                index++;
            }
        }catch (IOException e){
            System.out.println(e);
        }
        return salesData;

    }
}
