package P9_16;

import Interfaces.Measureable;
import Interfaces.Measureable;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {

        // /Create an array of countries.
        Country[] cCountries = new Country[10];

        //Populate the array.  Mixed them up in order of initialization because the list came in order from the internet
        //in terms of size and so it might have looked like it just returned the last one (which is the biggest.)
        cCountries[0] = new Country("Ethiopia", 426373);
        cCountries[2] = new Country("South Africa", 470693);
        cCountries[4] = new Country("Mali", 478841);
        cCountries[6] = new Country("Angola", 481354);
        cCountries[8] = new Country("Niger", 489191);
        cCountries[9] = new Country("Chad", 495755);
        cCountries[7] = new Country("Libya", 679362);
        cCountries[1] = new Country("Sudan", 718723);
        cCountries[3] = new Country("Democratic Republic of the Congo", 905355);
        cCountries[5] = new Country("Algeria", 919595);
        Country cBigCountry = (Country) maximum(cCountries);

        //Print out countries, biggest country and max area.  Important point, the method below returns a Measureable
        //interface (I spelled Measureable wrong) and so it is cast to a country.  That is neat.
        for (int i = 0; i < cCountries.length; i++) {
            System.out.println(cCountries[i].getsName() + ": " + cCountries[i].getMeasure());
        }
        System.out.println("Max area is in: " + cBigCountry.getsName());
        System.out.println("Max area is: " + cBigCountry.getMeasure());


    }

    public static Measureable maximum(Measureable[] objects){
        //Code implements a method that returns an array of type Measureable.
        int maxIndex = -1;
        double maxArea= 0;

        //Iterate over the different objects in the array, pick the one with the max size using Measureable methods.
        for (int i = 0; i <objects.length ; i++) {
            if (maxArea < objects[i].getMeasure()){
                maxIndex = i;
                maxArea = objects[i].getMeasure();
            }
        }

        //Return that object.
        return objects[maxIndex];
    }
}
