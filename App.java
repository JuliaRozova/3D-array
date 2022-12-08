package ThreeDecimalArray;

public class App {
    public static void main(String[] args) {
        ThreeDecimalArray array = new ThreeDecimalArray(5,3,3);
        array.createArray();
        System.out.println("Origin array:");
        array.printArray();
        array.sortArray();
        System.out.println("Sorted array: ");
        array.printArray();
    }
}
