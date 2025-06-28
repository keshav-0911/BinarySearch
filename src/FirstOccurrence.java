import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {2,4,8,10,10,10,18,20};
        int n = array.length;
        System.out.println("Enter the Element");
        int element  = sc.nextInt();
        int start = 0;
        int end = n-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]==element){
                result = mid;
                end= mid -1;
            }
            else if(element <array[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(result);
    }
}
