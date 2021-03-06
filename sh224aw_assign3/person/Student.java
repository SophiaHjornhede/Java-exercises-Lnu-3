package sh224aw_assign3.person;

/**
 * Assignment-3, exercise-2
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class Student extends Person{
    String classStatus;

    // Constructor
    public Student(String name, String address, String phonenumber, String email, String classStatus) {
        super(name, address, phonenumber, email);
        this.classStatus = classStatus;
    }

    // Getter and setter
    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classStatus='" + classStatus + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
