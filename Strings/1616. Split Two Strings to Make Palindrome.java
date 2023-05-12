class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b)||check(b,a);

    }

    public boolean check(String a, String b) {
        int i = 0, j = a.length() - 1;

        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }

        if (i >= j) return true;
        return isPalin(a, i, j) || isPalin(b, i, j);
    }

    public boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }
}
