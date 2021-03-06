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


class LinkListDemo 
{
	private Node head;
    private Node temp;
    
    public Node getHead()
    {
    	return head;
    }
    public void setHead(Node l)
    {
      head = l;
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

  }

  class Test {


    public static Node revKElements(Node l,int k)
    {
        Node head = l;
        Node carry = null;
        Node current = null;
        int t = k;
        while(head!=null && t>0)
        {
           //System.out.println(head.getData());
           current = head.getNext();
           head.setNext(carry);
           carry =head;
           head = current;
           t--;
        }
        
        if(current != null)
        {
          
          Node g = revKElements(current,k);
          l.setNext(g);
        }

        return carry;
      
    }

  public static void main(String[] args) {
    
    LinkListDemo list2 = new LinkListDemo();
    list2.add(-2);
    list2.add(-1);
    list2.add(0);
    list2.add(10);
    list2.add(10);
    list2.add(15);
    list2.add(16);
    list2.add(17);

    
    list2.setHead(revKElements(list2.getHead(),3));
    Node p =list2.getHead();
    while(p!=null)
    {
      System.out.println(p.getData()+" ");
      p = p.getNext();
    }

  }

}
