import java.util.*;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
            if(summation(i,a,b)){
                sum+=i;
            }
        }

        System.out.print(sum);
    }

    private static boolean summation (int m, int x, int y){
        int addSum = 0;
        while(m>0){
            int digit = m%10;
            addSum += digit;
            m = Math.floorDiv(m, 10);
        }

        if(addSum>=x && addSum<=y){
            return true;
        }
        else{
            return false;
        }
    }
}
