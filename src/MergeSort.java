import java.util.Scanner;

public class MergeSort {
    private static void merge (int [] a, int l, int m, int r) {
        int [] x = new int[m - l + 1];
        int [] y = new int[r - m];

        for(int i = 0; i < m - l + 1; i++) {
            x[i] = a[l + i];
        }
        for(int i = 0; i < r - m; i++) {
            y[i] = a[m+ i + 1];
        }

        int i = 0; int j = 0;
        while (i < x.length && j < y.length) {
            if(x[i] < y[j]) {
                a[l] = x[i];
                i++; l++;
            }
            else {
                a[l] = y[j];
                j++; l++;
            }
        }
        while (i < x.length) {
            a[l] = x[i];
            i++; l++;
        }
        while (j < y.length) {
            a[l] = y[j];
            j++; l++;
        }
    }

    private static void mergeSort(int [] a, int l, int r) {
        if(l >= r) return;
        int m = (l + r) / 2;
        mergeSort(a , l, m);
        mergeSort(a,m + 1, r);;
        merge(a, l , m, r);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            a[i] = x;
        }
        mergeSort(a, 0, n -1);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}