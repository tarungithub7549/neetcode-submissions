// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int len = temperatures.length;
//         int[] res = new int[len];
//         for(int i = 0; i < len; i++){
//             for(int j = i + 1; j < len; j++){
//                 if(temperatures[j] > temperatures[i]){
//                     res[i] = j - i;
//                     break;
//                 }
//             }
//         }
//         return res;
//     }
// }
// ---------------------------------------------------------

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int idx = stack.pop();
                res[idx] = i - idx;
            }

            stack.push(i);
        }

        return res;
    }
}