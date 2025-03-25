public class AnonymousClass {
    public static void main(String[] args) {
        User u = new User() {
            public void getInfo() {
                System.out.println("User Anonymous");
            }
        };
        u.getInfo();

        User u2 = new Admin();
        u2.getInfo();

        User u3 = () -> System.out.println("User Lambda");
        u3.getInfo();
    }
}

interface User {
    void getInfo();
}

class Admin implements User {
    public void getInfo() {
        System.out.println("User Admin");
    }
}
