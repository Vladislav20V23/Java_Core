package com;

import lombok.Data;

@Data
public class Human {
    public String name;
    public byte age;
    public long income;

    public Human(String name, byte age, long income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }



}
