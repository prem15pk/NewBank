package com.bank.Entity;
import javax.persistence.*;


public class Pots {
    private int id;
    private int Accountnumber;

    private String userId;

    @ManyToOne
    private Customer customer;
}
