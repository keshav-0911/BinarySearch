public class MinimumDifference {
    public static void main(String[] args) {
        int [] array = {3,8,10,15,16};
        int n = array.length;
        int key = 18;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == key){
                System.out.println("The minimum difference element is: "+array[mid]);
                return;
            }
            else if(array[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(start >= n){
            System.out.println("The minimum difference element is: "+ array[end]);
            return;
        }
        else if(end < 0){
            System.out.println("The minimum difference element is: "+ array[start]);
            return;
        }
        int answer = Math.abs(array[start]-key);
        int result = Math.abs(array[end]-key);
        if(answer < result){
            System.out.println("The minimum difference element is: " + array[start]);
            return;
        }
        else{
            System.out.println("The minimum difference element is: " + array[end]);
            return;
        }
    }
}
