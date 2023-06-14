class Solution {
    public int punishmentNumber(int n) {
        long ans = 0;
        for (long i = 1; i <= n; ++i) {
            long x = i * i;
            String p = Long.toString(x);
            if (check(0, p, (int) i)) {
                ans += (i * i);
            }
        }
        return (int) ans;
    }

    public boolean check(int idx,String p,int tar){
        if(idx==p.length()){
            return tar==0;
        }
        if(tar<0){
            return false;
        }

        for (int i = idx; i < p.length(); ++i) {
            String x = p.substring(idx, i + 1);
            int y = Integer.parseInt(x);
            if (check(i + 1, p, tar - y)) {
                return true;
            }
        }
        return false;

    }
}
