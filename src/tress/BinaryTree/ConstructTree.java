import java.util.*;

class Node{
 int data;
 Node left;
 Node right;
 Node(int d){
data=d;
 }
    
    public static void main(String[] args) {
      Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(7);
      root.left.left=new Node(3);
      root.left.right=new Node(4);
      root.left.right.left=new Node(5);
      root.left.right.right =new Node(6);
        System.out.println("ConstructTree");
        preorder(root);
        preorderIterative(root);
        System.out.println("inorder :-");
        inorderIterative(root);
    }


    // recursive preorder
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // iterative preorder
    public static void preorderIterative(Node root){
        if(root==null)return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
           root= st.pop();
            System.out.println(root.data+" ");
            if(root.right!=null)st.push(root.right);
            if(root.left!=null)st.push(root.left);
    }
    }
    // iterative inorder
    public static void inorderIterative(Node root){
        if(root==null)return;
        Stack<Node> st = new Stack<>();
        Node curr=root;
        while(!st.isEmpty() || curr!=null){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;

}
            curr=st.pop();
            System.out.println(curr.data+" ");
            curr=curr.right;
}
    }

    // iterative postorder
    
}
