package services;

import model.Balance;
import model.Credit;
import model.Withdrawl;

import javax.swing.text.View;
import java.util.Scanner;

public class Menu {
    public void menu() {
        while (true){
        System.out.println("1.Withdrawl");
        System.out.println("2.Credit");
        System.out.println(("3.View Balance"));
        System.out.println("4.Exit");
        System.out.println("Enter the choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                Withdrawl withdrawl = new Withdrawl();
                withdrawl.withdrawl();
                break;
            }
            case  2:{
                Credit credit = new Credit();
                credit.credit();
                break;
            }
            case 3:{
                Balance balance = new Balance();
                balance.balance();
                break;
            }
            case 4:{
                System.exit(0);
            }
            default:{
                System.out.println("Invalid number");
            }
        }
    }
}
}
