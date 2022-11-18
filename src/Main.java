public class Main {
    public static void checkYear(int year) {

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным"); }
        else if (year % 4 ==0 && year % 100 > 0) {
            System.out.println(year + " год является високосным!"); }
        else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным..."); }
        else { System.out.println(year + " год не является високосным!"); }

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
    checkYear(2008);
    }


}