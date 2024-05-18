public class coin_change_permut_tab {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 7;
        int[] dp = new int[target+1];

   
        dp[0] = 1;
        for(int i = 1 ; i < target+1; i++){
            for(int val : coin){
                if(i-val >= 0)
                    dp[i] += dp[i-val];
            }
        }
        System.out.println(dp[target]);
    }
    
}
