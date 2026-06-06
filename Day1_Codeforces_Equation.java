import java.util.*;

public class Equation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long n = sc.nextInt();

        long sum = 0;

        for(int i=2; i<=n; i+=2){
            sum += power(x,i);
        }

        System.out.print(sum);
    }

    private static long power(long a, long b){
        long mul = 1;
        for(int j=1; j<=b; j++){
            mul*=a;
        }

        return mul;
    }
}
