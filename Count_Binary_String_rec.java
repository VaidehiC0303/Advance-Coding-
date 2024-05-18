public class Count_Binary_String_rec {
    public static void main(String[] args) {
        int n = 3;
        int ans = help(1,n);
        System.out.println(n);
        System.out.println(ans);
    }
    public static int help(int prev , int n) {
        if(n == 0){
            if(prev == 0){
                 return 1;
            }
            else{
                 return 2;
            }
        }
        int ans = 0;
        if(prev == 0){
            ans = help(1 , n-1);
        }
        else {
            ans = help(0 ,n-1) + help(1,n-1);

        }

        return ans;   
    }
}
