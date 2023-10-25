public class MyClass {
    private static int instanceCount = 0; // Static variable to count instances
    
    public MyClass() {
        instanceCount++; // Increment count when an instance is created
    }
    
    public static int getCount() {
        return instanceCount;
    }
    
}