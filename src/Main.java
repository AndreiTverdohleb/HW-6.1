public class Main {
    public static void leapYear(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println(i + " год — високосный год.");
        } else {
            System.out.println(i + " год — невисокосный год.");
        }
    }
    public static void updatePhone (int i , int d) {
        if (i == 1 && d >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (i == 1 && d < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");}
        if (i == 0 && d >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (i == 0 && d < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
    }public static void deliveryCard(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            int day = 1;
            if (deliveryDistance > 20) {
                day++;}
            if (deliveryDistance > 60) {
                day++;}
            System.out.println("Потребуется " + day + " дня.");}
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
       System.out.println("Задача 1");
              int i = 2004;
              leapYear(i);
            System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        int d = 2014;
        updatePhone(i,d);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int i = 101;
        deliveryCard(i);
        System.out.println(" ");}
    }
