class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Sol 1: Sort the given string, store it as key for a map, and     store the unsorted string into a list which is added as a value, and append if any other string sort gives same sorted order.
        at last, fetch all the values as a list and return 
        */
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0 ; i < strs.length; i++) {
            String value = strs[i];
            String key = generateKey(strs[i]);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }
        List<List<String>> list = new ArrayList<>();
        map.forEach((key, value) -> list.add(value));
        return list;
    }

    public String generateKey(String s) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        return new String(sArray);
    }
}
