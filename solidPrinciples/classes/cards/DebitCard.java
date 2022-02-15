package solidPrinciples.classes.cards;

import solidPrinciples.classes.services.BankService;

public class DebitCard extends BankCard {

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
        bankService.print();
        bankService.withDraw(amount);
        bankService.print();
    }
}
