package college;
import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        final int PIN = 1234;
        double balance = 10000.0; // Initial balance
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        // PIN verification (3 tries)
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                break;
            } else {
                attempts++;
                if (attempts == 3) {
                    System.out.println("Account Blocked");
                    sc.close();
                    return;
                } else {
                    System.out.println("Incorrect PIN. Try again.");
                }
            }
        }

        // Menu loop
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: ₹%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Successfully withdrawn ₹%.2f\n", withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Successfully deposited ₹%.2f\n", deposit);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}


