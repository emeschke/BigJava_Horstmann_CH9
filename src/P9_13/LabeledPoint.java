package P9_13;

import java.awt.*;



/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class LabeledPoint extends Point {

    String strLabel;

    //Store the location in the Super Point object.
    public LabeledPoint(int x, int y, String label){
        super.setLocation(x,y);
        strLabel = label;
    }

    //Override the toString method to print from toString method of Point class.
    @Override
    public String toString() {
        return "LabeledPoint{" + super.toString() +
                " strLabel='" + strLabel + '\'' +
                '}';
    }
}
