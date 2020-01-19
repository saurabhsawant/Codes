public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(checkEqualWithBackspace("xyz#", "xzz#"));
        System.out.println(checkEqualWithBackspace("xy#z#z", "xzz#"));
     }
     
     public static boolean checkEqualWithBackspace(String x, String y)
     {   
        if(x==null && y==null) return true;
        
        if(x==null || y==null) return false;
        
        
        int i=0, j=0;
        while(i<=x.length()-1 && j<=y.length()-1)
        {
             
             //next x
             while(i<=x.length()-2 && x.charAt(i+1)=='#')
                i+=2;
                
             while(j<=y.length()-2 && y.charAt(j+1)=='#')
                j+=2;
                
                
            if(i<=x.length()-1 && j<=y.length()-1 && x.charAt(i)!=y.charAt(j))
                return false;
            
            i++;
            j++;
        }
    
         
         //either of them ended or both
        while(i<=x.length()-2 && x.charAt(i+1) == '#')
            i+=2;
        
        while(j<=y.length()-2 && y.charAt(j+1)== '#')
            j+=2;
        
        if(i==x.length() && j==y.length())
            return true;
        else
            return false;
     }
}
