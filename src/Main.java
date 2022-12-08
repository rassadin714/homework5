public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        int deliveryDistance = 95;

    }
}