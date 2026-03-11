package TwoSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //      number   index

        for (int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if (hashMap.containsKey(num)){
                return new int[] {
                        hashMap.get(num),
                        i
                };
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("n/a");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input1 = {2, 7, 11, 15};
        int[] input2 = {3, 2, 4};
        int[] input3 = {3, 3};

        int target1 = 9;
        int target2 = 6;
        int target3 = 6;

        int[] solution = s.twoSum(input2, target2);
        for (int j : solution) {
            System.out.println(j);
        }
    }
}