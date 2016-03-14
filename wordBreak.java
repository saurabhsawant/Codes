import java.util.*;

public class WordBreak {
    public static containsDictionary(String s) {//} 
    
    
    public static boolean wordBreak(String s) {
        if(s==null) return true;
        
        return wordBreaks(replaceAll("\\s+", ""));
    
    }
    public static boolean wordBreakR(String s) {
        if(s==null) true;
        
        if(s.length()==0 || s.equals("")) retrun true;
        
        if(containsDictionary(s)) return true;
        
        
        for(int i = 1; i<=s.length()-1 ; i++) {
            if(containsDictionary(s.substring(0,i)))
                return wordBreak(s.substring(0,i));
        }
       
       return false;
    }
    
    public static boolean wordBreakMem(String s, HashMap<String, Boolean> cash) {
        if(s==null) retun true;
        
        if(cash==null) throw Exception("");
        
        if(s.length()==0|| s.equals("")) return true;
        
        if(containsDictionary(s)) retrun true;
        
        if(cash.containsKey(s)) return cash.get(s);
        
        for(int i=1; i<=s.legth()-1; i++) {
            if(containsDictionary(s.subnstring(0,i))) {
                boolean result = wordBreakMem(s.subnstring(i));
                cash.put(s.subnstring(i), result);
                return result;
            }       
        }
        
        return false;    
    }
    public static boolean wordBreakMem(String s) {
        if(s==null) return true;
        
        HashMap<String, Boolean> cash = new HashMap<String, Boolean>();
        return wordBreakMem(s.replaceAll("\\s+", ""));
    }
}
