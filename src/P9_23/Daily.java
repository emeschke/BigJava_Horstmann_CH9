package P9_23;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Daily extends Appointment{

    //Constructor creates the Appointment object.
    public Daily(String sDesc, int date, int month, int year) {
        super(sDesc, date, month, year);
    }

    //Over-ridden method returns true if a fair date is passed to the method, because if an appointment is daily it
    //will happen very day.
    @Override
    public boolean occursOn(int date, int month, int year) {
        return true;
    }

}
