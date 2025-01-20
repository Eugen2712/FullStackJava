package Session17;

/**
 * Class representing an undergraduate student.
 */
public class UndergradStudent extends Student implements Printable {

    /**
     * Constructs a new UndergradStudent with the specified details.
     *
     * @param firstName the first name of the student
     * @param lastName  the last name of the student
     * @param age       the age of the student
     * @param major     the major of the student
     */
    public UndergradStudent(String firstName, String lastName, int age, Major major, String email) {
        super(firstName, lastName, age, major, email);
    }

    /**
     * Constructs a new UndergradStudent with the specified details.
     *
     * @param id        the ID of the student
     * @param firstName the first name of the student
     * @param lastName  the last name of the student
     * @param age       the age of the student
     * @param major     the major of the student
     */
    public UndergradStudent(int id, String firstName, String lastName, int age, Major major, String email) {
        super(id, firstName, lastName, age, major, email);
    }

    /**
     * Prints the details of the undergraduate student.
     */
    @Override
    public void print() {
        System.out.format("| %-15s | %-15d | %-15s | %-15s | %-15d | %-15s | %-15s |%n",
                "Undergraduate", getId(), getFirstName(), getLastName(), getAge(), major, getEmail(),  "");
        System.out.format("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+-------------------------+%n");
    }
}