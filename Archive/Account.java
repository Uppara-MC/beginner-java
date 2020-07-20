package com.ypp.bankaccount;

public class Account {
    private String bankName;
    private String accountHolderName;
    private String Iban;
    private int balance;


    // Constructor with all properties
    public Account(String bankName, String accountHolderName, String iban, int balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bankName = bankName;
        Iban = iban;
    }

    public Account(){

    }

    public Account(int balance) {
        this.balance = balance;
    }

    //Getters and Setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public int transaction(int balance, int amount){
        return balance;
    }

    public void printBalance(){
        System.out.println(accountHolderName + " : " + balance);
    }
}
