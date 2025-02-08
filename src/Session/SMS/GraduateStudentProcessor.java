package Session.SMS;

public class GraduateStudentProcessor {
    private StudentService studentService;

    public GraduateStudentProcessor(StudentService studentService) {
        this.studentService = studentService;
    }

    public GraduateStudent graduateStudent(int studentId, double gpa) throws Exception {
        Student student = studentService.getStudents().stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElse(null);

        if (student == null) {
            throw new Exception("Student not found");
        }

        GraduateStudent graduateStudent = new GraduateStudent(student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getAge(),
                student.getMajor(),
                student.getemail());
        graduateStudent.setGPA(gpa);

        studentService.deleteStudent(studentId);
        studentService.addStudent(graduateStudent);
        studentService.saveStudents();

        return graduateStudent;

    }
}
