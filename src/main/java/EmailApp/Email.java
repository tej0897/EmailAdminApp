package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength=10;
    private String email;
    private String companySuffix=".tejThoughts.com";
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String changePassword;



    // constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method asking for department and return the department
        this.department=setDepartment();

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+this.password);

        //combine elements to generate email
        this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department.toLowerCase()+companySuffix;

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Hello, "+firstName+"\nDepartment Codes: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter Department Code:\t");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        if (departmentChoice==1){
            return "Sales";
        } else if(departmentChoice==2){
            return "Dev";
        } else if (departmentChoice==3) {
            return "Accounting";
        } else {
            return "guest";
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
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Set alternate email address
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change password
    public void setChangePassword(String changePassword) {
        this.changePassword = changePassword;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getChangePassword() {
        return changePassword;
    }

    public String showInfo(){
        return "DISPLAY NAME: "+firstName + " " +lastName+"\nCOMPANY EMAIL: "+ email+"\nMAILBOX CAPACITY: "+mailboxCapacity +"mb";
    }
}
