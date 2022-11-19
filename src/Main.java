import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным!");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным...");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void checkDevice(int yearDevice, int osDevice) {
        int currentYear = LocalDate.now().getYear();
        if (osDevice == 0 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (osDevice == 0 && yearDevice == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (osDevice == 1 && yearDevice < currentYear) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        if (osDevice == 1 && yearDevice == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (osDevice > 1 || yearDevice > currentYear) {
            System.out.println("Некорректно введены данные, проверьте ещё раз, пожалуйста");
        }
    }

    public static void calculateDays(double deliveryDistance) {
        double deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("При расстоянии " + deliveryDistance + "км от банка, доставка осуществляется в течение " + deliveryTime + " дня");
        } else if (deliveryDistance > 20) {
            deliveryTime = ((deliveryDistance - 20) / 40) + 1;
            System.out.println("При расстоянии " + deliveryDistance + "км от банка, доставка осуществляется в течение " + Math.ceil(deliveryTime) + " дней");
        }
    }
    public static double checkDays(double distance) {
        double deliveryTime = 1;
        if (distance <= 20) {
            return deliveryTime;
        } else {
            deliveryTime = (distance - 20) / 40 + 1;
            return Math.ceil(deliveryTime);
        }
    }

    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++");
        System.out.println("---------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("    Урок Методы");
        System.out.println();
        System.out.println("Черновик");
        //Черновик
        int[] issuesByMonth = {5, 6, 7, 9, 2, 5, 4, 2, 1, 3, 10, 11, 5, 8, 4, 7, 11, 5};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            } else if (i == issuesByMonth.length - 1) {
                printSeparator();
            }
        }
        int total = sum(issuesByMonth);
        printIssues(total);

        //ДЗ
        System.out.println();
        System.out.println("    ДЗ");

//        Задание 1
        System.out.println("Задание 1");
        checkYear(2012);

//    Задание 2
        System.out.println();
        System.out.println("    Задание 2");
        checkDevice(2021, 1);

//        Задание 3
        System.out.println();
        System.out.println("    Задание 3");
        calculateDays(356);

        System.out.println();
        System.out.println("    Конец.");

//        P.S. Задание 3.1 (использовал возвращающий метод)
        System.out.println();
        System.out.println("P.S.Задание 3.1");
        double deliveryDistance = 356;
        double deliveryTime = checkDays(deliveryDistance);
        System.out.println("При расстоянии " + deliveryDistance + " км от банка, доставка банковской карты осуществляется в течение " + deliveryTime + " суток");
    }
}
