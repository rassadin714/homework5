import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задача 1");

        int clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");

        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2016){
            switch (clientOS){
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                default:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3(){
        System.out.println("Задача 3");

        int year = 2021;
        if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
            System.out.println(year + " год является високосным.");
        }
        else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");

        int deliveryDistance = 101;
        int deliveryDay = 1;
        if (deliveryDistance > 20){
            deliveryDay++;
        }
        if (deliveryDistance > 60){
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);

    }
    public static void task5(){
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Сезон зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осени");
                break;
            case 12:
                System.out.println("Сезон зимы");
                break;
            default:
                System.out.println("Такого месяца не сущевствует");

        }
    }
}