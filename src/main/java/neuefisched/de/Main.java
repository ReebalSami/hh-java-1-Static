package neuefisched.de;

public class Main {
    public static void main(String[] args) {
        NewClass object = new NewClass();
        NewClass object2 = new NewClass();
        NewClass object3 = new NewClass();
        NewClass object4 = new NewClass();

        NewClass.incrementTotalCount();
        object.incrementInstanceCount();

    }
}