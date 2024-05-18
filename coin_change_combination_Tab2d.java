public class coin_change_combination_Tab2d {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 7;
        int[][] dp = new int[coin.length+1][target+1];

        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0; j < dp[0].length ; j++){
                if(j == 0){
                    dp[i][j] = 1;
                }
                else if(i == 0){
                    dp[i][j] = 0;
                }
                else{
                    if(coin[i-1] <= j){
                        dp[i][j] = dp[i-1][j] + dp[i][j - coin[i-1]];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0; j < dp[0].length ; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }


        
    }
}
