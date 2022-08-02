package com.bridgelabz.userragistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRagistration {
    public static void main(String[] args) {
            UserRagistration userRegistration = new UserRagistration();
            userRegistration.validFirstName();
        }
        public void validFirstName(){
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
}
