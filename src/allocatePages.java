public class allocatePages {
    public static void main(String[] args) {
        int [] array = {10,20,30,40};
        int n = array.length;
        int key = 2;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
           end = end + array[i];
            if (array[i]>start) {
              start = array[i];
            }
        }
        if(n < key){
            System.out.println(-1);
        }
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int student = 1;
            int sum = 0;
            boolean isValid = true;
            for(int i = 0; i < n; i++){
                if(sum + array[i] > mid){
                    student++;
                    sum = array[i];
                }
                else{
                    sum = sum+array[i];
                }
                if(student > key){
                    isValid = false;
                    break;
                }
            }
            if(isValid == true){
                result = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("Minimum Pages: " + result);
    }
}
