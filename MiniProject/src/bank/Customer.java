package bank;

import java.sql.*;
import java.util.Scanner;

public class Customer {
    static Scanner sc = new Scanner(System.in);
    //Declaring variables
    static int customerId;
    static String name;
    static String address;
    static int accountNumber;
    static long mobileNumber;
    private static int pin;
    static double balance;

    public static void accountInfo(int customerId) throws Exception {       //method for viewing account details
        Connection c = DB.getConnection();
        String query = "SELECT * FROM AccountDetails WHERE ID = " + customerId;     //using customer ID getting details form Account details table
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {         //checks for availability of credentials of next row
            System.out.println("Customer ID: " + rs.getInt("Id"));
            System.out.println("Customer Name: " + rs.getString("Name"));
            System.out.println("Customer Address: " + rs.getString("Address"));
            System.out.println("Account Number: " + rs.getString("AccountNumber"));
            System.out.println("Mobile Number: " + rs.getLong("MobileNumber"));
        }
        customer(Login.username);       //redirects to customer method
    }

    public static void withdraw() throws Exception {       //method for withdrawl
        System.out.println("Enter the amount to withdraw");
        double amount = sc.nextDouble();
        Connection c = DB.getConnection();
        String query = "SELECT * FROM AccountDetails WHERE ID = " + customerId;
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            balance = rs.getDouble("AccountBalance");    //getting and storing balance and pin
            pin = rs.getInt("Pin");
        }
        System.out.println("Enter your pin:");
        if (sc.nextInt()==pin) {        //checks if the given pin is equal to the generated pin
            double check = balance - amount;      //balance - amount stores in check
            if (check<0) {         //checks if less than 0
                System.out.println("Insufficient Funds");
            } else {
                balance-=amount;
                String query1 = "UPDATE AccountDetails SET AccountBalance = " + balance + " WHERE ID = " + customerId;
                smt.execute(query1);
                System.out.println("Account Balance Updated");
            }
        } else {
            System.out.println("Invalid Pin");
        }
        customer(Login.username);      //redirects to customer method
    }

    public static void deposit() throws Exception {       //method for deposit
        Connection c = DB.getConnection();
        System.out.println("Enter the amount to deposit");
        double amount = sc.nextDouble();
        String query = "SELECT * FROM AccountDetails WHERE ID = " + customerId;
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            balance = rs.getDouble("AccountBalance");
            pin = rs.getInt("Pin");
        }
        System.out.println("Enter your pin:");
        if (sc.nextInt()==pin) {
            balance+=amount;
            String query1 = "UPDATE AccountDetails SET AccountBalance = " + balance + " WHERE ID = " + customerId;
            smt.execute(query1);
            System.out.println("Account Balance Updated");
        } else {
            System.out.println("Invalid Pin");
        }
        customer(Login.username);
    }

    public static void getBalance(int customerId) throws Exception {     //method for viewing balance
        Connection c = DB.getConnection();
        String query = "SELECT * FROM AccountDetails WHERE ID = " + customerId;
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            balance = rs.getDouble("AccountBalance");
            pin = rs.getInt("Pin");
        }
        System.out.println("Enter your pin:");
        if (sc.nextInt()==pin) {
            System.out.println(balance);;
        } else {
            System.out.println("Invalid Pin");
        }
        customer(Login.username);
    }

    public static void customer(String username) throws Exception {      //method for customer
        Connection c = DB.getConnection();
        String query = "SELECT Id FROM AccountDetails WHERE Name = '" + username + "'";
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            customerId = rs.getInt(1);
        }
        System.out.println("Select an option");
        System.out.println("1. View Account Details");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. View Balance");
        System.out.println("5. Exit");
        switch (sc.nextInt()) {
            case 1:
                accountInfo(customerId);
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                getBalance(customerId);
                break;
            case 5:
                System.out.println("$$$$Thank you visit again$$$$");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
