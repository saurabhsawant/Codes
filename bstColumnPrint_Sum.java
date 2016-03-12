import java.util.HashMap;
import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;
    //
}

public class Solution {
    public void printAllColumns(TreeNode<T> root) {
        if(root==null) return;
        
        if(root.left  == null || root.right == null) return System.out.println(root.data.toString());
        
        //Put All Nodes in HashMap
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList<T>> map = new HashMap<Integer, ArrayList<T>>();
        parseColumnsIntoMap(root, map, min, max);
        
        
        //Traverse Map to get 
        printColumnFromMap(map, min, max);
    
    }
    
    
    public void parseColumnsIntoMap(TreeNode<T> root, HashMap<Integer, ArrayList<T>> map, Integer min, Integer max) {
        if(root==null) return null;
        
        if(map==null)
            new HashMap<Integer, ArrayList<T>>();
            
        if(max==null)
            max = Integer.MIN_VALUE;
        
        if(min==null)
            min = Integer.MAX_VALUE;
        
        parseColumnsIntoMap(root, 0, map, min, max)
    }
    
    public void parseColumnsIntoMap(TreeNode<T> root, int index, HashMap<Integer, ArrayList<T>> map, Integer min, Integer max) {
        if(root == null)
            return;
            
        ArrayList<T> list = null;
        if(map.containsKey(index)) {
            list = map.get(index);   
        } else {
            list = ArrayList<T>();
            map.put(index,list);
        }
        
        list.add(root.data);
        
        if(index>max)
            max = index;
            
        if(index<min)
            min = index;
        
        //Navigate
        parseColumnsIntoMap(root.left, index-1, map, min, max);
        parseColumnsIntoMap(root.right, index+1, map, min, max);
    
    }
    
    
    public printColumnFromMap(HashMap<Integer, ArrayList<T>> map, Integer min, Integer max) {
        if(map==null || min==null || max==null) return; //Throw Exception
        
        for(int i=min; i<=max; i++) {
            if(map.containsKey(i)) {
                ArrayList<T> list = map.get(i);
                for(T dta: list) {
                    System.out.println(T.toString());
                }//for list
            }//if
        }//for i 
        
    }
    
}
