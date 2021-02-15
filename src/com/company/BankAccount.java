package com.company;

public class BankAccount {
    private int dollars;

    public void deposit(double dollars){
        this.dollars += dollars;
    }

    public int getDollars() {
        return dollars;
    }
    // Hot key to comment the code by single line Ctrl + /.
    // Hot key to comment the block of code: Ctrl + Shift + /
    @Override
    public String toString(){
        return "This account has: " + getDollars();
    }
}
