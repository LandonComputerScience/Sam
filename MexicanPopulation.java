import java.util.Scanner;

public class MexicanPopulation {
    public static final int startYear = 2014;
    public static final double growth = 1.005;
    public static final double startGrowth = 123.8;

    public static void main(String[] args) {
        System.out.println("Type how large the population should be in millions");
        Scanner Total = new Scanner(System.in);
        double x = Total.nextDouble();
        int year;
        for (year = startYear; startGrowth * Math.pow(growth, year - startYear) < x; year++) {
        }
        System.out.println("By the year "+year+" the population will reach the goal of "+x);

    }
}
