package neuefisched.de;

public class Main {
    public static void main(String[] args) {
        NewClass object = new NewClass();
        NewClass object2 = new NewClass();
        NewClass object3 = new NewClass();
        NewClass object4 = new NewClass();


        System.out.println(object);
        NewClass.incrementTotalCount();
        NewClass.incrementTotalCount();
        NewClass.incrementTotalCount();
        NewClass.incrementTotalCount();
        System.out.println(object);
        NewClass.incrementTotalCount();
        NewClass.incrementTotalCount();
        object.incrementInstanceCount();
        object.incrementInstanceCount();
        object.incrementInstanceCount();
        System.out.println(object);
        object.incrementInstanceCount();
        object.incrementInstanceCount();
        System.out.println(object);

    }
}