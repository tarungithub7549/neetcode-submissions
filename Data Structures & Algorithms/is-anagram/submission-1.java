class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        char[] tchar = t.toCharArray();
        Arrays.sort(tchar);

        return Arrays.equals(schar, tchar);
    }
}
