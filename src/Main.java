import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2013;
        if (clientDeviceYear >= 2015 && clientDeviceYear < 2022) {
            System.out.println("Установите приложение");
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задание 3");
        int year = 2021;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }


        System.out.println("Задание 4");
        int deliveryDistance = 102;
        int delivery = 20;
        int delivery2 = 60;
        int delivery3 = 100;
        if (deliveryDistance < delivery) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= delivery && deliveryDistance <= delivery2) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > delivery2 && deliveryDistance <= delivery3) {
            System.out.println("Потребуется дней: 3");
        } else{
            System.out.println("Доставку в отдаленные районы не осуществляем.");//
        }


            System.out.println("Задание 5");
            int monthNumber = 6;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                    default:
                    System.out.println("Такого месяца не существует.");
            }
        }
    }