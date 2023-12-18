package com.jap.course3;

public class VoterImpl {
    public static void main(String args[]){
        Voter v=new Voter();
        v.setName("John");
        v.setAge(10);
        System.out.println(v.getAgeCriteria());

    }

}
