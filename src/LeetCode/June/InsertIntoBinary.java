package June;
import java.util.*;

public class InsertIntoBinary {
 public static void main(String[] args) {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right,  val);
        }
        return root;
    }
}


//Iterative

public static TreeNode insertIntoBST(TreeNode root, int val) {
if(root == null) return new TreeNode(val);
TreeNode cur = root;
while(true) {
    if(cur.val <= val) {
        if(cur.right != null) cur = cur.right;
        else {
            cur.right = new TreeNode(val);
            break;
        }
    } else {
        if(cur.left != null) cur = cur.left;
        else {
            cur.left = new TreeNode(val);
            break;
        }
    }
}
return root;
}  
 }
      