package classes.paymentServices;
import classes.services.BankService;
import classes.cards.*;

public class Shopping {
    private BankService bankService;
    public Shopping(BankService bankService){
        this.bankService=bankService;
    }

    public void purchase(long amount){
        bankService.creditCard.withdrawAmount(amount,bankService);
    }

}
