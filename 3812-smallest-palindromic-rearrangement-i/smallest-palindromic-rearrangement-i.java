class Solution {
    public String smallestPalindrome(String s) {
        int[] a = new int[26];

        for (char c : s.toCharArray())
            a[c - 'a']++;

        StringBuilder ans = new StringBuilder();
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            while (a[i] >= 2) {
                ans.append((char)(i + 'a'));
                a[i] -= 2;
            }
            if (a[i] == 1)
                mid = (char)(i + 'a');
        }

        String left = ans.toString();
        return left + (mid == 0 ? "" : mid) + ans.reverse();
    }
}
