public class coin_change_permut_memo {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int tar = 7;
        int[] dp = new int[tar+1];
        int ans = helper(tar , dp, arr);
        System.out.println(ans); 
        
    }
    public static int helper(int tar ,int[] dp, int[] arr) {
        dp[0] = 1;
        int ans = 0;
        if(tar == 0){
            return 1;
        }
        if(tar < 0){
            return 0;
        }
        if(dp[tar] != 0){
            return dp[tar];
        }
        for(int i = 0 ; i < arr.length ; i++){
            int val = arr[i];
            int remAmt = tar - val;
            ans += helper(remAmt , dp, arr);
        }
        dp[tar] = ans;
        return ans;
        
    }
}
