//10 41 18 50 43 31 29 25 59 96 67
import java.util.*;
public class Sum_Prime {
    static int isPrime(int n){
        int flag = 0;
        for(int i=2;i<=n;i++){
            if(n%i == 0){
                flag++;
            }
        }
        if(flag == 1){
            return 1;
        }
        return 0;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arr));
        
//        calculate sum of prime and min among the prime array
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])==1){
                sum+=arr[i];
                if(min>arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.println(sum-min);
    }
}