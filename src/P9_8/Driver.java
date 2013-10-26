package P9_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/22/13
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {

        //Pretty simple, make the objects and then print their toString methods.
        Person ericMeschke = new Person(1982, "Eric Meschke");
        Student billyJean = new Student(1978, "Billy Jean", "English");
        Professor adamGerber = new Professor(1976, "Adam Gerber", 100000);

        System.out.println(ericMeschke.toString());
        System.out.println(billyJean.toString());
        System.out.println(adamGerber.toString());

    }
}
