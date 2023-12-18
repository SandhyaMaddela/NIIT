public class SavingsAccount {
    static long accountNumber=100000000000L;
    String name;
    long balance;
    String status;
    //parameterized constructor
    SavingsAccount(String name,long balance,String status){
        this.name=name;
        this.balance=balance;
        this.status=status;
    }
    public static long generateNumber(){
        accountNumber=accountNumber+1;
        return accountNumber;
    }
    public void displaySavingsAccountDetails(){
        System.out.println("Account number :"+accountNumber);
        System.out.println("Name  :"+name);
        System.out.println("Balance Amount :"+balance);
        System.out.println("status of the account :"+status);
    }
    public long accountBalance(long balance){
        return balance;
    }
    public long balanceAfterDebitCash(long balance){
        long debitCash=4567L;
        if(balance>debitCash){
            balance=balance-debitCash;
        }
        else{
            System.out.println("there is no sufficient balance");
        }
        return balance;
    }
    public long balanceAfterCreditCash(long balance){
        long creditCash=4567L;
        balance=balance+creditCash;
        return balance;
    }
}
