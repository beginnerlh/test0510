/*你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

        给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

        示例 1:

        输入: [2,3,2]
        输出: 3
        解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。

         

        示例 2:

        输入: [1,2,3,1]
        输出: 4
        解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
             偷窃到的最高金额 = 1 + 3 = 4 。*/

package lianxi0510;

public class test0510{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,3,9,1};
        int a = s.rob(nums);
        System.out.println(a);
    }
}


class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int N = 0;
        int Y = nums[0];
        for(int i = 1;i<nums.length-1;i++){
            int tmp = Y;
            Y = N+nums[i];
            N = tmp>N?tmp:N;
        }
        int a = Math.max(Y,N);
        N = 0;
        Y= nums[1];
        for(int i = 2;i<nums.length;i++){
            int tmp = Y;
            Y = N+nums[i];
            N = tmp>N?tmp:N;
        }
        int b = Math.max(Y,N);
        return Math.max(a,b);
    }
}

