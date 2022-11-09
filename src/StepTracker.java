public class StepTracker {

    int[][] monthsAndDays = new int[12][30];
    int realSteps = 0;
    int stepGoal = 10_000;
    ;


    public int saveSteps(int month, int day, int realSteps) {
        if (month < 1 || month > 12) {
            System.out.println("Введен неверный месяц.");
            return month;
        }
        if (day < 0 || day > 31) {
            System.out.println("Введен неверный день.");
            return day;
        }
        if (realSteps < 0) {
            System.out.println("Количество шагов не может быть отрицательным.");
            return realSteps;
        }
        monthsAndDays[month - 1][day - 1] = realSteps;

        return realSteps;
    }

    public void showStatistic(int month) {
        int allStepsPerMonth = 0;
        int maxDaySteps = 0;
        int numberOfDay = 0;
        int bestSeries = 0;
        int durBestSeries = 0;
        if (month > 0 || month < 13) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 30; j++) {
                    allStepsPerMonth = allStepsPerMonth + monthsAndDays[i][j];
                    if (i == month - 1) {
                        if (j != 29) {
                            System.out.print((j + 1) + " день: " + monthsAndDays[i][j] + ", ");
                        } else {
                            System.out.print((j + 1) + " день: " + monthsAndDays[i][j] + "." + "\n");
                        }
                    }
                    if (maxDaySteps < monthsAndDays[i][j]) {
                        maxDaySteps = monthsAndDays[i][j];
                        numberOfDay = j + 1;
                    }
                    if (i + 1 == month) {
                        if (monthsAndDays[i][j] > stepGoal) {
                            durBestSeries++;

                        } else {
                            bestSeries = Math.max(bestSeries, durBestSeries);
                            durBestSeries = 0;
                        }
                    }
                }
            }

            double averageSteps = allStepsPerMonth / 30;
            System.out.println("Общее количество шагов за месяц: " + allStepsPerMonth);
            System.out.println("Максимальное количество шагов - " + maxDaySteps +
                    " было пройдено в день номер " + numberOfDay);
            System.out.println("Среднее количество шагов в день: " + averageSteps);
            Converter.convert(allStepsPerMonth);
            System.out.println("Лучшая серия: " + bestSeries + " дней");

        } else {
            System.out.println("Название месяца введено неверно");
        }
    }

    public int changeDailyGoal(int newGoal) {
        stepGoal = newGoal;
        System.out.println("Данные сохранены! Цель по количеству пройденных шагов в день составляет " + newGoal);
        return newGoal;
    }
}





