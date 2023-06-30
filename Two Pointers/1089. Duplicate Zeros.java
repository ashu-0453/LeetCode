class Solution {
    public void duplicateZeros(int[] arr) {
        int s = 0;
        int len = arr.length -1;
        for(int i = 0; i <= len-s; i++)
        {
            if(arr[i] == 0)
            {
                if(i == len-s)
                {
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
                s++;
            }
        }
        int last = len -s;
        for(int j = last; j >= 0; j--)
        {
            if(arr[j] == 0)
            {
                arr[j + s] = 0;
                s--;
                arr[j + s] = 0;
            }
            else
                arr[j + s] = arr [j];
        }
    }
}
