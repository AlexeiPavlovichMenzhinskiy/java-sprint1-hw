
public class Converter {

    double stepsToMeters;
    double stepsToKilocalories;

    Converter(double meters, double Kilocalories) {
        stepsToMeters = meters;
        stepsToKilocalories = Kilocalories;
    }

    void convert(int steps) {

        System.out.println("Поздравляем! Вы прошли: " + (int)(steps*stepsToMeters) + " метров и потратили: " + (int)(steps*stepsToKilocalories) +" килокалорий.");
    }
}



