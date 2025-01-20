package Session14.SMS;

import java.util.ArrayList;

public class UndergraduateStudent extends Student implements details {
    public UndergraduateStudent(String fistname, String lastname, String major, Integer age) {
        super(fistname, lastname,major, age);
    }

    @Override
    public void displayInfo() {
            System.out.printf("| %-20s | %-20s | %-10s | %-5d | %-11d\n",
                    getFistname(),
                    getLastname(),
                    getMajor(),
                    getAge(),
                    getIdGenerator());
            System.out.println("-------------------------------------------------------------------------------------------");
    }

    @Override
    public void editDetails() {
        System.out.println("The student" + getFistname() +" "+ getLastname()+ " didn't graduate!");
    }
}
