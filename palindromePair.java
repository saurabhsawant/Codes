import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */



class PalindromePairs {
  public static boolean isPalindrome(String s) {
    if(s==null||s.isEmpty()||s.length()==1) return true;
    
    for(int i=0; i<=s.length()/2-1; i++) {
      if(s.charAt(i)!=s.charAt(s.length()-1-i))
          return false;
    }
    
    
    return true;
  }
  
  
  public static List<List<Integer>> findPalPairs(String[] words) {
    if(words==null||words.length==1)  return null;
    
    List<List<Integer>> list =  new ArrayList<>();

    HashMap<String, Integer> map =  new HashMap<String, Integer>();
    for(int i=0;i<=words.length-1;i++) {
      map.put(words[i], i);
    }
    
    
    for(int i=0;i<=words.length-1;i++) {
      for(int j=0;j<=words[i].length();j++) {
        
        String part1 = words[i].substring(0,j);
        String part2 = words[i].substring(j);
        
        String part1Rev = ((new StringBuilder(part1)).reverse()).toString();
        String part2Rev = ((new StringBuilder(part2)).reverse()).toString();
        
        if(isPalindrome(part1)) 
        {
          if(map.containsKey(part2Rev)&&map.get(part2Rev)!=i) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            innerList.add(map.get(part2Rev));
            innerList.add(i);
            
            System.out.println(map.get(part2Rev)+","+i);
            list.add(innerList);
            
            for(Integer i1 : innerList)
              System.out.println(i1.intValue());
          }
        }
        
        if(isPalindrome(part2)){
          if(map.containsKey(part1Rev)&&map.get(part1Rev)!=i) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();
            innerList.add(i);
            innerList.add(map.get(part1Rev));
            list.add(innerList);
          }
        }
        
      }//for j
       
    }//for i
      
    
    //if(list==null)
      
    
    for(List<Integer> l : list) 
      for(Integer i : l) 
        System.out.println(i.intValue());
    
    return list;
  }//findPalPairs
  
}
class Solution {

  public static void main(String[] args) {
    
      String [] s = {"s" , "lls"};
  
    List<List<Integer>> list = PalindromePairs.findPalPairs(s);
    for(List<Integer> l : list) 
      for(Integer i : l) 
        System.out.println(i);
    
    /*
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");

    for (String string : strings) {
      System.out.println(string);
    }
    
    */
  }
}
