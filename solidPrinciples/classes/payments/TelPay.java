package solidPrinciples.classes.payments;

import solidPrinciples.interfaces.DigitalCurrency;
import solidPrinciples.interfaces.UPIpayments;

public class TelPay implements UPIpayments, DigitalCurrency {
    @Override
    public void getScratchcard() {
       // scratch card logic
    }

    @Override
    public void sendMoney() {
        // sending money logic
    }
    @Override
    public void AcceptBitCoins(){
        //accepts bit coin and converts to INR
    }
}
