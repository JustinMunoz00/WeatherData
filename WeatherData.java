import java.util.ArrayList;

public class WeatherData
{
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    /**
    * Cleans the data by removing from temperatures all values that are less than
    * lower and all values that are greater than upper, as described in part (a)
    */
    public void cleanData(double lower, double upper){ 
        for (int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) < lower || temperatures.get(i) > upper) {
                temperatures.remove(i);
                i--;
            }
        }
        System.out.println(temperatures);
    }

    /**
    * Returns the length of the longest heat wave found in temperatures, as described in
    * part (b)
    * Precondition: There is at least one heat wave in temperatures based on threshold.
    */
    public int longestHeatWave(double threshold){
        int maxCount = 0;
        int count = 0;
        for (double t : temperatures){
            if (t > threshold) count++;
            else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }
        return maxCount;
    }
    
    // There may be instance variables, constructors, and methods that are not shown.
    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }

    
}
