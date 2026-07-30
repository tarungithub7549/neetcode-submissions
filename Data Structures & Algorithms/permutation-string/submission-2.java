class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int l = 0;
        int r = s1.length() - 1;
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        String res1 = new String(a1);
        boolean flag = false;
        while(r < s2.length()){
            String ch = s2.substring(l, r + 1);
            char[] a2 = ch.toCharArray();
            Arrays.sort(a2);
            String res2 = new String(a2);

            if(res1.equals(res2)){flag = true; return flag;}
            else{
                l++;
                r++;
            }
        }
        return flag;
    }
}
