/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    public int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        
        return start;
    }

    public int bs(MountainArray mountainArr, int start, int end, int target){

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) > target){
                end = mid - 1;
            }else if(mountainArr.get(mid) < target){
                start = mid + 1;
            }else{
                ans = mid;
                break;
            }
        }

        return ans;
    }


    
    public int bsu(MountainArray mountainArr, int start, int end, int target){

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) < target){
                end = mid - 1;
            }else if(mountainArr.get(mid) > target){
                start = mid + 1;
            }else{
                ans = mid;
                break;
            }
        }

        return ans;
    }





    public int findInMountainArray(int target, MountainArray mountainArr) {

        //Finding the peak element
        int peak = findPeak(mountainArr);

        //Find element in the left part
        int ans = bs(mountainArr, 0, peak, target);

        if(ans == -1){
            //Find element in the right part
            ans = bsu(mountainArr, peak, mountainArr.length() - 1, target);
        }

        return ans;
    }
}