import java.util.Scanner;
public class MyBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //intially we will keep the balance 0
        double balance = 0.0; 
        
        System.out.println("Welcome to your simple bank app!");

        while (true) {
            System.out.println("\nYour Balance is: $" + balance);
            System.out.println("Type 'add', 'sub', or 'exit':");
            String choice = input.next();

if (choice.equalsIgnoreCase("add")) {
                System.out.print("Enter amount to add: ");
                double deposit = input.nextDouble();
                balance = balance + deposit; //addition
                System.out.println("Done!");}
                
                else if (choice.equalsIgnoreCase("sub")) {
                System.out.print("Enter amount to subtract: ");
                double withdrawal = input.nextDouble();
                balance = balance - withdrawal; // subtraction 
                System.out.println("Done!");

            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Final Balance: $" + balance);
                break;
            } else {
                System.out.println("Unknown command."); } }
        input.close(); } }