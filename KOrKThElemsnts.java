import java.util.*;

// Nearest Points to the Origin
class Point 
{
    public int x;
    public int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public boolean equals(Object o) {
        if(o == null)
            return false;   
        
        if(this==o) return true;
        
        Point that;
        if(o instanceof Point)
            that = (Point)o;
        else return false;
        
        if (this.x != that.x) return false;
        
        if(this.y != that.y) return false;
        
        
        return true;
    }
}


class NearestPointComparatorReverse implements Comparator<Point>
{
    public int compare(Point p1, Point p2){
        
        double p1d = Math.pow(p1.x,2) + Math.pow(p1.y,2);
        double p2d = Math.pow(p2.x,2) + Math.pow(p2.y, 2);
        
        return (int)(p2d - p1d); 
    }
}

public class K
{
    //K  largest numbers
    
    public static ArrayList<Integer> kLargestElements(int[] nums, int k) throws Exception
    {
        if(nums==null || nums.length == 0 || k == 0)
            throw new Exception("Invalid input");
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        
        for(int i=0; i<=nums.length-1; i++)
        {
            if(i<=k-1)
                minHeap.offer(nums[i]);
            else
            {
                if(!minHeap.isEmpty()&& nums[i] > minHeap.peek())
                    {
                        minHeap.poll();
                        minHeap.add(nums[i]);
                    }
            }
                
        }
        
        return new ArrayList<Integer>(minHeap);
        /*
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(!minHeap.isEmpty())
        {
            result.add(minHeap.poll());   
        }
        
        return result;
        */
    }
    
    // using Heap KlogK + NlogK
    public static int kThSmallestElement(int[] nums, int k) throws Exception
    {
        if(nums==null || nums.length==0 || k ==0)
            throw new Exception("Invalid Input");
            
        PriorityQueue<Integer> maxHeap  = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i=0; i<=nums.length-1; i++)
        {
            if(i<=k-1)
                maxHeap.add(nums[i]);
            else
            {
                if(!maxHeap.isEmpty()&&nums[i] <= maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.add(nums[i]);
                }
                
            }
            
        }
        
        return maxHeap.peek();
    }
    
    
    
    //Knearest to Orighins
    public ArrayList<Point> KNearestOrighinPoints(Point[] points, int k) throws Exception
    {
        if(points==null || points.length == 0 || k==0)
            throw new Exception("");
        
        NearestPointComparatorReverse comp = new NearestPointComparatorReverse();
        
        PriorityQueue<Point> maxHeap = new PriorityQueue<Point>(comp);
        
        for(int i=0 ; i<= points.length-1; i++)
        {
            if(i<=k-1)
                maxHeap.add(points[i]);
            else{
                if(!maxHeap.isEmpty()&& comp.compare(points[i], maxHeap.peek()) >= 0)
                {
                    maxHeap.poll();
                    maxHeap.add(points[i]);
                }
            }
        }
        
        return new ArrayList<Point>(maxHeap);
        
    }
    
     public static void main(String[] args){
        try{
        System.out.println(kLargestElements(new int[]{1,3,2,5,4}, 2));
        System.out.println(kThSmallestElement(new int[]{1,3,2,5,4}, 2));
        
        }catch(Exception e)
        {
            //DN
        }
     }
    
    
     // aabbccc -> cccaabb
     public static String sortFerquencyString(String str){
         if(str==null||str.length()<=1) return str;
         
         Map<Character, Integer> freqMap = frequencyString(str); //O(N)
         
         PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<Map.Entry<Character, Integer>>((e1,e2)-> (e2.getValue()==e1.getValue())?
            e2.getKey()-e1.getKey():e2.getValue()-e1.getValue());
        
        maxHeap.addAll(freqMap.entrySet()); // O(N) NlogN
        
        StringBuilder sb = new StringBuilder(); // NlonN
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for(int i=1;i <=entry.getValue(); i++)
                sb.append(entry.getKey());
        }        
        
        return sb.toString();
         
     }
     
     public static HashMap<Character, Integer> frequencyString(String str) {
         if(str==null||str.length()==0)
            return null;
            
        HashMap<Character,Integer> freqMap = new HashMap<Character, Integer>();
        for(char c : str.toCharArray()) 
            if(freqMap.containsKey(c))
                freqMap.put(c, freqMap.get(c)+1);
            else
                freqMap.put(c, 1);
        
        return freqMap;    
     }
     
}

