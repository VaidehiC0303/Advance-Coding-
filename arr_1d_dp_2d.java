public class arr_1d_dp_2d {
    public static void main(String[] args) {

        
        int[] arr = {4,2,7,1,3};
        
        int tar = 10;
        
        boolean[][] dp = new boolean[arr.length+1][tar+1];
     
        
        for(int i = 0 ; i <dp.length;i++){
            for(int j = 0 ; j <dp[0].length;j++){
            
            if(j == 0){
                dp[i][j] = true;
            }
            else if(i == 0){
                dp[i][j] = false;                
            }
            else{
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
                }
            }
        }
        System.out.println(dp[arr.length-1][tar]);
    }

    
        
    }

