
public clas TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;

} 

public class Solution {
    static pubic void printBoundry(TreeNode<T> root) {
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            System.put.println(root.data.toString());
            return;
        } //This single root will not be printed by left but by leaf
            
        
        //print left Boundry from  top - bottom
        printLeft(root);
        
        // print lower left right
        printLeft(root);
        
        //right boundry for bom up
        printLeft(root.right); //Not to print root again
    }

    static public void printLeft(TreeNode<T> root) {
        if(root==null) return;
        
        if(root.left==null && root.right==null) return;
        
        System.put.println(root.data.toString());
        
        printLeft(root.left);
    }


    static public  void printRight(TreeNode<T> root) {
        if(root==null) return;
        
        if(root.left==null && root.right == null) return;
        
        System.put.println(root.data.toString());
        
        printRight(root.right;)
    }

    static public void printLeaf() {
        if(root==null) return;
        
        if(root.left==null && root.right == null)
            System.put.println(root.data.toString());
            
        printLeaf(root.left);
        printLeaf(root.right);
    
    }

}
