package classes;

import classes.cards.BankCard;
import classes.cards.CreditCard;
import classes.cards.DebitCard;
import classes.loanServices.Loan;
import classes.paymentServices.GooglePay;
import classes.paymentServices.Shopping;
import classes.services.BankService;
import interfaces.UPIPayments;

public class Main {
    public static void main(String args[]) {
        CreditCard creditCard =new CreditCard();
        BankCard bankCard1=new DebitCard();
        BankCard bankCard2=new BankCard();
        bankCard2.bankCardCreditScore();
        bankCard1.bankCardCreditScore();
        BankService bankService = new BankService(creditCard);
        bankCard1.bankCardCreditScore();
        bankCard1.withdrawAmount(10,bankService);
        Loan loan = new Loan();
        bankService.deposit(10);
        Shopping shopping = new Shopping(bankService);
        bankService.print();
        loan.getLoanIntrestInfo("HomeLoan");
        shopping.purchase(10);
        bankService.print();
        creditCard.bankCardCreditScore();
        UPIPayments upiPayments=new GooglePay();
        upiPayments.getScratchcard();
    }
}
