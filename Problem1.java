Time Complexity: o(n)

class Solution {
    public int[] find_target(int [] nums, int t){
        
        nums = [2,7,9,8];
        if(nums == null || nums.length == 0) return 0;
        t = 9;

        HashMap<Integer, Integer> map = new HashMap<>(); //initialize

        for(int i=0; i < n.length; i++) {
            if (map.get(i) != map) {
                map.put(n[i], i);
            }
        }

        for(int i=0; i < n.length; i++)    {
            int complement = t-n[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[](i, map.get(complement));
            }

    }
}
