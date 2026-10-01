

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // Count characters in s
        char[] charsS = s.toCharArray();

        for (int i = 0; i < charsS.length; i++) {
            char c = charsS[i];

            if (mapS.containsKey(c)) {
                mapS.put(c, mapS.get(c) + 1);
            } else {
                mapS.put(c, 1);
            }
        }

        // Count characters in t
        char[] charsT = t.toCharArray();

        for (int i = 0; i < charsT.length; i++) {
            char c = charsT[i];

            if (mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            } else {
                mapT.put(c, 1);
            }
        }

        // Compare the two maps
        return mapS.equals(mapT);
    }
}