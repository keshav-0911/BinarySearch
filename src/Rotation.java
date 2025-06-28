public class Rotation {
    public static void main(String[] args) {
        int [] array = {12,13,15,23,34,35,54,67,2,5,6,8,11};
        int n = array.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid  = start + (end-start)/2;
            int previous = (mid+n-1)%n;
            int next = (mid+1)%n;
            if (array[start] <= array[end]) {
                System.out.print(start);
                return;
            }
            if(array[mid]<=array[previous]&&array[mid]<=array[next]){
                System.out.print(mid);
                return;
            }
            else if(array[start]<=array[mid]){
                start = mid+1;
            }
            else if (array[mid]<=array[end]){
                end = mid-1;
            }
        }
    }
}
