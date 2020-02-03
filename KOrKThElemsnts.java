import java.util.*;
public class KOrKThElemsnts{
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
    
    
     public static void main(String []args){
        try{
        System.out.println(kLargestElements(new int[]{1,3,2,5,4}, 2));
        }catch(Exception e)
        {
            //DN
        }
     }
}
