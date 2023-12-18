public class SavingsAccountImpl {
    public static void main(String args[]){
        SavingsAccount Sa=new SavingsAccount("tom",200000,"active");
        Sa.generateNumber();
        Sa.displaySavingsAccountDetails();
        long accountBalance=Sa.accountBalance(Sa.balance);
        System.out.println("account balance is "+accountBalance);
        long balanceAfterDebit=Sa.balanceAfterDebitCash(Sa.balance);
        System.out.println("account balance after the cash debit is "+balanceAfterDebit);
        long balanceAfterCredit=Sa.balanceAfterCreditCash(Sa.balance);
        System.out.println("account balance after the cash debit is "+balanceAfterCredit);
    }
    
}
