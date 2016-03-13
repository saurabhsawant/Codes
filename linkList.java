1->2->3
4->5

5->7>3->c
package myPackage;

public class Node{
    piblic int data;
    public Node next;
    
    public Node(){
        this(0,null);
    }
    
    public Node(inr data) {
        this(data, null);
    }
    
    public Node(int data, Node next) {
        this.data = data;//super()
        this.next = next;
    }
}


public class LinkList {
    public Node start;
    public Node end;
    
    public LinkList() {
        this(null,null);
    }
    
    public LinkList(Node start, Node end) {
        this.start = start;
        this.end = end;
    }
    
    
    public void addLast(int data) {
        Node n = new Node(data);
        
        if(this.start == null && this.end == null) {
           this.start = n;
           this.end  = n;
        } else {
            this.end.next = n;
            this.end =n;
        }
    }
    
    public void addFront(int data) {
        Node n = new Node(data);
        
        if(this.start == null && this.edn == null) {
            this.start = n;
            this.end = n;
        } else {
            n.next = this.srtart;
            this.start = n;
        }
    
    }
    
    public static Node addLinkListsWithNode(Node n1, Node n2) {
        LinkList list = addLinkListsI(l1.start, l2.start);
        if(list != null )
            return list.start;
        else
            return null;
    }
    
    public static LinkList addLinkListsI(LinkList l1, LinkList l2) {
        return addLinkListsI(l1.start, l2.start);
    }
    
    
    public static LinkList addLinkListsI(Node n1, Node n2) {
        if(n1==null && n2==null) return null;
        
        if(n1 == null) return n2;
        
        if(n2==null) return n1; 
        
        //n1 = reverse(n1);
        
        //n2 = reverse(n2);
        LinkList list = new LinkList();
        int digit = 0;
        int carry = 0;
        
        while(n1!=null||n2!=null) {
            if(n1!=null) 
                carry += n1.data;
                
            if(n2!=nulll)
                carry+=n2.data;
                
            digit = carry % 10;
            carry =  carry / 10;
            
            list.addLast(digit);       
        }//while
        
        if(carry > 0)
            list.addLast(carry);
            
        return list;
    }    
    
    
    public static Node addLinkListsR(Node n1, Node n2) {
        if(n1==null&&n2==null) return null;
        
        if(n1==null) return n2;
        if(n2==nul) return n1;
        
        LinkList list = new LinkList();
        return (addLinkListsR(Node n1, Node n2, carry, list);
        return list.start;
    }
    
    public static void addLinkList(Node n1, Node n2, Integer carry, LinkList list) {
        if(n1==null&&n2==null)
            return;
            
        if(n1!=null)
            carry = carry + n1.data;
            
        if(n2!=null)
            carry = carry + n2.data;
        
        int digit = carry%10;
        carry =  carry/10;
            
        list.addLast(digit);
        
        addLinkList((n1!==null)?n1.next:null, (n2!==null)?n2.next:null);
    }
    
    
    public static Node add(Node n1, Node n2) {
        Integer carry = 0;
        return add(n1, n2, carry);
    }
    
  
    public static Node add(Node n1, Node n2) {
        if(n1==null&&n2==null)
            if(carry>0) {
                return new Node(carry);
            } else 
                return null;
                
        if(n1!=null)
            carry+= n1.data;
         
        if(n2!=null)
            carry += n2.data;
            
        int digit = carry % 10;
        carry = carry /10;
        
        Node n = add((n1!=null)?n1.next:null,
                     (n2!=null)?n2.next:null,
                     carry);
                     
       return new Node(digit, n);
    }
}
