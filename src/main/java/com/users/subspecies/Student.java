package com.users.subspecies;

import com.users.Human;
import lombok.Data;

import java.io.Serializable;

@Data
public class Student extends Human implements Comparable<Student>, Serializable {

    public Student(String name, String faculty, int age){
        this.faculty = faculty;
        this.age = age;
        this.name = name;
    }

    private static final long serialVersionUID = 44341;
    public int age;
    public String faculty;
    public String name;


    @Override
    public void getOpinion(){
        System.out.println("Я не хочу искать работу!");
    }

    public void wantToEarn(int many, int maxMany){      //Overload method
        System.out.println("Хотелось бы зарабатывать хотя бы " + many + " а лучше " + maxMany);
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
