public class Main {
    public static void main(String[] args) {

        // Домашнее задание 1
        // Задача 1
        int savingPerMonth = 15000;
        int total = 0;
        int v = 0;
        while (total <= 2459000) {
            v++;
            total = total + total / 100;
            total = total + savingPerMonth;
            System.out.println("Месяц " + v + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Задача 3
        int population = 12_000_000;
        float birthrate = (float) 0.017;
        float mortality = 0.008F;
        for (int year = 1; year <= 10; year++) {
            population = (int) (population + population * birthrate - population * mortality);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Домашнее задание 2
        // Задача 1
        int totalDeposit = 15000;
        int month = 0;
        while (totalDeposit <= 12_000_000) {
            month++;
            totalDeposit = totalDeposit + totalDeposit * 7 / 100;
            System.out.println("Месяц " + month + " сумма накоплений равна " + totalDeposit + " рублей");
        }

        // Задача 2
        int totalDeposit1 = 15000;
        int month1 = 0;
        while (totalDeposit1 <= 12_000_000) {
            month1++;
            totalDeposit1 = totalDeposit1 + totalDeposit1 * 7 / 100;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма накоплений равна " + totalDeposit1 + " рублей");
            }
        }
        System.out.println(totalDeposit1);
        System.out.println(month1);

        // Задача 3
        int totalDeposit2 = 15000;
        int month2 = 0;
        while (month2 <= 9 * 12) {
            month2++;
            totalDeposit2 = totalDeposit2 + totalDeposit2 * 7 / 100;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + totalDeposit2 + " рублей");
            }
        }

        // Задача 4
        for (int friday = 5; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Домашнее задание 3
        // Задача 1
        for (int cometYear = 0; cometYear <= 2022 + 100; cometYear = cometYear + 79) {
            if (cometYear >= 2022 - 200)
                System.out.println(cometYear);
        }

        // Задача 2
        for (int z = 1; z <= 10; z++) {
            int number = z * 2;
            if (number <= 20) {
                System.out.println("2 * " + z + " = " + number);

            }

        }
    }

}
