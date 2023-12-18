package com.marks;

public class StudentMarks {
    public int calculateMarks(int maths,int physics,int chemistry,int biology){
        int sum=maths+physics+chemistry+biology;
        return sum;
    }
    public float calculateMarks(float maths,int physics,int chemistry){
        float sum=maths+physics+chemistry;
        return sum;
    }
    public int calculateMarks(int businessStudies,int finance,int accounting){
        int sum=businessStudies+finance+accounting;
        return sum;
    }

}
