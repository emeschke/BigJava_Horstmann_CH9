package P9_10;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {

    //Create object br of type better rectangle.  Print the values returned for Perimeter and Area
    BetterRectangle br = new BetterRectangle(3,4,5,6);
        System.out.println(br.getPerimeter());
        System.out.println(br.getArea());
    }
}