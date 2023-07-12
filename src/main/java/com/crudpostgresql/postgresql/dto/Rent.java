package com.crudpostgresql.postgresql.dto;

public class Rent {
    private int amount;
    private boolean isNegotiate;

    // Constructor, getters, and setters

    public Rent() {
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
