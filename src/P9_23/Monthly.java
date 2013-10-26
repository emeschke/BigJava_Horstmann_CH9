package P9_23;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Monthly extends Appointment {

    //Constructor creates the Appointment object.
    public Monthly(String sDesc, int date, int month, int year) {
        super(sDesc, date, month, year);
    }

    //Overrides and checks to see if only the date matches the date provided.  Returns true if that is the case.
    @Override
    public boolean occursOn(int date, int month, int year) {
        if(date == super.getIntDate()){
            return true;
        }
        return false;
    }
}
