package P9_23;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Appointment {
    String sDesc;
    int intDate;
    int intMonth;
    int intYear;

    public Appointment(String sDesc, int date, int month, int year){
        this.sDesc = sDesc;
        intDate = date;
        intMonth = month;
        intYear = year;
    }

    public boolean occursOn(int year, int month, int date){
        if(intYear == year && intMonth == month && intDate == date) {
            return true;
        }
        else return false;
    }

    public String getsDesc() {
        return sDesc;
    }

    public int getIntDate() {
        return intDate;
    }

    public int getIntMonth() {
        return intMonth;
    }

    public int getIntYear() {
        return intYear;
    }
}
