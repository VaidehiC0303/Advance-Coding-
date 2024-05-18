public class Tree_nodeCount {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val , Node left , Node right){
            this.val = val;
            this.right = right;
            this.left = left;

        }

    }

    public static void main(String[] args) 
    {
       Node node = new Node(1,null,null);

       node.left = new Node(4, null, null);
       node.right = new Node(5, null, null);
       node.left.left = new Node(3, null, null);
       node.right.right = new Node(1, null, null);

       
         System.out.println(sum(node));
         System.out.println(Maxm(node));
           

    }
    public static int sum(Node node) {
        int count = 0;

        if(node.left == null && node.right == null){
            return 1;
        }
        
        if(node.left == null){
            count += sum(node.right) + 1;
        }
        else if (node.right == null) {
            count += sum(node.left) + 1;
        }
        else{
        count = count + (sum(node.left) + sum(node.right) + 1);
        }
        return count;
        
    }
    public static int Maxm(Node node) {
        int max = node.val;
        
        if(node.left == null && node.right == null){
            return max;
        }        

        if(node.left == null){
            max = Math.max(Maxm(node.right) , max);
        }
        else if (node.right == null) {
            max = Math.max(Maxm(node.left) , max);
        }
        else{
            max = Math.max(Math.max(Maxm(node.right) , Maxm(node.left)),max);
        }

        return max;
        
    }
}
    

