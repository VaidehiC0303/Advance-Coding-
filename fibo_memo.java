public class fibo_memo {
    
        public static void main(String[] args) {
            int k=10;
            int[] dp = new int[k+1];
            int ans = fibo(k , dp);
            System.out.println(ans);
        }
            public static int fibo(int k,int[] dp ) {
            if(k == 0 || k == 1){
                return k;            
            }
            dp[0] = 0;
            dp[1] = 1;
    
            dp[k] =  fibo(k-1,dp) + fibo(k-2,dp);
            int  ans = dp[k];
            return ans;
        }
    
        
        
}

