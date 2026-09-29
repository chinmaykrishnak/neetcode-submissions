
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        // Count characters in t
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        // Compare the two maps
        return mapS.equals(mapT);
    }
}
       
