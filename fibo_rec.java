public class fibo_rec {
    public static void main(String[] args) {
        int k=10;
        int ans = fibo(k);
        System.out.println(ans);
    }
        public static int fibo(int k ) {
        if(k == 0 || k == 1){
            return k;            
        }

        return fibo(k-1) + fibo(k-2);
    }

    
    
}
