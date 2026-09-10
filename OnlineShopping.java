import java.util.Scanner;
public class OnlineShopping {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            if (price <= 0) {
                throw new Exception("Invalid product price");
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            if (quantity <= 0) {
                throw new Exception("Invalid quantity");
            }
            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();
            if (discount < 0 || discount > 100) {
                throw new Exception("Invalid discount percentage");
            }
            double bill = price * quantity;
            double discountAmount = bill * discount / 100;
            double finalAmount = bill - discountAmount;
            System.out.println("Final bill = " + finalAmount);
            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();
            if (payment < finalAmount) {
                throw new Exception("Payment amount is less than the bill");
            }
            System.out.println("Payment successful");
            System.out.println("Remaining amount = " + (payment - finalAmount));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}