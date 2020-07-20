package com.ypp.bankaccount;

public class debitMoney extends Account {
    private int accountBalance;

    @Override
    public int transaction(int accountBalance, int totalAmount){
        if(accountBalance < totalAmount){
            System.out.println("Transaction rejected not enough balance");
            return accountBalance;
        }
        else {
            accountBalance -= totalAmount;
            return accountBalance;
        }
    }
}
