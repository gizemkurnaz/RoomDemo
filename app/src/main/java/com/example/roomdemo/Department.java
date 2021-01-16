package com.example.roomdemo;

import java.io.Serializable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Department implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;
}
