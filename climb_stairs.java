public class climb_stairs {
    public static void main(String[] args) {
        int s = 4;
        int[] dp = new int[s+1];
        int count = 0;
        int ans = climb(s,count);
        System.out.println(ans);
    }
    public static int climb(int s , int count) {

        if(s == 0){
            count++;
            return count;
        }
         if(s<0){
            return count;
         }

         count = climb(s-1  , count);
         count = climb(s-2, count);
         count = climb(s-3, count);

         return count;


        
    }
    
}
