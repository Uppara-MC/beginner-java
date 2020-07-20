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

    public void printBalance(){
        System.out.println(accountHolderName + " : " + balance);
    }

    public void creditAccount(int amount){
        balance += amount;
        System.out.println("Credit success");
    }

    public void debitAccount(int amount){
        if(balance < amount){
            System.out.println("Debit not success, not enough balance");
        }
        else {
            balance -= amount;
            System.out.println("Debit success");
        }
    }

    public void transferTo(Account account,int amount) {
        if(this.balance < amount){
            System.out.println("Transfer not success," + this.accountHolderName + " doesnt have enough balance");
        }
        else {
            this.balance -= amount;
            account.setBalance(account.getBalance() + amount);
            System.out.println("Transfer success from " + this.accountHolderName + " To " +
                               account.getAccountHolderName());
        }
    }

}
