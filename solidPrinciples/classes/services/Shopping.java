package solidPrinciples.classes.services;

public class Shopping {
    private BankService bankService;

    public Shopping(BankService bankService) {
        this.bankService = bankService;
    }

    public void purchase(long amount){
        bankService.bankCard.doTransaction(amount,bankService);
    }

}
