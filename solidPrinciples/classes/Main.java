package solidPrinciples.classes;

import solidPrinciples.classes.cards.BankCard;
import solidPrinciples.classes.loanServices.Loan;
import solidPrinciples.classes.payments.GooglePay;
import solidPrinciples.classes.services.BankService;
import solidPrinciples.classes.services.FactoryMethod;
import solidPrinciples.classes.services.Shopping;

public class Main {
    public static void main(String[] args){
        Loan loan=new Loan();
        FactoryMethod factoryMethod=new FactoryMethod();
        BankCard bankCard =factoryMethod.select(1);
        BankService bankService=new BankService(bankCard);
        bankService.deposit(120L);
        Shopping shopping=new Shopping(bankService);
        bankService.print();
        loan.getLoanIntrestInfo("HomeLoan");
        shopping.purchase(10);
        GooglePay googlePay=new GooglePay();
        googlePay.getScratchcard();
        googlePay.getFeedback();
    }
}
