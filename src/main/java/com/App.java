package com;


import com.users.Human;
import com.users.subspecies.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException
    {

        Human Vlad = new Human("Vlad", (byte) 27, 90000);
        Human Roma = new Human("Roma", (byte) 21, 86000);
        Human RomaHum = new Human("Roma", (byte) 25, 73000);
        System.out.println( Vlad  + " " + Roma);
        Vlad.lookingJob();
        System.out.println( " " );

        Student Max = new Student("Max","IT", 20);  //переопределение, перезагрузка, конструкторы
        Max.wantToEarn(70000);
        Max.wantToEarn(50000, 90000);
        Max.getOpinion();
        System.out.println( " " );

        Object test = Vlad.clone();         // применение Cloneable
        System.out.println(test);
        System.out.println(" ");

        Human copyVlad = Vlad;                  //сравнение объектов и ссылок
        System.out.println(copyVlad == Vlad);
        System.out.println(Vlad == test);
        System.out.println( Roma.equals(RomaHum) ); // equals переопределен
        System.out.println( Vlad.equals(Roma));
        System.out.println( " " );

        List<Student> studentsList= new ArrayList<>();      //применение Comparable
        Student Igor = new Student("Igor","IT", 22);
        Student Liza = new Student("Liza","HR", 19);
        Student Oleg = new Student( "Oleg","Teacher", 30);
        Student Ira = new Student( "Ira","Teacher", 21);
        studentsList.add(Igor);
        studentsList.add(Liza);
        studentsList.add(Oleg);
        studentsList.add(Ira);
        Collections.sort(studentsList);
        System.out.println( studentsList );
        System.out.println( " " );





        byte maxX = (byte) 0B1000_0000;             // 8 видов примитивов
        byte minX = (byte) 0b0111_1111;
        System.out.println( maxX + " " + minX);
        System.out.println( " " );

        short maxY = (short) 16383.5 * 2;
        short minY = (short) 3276.7 * (-10);
        System.out.println( maxY + " " + minY );
        System.out.println( " " );

        int maxZ = 2147483647;
        int minZ = -2147483648;
        System.out.println( maxZ + " " + minZ);
        System.out.println( " " );

        long minV = -9223372036854775808L;
        long maxV = 9223372036854775807L;
        System.out.println( maxV + " " + minV);
        System.out.println( " " );

        float FloatValue = 43.4F;
        double DoubleValue = 91.32D;
        System.out.println( FloatValue + " " + DoubleValue);
        System.out.println( " " );

        boolean resultBoolean = FloatValue == DoubleValue;
        boolean resultBooleanMin = minV < maxV;
        System.out.println( resultBoolean + " " + resultBooleanMin);
        System.out.println( " " );

        char symbolV = '\u0056';
        char symbolL ='\u006c';
        char symbolA ='\u0061';
        char symbolD ='\u0064';
        System.out.println( symbolV + " " + symbolL + " " + symbolA +  " " + symbolD );
        System.out.println( " " );

        Integer a = 80; // autoboxing                   обвертка примитива
        int aBack = new Integer(a);  //unboxing
        Float floatX = 124.2F;
        float floatBack = new Float(floatX);
        System.out.println( a + " " + aBack + " " + floatX + " " + floatBack);
        System.out.println( " " );

        int valueX = 128;               //          приведение типов
        byte valueByteX = (byte) valueX;        //теряются данные
        System.out.println( valueByteX );
        int valueY = 127;
        byte valueByteY = (byte) valueY;        //успешно
        System.out.println( valueByteY );
        short valueU = 300;
        long valueLongU =(long) valueU;
        System.out.println( valueLongU );



                      // сериализация объекта
//            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\vladz\\IdeaProjects\\Java_Core\\save.ser");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//            objectOutputStream.writeObject(studentsList);
//
//            objectOutputStream.close();


                    //десериализация
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vladz\\IdeaProjects\\Java_Core\\save.ser");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        List<Student> studentListDer = (List<Student>) objectInputStream.readObject();
//        System.out.println( studentListDer );
//        objectInputStream.close();


    }



}
