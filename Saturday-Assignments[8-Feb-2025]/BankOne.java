package com.celcom.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Account class represents a customer's account with necessary attributes and methods
class Account {
    private String accountHolder;  // Account holder's name
    private long accountNumber;    // Unique account number
    private double balance;        // Current balance in the account

    // Constructor to initialize the Account object
    public Account(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter method for account number
    public long getAccountNumber() {
        return accountNumber;
    }

    // Getter method for account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {  // Validating deposit amount (must be positive)
            balance += amount;  // Adding deposit to the balance
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");  // Invalid deposit amount
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {  // Validating withdrawal amount (must be positive)
            if (balance >= amount) {  // Check if the balance is sufficient for withdrawal
                balance -= amount;  // Deducting the amount from the balance
                System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");  // Insufficient balance
            }
        } else {
            System.out.println("Invalid withdrawal amount.");  // Invalid withdrawal amount
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: " + balance);
    }
}

// Bank class manages a collection of accounts
class Bank {
    private Map<Long, Account> accounts;  // A map to store account information with account number as key

    // Constructor to initialize the Bank object with an empty map
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            System.out.println("Account already exists!");  // Check if the account already exists
        } else {
            accounts.put(account.getAccountNumber(), account);  // Adding the new account to the map
            System.out.println("Account added for " + account.getAccountHolder());
        }
    }

    // Method to remove an account from the bank
    public void removeAccount(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);  // Removing the account from the map
            System.out.println("Account removed: " + accountNumber);
        } else {
            System.out.println("Account not found.");  // Account doesn't exist
        }
    }

    // Method to get an account by its account number
    public Account getAccount(long accountNumber) {
        return accounts.get(accountNumber);  // Return the account corresponding to the account number
    }

    // Method to display all the accounts in the bank
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");  // No accounts to display
        } else {
            System.out.println("\nList of Accounts:");
            for (Account account : accounts.values()) {
                account.displayAccountDetails();  // Display details of each account
            }
        }
    }
}

// Main class that runs the Bank System and interacts with the user
public class BankOne {
    private static Scanner scanner = new Scanner(System.in);  // Scanner for user input
    private static Bank bank = new Bank();  // Creating a Bank object to manage accounts

    public static void main(String[] args) {
        boolean exit = false;  // Variable to control the program flow

        // Main loop that displays the menu and takes user input
        while (!exit) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. View All Accounts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();  // Read user input
            scanner.nextLine();  // Consume the newline character

            // Switch case to handle different menu options
            switch (choice) {
                case 1:
                    createAccount();  // Call method to create a new account
                    break;
                case 2:
                    removeAccount();  // Call method to remove an existing account
                    break;
                case 3:
                    depositMoney();  // Call method to deposit money into an account
                    break;
                case 4:
                    withdrawMoney();  // Call method to withdraw money from an account
                    break;
                case 5:
                    viewAccountDetails();  // Call method to view details of an account
                    break;
                case 6:
                    bank.displayAllAccounts();  // Call method to view all accounts
                    break;
                case 7:
                    exit = true;  // Exit the loop and terminate the program
                    System.out.println("Thank you for using the Bank System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");  // Handle invalid input
            }
        }
        scanner.close();  // Close the scanner
    }

    // Method to create a new account
    private static void createAccount() {
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();  // Read account holder's name
        System.out.print("Enter Account Number: ");
        long accNumber = scanner.nextLong();  // Read account number
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();  // Read initial balance

        Account account = new Account(name, accNumber, balance);  // Create new Account object
        bank.addAccount(account);  // Add account to the bank
    }

    // Method to remove an account by its account number
    private static void removeAccount() {
        System.out.print("Enter Account Number to Remove: ");
        long accNumber = scanner.nextLong();  // Read the account number to be removed
        bank.removeAccount(accNumber);  // Remove the account from the bank
    }

    // Method to deposit money into an account
    private static void depositMoney() {
        System.out.print("Enter Account Number: ");
        long accNumber = scanner.nextLong();  // Read account number
        Account account = bank.getAccount(accNumber);  // Retrieve the account

        if (account != null) {  // Check if account exists
            System.out.print("Enter Amount to Deposit: ");
            double amount = scanner.nextDouble();  // Read deposit amount
            account.deposit(amount);  // Deposit the amount into the account
        } else {
            System.out.println("Account not found.");  // Account doesn't exist
        }
    }

    // Method to withdraw money from an account
    private static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        long accNumber = scanner.nextLong();  // Read account number
        Account account = bank.getAccount(accNumber);  // Retrieve the account

        if (account != null) {  // Check if account exists
            System.out.print("Enter Amount to Withdraw: ");
            double amount = scanner.nextDouble();  // Read withdrawal amount
            account.withdraw(amount);  // Withdraw the amount from the account
        } else {
            System.out.println("Account not found.");  // Account doesn't exist
        }
    }

    // Method to view the details of an account
    private static void viewAccountDetails() {
        System.out.print("Enter Account Number: ");
        long accNumber = scanner.nextLong();  // Read account number
        Account account = bank.getAccount(accNumber);  // Retrieve the account

        if (account != null) {  // Check if account exists
            account.displayAccountDetails();  // Display account details
        } else {
            System.out.println("Account not found.");  // Account doesn't exist
        }
    }
}
