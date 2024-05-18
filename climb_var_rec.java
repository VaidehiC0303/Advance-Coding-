public class climb_var_rec {
    public static void main(String[] args) {
        int k = 6;
        int[] Jump = {2,3,0,2,2,3};
        int ans = climb(k,Jump,0);
        System.out.println("Number of ways to climb stairs are -> "+ans);
       
    }
    public static int climb(int k , int[] Jump,int idx) {

        if(idx == k){
            return 1;
        }
        if(idx > k ){
            return 0;
        }
        int val = Jump[idx];
        int ans = 0;
        for(int i = 1 ; i <= val ; i++){
            ans += climb(k,Jump , idx+i);
            
        }
        return ans;

    }
}



    
