public class Converter {
    static double lengthStep = 0.75;
    static double calorieStep = 50;
    static void convert(int allMonthSteps) {

        System.out.println("Пройденная дистанция (в км): " + (allMonthSteps * lengthStep / 1000));
        System.out.println("Количество сожжённых килокалорий: " + (allMonthSteps * calorieStep / 1000));
    }
}