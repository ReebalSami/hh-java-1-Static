package neuefisched.de;

public class NewClass {

    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
        totalCount++;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                " totalCount= " + totalCount +
                " instanceCount= " + instanceCount +
                " " +
                '}';
    }

}
