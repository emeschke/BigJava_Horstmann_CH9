package P9_16;

import Interfaces.Measureable;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Country implements Measureable{
    String sName;
    double fSize;

    //Constructor for Country
    public Country(String name, double sqSize){
        sName = name;
        fSize = sqSize;
    }

    //getters for size and name of object.
    public double getMeasure(){
        return fSize;
    }

    public String getsName(){
        return sName;
    }
}
