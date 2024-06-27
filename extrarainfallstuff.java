package rainfallstuff;
public class extrarainfallstuff {
   private double [] myrain; //array to hold rainfall data
    int mostmonth = 0, leastmonth = 0;
    public extrarainfallstuff(double rain[]){
        myrain = new double[rain.length];

        for(int i = 0; i< myrain.length; i++){
        myrain[i]= rain[i];
        }
    }

    public double gettotalrainfall(){
    double total = 0.0; //accumulator
        //accumulate the sum of rain array elements
        for(int i = 0; i< myrain.length; i++){
          total += myrain[i]; // getting the sum
        }
        return total;
    }
    //method calucaltes the average amount of rainfall
    public double getaveragerainfall() {
        return this.gettotalrainfall() / myrain.length;
    }
    //  method to get the month
    // with the highest amount of rainfall
    public int getmostrain(){
        for (int i = 0; i < myrain.length; i++){
        if (myrain[i] > myrain[mostmonth]);
        mostmonth = i;
        }
        //return element number
        return mostmonth;
    }
    // method to get month with least rainfall
    public int getleastrain(){
        for (int i = 0; i < myrain.length; i++){
            if (myrain[i] < myrain[leastmonth]);
            leastmonth = i;
        }
        //return element number
        return leastmonth;
    }
    // getting specified value in the array
    public double getrain(int words) {
        // returns value stored in the specified element
        return words;
    }
    }
