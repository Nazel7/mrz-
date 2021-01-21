package com.MrZ.mrz.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
@Access(AccessType.FIELD)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "balance")
    private int balance;


    @Column(name = "payment")
    private int payment;

    @Column(name = "payer")
    private String payer;

@Column(name = "source_account")
private String sourceAccount;

    @Column(name= "date_transact")
    private Date date;


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "ac_outletid")
    private Outlet ac_outlet;

    public Transaction(){
        super();
    }

    public Transaction(int id, int balance, int deposit, Date dateTransact,
                       Outlet ac_outlet) {
        this.id = id;
        this.balance = balance;
        this.payment = deposit;
        this.date= dateTransact;
        this.ac_outlet = ac_outlet;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment= payment;

    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Outlet getAc_outlet() {
        return ac_outlet;
    }

    public void setAc_outlet(Outlet ac_outlet) {
        this.ac_outlet = ac_outlet;
    }
}
