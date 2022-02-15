package solidPrinciples.classes.services;
import solidPrinciples.interfaces.Factory;
import solidPrinciples.classes.cards.BankCard;
import solidPrinciples.classes.cards.CreditCard;
import solidPrinciples.classes.cards.DebitCard;

public class FactoryMethod implements Factory {
    public BankCard select(int set){
        if(set==1){
            return new CreditCard();
        }
        else{
            return new DebitCard();
        }
    }
}
