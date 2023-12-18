package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;

        try{
            //Write the logic
            int newArray[]=new int[ageRawData.length];
            for(int i=0;i<ageRawData.length;i++){
                newArray[i]=Integer.parseInt(ageRawData[i]);
            }
            double sum=0;
            for(int i=0;i<newArray.length;i++){
                sum=sum+newArray[i];
            }
            avg=sum/newArray.length;
            System.out.println("Average is :"+avg);
            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }

}
