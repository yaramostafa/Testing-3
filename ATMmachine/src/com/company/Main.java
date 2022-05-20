package com.company;


public class Main {
    double balance = 0;
    Withdraw w = new Withdraw();
    Deposit d = new Deposit();
    public double working(char x, double amount) {
        switch(x)
        {
            case 'a':
                this.balance =w.withdraw(amount,balance);
            case 'b':
                this.balance = d.deposit(amount,balance);
        }return balance;}
    public static void main(String args[] ) {
    }
}