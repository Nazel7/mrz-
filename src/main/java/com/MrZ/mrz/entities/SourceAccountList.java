package com.MrZ.mrz.entities;

import javax.persistence.*;

@Entity
@Table(name = "sourceAccout_list")
@Access(AccessType.FIELD)
public class SourceAccountList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "source_name")
    private String sourceName;

    public SourceAccountList(){
        super();
    }

    public SourceAccountList(int id, String sourceName) {
        this.id = id;
        this.sourceName = sourceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}
