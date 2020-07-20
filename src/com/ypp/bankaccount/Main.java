package com.ypp.bankaccount;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Account account1 = new Account("BANK1", "Name1", "NL21BAK11111111111",2000);
    Account account2 = new Account("BANK2", "Name2", "NL21BAK22222222222",5000);
    Account account3 = new Account("BANK3", "Name3", "NL21BAK33333333333",10000);

    //Add 1000 to account1
        System.out.print("Available balance ");
        account1.printBalance();
        System.out.println("Amount to be credited: " + 1000);
        account1.creditAccount(1000);
        System.out.print("New balance ");
        account1.printBalance();
        System.out.println();

    //Remove 3000 from account2
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.println("Amount to be debited: " + 3000);
        account2.debitAccount(3000);
        System.out.print("New balance ");
        account2.printBalance();
        System.out.println();

    //Remove 15000 from account3
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.println("Amount to be debited: " + 15000);
        account3.debitAccount(15000);
        System.out.print("New balance ");
        account2.printBalance();
        System.out.println();

    //Add 1500 to account1
        System.out.print("Available balance ");
        account1.printBalance();
        System.out.println("Amount to be credited: " + 1500);
        account1.creditAccount(1500);
        System.out.print("New balance ");
        account1.printBalance();
        System.out.println();

    //Remove 100 from account1
        System.out.print("Available balance ");
        account1.printBalance();
        System.out.println("Amount to be debited: " + 100);
        account1.debitAccount(100);
        System.out.print("New balance ");
        account1.printBalance();
        System.out.println();

    //Add 5500 to account3
        System.out.print("Available balance ");
        account3.printBalance();
        System.out.println("Amount to be credited: " + 5500);
        account3.creditAccount(5500);
        System.out.print("New balance ");
        account3.printBalance();
        System.out.println();

    //Remove 142 from account2
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.println("Amount to be debited: " + 142);
        account2.debitAccount(142);
        System.out.print("New balance ");
        account2.printBalance();
        System.out.println();

    //Transfer 500 from account2 to account3
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.print("Available balance ");
        account3.printBalance();
        System.out.println("transfer amount: " + 3000);
        account2.transferTo(account3, 3000);
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.print("Available balance ");
        account3.printBalance();
        System.out.println();

    //Transfer 400 from account1 to account2
        System.out.print("Available balance ");
        account1.printBalance();
        System.out.print("Available balance ");
        account2.printBalance();
        System.out.println("transfer amount: " + 400);
        account1.transferTo(account2, 400);
        System.out.print("Available balance ");
        account1.printBalance();
        System.out.print("Available balance ");
        account2.printBalance();
    }




}
