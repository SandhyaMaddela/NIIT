package com.jap.course3;

import java.sql.SQLOutput;

public class SavingsAccountImpl {
    public static void main(String args[]){
        SavingsAccount sa=new SavingsAccount();
        sa.generateNumber();
        sa.setName("tom");
        sa.setAccountOpeningDate("14-07-2020");
        sa.setStatus("active");
        sa.setAvailableBalance(9000);
        sa.setBalance(90000);
        sa.setInternetBanking(true);
        sa.setInterestRate(3);
        sa.setModeOfOperation("self");
        sa.displayDetails();
        sa.balance();
        sa.creditCash(900);
        sa.debitCash(400);

    }
}


