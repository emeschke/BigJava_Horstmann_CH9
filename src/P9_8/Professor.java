package P9_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/22/13
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Professor extends Person {
    double salary;

    //Constructor for Professor, same as Person but with a salary.
    public Professor(int birthYear, String name, double salary) {
        super(birthYear, name);
        this.salary = salary;
    }

    @Override
    //An override for toString.  Not sure how the formating should look, it would be possible to change the Person
    //to string output to mesh more nicely, or to reformat this one to look better.  Ditto for Professor.
    public String toString() {
        return "Professor{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }
}
