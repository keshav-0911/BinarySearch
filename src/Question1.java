import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);
        int count = 0;
        int first = -1;
        int last = -1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        if(count == 0){
            System.out.println("Not Found");
        }
        else if(count == 1){
            System.out.println(first);
        }
        else{
            System.out.println(last-first);
        }
    }
}
