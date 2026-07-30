// class Solution {
//     public int findMin(int[] nums) {
//         int min = nums[0];

//         for(int i = 1; i < nums.length; i++){

//             if(nums[i] < min){
//                 min = nums[i];
//             }
//         }
//         return min;
//     }
// }

class Solution{
    public int findMin(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l)/2;

            if(nums[mid] > nums[r]){
                 l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return nums[l];
    }
}
