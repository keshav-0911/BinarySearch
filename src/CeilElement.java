import java.util.Arrays;
import java.util.Scanner;

public class CeilElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,8,10,10,12,14};
        int n = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element");
        int element = sc.nextInt();
        int start = 0;
        int end = n-1;
        int answer = -1;
        int index = -1;
        while(start<=end){
             int mid = start + (end-start)/2;
             if(array[mid] == element){
                 System.out.println("Ceil element : " + array[mid]);
                 System.out.println("Index of Ceil element : " + mid);
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
        System.out.println("Ceil element : " + answer);
        System.out.println("Index of Ceil element : " + index);
    }
}
