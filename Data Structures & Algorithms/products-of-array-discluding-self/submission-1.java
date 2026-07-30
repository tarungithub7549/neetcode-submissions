// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             int mul = 1;
//             for(int j = 0; j < nums.length; j++){
//                 if(j != i) mul = mul * nums[j];
//             }
//             res[i] = mul;
//         }
//         return res;
//     }
// }  
//------------------------------------------
class Solution{
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }
        return res;
    }
}
