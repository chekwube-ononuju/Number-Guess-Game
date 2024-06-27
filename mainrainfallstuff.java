package rainfallstuff;
import java.util.Scanner;

public class mainrainfallstuff {
    public static void main(String[] args) {

        double[] thisyear = {1.6 ,2.1 ,1.7 ,3.5 ,2.6 ,3.7 ,
                3.9 ,2.6 ,2.9 ,4.3 ,2.4 ,3.7};

        extrarainfallstuff myrainfall = new extrarainfallstuff(thisyear);
        // code to get total rainfall
        System.out.println("Total rainfall: " + myrainfall.gettotalrainfall());

        //code to get average rainfall
        System.out.println("Average rainfall: " + myrainfall.getaveragerainfall());

        //code to get the month with the most rain
        System.out.println("Month with the most rain: " +
                (myrainfall.getmostrain()+1));

        // code to get amount of rain in most month
        int high = myrainfall.getmostrain();
        System.out.println("Amount of rain " + "is " +
                + myrainfall.getrain(high) + " inches.");

        //code to get the month with the least rain
        System.out.println("Month with the least rain: " +
                (myrainfall.getleastrain()+1));

        // code to get amount of rain in the least month
        int low = myrainfall.getleastrain();
        System.out.println("Amount of rain " + "is " +
                myrainfall.getrain(low) + " inches.");
        }
    }

