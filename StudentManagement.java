import java.util.*;

class Student {
    int id;
    String name;
    int age;
    Set<String> courses;

    public Student(int id, String name, int age, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", courses=" + courses + '}';
    }
}

class StudentManager {
    private HashMap<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.id, student);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void updateStudent(int id, String name, int age, Set<String> courses) {
        Student student = students.get(id);
        if (student != null) {
            student.name = name;
            student.age = age;
            student.courses = courses;
        }
    }

    public void displayStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void searchStudent(int id) {
        System.out.println(students.get(id));
    }

    public void listStudentsByCourse(String course) {
        for (Student student : students.values()) {
            for (String studentCourse : student.courses) {
                if (studentCourse.equals(course)) {
                    System.out.println(student);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        StudentManager m = new StudentManager();
        Set<String> c1 = new HashSet<>();
        c1.add("java");
        c1.add("python");

        Set<String> c2 = new HashSet<>();
        c2.add("java");
        c2.add("cs");

        Set<String> c3 = new HashSet<>();
        c3.add("python");
        c3.add("cs");

        Student s1 = new Student(1, "Salma", 20, c1);
        Student s2 = new Student(2, "Gulnura", 21, c2);
        Student s3 = new Student(3, "Azamzamzam", 22, c3);

        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);

        m.removeStudent(2);
        m.updateStudent(1, "Salma", 17, new HashSet<>(Set.of("java", "cs")));
        m.displayStudents();
        m.searchStudent(1);
        m.listStudentsByCourse("java");
    }
}