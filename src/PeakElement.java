public class PeakElement {
    public static void main(String[] args) {
        int [] array = {5,10,15,30,25};
        int n = array.length;
        int start = 0;
        int end = n-1;
        if(n==1){
            System.out.println("Index of the Peak Element is: " + 0);
            return;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid > 0 && mid < n-1){
                if(array[mid]>array[mid+1] && array[mid]>array[mid-1]){
                    System.out.println("Index of the Peak Element is: " + mid);
                    return;
                }
                else if(array[mid]<array[mid+1]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else if(mid==0){
                if(array[0]>array[1]){
                    System.out.println("Index of the Peak Element is: " + 0);
                    return;
                }
                else{
                    System.out.println("Index of the Peak Element is: " + 1);
                    return;
                }
            }
            else if(mid==n-1){
                if(array[n-1]>array[n-2]){
                    System.out.println("Index of the Peak Element is: " + (n-1));
                    return;
                }
                else{
                    System.out.println("Index of the Peak Element is: " + (n-2));
                    return;
                }
            }
        }
    }
}
