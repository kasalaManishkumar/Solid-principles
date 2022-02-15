package solidPrinciples.classes.notificationServices;

public class Mobile extends Notification {
    public void sendOTP(String medium){
        System.out.println("the otp is send in mobile");
    }
    public void sendTransactionReport(String medium){
        System.out.println("the report is sent using mobile");
    }
}
