/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeak(mountainArr);
        int firstTry=BinarySearch(mountainArr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        else
        return BinarySearch(mountainArr,target,peak+1,mountainArr.length()-1);
        
    }


    public int findPeak(MountainArray mountainArr) {
        int s=0;
        int e=mountainArr.length()-1;
        
        while(s<e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                e=mid;
            }
            else
                s=mid+1;
        }
        return e;  
    }
    static int BinarySearch(MountainArray mountainArr, int target, int s, int e) {
        boolean isAsc;
        isAsc= mountainArr.get(s) < mountainArr.get(e);
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if(mountainArr.get(mid)==target) {
                return mid;
            }

            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    e=mid-1;
                }
                else{
                    s = mid + 1;
                }
            }
            else {
                if(target > mountainArr.get(mid)) {
                    e=mid-1;
                }
                else{
                    s = mid + 1;
                }
            }
        }

        return -1;
    }
}
