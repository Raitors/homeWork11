import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static int checkAge(int number) {
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println(number + " год — високосный год");
        } else System.out.println(number + " год — невисокосный год");
        return 0;
    }

    public static int checkiOSAndYear(int oS, int clientDeviceYear) {
        if (oS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        if (oS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");


        return 0;
    }
    public static int cheakDeliveryDays(int deliveryDistance) {
        int deliveryDays=1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: "+ deliveryDays);
        if (deliveryDistance >100){
            System.out.println("Доставки нет");
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        checkAge(year);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("iOS - 0 | 1 - Android");
        byte clientOS = scanner.nextByte();
        checkiOSAndYear(clientOS, currentYear);

    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Дистанция");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        cheakDeliveryDays(distance);

    }
}