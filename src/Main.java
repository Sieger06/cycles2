public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание - 1");
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; i++ ) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений " + total);
        }

        System.out.println();
        System.out.println("Задача 2");
        int numericalSeries = 0;
        while (numericalSeries < 10){
            numericalSeries++;
            System.out.print(numericalSeries + " ");
        }
        System.out.println("\n");
        for (numericalSeries = 10; numericalSeries > 0; numericalSeries--){
            System.out.print(numericalSeries + " ");
        }

        System.out.println("\n");
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int fertility = Y / 1000 * 17;
        int mortality = -(Y / 1000 * 8);
        int year = 2022;
        int population = Y;
        for (; year <= 2032; year++) {
            population = population + fertility + mortality;
            System.out.println("Год " + year + " численность населения составляет " + population + " человек.");
        }

        System.out.println();
        System.out.println("Домашнее задание - 2");
        System.out.println("Задача 1 - 3");
        int DepositAmount = 15_000;
        int TotalAmount = 0;
        int month = 0;
        int MonthInYear = 12;
        int DepositYears = 9;
        while (month <= MonthInYear * DepositYears){
            month++;
            TotalAmount = TotalAmount + DepositAmount + DepositAmount / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Накоплений " + TotalAmount + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задача 4");
        int dateFriday = 5;
        for (; dateFriday <=31; dateFriday += 7) {
                System.out.println("Сегодня пятница - " + dateFriday + "-е число. Необходимо подготовить отчёт.");
        }
    }
}