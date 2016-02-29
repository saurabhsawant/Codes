/* package whatever; // don't place package name! */
// Copnvert Tree to LinkList
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

public TreeNode<T> {
	public T data;
	public TreeNode left, right;

}


public class DLinkList<T> {
TreeNode<T> start;
TreeNode<T> end;

public DLinkList(){
	start =  end = null;
}

public DLinkList(TreeNode _start, TreeNode _end){
	start =  end = null;
}

public static DLinkList<T> convertToDLink(TreeNode<T> root) {
	if(root == null)
		return null;
	//Nacigate left
	if(root.left!=null) {public DLinkList(){
		DlinkList<T> leftList =  new DlinkList<T>();
		leftList  = convertToDLink(root.lleft);
		root.left = leftList.end;
		leftList.end = root.left;
	}
	
	if(root.right!=null) {
		DlinkList<T> rightList =  new DlinkList<T>();
		rightList = convertToDLink(root.lleft);
		root.right = rightList.start;
		rightList.start = root.right;
	}
	
	return new DlinkList((root.left==null)?root:leftList.start,
						(root.right==null)?root:rightList.end);
	
}


public static DLinkList<T> convertToDLink(TreeNode<T> root) {
	if(root ==null) return null;
	DlinkList<T> list = new DLinkList<T>(root,list.start, list.end);
	return list;
}

public static void convertToDLink(TreeNode<T> root, TreeNode<T> start, TreeNode<T> end)
	if(root == null) {
	 start = null;
	 end = null;
	return;}
	
	 TreeNode<T> lstart = null;
	 TreeNode<T> lend  = null;
	 convertToDLink(root, lstart,lend);
	 
	 TreeNode<T> rstart = null;
	 TreeNode<T> rend  = null;
	 convertToDLink(root, rstart,rend);
	 
	 if(lstart==null)
	 	start = root;
	 else {
	    start = lstart;
	    lend = root;
	    root.left = lend;
	 }
	 if(rend==null)
	   end  == root
	 else {
	 	root.right = rstart;
	 	rstart= root.right;
	 	end = rend;
	 }  
}



