package P9_23;

import java.io.*;
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
 //This question was really out of control, it is way to much mashed together without good explanation of what is
 required.  This has many methods and uses the four requested classes.  The classes are Appointment, and then sub-classes
 of daily, monthly and onetime.  The main method initializes an array of Appointments and then populates it with three
 example appointments.  It then calls a menu method and runs through an if statement while the menu choice is valid.
 Otherwise the methods below implement the required menu options with a couple of extra methods to validate input.

 This one was frustrating because of all the input and edge cases that could mess up the program coming from user input.
 Is there a more succinct way to use the classes in java to validate input and arrange a menu class like this?
 */
public class Driver {
    public static void main(String[] args) throws IOException {
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
                addAppt(aAppointments);
                choice = menu();
            }
            else if(choice == 3){
                checkDates(aAppointments);
                choice = menu();
            }
            else if(choice == 4){
                writeToFile(aAppointments);
                choice = menu();
            }
            else if(choice ==5){
                reader(aAppointments);
                choice = menu();
            }
        }

    }


    public static int menu(){
        //Menu method.  Prints menu and then reads a string.  If it can convert that to int 1-5 it returns that,
        //otherwise choice is not valid and the method return 0.
        String sChoice;
        System.out.println("\nChoose one of the following.");
        System.out.println("1. Print list of appointments.");
        System.out.println("2. Add an appointment.");
        System.out.println("3. Check the calendar.");
        System.out.println("4. Save an appointment calendar to file.");
        System.out.println("5. Load an appointment from a file.");
        System.out.print("Any other key to exit. Choice:");
        Scanner in =new Scanner(System.in);
        sChoice = in.next();
        if(sChoice.equals("1") || sChoice.equals("2") || sChoice.equals("3") || sChoice.equals("4") || sChoice.equals("5")){
            return Integer.parseInt(sChoice);
        }
        else return 0;

    }

    public static void apptPrint(ArrayList<Appointment> aList){
        //Print a list of the appointments.
        for (int i = 0; i < aList.size(); i++) {
            System.out.println((i+1) + ":" + aList.get(i).getsDesc() + " " + aList.get(i).getIntDate() +
                               "/" + aList.get(i).getIntMonth() + "/"  + aList.get(i).getIntYear());
        }
    }

    public static void addAppt(ArrayList<Appointment> aList){
        //Add an appointment to the list after checking that inputs are valid an ints.
        String type;
        String desc;
        String sDate;
        String sMonth;
        String sYear;
        int date;
        int month;
        int year;

        //Read in the input for the new appointment.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter appt type (daily, monthly, onetime):");
        type = in.next().toLowerCase();
        System.out.println("Enter a string description:");
        desc = in.next();
        System.out.println("Enter a date:");
        sDate = in.next();
        System.out.println("Enter a month:");
        sMonth = in.next();
        System.out.println("Enter a year:");
        sYear = in.next();

        //Check that inputs are ints, if they are assign them to int values.
        if(isInt(sDate) && isInt(sMonth) && isInt(sYear)){
            date = Integer.parseInt(sDate);
            month = Integer.parseInt(sMonth);
            year = Integer.parseInt(sYear);
        }

        else{
            System.out.println("Not valid inputs.  Please try again.");
            return;
        }

        //Check that the dates are valid.
        if(!validate(date, month, year)){
            System.out.println("Not valid inputs.  Please try again.");
            return;
        }

        //Create the new object based on one of the three types.
        System.out.println(type.equals("daily"));
        if(type.equals("daily")){
            Daily d = new Daily(desc, date, month, year);
            aList.add(d);
            System.out.println("Appointment added!");
        }

        else if(type.equals("monthly")){
            Monthly m = new Monthly(desc, date, month, year);
            aList.add(m);
            System.out.println("Appointment added!");

        }
        else if(type.equals("onetime")){
            Onetime o = new Onetime(desc, date, month, year);
            aList.add(o);
            System.out.println("Appointment added!");

        }
        //Otherwise return that it was not added.
        else{
            System.out.println("Not a valid input.");
            return;
        }
    }

    public static boolean validate(int date, int month, int year){
        //Check conditions around the date being valid.  Doesn't allow for leap days unfortunately.
        if(year<0){
            return false;
        }
        else if(month<1 || month > 12){
            return false;
        }
        else if(date<1 || date > 31){
            return false;
        }
        else if((month == 4 || month == 6 || month == 9 ||month == 11) && date > 30){
            return false;
        }
        else if((month == 2 && date > 28)){
            return false;
        }
        else return true;
    }

    public static boolean isInt( String input ) {
        //Check whether it is a boolean.
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( NumberFormatException e ) {
            return false;
        }
    }
    public static void checkDates(ArrayList<Appointment> aList){
        //Menu item three, compare the dates and check to see if they are real.
        //Get inputs and check them.
        String sDate;
        String sMonth;
        String sYear;
        int date;
        int month;
        int year;

        //Read in the input for the new appointment.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date to check:");
        sDate = in.next();
        System.out.println("Enter a month to check:");
        sMonth = in.next();
        System.out.println("Enter a year to check:");
        sYear = in.next();
        if(isInt(sDate) && isInt(sMonth) && isInt(sYear)){
            date = Integer.parseInt(sDate);
            month = Integer.parseInt(sMonth);
            year = Integer.parseInt(sYear);
        }
        else{
            System.out.println("Not a valid date to check.");
            return;
        }

        for (int i = 0; i <aList.size() ; i++) {
            if(aList.get(i).occursOn(date, month, year)){
                System.out.println();
                System.out.println(aList.get(i).getClass());
                System.out.println(aList.get(i).getsDesc() + " : " + aList.get(i).getIntDate() + "/" +
                                   aList.get(i).getIntMonth() + "/" + aList.get(i).getIntYear());
            }

        }
    }

    public static void writeToFile(ArrayList<Appointment> aList){

        //Try catch to write the data to the file.
        try {
            //Write the appointment calendar to file using PrintWriter.
            PrintWriter out = new PrintWriter("appointments.txt");

            //Use a for loop to loop through and print to the file.
            for (int i = 0; i < aList.size() ; i++) {
                out.println(aList.get(i).getsDesc() + "," + aList.get(i).getIntDate() + "," + aList.get(i).getIntMonth() +
                        "," + aList.get(i).getIntYear() + "\n");
            }

            out.close();

            System.out.println("Write to file successful!");

        } catch (IOException e) {
            System.out.println("Not successfully written.");
            e.printStackTrace();
        }
    }

    public static void reader(ArrayList<Appointment> aList) throws IOException{
        //Method loads from a file that is in the same place as where the previous method writes to.  The format
        //of the file to load is string,int,int,int where the ints are date, month, year.  Included is appointments1.txt
        //Please direct the program to the appropriate path to load it.
        try{
            //Figure out what type of appointment to create.
            String apptType;
            String strInputFile;
            String apptInfo;
            System.out.print("Enter type of appointment to create Daily (d), Monthly (m), One-time (o):");
            Scanner in = new Scanner(System.in);
            apptType = in.nextLine().toLowerCase();
            //Get file name, open file.
            System.out.println("Enter a file from which to input data:");
            strInputFile = in.nextLine();
            File inputFile = new File(strInputFile);
            Scanner scFile = new Scanner(inputFile);
            //Read in first line of file and split it into pieces based on commas.
            apptInfo = scFile.nextLine();
            //System.out.println(apptInfo);
            String[] splitStr = apptInfo.split(",");
            //Assign the appointment to the file based on type specified.
            System.out.println(apptType);
            if (apptType.equals("d")){
                Daily newD = new Daily(splitStr[0], Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2]),
                                       Integer.parseInt(splitStr[3]));
                aList.add(newD);
            }
            else if (apptType.equals("m")){
                Monthly newD = new Monthly(splitStr[0], Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2]),
                        Integer.parseInt(splitStr[3]));
                aList.add(newD);
            }
            else if (apptType.equals("o")){
                Onetime newD = new Onetime(splitStr[0], Integer.parseInt(splitStr[1]), Integer.parseInt(splitStr[2]),
                        Integer.parseInt(splitStr[3]));
                aList.add(newD);
            }
            else{
                System.out.println("Appointment type was not valid.");
            }
            scFile.close();
        }

        catch (IOException e){
            System.out.println("Couldn't read from file.");
        }

    }


}

