import java.util.Arrays;
import java.util.Scanner;

// This code will not run because this code is for infinite array, and we can't give infinte array
//as input. So it always go out of bound when we run this code.

// This code is only for practice.

public class InfiniteSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element");
        int element = sc.nextInt();
        int start = 0;
        int end = 1;
        while(element > array[end]){
            start = end;
            end = end*2;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == element){
                System.out.println("Index of the element : " + mid);
                return;
            }
            else if(array[mid] < element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
}
