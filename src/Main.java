public class Main {
public static void years(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год вискокосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
public static void clientOS(int version) {
        if (version == 1) {
            System.out.println("Android");
        } else if (version == 0) {
            System.out.println("iOS");
        } else  {
            System.out.println("Версия неопознана");
        }
    }
public static void ageDevice(int age) {
        if (age > 2015) {
            System.out.println("Установите обычную версию ");
        } else {
            System.out.println("Установите облегченную версию ");
        }
    }
public static void deliveryDistance(int km) {

        if (km == 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (km >= 20 && km <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (km > 60 && km <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (km > 100 || km < 20) {
            System.out.println("Доставки нет");
        }
    }

public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

public static void task1() {
        System.out.println("Задача 1");
        years(2001);
    }

public static void task2() {
        System.out.println("Задача 2");
        ageDevice(2000);
        clientOS(0);
    }

public static void task3() {
        System.out.println("Задача 3");
        deliveryDistance(45);
    }
}

