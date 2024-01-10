public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(200,2);
        CreditAccount creditAccount = new CreditAccount(20,5);
        System.out.println(" При проценте" + savingsAccount.InterestRate + " % "
                + " c основного счета, сумма которого составляет : " + savingsAccount.savingsBalance + "euro"
                + " вы сможете заработать " + savingsAccount.calculateInterestRate() + "euro");
        System.out.println(creditAccount.calculateInterestRate());

        }
    }

