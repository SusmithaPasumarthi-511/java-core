package com.learning.core.day2Session1;

//import com.learning.core.day3session1.D03P611.LowBalanceException;
//import com.learning.core.day3session1.D03P611.NegativeAmountException;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equals("Saving") && initialBalance < 1000) {
            throw new LowBalanceException("Low Balance");
        } else if (accType.equals("Current") && initialBalance < 5000) {
            throw new LowBalanceException("Low Balance");
        } else if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        this.balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (this.balance < 1000 && accType.equals("Saving")) {
            throw new LowBalanceException("Low Balance");
        } else if (this.balance < 5000 && accType.equals("Current")) {
            throw new LowBalanceException("Low Balance");
        }
        return this.balance;
    }
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
            account1.deposit(100);
            System.out.println("Balance after deposit: " + account1.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
