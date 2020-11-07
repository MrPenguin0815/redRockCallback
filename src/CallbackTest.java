public class CallbackTest {
    public static void main(String[] args) {
        Logistics JD = new Logistics();
        Student s1 = new Student(JD);
        s1.bookComputer("3242354325");
    }
}
