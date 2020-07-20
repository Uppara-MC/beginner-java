package com.ypp.bankaccount;

public class creditMoney extends Account{
    private int accountBalance;

    @Override
    public int transaction(int accountBalance, int totalAmount){
        accountBalance += totalAmount;
        return accountBalance;
    }
}
