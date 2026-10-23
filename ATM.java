
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int attempts = 0;
        int choice;

        double balance = 5000.00;

        String lastTransaction = "No transactions yet";

        System.out.println("================================");
        System.out.println("      WELCOME TO JAVA ATM");
        System.out.println("================================");

        // PIN Login
        while (attempts < 3) {

            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println("\nLogin successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN!");

                if (attempts == 3) {
                    System.out.println("Too many attempts. Exiting...");
                    sc.close();
                    return;
                }
            }
        }

        // ATM Menu
        do {

            System.out.println("\n================================");
            System.out.println("          ATM MENU");
            System.out.println("================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Change PIN");
            System.out.println("6. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf(
                        "Available Balance: Rs. %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        lastTransaction =
                            "Deposited Rs. " + deposit;

                        System.out.println("Deposit successful!");
                        System.out.printf(
                            "New Balance: Rs. %.2f%n", balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (withdrawal <= balance) {
                        balance = balance - withdrawal;
                        lastTransaction =
                            "Withdrawn Rs. " + withdrawal;

                        System.out.println("Please collect your cash.");
                        System.out.printf(
                            "Remaining Balance: Rs. %.2f%n", balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== MINI STATEMENT =====");
                    System.out.println("Last Transaction: "
                            + lastTransaction);
                    System.out.printf(
                        "Current Balance: Rs. %.2f%n", balance);
                    break;

                case 5:
                    System.out.print("Enter current PIN: ");
                    int oldPin = sc.nextInt();

                    if (oldPin == pin) {
                        System.out.print("Enter new 4-digit PIN: ");
                        int newPin = sc.nextInt();

                        if (newPin >= 1000 && newPin <= 9999
                                && newPin != pin) {
                            pin = newPin;
                            System.out.println(
                                "PIN changed successfully!");
                        } else {
                            System.out.println(
                                "Enter a different 4-digit PIN.");
                        }
                    } else {
                        System.out.println("Incorrect current PIN!");
                    }
                    break;

                case 6:
                    System.out.println("\nThank you for using Java ATM.");
                    System.out.println("Please visit again!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
