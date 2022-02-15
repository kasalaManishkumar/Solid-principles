package classes.services;

import classes.cards.CreditCard;

public class BankService{
    public CreditCard creditCard;
    private Long balance=0L;
    public BankService(CreditCard creditCard){
        this.creditCard=creditCard;
    }

    public long deposit(long amount){
        return this.balance+=amount;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void withdraw(long amount){this.balance-=amount;
    }
    public void print(){
        System.out.println(balance);
    }
}
