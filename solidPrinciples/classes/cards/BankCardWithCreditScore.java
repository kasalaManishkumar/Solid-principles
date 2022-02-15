package solidPrinciples.classes.cards;

import solidPrinciples.classes.services.BankService;

public class BankCardWithCreditScore extends BankCard{
    @Override
    public long getBalance() {
        return super.balance;
    }
    @Override
    public void setBalance(long balance) {
        super.balance = balance;
    }
    @Override
    public void doTransaction(long amount, BankService bankService) {
        bankService.withDraw(amount);
        System.out.println("you have purchased: "+amount);
        System.out.println("the let over balance is");
        bankService.print();
    }
    public void creditScore(){
        System.out.println("Based on your credit score your given loan");
    }
}
