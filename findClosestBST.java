public class T {
    
    public int difference(T data)
    {
        //return int 
    }

}

pubic class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode() {
        this(null,null,null);
    }
    
    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class Solution {

public static TreeNoode find(TreeNoode<T> root, T data) {
    //Null case
    if(root == null)
        return null;
       
    int result  = data.compareTo(root.data);
    
    //found
    if(result == 0)
        return root;
    //Navigation    
    if(result<1)
        return find(root.left, data);
    else 
        return find(root.right, data);
}

public static TreeNoode findW(TreeNode<T> root, T data) {
    if(root==null) return null;
    
    TreeNode closest = null;
    Integer minDiffrence = Integer.MAX_VALUE;
    
    retuurn find(root, data, closest, minDifference);

}


public static TreeNoode find(TreeNode<T> root, T data, TreeNode<T> closest, Integer minDifference) {
    if(root == null)
        return closest;
    
    
    int diff = Math.abs(data.difference(root.data));
    if (diff == 0)
        return root;
    
    if(diff< minDiffrence)
     { minDiffrence = diff;
       closest = root;
     }
    
    if(data.compareTo(root.data)<0)
        return find(root.left, data, closest, minDifference);
    else 
        return find(root.left, data, closest, minDifference);
}

