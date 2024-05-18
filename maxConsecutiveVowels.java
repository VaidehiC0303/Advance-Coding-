public class maxConsecutiveVowels {
    public static void main(String[] args) {
        String str = "abcecdbaeeiuce";
        
        int count = 0;
        int ans = 0;

        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
                ans = Math.max(ans,count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(ans);
    }
    
}
