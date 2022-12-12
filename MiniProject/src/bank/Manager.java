package bank;

import java.sql.*;
import java.util.Scanner;

public class Manager {   //implementing class Manager
    //Declaring required variables
    static Scanner sc = new Scanner(System.in);
    static int customerId = 4;
    static String name;
    static String address;
    static int accountNumber = 1004;
    static long mobileNumber;
    private static int pin;
    private static double accountBalance;

    public static void viewCustomerDetails() throws Exception {  //method for viewing customer details
        Connection c = DB.getConnection();
        String query = "SELECT * FROM AccountDetails";     //Accessing details of AccountDetails table
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {             //checks for next row
            System.out.println("User ID: " + rs.getString("ID") + "\nName: " + rs.getString("Name") + "\nAddress: " + rs.getString("Address") + "\nAccount Number: "
                    + rs.getString("AccountNumber") + "\nMobile Number: " + rs.getString("MobileNumber") + "\nAccount Balance: " + rs.getString("AccountBalance") + "\n");
        }
    }

    public static void addUser() throws Exception {      //method for adding a user
        Connection c = DB.getConnection();
        System.out.println("Enter the first name of the customer");
        String fname = sc.next();
        System.out.println("Enter the last name of the customer");
        String lname = sc.next();
        name = fname + " " + lname;       //concatenating first and last name and storing in name
        System.out.println("Enter the address of the customer");
        sc.next();
        address = sc.nextLine();
        System.out.println("Create a 4 digit pin:");
        pin = sc.nextInt();
        System.out.println("Enter the mobile number of the customer");
        mobileNumber = sc.nextLong();
        System.out.println("Enter the Account Balance of the customer");
        accountBalance = sc.nextDouble();
        String query = "INSERT INTO AccountDetails VALUES(" + customerId + ",'" + name + "','" + address + "'," + accountNumber + "," + pin + "," + mobileNumber + "," + accountBalance + ")";
        Statement smt = c.prepareStatement(query);
        smt.execute(query);
        System.out.println("User Added");
        customerId++;        //incrementing customer ID
        accountNumber++;    //incrementing account number
        manager();        //calling manager method
    }

    public static void removeUser() throws Exception {         //method for checking the availability of the user to remove
        System.out.println("Enter the customer id of the user to be removed:");
        int id = sc.nextInt();
        Connection c = DB.getConnection();
        String query = "SELECT AccountNumber FROM AccountDetails WHERE ID = " + id;
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        if(!rs.next()) {           //checks if there is any credentials available next
            System.out.println("No accounts exist with the given id");
        } else {
            confirmRemove(id);        //calling confirm remove method to remove the user by ID
        }
        return;
    }

    public static void confirmRemove(int id) throws Exception {     //method for removing the user
        Connection c = DB.getConnection();
        String query = "DELETE FROM AccountDetails WHERE ID = " + id;    //removing user by selecting ID
        Statement smt = c.prepareStatement(query);
        smt.execute(query);
        System.out.println("User Removed Successfully");
        return;
    }

    public static void manager() throws Exception {    //method for manager
        System.out.println("Select an option");        //requirements of manager
        System.out.println("1. View Customer Details");
        System.out.println("2. Add User");
        System.out.println("3. Remove User");
        System.out.println("4. Exit");
        switch (sc.nextInt()) {
            case 1:
                viewCustomerDetails();
                break;
            case 2:
                addUser();
                break;
            case 3:
                removeUser();
                break;
            case 4:
                System.out.println("$$$$Thank you Visit Again$$$$");
                return;
            default:
                System.out.println("Invalid choice");
        }
        manager();            //calling manager method
    }
}
