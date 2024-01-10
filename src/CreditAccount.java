public class CreditAccount implements Bank{
    private double creditBalance;
    private double loanInterest = 0;

    public CreditAccount(double creditBalance, double loanInterest) {
        this.creditBalance = creditBalance;
        this.loanInterest = loanInterest;
    }
    @Override
    public double calculateInterestRate(){
        return this.creditBalance * this.loanInterest/100;
    }
}
