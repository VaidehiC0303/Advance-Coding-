public class climb_memo {
    
    public static void main(String[] args) {
        int s = 4;
        int[] dp = new int[s+1];
        int count = 0;
        int ans = climb(s,count);
        System.out.println(ans);
    }
    public static int climb(int s , int i,int[] dp) {
            if(i == s){
            return 1;
        }
         if(s<i){
            return 0;
         }
         if(dp[i]!=0)

         count = climb(s-1  , count);
         count = climb(s-2, count);
         count = climb(s-3, count);

         return count;


        
    } 
}
