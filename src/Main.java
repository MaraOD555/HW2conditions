import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        boolean client = clientOS < 1;
        if (client) {
            System.out.println("Установите версию для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения Android  по ссылке");

        //Задание 2
        int clientDeviseYear = 2022;

        if (clientOS == 0 && clientDeviseYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviseYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if (clientOS == 0 && clientDeviseYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1 && clientDeviseYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Приложение не распознано");


        //Задание 3
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Високосный");
        else
            System.out.println("Не високосный");

        switch (year) {
            case 2021:
            case 2022:
            case 2023:
                System.out.println("2021 год не является високосным");
                break;
            case 2024:
                System.out.println("2024 год является високосным");
                break;
            default:
                System.out.println("сложно сказать, надо еще посчитать");
        }

        //Задание 4

        int distance = 95;
        int days = 1;
        if (distance < 20)
            days = 1;
        else if (distance >= 20 && distance < 60)
            days = 2;
        else if (distance >= 60 && distance < 100)
            days = 3;

        System.out.println("Потребуется дней: " + days + " для доставки");


        if (distance >= 20)
            ++days;
        if (distance >= 60)
            days++;
        System.out.println("Потребуется дней: " + days++ + " для доставки");

        //Задание 5
        int monthNumber = 5;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
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
            default:
                if (monthNumber >= 13) {
                    System.out.println("нет такого месяца");
                }


        }
    }
}





