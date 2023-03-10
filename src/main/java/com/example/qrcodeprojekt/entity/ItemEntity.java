package com.example.qrcodeprojekt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "item")
public class ItemEntity{

    @Id
    private int IDitem;

    @NonNull
    private String name;

    @NonNull
    private int IDFSshelf;

    @NonNull
    private int cost;

    @NonNull
    private int IDFSqrcode;

    public ItemEntity(){

    }

    public int getIDitem(){
        return IDitem;
    }

    public ItemEntity setIDitem(int IDitem){
        this.IDitem = IDitem;
        return this;
    }

    @NonNull
    public String getName(){
        return name;
    }

    public ItemEntity setName(@NonNull String name){
        this.name = name;
        return this;
    }

    public int getIDFSshelf(){
        return IDFSshelf;
    }

    public ItemEntity setIDFSshelf(int IDFSshelf){
        this.IDFSshelf = IDFSshelf;
        return this;
    }

    public int getCost(){
        return cost;
    }

    public ItemEntity setCost(int cost){
        this.cost = cost;
        return this;
    }

    public int getIDFSqrcode(){
        return IDFSqrcode;
    }

    public ItemEntity setIDFSqrcode(int IDFSqrcode){
        this.IDFSqrcode = IDFSqrcode;
        return this;
    }

    public ItemEntity(int IDitem, int IDFSqrcode, int IDFSshelf, int cost, String name){
        this.cost = cost;
        this.name=name;
        this.IDFSqrcode=IDFSshelf;
        this.IDitem=IDitem;
        this.IDFSshelf=IDFSshelf;
    }
}
