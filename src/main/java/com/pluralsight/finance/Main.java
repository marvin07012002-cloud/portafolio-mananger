package com.pluralsight.finance;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam","123",12500);
        Valuable account2 = new BankAccount("Gary","456",1500);


        if(account2 instanceof BankAccount){
            BankAccount bankAccount2 =(BankAccount) account2;
            ((BankAccount) account2).deposit(100);
        }

        account1.deposit(100);


    }
}
