class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int l = 0;
        int r = p.length() -1;

        while (l < r) {
            if (p.charAt(l) != p.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
