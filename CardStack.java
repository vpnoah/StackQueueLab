public class CardStack{

   CardNode head = null;
   
   public CardStack(){
   
   }
   
   public void push(int x){
   
      CardNode cn = new CardNode(x);
      cn.setNext(head);
      head=cn;
       
   }
   
   public void pop(){
      
      head = head.getNext();
      
   }
   
   public Card peek(){
   
      return head.getData();
      
   }
   
   public boolean isEmpty(){
   
      if(head==null)
         return true;
         
      return false;
      
   }
   
   public String toString(){
   
      String s= "Stack: " + "\n" + "<top>" + "\n";
      
      CardNode cn = head;
      
      while(cn!=null){
         s+= cn.getData().toString();
         s+= "\n";
         cn=cn.getNext();
      }
   
      s+="<bottom>";
   
      return s;
   
   }

   public static void main(String args[]){
   
      CardStack cs = new CardStack();
      cs.push(1);
      cs.push(2);
      cs.push(3);
      cs.push(4);
      cs.push(5);
      cs.push(6);
      System.out.println(cs);
      
      cs.pop();
      cs.pop();
      cs.pop();
      
      System.out.println(cs.peek());
      
      cs.push(7);
      cs.push(8);
      cs.push(9);
      System.out.println(cs);

   
   
   }



}