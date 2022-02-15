package classes.cards;

import classes.cards.BankCard;
import classes.services.BankService;

public class CreditCard extends BankCard {
    @Override
    public void withdrawAmount(long amount, BankService bankService) {
        bankService.withdraw(amount);
    }
    @Override
    public void bankCardCreditScore(){
        System.out.println("the load will be issued based on credit score");
    }
}
