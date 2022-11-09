public class StepTracker {

    int[][] monthsAndDays;
    int stepsGoal;
    int stepsPerDay;

    private static void StepTracker() {
        stepGoal = 10_000;
        stepsPerDay = 0;
        stepsPerMonth = 0;
        monthsAndDays = new int[12][30];
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 30; j++) {
                {stepsPerMonth = stepsPerMonth + steps[month - 1][i];}}
            }
        }
        System.out.println("За "+ month + "-й месяц вы прошли " + stepsPerMonth + " шагов");
    }

            }
        }
    }
    public static void saveSteps (int month, int day, int realSteps){
        if (realSteps < 0) {
            System.out.println("Количество шагов не может быть отрицательным.");
            return;
        } else if (0 > day > 30) {
            System.out.println("Введен неверный день.");
            return;
        } else if (0 > month > 12){
            System.out.println("Введен неверный месяц");
            return;
        }
    }


        int changeDailyGoal (int newGoal){
            stepGoal = newGoal;
            System.out.println("Данные сохранены! Цель по количеству пройденных шагов в день составляет " + newGoal);
        return newGoal;
        }

}