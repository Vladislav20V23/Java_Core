package com.users;

import com.methods.StartLokingJob;
import lombok.Data;

import java.io.Serializable;

@Data
public class Human implements Cloneable, Serializable {

    private static final long serialVersionUID = 44341;
    public static final int luck = 10;
    public String name;
    public byte ageHuman;
    public long income;
    transient public String HumanNotes;

    public Human(String name, byte age, long income) {
        this.name = name;
        this.ageHuman = age;
        this.income = income;
    }

    public Human(String name, byte age, long income, String HumanNotes) {
        this.name = name;
        this.ageHuman = age;
        this.income = income;
        this.HumanNotes = HumanNotes;
    }

    public Human() {
    }

    public void lookingJob(){
        StartLokingJob startLokingJob = new StartLokingJob();
        startLokingJob.lookingJob();
    }

    public void getOpinion(){
        System.out.println("Мне нравиться работать!");
    }

    public void wantToEarn(int many){
        System.out.println("Хотелось бы зарабатывать " + many);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Human human){
        return this.name == human.name;
    }


}
