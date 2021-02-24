package src.tress.BinaryTree;

import java.util.Scanner;
public class TreeSize {

    static Scanner sc= null;
        public static void main(String[] args) {
            sc= new Scanner(System.in);
            Node root=createTree();
            System.out.println("Inorder");
            inOrder(root);
            System.out.println();
            System.out.println(size(root));
            System.out.println("sum"+ " "+ sum(root));
        
   } 

  static Node createTree(){
        Node root=null;
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if(data==-1) return null;
        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root){
    if(root == null) return;
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
}

public static int size(Node root){
    if(root == null){
        return 0;
    }
    int ls = size(root.left);
    int  rs = size(root.right);
    int ts= ls+rs+1;
    return ts;
}

public static int sum (Node root){
    if(root == null){
        return 0;
    }
    int lsm = sum(root.left);
    int rsm = sum (root.right);
    int tsm = lsm + rsm +  root.data;
    return  tsm;
}

}

class Node{
    Node left, right;
    int data;
    public Node (int data){ //constructor
        this.data=data; 
    }
}
