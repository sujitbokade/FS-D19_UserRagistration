package com.bridgelabz.userragistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRagistration {
    public static void main(String[] args) {
        UserRagistration userRegistration = new UserRagistration();
//            userRegistration.validFirstName();
//            userRegistration.validLastName();
//            userRegistration.validateEmail();
//            userRegistration.validMobileNumber();
            userRegistration.validPassword();
    }

    public void validFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User First Name: ");
        String firstName = scanner.next();

        Matcher match = pattern.matcher(firstName);
        if (match.matches())
            System.out.println("First Name is Valid");
        else
            System.out.println("First Name is InValid");
    }

    public void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Last Name: ");
        String lastName = scanner.next();

        Matcher match = pattern.matcher(lastName);
        if (match.matches())
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is InValid");
    }

    public void validateEmail() {
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User EmailId: ");
        String emailId = scanner.next();

        Matcher match = pattern.matcher(emailId);
        if (match.matches())
            System.out.println("Email is Valid");
        else
            System.out.println("Email is InValid");
    }
    public void validMobileNumber(){
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{10}$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Mobile Number: ");
        String mobileNumber = scanner.next();

        Matcher match = pattern.matcher(mobileNumber);
        if (match.matches())
            System.out.println("Mobile Number is Valid");
        else
            System.out.println("Mobile Number is InValid");

    }
    public void validPassword(){
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$!])[a-zA-Z0-9@#$!]{8}$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = scanner.next();

        Matcher match = pattern.matcher(password);
        if (match.matches())
            System.out.println("Password is Valid");
        else
            System.out.println("Password is InValid");

    }
}

