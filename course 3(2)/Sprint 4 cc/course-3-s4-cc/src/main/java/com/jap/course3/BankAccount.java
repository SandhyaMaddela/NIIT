package com.jap.course3;

public abstract class BankAccount {
    static long accountNo=123456789123L;
    String name;
    int balance;
    String status;
    public BankAccount(String name,int balance,String status){
        this.name=name;
        this.balance=balance;
        this.status=status;
    }
    public static long GenerateNo(){
        accountNo=accountNo+1;
        return accountNo;
    }
    abstract void checkBalance();
    abstract void debitCash(int amount);
    abstract void creditCash(int amount);
}
