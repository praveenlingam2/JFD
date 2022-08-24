package model;

import util.AmountUtil;

import java.util.Scanner;

public class Balance {
    public void balance(){
        AmountUtil amountUtil=new AmountUtil();
        int newAmount = amountUtil.amountUtil();
        System.out.println(newAmount);
    }

}
