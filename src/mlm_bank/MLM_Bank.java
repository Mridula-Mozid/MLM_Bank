
package mlm_bank;

import java.util.Scanner;

public class MLM_Bank {

    public static void main(String[] args) {

        EntryOptions eop = new EntryOptions();

        System.out.println("AssalamuAlaikum, Welcome to MLM Bank, A mobile banking solution");
        System.out.println("To use our services, please Login first or Create a new Account");
        System.out.println("Choose any option");
        System.out.println("1.Login or 2.Create New Account");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                eop.getLogIn();
                break;
            case 2:
                eop.getNew();
                break;
            default:
                System.out.println("Sorry, Invalid choice.");
        }
    }
}
