
package com.module_2;

abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA() {
        this.balance = 100;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB() {
        this.balance = 150;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC() {
        this.balance = 200;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
}


