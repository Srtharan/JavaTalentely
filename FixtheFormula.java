import java.util.*;
public class FixtheFormula {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.toLowerCase();
    char[] number_arr = new char[s.length()]; int n_index = 0; int n=0;
    char[] operator_arr = new char[s.length()]; int operator_index = 0;int operator=0;
    for(int i=0;i<s.length();i++){
        char curr = s.charAt(i);
        if(curr>='0' && curr<='9'){
            number_arr[n_index++] = curr;
        }
        else if(curr == '-' ||curr == '+'||curr == '/'||curr == '*'){
            operator_arr[operator_index++] = curr;
        }
        else{
            continue;
        }
    }
    System.out.println(Arrays.toString(number_arr));
    System.out.println(Arrays.toString(operator_arr));
        // perform calculation using number_arr[n] operator_arr[operator] 
        int val = (int)(number_arr[n++])-48; 
        for(int i=0;i<operator_arr.length;i++,operator++){
            switch (operator_arr[operator]) {
                case '+':
                    val+=(int)(number_arr[n++])-48;
                    break;
                case '-':
                    val-=(int)(number_arr[n++])-48;
                    break;
                case '/':
                    val/=(int)(number_arr[n++])-48;
                    break;
                case '*':
                    val*=(int)(number_arr[n++])-48;
                    break;
                default:
                    break;
            }
    }
    System.out.println(val);
}
}