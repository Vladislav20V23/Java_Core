package com.methods;

import static com.users.Human.luck;

public class StartLokingJob {

    public static int count;
    public void lookingJob(){
        boolean x =true;
        do {
            invokeCounter();
            int probabilitySuccess = (int) (Math.random() * 100);   //переменную видно только в рамках метода {}
            if ((probabilitySuccess + luck) > 40) {
                System.out.println("Нашел работу!! Потратил попыток: " + count);
                x=false;
                break;
            } else {
                System.out.println("Работа не найдена.");
            }
        } while (x==true);
    }

    public static void invokeCounter(){
        count++;
    }
}
