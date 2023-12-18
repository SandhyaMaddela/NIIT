public class SavingsAccount {
    /*Attributes are:1) account 12digit number
                     2) account holder name
                     3) account balance
                     4) account status
                     5)cash with draw
                     6)cash deposit
                     7)cash debit
                     8)cash credit
     */
    long accountNo;
    String name;
    long balance;
    String accountStatus;
    long cashWithDraw;
    long cashDeposit;
    long cashDebit;
    long cashCredit;

    /*Behaviours are :1)with draw cash,check bank balance and deposit cash
                      2)debit cash,credit cash,display bank balance.
     */
    public long withDrawCash(long balance,long cashWithDraw){
        balance=balance-cashWithDraw;
        return balance;
    }
    public long depositCash(long balance,long cashDeposit){
        balance=balance+cashDeposit;
        return balance;
    }
    public long debitCash(long balance,long cashDebit){
        balance=balance-cashDebit;
        return balance;
    }
    public long creditCash(long balance,long cashCredit){
        balance=balance+cashCredit;
        return balance;
    }
}
