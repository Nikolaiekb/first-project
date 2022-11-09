import java.util.Scanner;

public class Main {
    StepTracker stepTracker = new StepTracker();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMenu();

        while (input != 0) {
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Введите число за какой месяц вы хотите ввести данные: 1-Январь - 12-Декабрь?");
                int month = scanner.nextInt();
                System.out.println("За какое число месяца вы хотите ввести данные: от 1 до 30?");
                int day = scanner.nextInt();
                System.out.println("Какое количество шагов вы прошли в этот день?");
                int realSteps = scanner.nextInt();
                System.out.println("Данные сохранены!");
                stepTracker.saveSteps (month, day, realSteps);
            } else if (input == 2) {
                System.out.println("Введите число за какой месяц вы хотите увидеть статистику: 1-Январь - 12-Декабрь?");
                int month = scanner.nextInt();
                stepTracker.showStatistic(month);
            } else if (input == 3) {
                System.out.println("Введите необходимое количество шагов?");
                int newGoal = scanner.nextInt();
                stepTracker.changeDailyGoal(newGoal);
            } else if (input == 0) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Извините, такой комманды нет, повторите свой выбор.");
                // обработка разных случаев
                // печатаем меню ещё раз перед завершением предыдущего действия
                // повторное считывание данных от пользователя
            }
        }
    }
        public static
        private static void printMenu () {
            System.out.println("Добрый день! Какое действие вы хотите сделать?");
            System.out.println("1 - Ввести количество шагов за определенный день.");
            System.out.println("2 - Напечатать статистику за определенный месяц.");
            System.out.println("3 - Изменить цель по количеству шагов в день.");
            System.out.println("0 - Выход.");
        }
}