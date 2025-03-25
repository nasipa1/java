public class Trio <A, B, C> {
    private A trioA;
    private B trioB;
    private C trioC;


    public Trio(A a, B b, C c) {
        trioA = a;
        trioB = b;
        trioC = c;
    }

    @Override
    public String toString() {
        return trioA + " " + trioB + " " + trioC ;

    }

    public void display() {
        System.out.println("Trio contains: \n" + trioA.toString() + " " + trioB.toString() + " " + trioC.toString());
    }

    public static void main(String[] args) {
        Trio<Integer, String, Double> t = new Trio<>(5, "Hello", 3.5);
        t.display();

        Trio<Trio, Character, Exception> t2 = new Trio<>(t, 'c', new Exception("lololol"));

        t2.display();

        Trio <Number, Boolean, Object> t3 = new Trio<>(3, true, new Book("Harry Potter", "JK Rowling", 2010));
        t3.display();
    }


}
