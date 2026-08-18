class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length-1;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target) return new int[] {i,j};
        //     }
        // }
        // return new int[] {};
        int n=numbers.length;
        int l=0,r=n-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum<target){l++;}
            else if(sum==target){return new int[] {l+1,r+1};}
            else{r--;}
        }
        return new int[] {};
    }
}
