package classes.cards;

import classes.cards.BankCard;
import classes.services.BankService;

public class DebitCard extends BankCard {
    @Override
    public void withdrawAmount(long amount, BankService bankService)
    {
        bankService.withdraw(amount);
    }

    @Override
    public void bankCardCreditScore(){
        System.out.println("this is not applicable");
    }
}
