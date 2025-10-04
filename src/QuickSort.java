import java.util.*;

public class QuickSort {
    public static int partition(int [] a, int l, int r) {
        int pivot = a[r];
        int i = l - 1;
        for(int j = l; j < r; j++) {
            if(a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i;
    }
    private static void quickSort(int [] a, int l, int r) {
        if(l >= r) return;
        int p = partition(a, l, r);
        quickSort(a, l, p - 1);;
        quickSort(a, p + 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a[i] = x;
        }
        quickSort(a, 0, n-1);
        for(int k : a) {
            System.out.print(k + " ");
        }
    }
}