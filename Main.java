import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // cleanData test case
        double[] list1 = {99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5};
        ArrayList<Double> array1 = new ArrayList<>();
        for (double d : list1) array1.add(d);
        WeatherData test1 = new WeatherData(array1);
        test1.cleanData(85.0, 120.0);
        
        // longestHeatWave test cases
        double[] list2 = {100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2};
        ArrayList<Double> array2 = new ArrayList<>();
        for (double d : list2) array2.add(d);
        WeatherData test2 = new WeatherData(array2);
        System.out.println(test2.longestHeatWave(100.5));
        System.out.println(test2.longestHeatWave(95.2));
    }
}