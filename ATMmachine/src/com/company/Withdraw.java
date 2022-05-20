package com.company;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Withdraw {
    double withdraw(double withdraw, double balance){
        if(balance >= withdraw)
            return balance - withdraw;
        else
            return balance;
    }
}
