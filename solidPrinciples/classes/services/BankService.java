package solidPrinciples.classes.services;

import solidPrinciples.interfaces.*;
import solidPrinciples.classes.cards.BankCard;

public class BankService implements Printable{
   public BankCard bankCard;

    public void deposit(long amount){bankCard.setBalance(getBalance()+amount);}
    public void setBalance(long balance) {
        bankCard.setBalance(balance);
    }
    public long getBalance() {
        return bankCard.getBalance();
    }
    public BankService(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void withDraw(long amount){
        bankCard.setBalance(bankCard.getBalance()-amount);
    }
    public void print(){
        System.out.println(bankCard.getBalance());
    }}
