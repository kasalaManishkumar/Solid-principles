package solidPrinciples.classes.cards;


import solidPrinciples.classes.services.BankService;

public abstract class BankCard {
    protected long balance = 0L;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public abstract void doTransaction(long amount, BankService bankService);

}
