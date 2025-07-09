import java.util.Arrays;
import java.util.Scanner;


// This code is for to find the first 1 in the infinite binary sorted array.


public class BinarySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(array));
        int element = 1;
        int start = 0;
        int end = 1;
        while(array[end] < element){
            start = end;
            end = end*2;
        }
        int result = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == element){
                result = mid;
                end = mid-1;
            }
            else if(array[mid] < element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("The index of first 1 in this array is : " + result);
    }
}
