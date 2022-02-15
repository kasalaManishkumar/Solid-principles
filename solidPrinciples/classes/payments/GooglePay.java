package solidPrinciples.classes.payments;

import solidPrinciples.interfaces.UPIpayments;

public class GooglePay implements UPIpayments {
    @Override
    public void getScratchcard() {
        System.out.println("the scratch card is unlocked in googlepay");
    }

    @Override
    public void sendMoney() {
        //send money logic
    }
    public void getFeedback(){
        System.out.println("the feedback is given");
    }

}
