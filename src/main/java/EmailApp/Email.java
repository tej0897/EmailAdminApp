package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength=10;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " +this.firstName + " "+this.lastName);

        // call a method asking for department and return the department
        this.department=setDepartment();
        System.out.println("Department Selected: "+this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+this.password);

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Department Codes: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department Code:");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice==1){
            return "Sales";
        } else if(departmentChoice==2){
            return "development";
        } else if (departmentChoice==3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int randomNumber = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomNumber);
        }
        return new String (password);
    }

    // Set mailbox capacity

    // Set alternate email address

    // Change password
}
