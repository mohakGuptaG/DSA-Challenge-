import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        
        for(int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }
        
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        
        int i=0, j=0;
        
        while(i<n1 && j<n2){
            if(a2[j] == a1[i]){
                j++;
            }
            i++;
        }
        
        if(j == n2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
