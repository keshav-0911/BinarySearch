import java.util.Arrays;
import java.util.Scanner;

public class NextAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] array = {'a','b','c','e','f','i','k'};
        int n = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the character");
        char element = sc.next().charAt(0);
        int start = 0;
        int end = n-1;
        char answer = '1';
        int index = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == element){
                System.out.println("Next character is : " + array[mid+1]);
                System.out.println("Index of next character is : " + (mid+1));
                return;
            }
            else if(array[mid] < element){
                start = mid+1;
            }
            else{
                answer = array[mid];
                index = mid;
                end = mid-1;
            }
        }
        System.out.println("Next character is : " + answer);
        System.out.println("Index of next character is : " + index);
    }
}
