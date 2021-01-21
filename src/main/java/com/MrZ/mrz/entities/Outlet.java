package com.MrZ.mrz.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Outlet")
@Access(AccessType.FIELD)
public class Outlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name= "az_id")
    private AZ_enterprise enterprise_ac;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "ac_outlet")
    private List<Transaction> transactions;

    public Outlet(){
        super();
    }

    public Outlet(int id, String name, String address, AZ_enterprise enterprise_ac) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.enterprise_ac = enterprise_ac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo() {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AZ_enterprise getEnterprise_ac() {
        return enterprise_ac;
    }

    public void setEnterprise_ac(AZ_enterprise enterprise) {
        this.enterprise_ac = enterprise;

    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
