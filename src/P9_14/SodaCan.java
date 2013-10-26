package P9_14;

import Interfaces.Measureable;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class SodaCan implements Measureable{
    double dHeight;
    double dRadius;

    //Create a constructor.
    public SodaCan(double height, double radius){
        dHeight = height;
        dRadius = radius;
    }

    //Create the getMeasure method.  This is required by implementing class Measureable.
    public double getMeasure(){
        return 2* Math.PI*dRadius*(dRadius + dHeight);
    }
}
