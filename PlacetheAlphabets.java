//        input1={10 5 70 1}
//        output={c,b,d,a} 
import java.util.*;

public class PlacetheAlphabets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(arr));
        
        int min = Integer.MAX_VALUE;
        char[] c = new char[n];
        int alphabet = 97; //(char)97 = 'a';
//        find the min value and replace
        int min_index = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(min>arr[j]){
                    min = arr[j];
                    min_index = j;
                }
            }
            min = Integer.MAX_VALUE;
//            System.out.println(min+" "+min_index);
            arr[min_index] = Integer.MAX_VALUE;
            c[min_index] = (char)(alphabet++);
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(arr));
    }
}