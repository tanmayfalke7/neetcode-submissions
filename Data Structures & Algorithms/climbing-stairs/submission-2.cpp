class Solution {
public:

    int func(int n,vector<int> &arr){
        if(n<=1) return arr[n];
        if(arr[n]!=0) return arr[n];
        return arr[n] = func(n-1,arr)+func(n-2,arr);
    }

    int climbStairs(int n) {
        vector<int> arr(n+1,0);
        arr[0]=1;
        arr[1]=1;
        return func(n,arr);
    }
};
