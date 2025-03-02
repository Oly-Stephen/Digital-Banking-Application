package com.example.bankingapp.dto;

public class AccountDto {

    private Long id;
    private String AccountHolderName;
    private double balance;

    public AccountDto() {
    }

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
