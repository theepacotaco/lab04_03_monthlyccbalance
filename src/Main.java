public class Main {
    public static void main(String[] args) {
        // Initialize the credit card balance
        double balance = 5000.0;  // Initial balance is $5000

        // Define the annual interest rate (as a decimal)
        double annualInterestRate = 0.17;  // 17% annual interest rate

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12.0;

        // Calculate the interest for one month
        double interestOneMonth = balance * monthlyInterestRate;

        // Calculate the interest for two months (interest on the previous month's balance)
        double interestTwoMonths = (balance + interestOneMonth) * monthlyInterestRate;

        // Display the results
        System.out.println("Initial Balance: $" + balance);
        System.out.println("Monthly Interest Rate: " + (monthlyInterestRate * 100) + "%");
        System.out.println("Interest Due After One Month: $" + interestOneMonth);
        System.out.println("Interest Due After Two Months: $" + interestTwoMonths);
    }
}