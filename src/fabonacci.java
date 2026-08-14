//package src;
//Implement a program that determines if a given number is prime. Then, create another program that prints the Fibonacci sequence 
// up to a specified number of terms. Focus on using loops and conditional statements effectively.

import java.util.Scanner;
class fabonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        long n = sc.nextInt();

        long f1 = 0, f2 = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        for (long i = 1; i <= n; ++i) {
            System.out.print(f1 + " ");

            // Compute the next term
            long f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        sc.close();
    }
}