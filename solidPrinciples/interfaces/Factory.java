package solidPrinciples.interfaces;

import solidPrinciples.classes.cards.BankCard;

public interface Factory {
    public BankCard select(int set);
}
