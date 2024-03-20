public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
        // задача 1 окончена

        clientOS = 1;
        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS ==1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        //задача 2 окончена

        int year = 2021;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        // задача 3 окончена

        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance < 20) {
            days = +1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            days = 1 + 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 1 + 1 + 1;
        }
        if (deliveryDistance > 100) {
            days = 0;
        }
        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
        //задание 4 окончено


        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("такого сезона не существует");
        }

    }
}