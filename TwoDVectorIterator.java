import java.util.*;
public class TwoDvectorterator implements Iterator<Integer>{
    int oI;
    int iI;
    int[][] v;
    
    public TwoDvectorterator(int[][] v)
    {   
        if(v==null||v.length==0)
            throw new IllegalArgumentException("Wrong input");
        
        this.v = v;    
        oI=0;
        iI=0;
        
    }
    
    public void findNext()
    {
        if(oI<0 || oI > v.length-1 || iI<0)
            return;
            
        if(oI>=0 &&oI<=v.length-1 && iI>=0&& iI<=v[oI].length-1)
            return;
        
        while(oI<=v.length-1)
        {
            while(v[oI]!= null && iI< v[oI].length-1)//*** <
            {
                iI++;
                return;
            }
            
            oI++;
            iI=0;
        }
        
        
        iI=-1;
        oI=-1;
        
    }
    
    @Override
    public boolean hasNext()
    {
        findNext();
        return (oI!=-1&&iI!=-1);
            
    }
    
    @Override
    public Integer next()
    {
        findNext();
        
        if(oI==-1 || iI==-1)
            throw new NoSuchElementException("");
        
        int result = v[oI][iI];
        iI++; //****
        return result;
    }
    
     public static void main(String []args){
        System.out.println("Hello World");
     }
}
