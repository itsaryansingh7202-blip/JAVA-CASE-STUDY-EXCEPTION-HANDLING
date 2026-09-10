import java.util.*;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidSeatsException extends Exception {
    InvalidSeatsException(String message) {
        super(message);
    }
}
class InsufficientSeatsException extends Exception {
    InsufficientSeatsException(String message) {
        super(message);
    }
}
public class BusTicketBookingSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int availableSeats = 10;
            System.out.print("Enter age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            int age = sc.nextInt();
            if (age <= 0) {
                throw new InvalidAgeException("Invalid age");
            }
            System.out.print("Enter number of seats: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            int seats = sc.nextInt();
            if (seats <= 0) {
                throw new InvalidSeatsException("Invalid number of seats");
            }
            if (seats > availableSeats) {
                throw new InsufficientSeatsException("Insufficient seats");
            }
            System.out.println("Booking successful");
            System.out.println("Age: " + age);
            System.out.println("Seats booked: " + seats);
            System.out.println("Remaining seats: " + (availableSeats - seats));
        } catch (InvalidAgeException | InvalidSeatsException | InsufficientSeatsException e) {
            System.out.println(e.getMessage());
        }
    }
}
