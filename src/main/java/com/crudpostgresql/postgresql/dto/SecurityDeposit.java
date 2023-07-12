package com.crudpostgresql.postgresql.dto;

public class SecurityDeposit {
    private int amount;
    private boolean isNegotiate;

    // Constructor, getters, and setters

    public SecurityDeposit() {
    }

    // Getter and Setter methods

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isNegotiate() {
        return isNegotiate;
    }

    public void setNegotiate(boolean negotiate) {
        isNegotiate = negotiate;
    }
}
