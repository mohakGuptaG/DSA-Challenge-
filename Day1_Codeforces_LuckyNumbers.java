import java.util.*;

public class LuckyNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=n1; i<=n2; i++){
            if(lucky(i)){
                arr.add(i);
            }
        }
        
        if(arr.isEmpty()){
            System.out.print(-1);
        }

        else{
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        }
    }

    private static boolean lucky (int n){
        while(n>0){
            int digit = n%10;
            if(digit !=4 && digit !=7){
                return false;
            }
            n = Math.floorDiv(n, 10);
        }

        return true;
    }
}
