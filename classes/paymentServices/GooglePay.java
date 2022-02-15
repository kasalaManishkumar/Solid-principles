package classes.paymentServices;

import interfaces.UPIPayments;

public class GooglePay implements UPIPayments {
    public void getScratchcard() {
        // scratch card
        System.out.println("Scratch method in gpay");
    }
    public void sendMoney() {
        //send money logic
    }
    public void acceptBitCoins(){
        System.out.println("this method is not supported");
    }
    public void RaiseFeedback(){
        System.out.println("the feedback is given");
    }
}
