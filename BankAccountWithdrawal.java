import java.util.Scanner;
public class BankAccountWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0; 
        System.out.println("Current Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a numeric value.");
        }
        else {
            double amount = sc.nextDouble();
            if (amount <= 0) {
                System.out.println("Invalid amount! Withdrawal amount must be greater than 0.");
            }
            else if (amount > balance) {
                System.out.println("Insufficient balance! Available balance is " + balance);
            }
            else {
                balance = balance - amount;
                System.out.println("Withdrawal successful!");
                System.out.println("Amount withdrawn: " + amount);
                System.out.println("Remaining balance: " + balance);
            }
        }
        sc.close();
    }
}