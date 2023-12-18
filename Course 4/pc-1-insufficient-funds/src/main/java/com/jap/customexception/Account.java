package com.jap.customexception;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     *
     */
    public int  withdraw(int  amount) throws InsufficientFundException{
        try{
            if(getAccountBalance()<amount){
                throw new InsufficientFundException("Insufficient balance");
            }
            else{
                return getAccountBalance()-amount;
            }
        }catch (InsufficientFundException exception){
            System.out.println(exception.getMessage());
        }
        return getAccountBalance();
    }


}
