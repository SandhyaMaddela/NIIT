package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        String highestScoreSchool="";
        try{
            int scoresArray[]=new int[scores.length];
            for(int i=0;i<scores.length;i++){
                scoresArray[i]=Integer.parseInt(scores[i]);
            }
            int highestScore=scoresArray[0];
            for(int i=1;i<scoresArray.length;i++){
                if(scoresArray[i]>highestScore){
                    highestScore=scoresArray[i];
                    highestScoreSchool=nameOfSchool[i];
                }
            }
        }catch (NumberFormatException exception){
            return exception.toString();
        }
        return highestScoreSchool;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[name.length];
        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
        } catch (NullPointerException exception) {
            System.out.println("null pointer exception");
        }
        return upperCase;
    }
}






