package P9_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/22/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student extends Person {
    String major;

    //Constructor for Student, the two super fields and an additional one for major.
    public Student(int birthYear, String name, String major) {
        super(birthYear, name);
        this.major = major;
    }

    @Override
    //An override for toString.  Not sure how the formating should look, it would be possible to change the Person
    //to string output to mesh more nicely, or to reformat this one to look better.  Ditto for Professor.
    public String toString() {
        return "Student{" + super.toString() +
                "major='" + major + '\'' +
                '}';
    }
}
