package com.bank.DTOs;




public class TransActionDTO {

    private int blance;

    private int fromAccount;
    private int toAccount;
    private int transactionAmount;
    private String discription;


    private  boolean isActive;

    public TransActionDTO(int blance, int fromAccount, int toAccount, int transactionAmount, String discription, boolean isActive) {

        this.blance = blance;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.transactionAmount = transactionAmount;
        this.discription = discription;
        this.isActive = isActive;
    }



    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(int fromAccount) {
        this.fromAccount = fromAccount;
    }

    public int getToAccount() {
        return toAccount;
    }

    public void setToAccount(int toAccount) {
        this.toAccount = toAccount;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public String toString() {
        return "TransActionDTO{" +

                ", blance=" + blance +
                ", fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", transactionAmount=" + transactionAmount +
                ", discription='" + discription + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
