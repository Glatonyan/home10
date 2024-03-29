public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }



    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }



    public static void installation(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }



    public static int calculateDelivery(int distance) {
        if(distance <= 20) {
            return 1;
        } else if(distance <= 60) {
            return 2;
        } else if(distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }



    public static void task1() {
        System.out.println("Задание 1");
        int year = 2024;
        checkLeapYear(year);
    }



    public static void task2() {
        System.out.println("Задание 2");
        int osType = 0;
        int year = 2011;
        installation(osType, year);
    }



    public static void task3() {

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + calculateDelivery(deliveryDistance));
    }
}