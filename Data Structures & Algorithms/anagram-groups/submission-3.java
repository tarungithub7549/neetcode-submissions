class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] schar = s.toCharArray();
            Arrays.sort(schar); 
            String sorted = new String(schar);

            map.putIfAbsent(sorted , new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }
}
