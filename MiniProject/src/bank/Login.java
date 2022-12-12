package bank;

import java.sql.*;
import java.util.Scanner;

public class Login {
    static Scanner sc = new Scanner(System.in);
    //Declaring variables
    static String username;
    static String password;

    public static void login() throws Exception {         //method for Login
        System.out.println("\t ======= Welcome to ABC Bank =======\n");
        System.out.println("Please Select a option");
        System.out.println(" 1) Bank Manager\n 2) Customer\n 3) Exit\n");
        switch(sc.nextInt()) {
            case 1:
                managerLogin();
                break;
            case 2:
                customerLogin();
                break;
            case 3:
                System.out.println("\t$$$$Thank you visit again$$$$");
                return;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void managerLogin() throws Exception {      //method for manager Login
        System.out.println("\tWelcome Mr. Manager\n");
        System.out.println("Please fill the Given Details For login\n");
        System.out.println("Enter Your Name");
        String username = sc.next();
        System.out.println("Enter your password");
        String password = sc.next();
        String query = "SELECT * FROM BankLoginDetails WHERE Name='"+username+"' and password='"+password+"'";    //get username & password
        Connection c = DB.getConnection();
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        String user = "";
        String pass = "";
        while (rs.next()) {            //checks for the availability of next row
            user = rs.getString("Name");
            pass = rs.getString("Password");
        }
        if (username.equals(user)&&password.equals(pass)) {     //check if the given username and password equal or not
            System.out.println("You are logged in successfully");
            Manager.manager();
        } else {
            System.out.println("Enter Valid details");
            System.out.println("Redirecting to the login page...\n");
            login();                //calling login method
        }
    }

    public static void customerLogin() throws Exception {             //method for customer Login
        System.out.println("\tWelcome Mr/Mrs Customer\n");
        System.out.println("Please fill the Given Details For login\n");
        System.out.println("Enter Your Name");
        String username = sc.next();
        sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.next();
        String query = "SELECT * FROM BankLoginDetails WHERE Name='"+username+"' and password='"+password+"'";
        Connection c = DB.getConnection();
        Statement smt = c.prepareStatement(query);
        ResultSet rs = smt.executeQuery(query);
        String user = "";
        String pass = "";
        while (rs.next()) {           //checks for the availability of the credentials of the next row
            user = rs.getString("Name");
            pass = rs.getString("Password");
        }
        if (username.equals(user)&&password.equals(pass)) {
            System.out.println("You are Logged In Successfully");
            Login.username = username;
            Customer.customer(username);      //calls the customer method
        } else {
            System.out.println("Enter Valid details");
            System.out.println("Redirecting to the login page...\n");
            login();            //redirect to login method
        }
    }
}
