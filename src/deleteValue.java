import java.util.Scanner;

public class deleteValue {
    public static void main(String[] args) {
        int size, temp, j;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter number of values :");
            size = scanner.nextInt();
        }while (size<=0);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter value " + (i + 1) + " = ");
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Enter value want to delete : ");
        int x = scanner.nextInt();
        for ( temp = j = 0; j < arr.length; j++) {
            if (arr[j] != x) {
                arr[temp] = arr[j];
                temp ++;
            }
        }
        size = temp;
        for ( j = 0; j < size; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
