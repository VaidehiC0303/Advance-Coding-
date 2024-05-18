public class Profit {
    public static void main(String[] args) {
        int[] arr = {5,10,12,10,9,5,4,6,10,15};
        int max =Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
}
