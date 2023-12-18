package com.jap.course3;

public class SavingsAccount {
    private String name;
    private long accountNo=100000000000L;
    private String accountOpeningDate;
    private String status;
    private int availableBalance;
    private int balance;
    private boolean internetBanking;
    private int interestRate;
    private String modeOfOperation;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAccountNo() {
        return this.accountNo;
    }
    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountOpeningDate() {
        return this.accountOpeningDate;
    }
    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getAvailableBalance() {
        return this.availableBalance;
    }
    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public boolean getInternetBanking() {
        return this.internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }
    public int getInterestRate() {
        return this.interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
    public String getModeOfOperation() {
        return this.modeOfOperation;
    }
    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    public void balance(){
        System.out.println("Account balance :"+balance);
    }
    public void creditCash(int credit){
        System.out.println("Amount after credit is :"+(getBalance()+credit));
    }
    public void debitCash(int debit){
        System.out.println("Amount after debit is : "+(getBalance()-debit));
    }
    public long generateNumber(){
        accountNo=accountNo+1;
        return accountNo;
    }

    public void displayDetails() {
        System.out.println("Account Number :"+accountNo);
        System.out.println("Account Holder Name: " + getName());
        System.out.println("Account Opening Date: " + getAccountOpeningDate());
        System.out.println("Account Status: " + getStatus());
        System.out.println("Available Balance: " + getAvailableBalance());
        System.out.println("Total Balance: " + getBalance());
        System.out.println("Internet Banking Enabled: " + getInternetBanking());
        System.out.println("Interest Rate: " + getInterestRate());
        System.out.println("Mode of Operation: " + getModeOfOperation());
    }
}
