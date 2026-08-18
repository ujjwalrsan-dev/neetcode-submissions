class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character,Integer> frequency = new HashMap<>();

        for (Character c : s.toCharArray()) {
            frequency.merge(c, 1, Integer::sum);
        }

        for (Character c : t.toCharArray()) {
            frequency.merge(c, -1, Integer::sum);
        }

        for (int value : frequency.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;

    }
}
