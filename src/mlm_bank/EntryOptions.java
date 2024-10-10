package mlm_bank;

import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EntryOptions extends MainMenu {

    protected String MobileNumber;
    protected int PassCode;
    String a;
    int b;

    Scanner sc = new Scanner(System.in);
    DecimalFormat money = new DecimalFormat("'$'###,##0.00");

    public void setMN(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public void setPC(int PassCode) {
        this.PassCode = PassCode;
    }

    String mn, pc;


    public void getNew() {
        loadFromFile();
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Mobile Number:");
        a= sc.next();
        setMN(a);
        System.out.println("Enter Your Passcode(In between 5-8 digits):");
        b = sc.nextInt();
        setPC(b);
        String pass = Integer.toString(b);

        if (phoneNumber.contains(a)){
            System.out.println("You already have an account. Please login from here.\n");
            getLogIn();
        }else {
            try{
                FileWriter writer = new FileWriter("UserCredential.txt", true);
                writer.write(a + " " + pass + " " + name +"\n");
                System.out.println("Successfully added to the Database.");
                writer.close();
            }catch (Exception e){
                System.out.println(e);
            }

            if (a.length() == 11  && (pass.length() >= 5 && pass.length()<=8)) {
                System.out.println(name + ", Your account has been created");
                System.out.println("Thanks for creating an account in MLM Bank.");
                System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        getAccounts();
                        break;
                    case 2:
                        System.out.println("Thank you for using MLM Bank.Have a nice day.");
                        break;
                }
            } else {
                System.out.println("Invalid number(s) or character(s)");
                System.out.println("Try again");
                getNew();
            }
        }

    }
    ArrayList<String> phoneNumber = new ArrayList<>();
    ArrayList<String> passWord = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    public void getLogIn() {
        loadFromFile();
        System.out.println("Enter Your Mobile Number:");
        mn= sc.next();

        System.out.println("Enter Your Passcode:");
        pc = sc.next();

        if (phoneNumber.contains(mn) && passWord.get(phoneNumber.indexOf(mn)).equals(pc)) {
            System.out.println("Welcome " + name.get(phoneNumber.indexOf(mn)) + ". Your login has been Successful");

            System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    getAccounts();

                    break;
                case 2:
                    System.out.println("Thank you for using MLM Bank.Have a nice day.");
                    break;
            }
        } else {
            System.out.println("Invalid mobile number or passcode.");
            System.out.println("Please try again. Or, to exit press 0");

            if (sc.nextInt() != 0) {
                getAccounts();
            }

        }

    }
    public void changePassword(){
        loadFromFile();
        System.out.print(" Enter your old password to continue: ");
        String  oldPassword = sc.next();
        if (passWord.contains(oldPassword)){
            System.out.print("Set new password: ");
            String newPassword= sc.next();
            passWord.add(passWord.indexOf(oldPassword), newPassword);
            int pass = Integer.parseInt(newPassword);
            setPC(pass);

            try{
                File file = new File("UserCredential.txt");
                Scanner scan = new Scanner(file);
                for (int i= 0; i<passWord.size(); i++){
                    FileWriter writer = new FileWriter("UserCredential.txt", true);
                    writer.write(phoneNumber.get(i) + " " + passWord.get(i) + " " + name.get(i) + "\n");
                    writer.close();
                }
                System.out.println("Your password has been changed successfully.");
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
    public void loadFromFile(){
        try{
            File infoBook = new File("UserCredential.txt");
            if (infoBook.exists()){
                Scanner scan = new Scanner(infoBook);
                while (scan.hasNext()){
                    String phoneNumber = scan.next();
                    String pW = scan.next();
                    String name = scan.nextLine();
                    this.phoneNumber.add(phoneNumber);
                    this.passWord.add(pW);
                    this.name.add(name);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
