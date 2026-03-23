public class CountNodes{
    static class Node{
        int data;
        Node left ,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    //function
    public static int count(Node root){
        if(root == null){
            return 0 ;
        }
        int lh = count(root.left);
        int rh = count(root.right);
        return (lh+rh)+1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(count(root));
    }
}