package P9_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/22/13
 * Time: 12:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    String name;
    int birthYear;

    //Constructor for Person with a birthyear and a string for name.
    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    @Override
    //Override for the toString method.
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
