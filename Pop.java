import java.util.Scanner;

public class Pop{
    //Program 'Pop' will determine the population based on website stats http://www.worldometers.info/world-population/ by 10 data sets, given a year as input, and return long value of population
    public static void main(String [] args){
        System.out.println("Enter year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); //read Int input with IO scanner class
        long var =  36/10 * 86400 * 365; //mathematic formula for pop increase in a year based on timed trials for RT statistical data provided by website
        long pop = 0;
        long currPop = (7242647500L + ((var/365)*190)); //algorithm for total current population extrapolated for until the end of the year 2014 (190 days from today's pop value of ~7.2E9)
            if (year >= 2014){
                year = year - 2014; //input year is above 2014
                pop = ((var * year) + currPop);
                 System.out.println("There will be " + pop + " people in the year " + (year+2014) + ".");
        }
            else if (year < 2014){
                year = 2014 - year; //input year is below 2014
                pop = currPop - (var * year);
                System.out.println("There was " + pop + " people in the year " + (2014 - year) + ".");
                /* else if( year <= 1937) {
                 CODE CODE CODE NEW ALGORITHM
    }
        //NOTES; Algorithm seems to be flawed for PAST years more than 50 years ago, past 1950, further calculations are required
        
        //*********total programming time: ~30 Mins ******** */
       
}
}
}
