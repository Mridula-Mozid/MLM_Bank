package mlm_bank;

import java.util.Scanner;

public class MyAccount extends MainMenu {
    public void getMyAccount() {

        System.out.println("1.View Account Balance.");
        System.out.println("2.Return to main menu");

        System.out.println("Enter your option :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Account Balance: " + money.format(getCheckBalance()));
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
                break;
            case 2:
                getAccounts();
                break;

            default:
                System.out.println("Sorry.Invalid choice.");
                getAccounts();
        }

    }
}
