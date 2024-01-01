import java.util.*;

class Solution {
    /*
    public List<List<String>> groupAnagramsA(String[] strs) {
        List<List<String>> anagramGroups = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) {
                continue;
            }


            List<String> anagramGroup = new ArrayList<>();
            anagramGroup.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[j] == null) {
                    continue;
                }

                if (isAnagram(strs[i], strs[j])) {
                    anagramGroup.add(strs[j]);
                    strs[j] = null;
                }
            }

            anagramGroups.add(anagramGroup);
        }

        return anagramGroups;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sA = new int[26];
        for (char c : s.toCharArray()) {
            sA[c - 97]++;
        }

        for (char c : t.toCharArray()) {
            if (--sA[c - 97] < 0) {
                return false;
            }
        }

        return true;
    }
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = new char[26];
            for (int i = 0; i < s.length(); i++) {
                chars[s.charAt(i) - 'a']++;
            }

            String key = new String(chars);
            if (map.get(key) == null) {
                map.put(key, new ArrayList<>(List.of(s)));
            } else {
                map.get(key).add(s);
            }
        }

        return new ArrayList<>(map.values());
    }

    /*
    public List<List<String>> groupAnagramsB(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        return new AbstractList<>() {
            List<List<String>> result;

            public List<String> get(int index) {
                if (result == null) init();
                return result.get(index);
            }

            public int size() {
                if (result == null) init();
                return result.size();
            }

            private void init() {
                for (String s : strs) {
                    char[] keys = new char[26];
                    for (int i = 0; i < s.length(); i++)
                        keys[s.charAt(i) - 'a']++;

                    String key = new String(keys);
                    List<String> list = map.get(key);
                    if (list == null) map.put(key, new ArrayList<>());
                    map.get(key).add(s);
                }
                result = new ArrayList<>(map.values());
            }
        };

    }
     */
}