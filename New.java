import java.util.*;

class New {
    private String title;
    private String author;
    private int numOfPages;
    private String ISBN;

    public New(String title, String author, int numOfPages, String ISBN) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        this.ISBN = ISBN;
    }

    public String getInitials() {
        String initials = "";
        for (int i = 0; i < author.length(); i++) {
            char currentChar = author.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                initials += currentChar + ".";
            }
        }
        return initials;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author + " (" + getInitials() + ")");
        System.out.println("Pages: " + numOfPages);
        System.out.println("ISBN: " + ISBN);
    }

    public void middle(String s){
        if(s.length()%2==0){
            System.out.println(s.substring(s.length()/2-1, s.length()/2+1));
        }else{
            System.out.println(s.charAt(s.length()/2));
        }
    }

    public static void main(String[] args) {
        New book = new New("1984", "George Orwell", 328, "978-0451524935");
        book.displayBookInfo();
        System.out.println(book.getInitials());
        book.middle("salmitta");
    }



//    public void addStudent(HashMap<Integer, StudentManagement> students, StudentManagement student) {
//        students.put(student.id, student);
//    }
//
//    public void removeStudent(HashMap<Integer, StudentManagement> students, int id) {
//        students.remove(id);
//    }
//
//    public void updateStudent(HashMap<Integer, StudentManagement> students, int id, String name, int age, Set<String> courses) {
//        StudentManagement student = students.get(id);
//        student.name = name;
//        student.age = age;
//        student.courses = courses;
//    }
//
//    public void displayStudents(HashMap<Integer, StudentManagement> students) {
//        Collection<StudentManagement> values = students.values();
//        Iterator<StudentManagement> iterator = values.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//
//    public void searchStudent(HashMap<Integer, StudentManagement> students, int id) {
//        System.out.println(students.get(id));
//    }
//
//    public void listStudentsByCourse(HashMap<Integer, StudentManagement> students, String course) {
//        Collection<StudentManagement> values = students.values();
//        Iterator<StudentManagement> iterator = values.iterator();
//        while (iterator.hasNext()) {
//            StudentManagement student = iterator.next();
//            if (student.courses.contains(course)) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    public static void main(String[] args){
//        HashMap<Integer, StudentManagement> students = new HashMap<>();
//        Set<String> courses = new HashSet<>();
//        courses.add("Java");
//        courses.add("Python");
//        StudentManagement student1 = new StudentManagement(1, "Salma", 20, courses);
//        StudentManagement student2 = new StudentManagement(2, "Gulnura", 21, courses);
//        StudentManagement student3 = new StudentManagement(3, "Azamzamzam", 22, courses);
//        student1.addStudent(students, student1);
//        student2.addStudent(students, student2);
//        student3.addStudent(students, student3);
//        student1.removeStudent(students, 2);
//        student1.updateStudent(students, 1, "Salma", 21, courses);
//        student1.displayStudents(students);
//        student1.searchStudent(students, 1);
//        student1.listStudentsByCourse(students, "Java");
//    }
//
}
