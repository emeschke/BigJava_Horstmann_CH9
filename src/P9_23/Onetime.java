package P9_23;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Onetime extends Appointment {

    //Constructor for the class, constructs the class in Appointment
    public Onetime(String str, int date, int month, int year){
        super(str, date, month, year);
    }

    @Override
    //All three fields must match in order to return this appointment type.  Override the original method.
    public boolean occursOn(int date, int month, int year) {
        if(date == super.getIntDate() && month == super.getIntMonth() && year == super.getIntYear()){
            return true;
        }
        else return false;
    }
}
