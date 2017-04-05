import java.util.*;

class TreeNode
{
    private Object data;
    private TreeNode left;
    private TreeNode right;
  
    
     public TreeNode()
     {

     }

    public TreeNode(Object data)
    {
       this.data = data;
       this.left = null;
       this.right = null;

    }
    public void setData(Object o)
    {
   	   this.data = o;
    }

    public Object getData()
    {
   	  return this.data;
    }

    public void setLeft(TreeNode n)
    {
   	  this.left = n;
    }

    public TreeNode getLeft()
    {
       return this.left;

    }

    public void setRight(TreeNode n)
    {
   	  this.right = n;
    }

    public TreeNode getRight()
    {
   	   return this.right;

    }

}


class TreeDemo
{
   
   private TreeNode root;
   
   TreeDemo(Object data)
   {
   	   this.root = new TreeNode(data);    
      
   }

   public void insert(Object o)
   {
      Queue<TreeNode> que = new LinkedList<TreeNode>();
      que.offer(root);
      while(!que.isEmpty())
      {
      	TreeNode node = que.poll();
      	if(node != null)
      	{ 
      		  
              if(node.getLeft() != null)
              {
              	 que.offer(node.getLeft());
              }
              else
              {
              	node.setLeft(new TreeNode(o));
              	return;
              }

              if(node.getRight() != null)
              {
              	 que.offer(node.getRight());
              }
              else
              {
              	node.setRight(new TreeNode(o));
              	return;
              }

      	}

      }       
       
   } 

   public  TreeNode getRoot()
   {
   	   return this.root;
   }      


   public int size(TreeNode root)
   {
     Queue<TreeNode> que = new LinkedList<TreeNode>();
     que.offer(root);
     if(root==null) return 0;
     int counter = 0;
     while(!que.isEmpty())
     {
         TreeNode node =que.poll();
         counter++;
         if(node!=null)
         {
           
           if(node.getLeft()!=null)
           {
              que.offer(node.getLeft());
           } 
            if(node.getRight()!=null)
           {
              que.offer(node.getRight());
           } 


         }
     } 

      return counter;

   }

   	   

}


class Test 
{
   public static void main(String[] args)
   {
       TreeDemo tree = new TreeDemo("0");
       tree.insert("1");
       tree.insert("2");
       tree.insert("3");
       tree.insert("4");
       tree.insert("5");

       

     System.out.println(tree.size(tree.getRoot()));


   }


}