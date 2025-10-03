import java.util.Scanner;

public class InsertionSort {
    private static void InsertionSort (int [] a) {
        int len = a.length;
        for(int i = 1; i < len; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a[i] = x;
        }
        scanner.close();
        InsertionSort(a);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
