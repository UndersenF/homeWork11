import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//       task1
        int year = 3600;
        determineYear(year);

//        task2
        int clientOS =  1;
        int clientDeviceYear = 2014;
        determinateVersionOS(clientOS, clientDeviceYear);

//         task3
        int deliveryDistance = 45;
        determinateTimeOfDelivery(deliveryDistance);
    }


//    Метод для task1
    public static void determineYear(int year) {
        if (year % 400 == 0 && year >= 1584) {
            System.out.printf("%s год является високосным!\n", year);
        }
        else if (year % 4 == 0 && year % 100 != 0 && year >= 1584) {
            System.out.printf("%s год является високосным!\n", year);
        }
        else if ( year < 1584) {
            System.out.printf("В %s год еще не ввели високосные года!\n", year);
        }
        else {
            System.out.printf("%s год не является високосным!\n", year);
        }
    }

//    Метод для task2
    public static void determinateVersionOS (int clientOS, int clientDeviceYear ) {
        int actualYear = 2015;
        if (clientOS == 0 && clientDeviceYear < actualYear) {
            System.out.println("Установите облегченную версию приложения iOS по ссылке.");
        }
        else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear < actualYear) {
            System.out.println("Установите облегченную версию приложения Android по ссылке.");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

//    Метод для task3

    public static void determinateTimeOfDelivery(int deliveryDistance) {
        int timeOfDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println(" Потребуется дней : " + timeOfDelivery);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуется дней : " + (int)(timeOfDelivery + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется дней : " + (int) (timeOfDelivery + 2));
        }
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        }
    }
}