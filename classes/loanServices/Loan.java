package classes.loanServices;

public class Loan {
    public void getLoanIntrestInfo(String LoanType) {
        if (LoanType.equals("HomeLoan")) {
            System.out.println("this is a homeloan");
        }
        if (LoanType.equals("car")) {
            System.out.println("this is a Carloan");
        }
    }
}