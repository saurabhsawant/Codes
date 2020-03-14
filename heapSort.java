public HrapSort {
    public static void swap(int[] a, int x , int y) {
        if(x!=y && x >= 0 && x <=a.lengh-1 && y >=0 && y<=a.lengh -1) {
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
        }
    }
    
    
    public static void maxHeapify(int[] a, int index, int heapSized) {
        int left = 2 * index + 1;
        int right =  2 * index + 2;
        
        
        int maxindex = index;
        if(left<=heapSize-1 && a[left] > a[maxindex])
            maxindex = left;
            
        if(right<=heapSize-1 && a[right] > a[maxindex])
            maxindex = right;
            
        if(index!=maxindex) {
            swap(a, index, maxindex);
            maxHeapify(a, maxindex, heapSize);
        }
    }
    
    public static void buildMaxHeap(int[] a) {
        if(a==null) return;
        //first mon leaf node (lastindexNode - 1) /2 ie last node cha parent
        if(int i=((a.length -1) -1)/2; i>=0; i--) {
            maxHeapify(a, i, a.length);
        }
     
    }
    
    //bubble up in max heapifyUp,
    // for an index, get parent p = (index -1 )/2 and then do max for recursive for index and not max index
    
    
    public static void heapSort(int[] a) {
        if(a==null) throw new Exception("");
        
        buildMaxHeap(a);
        
        int heapSize = a.lenhth;
        for(int i = a.length-1; i>= 1 ; i--) {
            swap(0,i);
            heapSize --;
            maxHeapify(a, 0, heapSize);
        }
        
    }

}
