import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int min;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Size of Array: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("This size does not exceed");
            }
        } while (size > 20);
        array = new int[size];
        System.out.println("Enter Elements's Value: ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your array: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("\nMin Element In Array: " + min);
    }
}
