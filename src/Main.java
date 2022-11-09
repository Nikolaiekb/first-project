import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        printMenu();
        int input = scanner.nextInt();

        while (true) {
            int day = 0;
            int realSteps = 0;
            if (input == 1) {
                System.out.println("Введите число за какой месяц вы хотите ввести данные: 1-Январь - 12-Декабрь?");
                int month = scanner.nextInt();
                System.out.println("За какое число месяца вы хотите ввести данные: от 1 до 30?");
                day = scanner.nextInt();
                System.out.println("Какое количество шагов вы прошли в этот день?");
                realSteps = scanner.nextInt();
                System.out.println("Данные сохранены!");
                stepTracker.saveSteps(month, day, realSteps);
                printMenu();
                input = scanner.nextInt();
            } else if (input == 2) {
                System.out.println("Введите число за какой месяц вы хотите увидеть статистику: 1-Январь - 12-Декабрь?");
                int month = scanner.nextInt();
                stepTracker.showStatistic(month);
                printMenu();
                input = scanner.nextInt();
            } else if (input == 3) {
                System.out.println("Введите необходимое количество шагов?");
                int newGoal = scanner.nextInt();
                stepTracker.changeDailyGoal(newGoal);
                printMenu();
                input = scanner.nextInt();
            } else if (input == 0) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Извините, такой комманды нет, повторите свой выбор.");
                printMenu();
                input = scanner.nextInt();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Добрый день! Какое действие вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определенный день.");
        System.out.println("2 - Напечатать статистику за определенный месяц.");
        System.out.println("3 - Изменить цель по количеству шагов в день.");
        System.out.println("0 - Выход.");
    }
}