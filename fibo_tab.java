import java.util.Scanner;

public class fibo_tab {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k = 10;
        int[] dp = new dp[k];
        fib(k,dp);
    }
    
    public static void fib(int k , int[] dp){
        
        dp[0] = 0;
        dp[1] = 1;            

        for(int i = 2 ; i <= k ; i++){
            dp[i] = dp[i-2] + dp[i-1];
            int ans = dp[i];
            System.out.println(ans);
        }
        
    }

}
