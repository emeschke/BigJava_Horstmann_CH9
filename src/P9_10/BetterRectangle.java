package P9_10;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BetterRectangle extends Rectangle{

    //Constructor using references to the super object in order to store the location and height/width
    public BetterRectangle(int x, int y, int width, int height){
        super.setLocation(x,y);
        super.setSize(width, height);
    }

    //Use a call to the double in order to get the width, calculate the Perimeter and cast it as an int.
    public int getPerimeter(){
        //System.out.println(2*super.getWidth()+2*super.getHeight());
        return (int) (2*super.getWidth()+2*super.getHeight());


    }

    //Same as above method except with area.
    public int getArea(){
        //System.out.println(super.getWidth()*super.getHeight());
        return (int) (super.getWidth()*super.getHeight());
    }


}
