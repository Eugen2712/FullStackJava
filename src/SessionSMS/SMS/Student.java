package SessionSMS.SMS;

import java.util.regex.Pattern;

/**
 * The abstract Student class represents a student with common attributes and methods.
 * It implements the Printable interface to allow printing student details.
 */
public abstract class Student implements Printable {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    protected Major major;
    private String email;

    private static int nextId = 1;

    /**
     * Constructs a Student with the specified details.
     *
     * @param id the student's ID
     * @param firstName the student's first name
     * @param lastName the student's last name
     * @param age the student's age
     * @param major the student's major
     */
    public Student(int id, String firstName, String lastName, int age, Major major, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.email = email;
    }

    /**
     * Gets the student's ID.
     *
     * @return the student's ID
     */
    public int getId() { return id; }

    /**
     * Gets the student's first name.
     *
     * @return the student's first name
     */
    public String getFirstName() { return firstName; }

    /**
     * Gets the student's last name.
     *
     * @return the student's last name
     */
    public String getLastName() { return lastName; }

    /**
     * Gets the student's age.
     *
     * @return the student's age
     */
    public int getAge() { return age; }

    /**
     * Gets the student's last name.
     *
     * @return the student's last name
     */
    public String getemail() { return email; }

    /**
     * Gets the student's major.
     *
     * @return the student's major
     */
    public Major getMajor() { return major; }

    /**
     * Sets the student's first name.
     *
     * @param firstName the student's first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Sets the student's last name.
     *
     * @param lastName the student's last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Sets the student's age.
     *
     * @param age the student's age
     */
    public void setAge(int age) {
        if (age < 18 || age > 150) {
            throw new IllegalArgumentException("Age must be between 18 and 150.");
        }
        this.age = age;
    }

    public void setEmail(String email) throws IllegalEmailException {
        String emailPattern = "^[\\w.-]+@[\\w.-]+.[A-Za-z]{2,6}$";
        if (Pattern.matches(emailPattern, email)) {
            this.email = email;
        } else {
            throw new IllegalEmailException("Email is not valid!");
        }
    }
    /**
     * Sets the student's major.
     *
     * @param major the student's major
     */
    public void setMajor(Major major) { this.major = major; }

    /**
     * Sets the next ID to be assigned to a student.
     *
     * @param nextId the next ID to be assigned
     */
    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    /**
     * Prints the details of the student.
     */
    @Override
    public abstract void print();
}