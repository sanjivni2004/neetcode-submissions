class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> i=new HashMap<>();

        for(int j=0;j<nums.length;j++){
            i.put(nums[j],j);
        }

        for(int j=0;j<nums.length;j++){
            int d=target-nums[j];
            if(i.containsKey(d) && i.get(d)!=j){
                return new int[]{j,i.get(d)};
            }
        }
        return new int[0];
    }
}
