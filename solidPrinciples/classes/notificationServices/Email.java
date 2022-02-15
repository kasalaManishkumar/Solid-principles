package solidPrinciples.classes.notificationServices;

public class Email extends Notification {
    public void sendOTP(String medium){
        System.out.println("the otp is send in email");
    }
    public void sendTransactionReport(String medium){
        System.out.println("the report is sent using email");
    }
}
