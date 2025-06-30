import java.util.Arrays;
import java.util.Scanner;

public class Nearlysorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {5,10,30,20,40};
        int n = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element you want");
        int element = sc.nextInt();
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]== element){
                System.out.println(mid);
                return;
            }
            else if( mid-1 >= start && array[mid-1]== element){
                System.out.println(mid-1);
                return;
            }
            else if(mid+1 <= end && array[mid+1] == element){
                System.out.println(mid+1);
                return;
            }
            else if(array[mid]<element){
                start = mid+2;
            }
            else{
                end = mid-2;
            }
        }
    }
}
