package rnd.mate00.codewars;

/**
 * https://www.codewars.com/kata/growth-of-a-population/train/java
 */
public class Arge {

    public static int nbYear(int initialPopulation, double percent, int yearlyPopulationChange, int populationLimit) {
        int currentPopulation = initialPopulation;
        int years = 0;

        while (currentPopulation < populationLimit) {
            currentPopulation = (int) (currentPopulation * (1 + percent/100) + yearlyPopulationChange);
            years++;
        }

        return years;
    }
}
