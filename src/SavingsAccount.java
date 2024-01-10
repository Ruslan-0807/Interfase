public class SavingsAccount implements Bank {
    public double savingsBalance;
    public double InterestRate = 0;
    public SavingsAccount(double savingsBalance,double InterestRate){
        this.savingsBalance = savingsBalance;
        this.InterestRate = InterestRate;
    }
    @Override
    public double calculateInterestRate() {
        return this.savingsBalance * InterestRate/100;
    }
}
