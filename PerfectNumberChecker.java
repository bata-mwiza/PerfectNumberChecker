/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bata.perfectnumberchecker;

/**
 *
 * @author User
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Step 1: Input & Exception Handling
        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                number = scanner.nextInt();

                if (number <= 0) {
                    System.out.println("Number must be positive. Try again.");
                    continue;
                }
                break; // valid input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
                scanner.next(); // clear invalid input
            }
        }

        // Step 2: Sum of Proper Divisors
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 3: Check Perfect Number
        if (sum == number) {
            System.out.println(number + " is a Perfect Number!");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }

        scanner.close();
    }
}