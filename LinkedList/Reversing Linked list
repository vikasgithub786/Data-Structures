public class Node 
{

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


public class LinkListDemo 
{
   	private Node head;
    private Node temp; 
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
   	 }
    }
    
    public void reverse()
    {
    	Node temp = head;
    	Node carry =head;
    	Node current;
    	int c=1;
    	while(temp!= null)
    	{
    		if(c==1)
		     {
		 	    temp = temp.getNext();
    			current = temp.getNext();
    			temp.setNext(carry);
    			if(c == 1){carry.setNext(null);}
    			carry = temp;
			    temp=current;
    			c++;
		    }
		   else
	     {   
          current = temp.getNext();
    			temp.setNext(carry);   			
    			carry = temp;
			    temp=current;
    			c++;
       }
    	}
    	head =carry;
    }
}


public class Test {

	public static void main(String[] args) 
  {
		LinkListDemo list = new LinkListDemo();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		Node header = list.getHead();
		while(header != null)
    {
			System.out.print(header.getData()+" ");
			header = header.getNext();
   	}
		System.out.println(" ");
		list.reverse();
		Node header1 = list.getHead();
		while(header1 != null)
    {	
			System.out.print(header1.getData()+" ");
			header1 = header1.getNext();	
		}
	}
}




