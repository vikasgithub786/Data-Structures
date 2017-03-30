class Node {

	private Object data;
	private Node next;
	
	public  synchronized void setData(Object data){
		
		this.data = data;
	}
 	
    public  synchronized Object getData(){
		
		return data;
	}
    
    public  synchronized Node getNext(){
		
		return next;
	}
    public  synchronized void setNext(Node next){
		
		this.next = next;
	}
}


class LinkListDemo {
	
	private Node head;
    private Node temp;
    static Node loop;
    static int j=0;
    
    public Node getHead()
    {
    	return head;
    }
    
    public void add(Object o)
    {
   	 if (head==null)
   	 {
   		 head = new Node();
   		 head.setData(o);
   		 temp = head;
       j++;
   	 }
   	 else
   	 {  
   		 while(temp.getNext()!= null)
   		 {
   			 temp=temp.getNext();
   		 }
   		 Node newnode = new Node(); 
   		 temp.setNext(newnode);
   		 newnode.setData(o);
       j++;
       if(j==5){loop = newnode;}
   	 }
    }  

  }
  
  class Test2 
  {

      public static Node reverse(Node node)
      {
          Node carry = null , current = null ;
          while(node!=null)
          {
            current = node.getNext();
            node.setNext(carry);
            carry = node;
            node = current;
          }
        return carry;
      }

    public static boolean isPalindrome(LinkListDemo l1)
    {
        Node fastptr = l1.getHead();
        Node prev = l1.getHead();
        Node slowptr = l1.getHead();
        Node h2=null;
        Node head = l1.getHead();
        boolean flag =true;
        while(fastptr != null && fastptr.getNext() != null)
        {
          prev = slowptr;         
          fastptr = fastptr.getNext().getNext();
          slowptr = slowptr.getNext();
        }
        
        if(fastptr == null)
        {          
          h2 = reverse(slowptr);          
        }
        else
        {
              if(fastptr.getNext() == null)
              {
                prev = slowptr;
                h2 = reverse(slowptr.getNext()); 
                slowptr.setNext(null);                            
              }
        }

        Node h3 = h2;
        while(h3!=null)
        {
          if(head.getData() != h3.getData())
          {
            flag = false;                 
          }
          head = head.getNext();
          h3 = h3.getNext();
        }
        prev.setNext(reverse(h2));
        return flag;
   }

   


  
  public static void main(String[] args) 
  {
    LinkListDemo list1 = new LinkListDemo();
    list1.add(-2);
    list1.add(-1);
    list1.add(0);
    list1.add(10);
    list1.add(10);

    LinkListDemo list2 = new LinkListDemo();
    list2.add(16);
    list2.add(-2);
    list2.add(-1);
    list2.add(0);
    list2.add(-1);
    list2.add(-2);
    list2.add(16);
      
    LinkListDemo list3 = new LinkListDemo();
    list3.add(16);
    list3.add(-2);
    list3.add(-1);
    list3.add(-1);
    list3.add(-2);
    list3.add(16);

    LinkListDemo list4 = new LinkListDemo();
    list4.add(-2);
    list4.add(-1);
    list4.add(10);
    list4.add(10);
   
    System.out.println(isPalindrome(list1));   
    System.out.println(isPalindrome(list2));
    System.out.println(isPalindrome(list3));
    System.out.println(isPalindrome(list4));  
  }

}
