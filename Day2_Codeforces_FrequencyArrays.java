import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int[] count = new int[x];

        for(int i=0; i<n; i++){
            count[a[i]-1]++;   
        }

        for(int i=0; i<x; i++){
            System.out.println(count[i]);
        }
    }
}

