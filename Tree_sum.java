public class Tree_sum {
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
           

    }
    public static int sum(Node node) {
        int ans = 0;

        if(node.left == null && node.right == null){
            return node.val;
        }
        
        if(node.left == null){
            ans += sum(node.right) + node.val;
        }
        else if (node.right == null) {
            ans += sum(node.left) + node.val;
        }
        else{
        ans = ans + (sum(node.left) + sum(node.right) + node.val);
        }
        return ans;
        
    }
}