public class Question4 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<= nums[mid]){
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if (nums[end]>= nums[mid]){
                if(nums[end] >= target && nums[mid] <= target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

public static void main(String[] args) {
    Question4 obj = new Question4();
    int[] nums = {4,5,6,7,0,1,2};
    int target = 0;

    int result = obj.search(nums, target);
    System.out.println("Index of target: " + result);
}
}

