public class FailureExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int value = numbers[3]; // IndexOutOfBoundsException 발생
        
        System.out.println("Value: " + value);
    }
}
