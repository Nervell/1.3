public class Main {
    public static void main(String[] args) {

        //Задание номер 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание номер 2
        int clientDeviceYear = 2014;
        int ClientOS = 1;
        if (clientDeviceYear < 2015 && ClientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && ClientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Приложение будет работать корректно");
        }

        //Задание номер 3
        int year = 1936;
        if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание номер 4
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 21) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance < 61) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        //Задание номер 5
        int MonthInYear = 11;

        switch (MonthInYear) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}