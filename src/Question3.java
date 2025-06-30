
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);
        int start = 0;
        int end = str.length()-1;
        int first =-1;
        int last = -1;
        while(start <= end ){
            int mid = start + (end-start)/2;
            if(str.charAt(mid)==ch){
                first = mid;
                end = mid-1;
            }
            else if(str.charAt(mid)<ch){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        start = 0;
        end = str.length()-1;
        while(start <= end ){
            int mid = start + (end-start)/2;
            if(str.charAt(mid)==ch){
                last = mid;
                start = mid+1;
            }
            else if(str.charAt(mid)<ch){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(first ==-1){
            System.out.println("Not Found");
        }
        else if(first==last){
            System.out.println(first);
        }
        else{
            System.out.println(last-first);
        }
    }
}
