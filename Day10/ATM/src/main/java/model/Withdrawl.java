package model;

import util.AmountUtil;

import java.util.Scanner;

public class Withdrawl {
    public void withdrawl() {
        Scanner scanner=new Scanner(System.in);
        Balance balance = new Balance();
        balance.balance();
        System.out.println("Enter to withdrawl amount");
        int amount = scanner.nextInt();
        AmountUtil amountUtil=new AmountUtil();
        int newAmount = amountUtil.amountUtil()-amount;
        System.out.println(newAmount);
    }
}