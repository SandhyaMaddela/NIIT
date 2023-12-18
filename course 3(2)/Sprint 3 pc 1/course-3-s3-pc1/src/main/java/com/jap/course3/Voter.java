package com.jap.course3;

public class Voter {
    private String name;
    private int age;
    static final int voterEligibleAge=18;

    public Voter(){
        name="Tom";
        age=17;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAgeCriteria(){
        if(getAge()>=18){
            return getName() + " Is Eligible to vote";
        }
        else if (getAge()>0 && getAge()<18 ) {
            return getName() + " Is Not Eligible to vote";
        }
        else{
            return getName() + " Age can't be Negative or zero";
        }
    }


}
