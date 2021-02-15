// author: Abulkhair Zhamiyev
/**
 * Account class, bla bla bla
 */
package com.company;

public class Account {
    private String name;
    private double balance;
    private static int id_gen = 0;
    private int id;

    // No-arg constructor
    public Account(){
        id = id_gen++;
    }
    // constructor #2
    public Account(String name){
        // it calls no-arg constructor in order to auto-increment an id
        this();
        setName(name);
    }

    // parameterized constructor
    public Account(String name, double balance){
        // calls constructor #2
        this(name);
        if(balance > 0.0){
           this.balance = balance;
        }
    }


    public int getId() {
        return id;
    }



    @Override
    public String toString(){
        return getName() + "'s balance is: " + getBalance();
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            balance += depositAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
