package P9_23;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {
        //Array list for the values of different appointments.
        ArrayList<Appointment> aAppointments = new ArrayList<Appointment>();
        //Initialize a few objects of different types to populate the array.
        Monthly massage = new Monthly("Massage appointment",1,2,2013);
        Onetime disney = new Onetime("Disneyland!!",3,5,2014);
        Daily sleep = new Daily("Bedtime.",10,25,2013);
        aAppointments.add(massage);
        aAppointments.add(disney);
        aAppointments.add(sleep);

        //Menu method to run the different choices or exit if choice is not a valid one.
        int choice = menu();
        while (choice != 0){
            if(choice == 1){
                apptPrint(aAppointments);
                choice = menu();
            }
            else if(choice == 2){
                //add method
                choice = menu();
            }
            else if(choice ==3){
                //check dates method
                choice = menu();
            }
            else if(choice == 4){
                //save method
                choice = menu();
            }
            else if(choice ==5){
                //load method
                choice = menu();
            }
        }

    }


    public static int menu(){
        //Menu method.  Prints menu and then reads a string.  If it can convert that to int 1-5 it returns that,
        //otherwise choice is not valid and the method return 0.
        String sChoice;
        System.out.println("Choose one of the following.");
        System.out.println("1. Print list of appointments.");
        System.out.println("2. Add an appointment.");
        System.out.println("3. Check the calendar.");
        System.out.println("4. Save an appointment to file.");
        System.out.println("5. Load an appointment from a file.");
        System.out.print("Any other key to exit. Choice:");
        Scanner in =new Scanner(System.in);
        sChoice = in.next();
        if(sChoice.equals("1") || sChoice.equals("2") || sChoice == "3" || sChoice == "4" || sChoice == "5"){
            return Integer.parseInt(sChoice);
        }
        else return 0;

    }

    public static void apptPrint(ArrayList<Appointment> aList){
        System.out.println(aList.size());
        for (int i = 0; i < aList.size(); i++) {
            System.out.println((i+1) + ":" + aList.get(i).getsDesc() + " " + aList.get(i).getIntDate() +
                               "/" + aList.get(i).getIntMonth() + "/"  + aList.get(i).getIntYear());
        }
    }
}

