class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int numLength = nums.length;
        int [] resultArr = new int[2];


        for (int i=0; i < numLength; i++){
            if(map.containsKey(target - nums[i])){
                resultArr[1] = i;
                resultArr[0] = map.get(target-nums[i]);
                System.out.print(map);
                return resultArr;
            }
            map.put(nums[i], i);
        }
        return resultArr;
    }
}