import java.util.Arrays;
import java.util.Scanner;

public class FloorElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3,4,8,10,10,12,19};
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element you want");
        int element = sc.nextInt();
        int n = array.length;
        int start = 0;
        int end = n-1;
        int result = -1;
        while(start<=end){
            int mid  = start + (end-start)/2;
            if(array[mid]==element){
                System.out.println(mid);
                return ;
            }
            else if(array[mid] < element){
                result = array[mid];
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(result);
    }
}
