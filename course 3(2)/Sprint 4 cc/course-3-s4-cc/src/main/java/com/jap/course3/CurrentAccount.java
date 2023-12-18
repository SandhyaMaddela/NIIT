package com.jap.course3;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String name,int balance,String status){
        super(name,balance,status);
    }
    @Override
    public void checkBalance(){
        System.out.println("Account balance is "+balance);
    }
    @Override
    public void debitCash(int amount){
        balance=balance-amount;
        System.out.println("Account balance after debit the cash "+balance);
    }
    @Override
    public void creditCash(int amount){
        balance=balance-amount;
        System.out.println("Account balance after credit the cash "+balance);
    }


}
