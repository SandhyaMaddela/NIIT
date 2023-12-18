package com.jap.course3;

public class BankAccountImpl {
    public static void main(String args[]){
        BankAccount.GenerateNo();
        CurrentAccount ca=new CurrentAccount("abcd",67890,"active");
        ca.checkBalance();
        ca.creditCash(2345);
        ca.debitCash(4567);
        SavingsAccount sa=new SavingsAccount("abcd",56789,"active");
        sa.checkBalance();
        sa.creditCash(3452);
        sa.debitCash(2345);
    }
}
