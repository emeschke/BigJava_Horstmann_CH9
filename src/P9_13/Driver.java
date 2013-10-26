package P9_13;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {

        //Create labeled point object.
        LabeledPoint lP = new LabeledPoint(4,67, "My name is RUBEN!");
        //Call the toString method.
        System.out.println(lP.toString());
    }
}
