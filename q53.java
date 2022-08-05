class Solution {
    public int maxSubArray(int[] nums) {
        return recursion(nums,0,nums.length-1);

    }
    public int recursion(int[] nums,int i, int j){
        if(i==j){
            return nums[i];
        }
        int mid=i+(j-i)/2;
        int sum=recursion(nums, i, mid);
        if(mid<j){
            int sumRight = recursion(nums,mid+1,j);
            if(sumRight>sum){
                sum=sumRight;
            }
        }
        int midLeft = nums[mid];
        int midLeftMax = midLeft;
        for(i=mid-1;i>-1;i--){
            midLeft = midLeft+nums[i];
            if (midLeft>midLeftMax){
                midLeftMax=midLeft;
            }
        }
        int midRight = nums[mid];
        int midRightMax = midRight;
        for(i=mid+1;i<nums.length;i++){
            midRight = midRight+nums[i];
            if (midRight>midRightMax){
                midRightMax=midRight;
            }
        }
        int max = midRight+midLeft-nums[mid];
        if(midLeftMax>max){
            max = midLeftMax;
        }
        if(midRightMax>max){
            max = midRightMax;
        }
        if(sum>max){
            max = sum;
        }
        return max;
    }
}
