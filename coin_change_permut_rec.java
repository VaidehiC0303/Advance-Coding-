public class coin_change_permut_rec {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int tar = 7;
        int ans = helper(tar , arr);
        System.out.println(ans);
    }
    public static int helper(int tar , int[] arr) {
        int ans = 0;
        if(tar == 0){
            return 1;
        }
        if(tar < 0){
            return 0;
        }
        for(int i = 0 ; i < arr.length ; i++){
            int val = arr[i];
            int remAmt = tar - val;
            ans += helper(remAmt , arr);
        }
        return ans;
        
    }
}
