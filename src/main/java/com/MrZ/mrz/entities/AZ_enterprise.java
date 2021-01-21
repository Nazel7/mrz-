package com.MrZ.mrz.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "az_enterprise")
@Access(AccessType.FIELD)
public class AZ_enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_az")
    private String enterprizeName;

    @Column(name = "address")
    private String address;

    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "enterprise_ac")
    private List<Outlet> ac_outlet;


    public AZ_enterprise(){
        super();
    }


    public AZ_enterprise(int id, String enterprizeName, String address) {
        this.id = id;
        this.enterprizeName = enterprizeName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnterprizeName() {
        return enterprizeName;
    }

    public void setEnterprizeName(String enterprizeName) {
        this.enterprizeName = enterprizeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Outlet> getAc_outlet() {
        return ac_outlet;
    }

    public void setAc_outlet(List<Outlet> ac_outlet) {
        this.ac_outlet = ac_outlet;
    }
}
