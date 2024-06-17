package org.example;

import java.util.Scanner;

//custom exception
class InsufficientFundsException extends  Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

public class bankApp {
    private double balance;
    //constructor
    public bankApp (double initialBalance){
        this.balance = initialBalance;
    }
    //method to deposit money
    public void deposit(double amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("PLEASE ENTER A POSITIVE VALUE");
        }
        balance += amount;
        System.out.println("Successfully deposited :"+ amount + " Your new balance is : "+ balance);
    }
    //Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Enter a positive value to withdraw");
        }
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds. Available balance: "+ balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: " + amount);
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        bankApp bankAccount = new bankApp(10000);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nWelcome to the Bank Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try{
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1 -> {
                        System.out.println("Enter the deposit amount: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        bankAccount.deposit(depositAmount);
                    }
                    case 2 -> {
                        System.out.println("Enter the withdrawal amount: ");
                        double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                        bankAccount.withdraw(withdrawalAmount);
                    }
                    case 3 -> {
                        System.out.println("Current balance: "+ bankAccount.getBalance());
                    }
                    case 4 -> {
                        System.out.println("Exiting the application. Thank you");
                        scanner.close();
                        return;                    }
                    default -> System.out.println("invalid option, please choose again");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input please enter a valid number");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
