class Solution {
    public int[] twoSum(int[] nums, int target) {
        /** Given nums [], target 
        * Sol 1 : iterate nums i -> 0 to n -1, inner loop 
        * from i to n, check if those two make target, then return 
        * i,j as a int array 
        */

        /**       
        * Advanced Solutions : 
        * Sol 2 : If the array is sorted, iterate over the elements, get the first 
        * element, subtract that from target, now binary search value in the array,    
        * once that's found, return the current element and found element's indexs 
        * in an array
        */

        /**
        * Sol 3 : If the array is not sorted, then iterate over the elements, now store the
        * target - current element as key, and index as the value, when you are iterating 
        * over the new element, check if they exist in the map, if it exists then just take 
        * the value for matching key from the map and then also take the current index pack 
        * it and return as the array.
        **/

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }

        return new int[0];
    }
}
